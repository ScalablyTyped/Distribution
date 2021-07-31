package typings.azdata.mod

import typings.azdata.mod.connection.ConnectionProfile
import typings.azdata.mod.window.DialogTab
import typings.std.Map
import typings.vscode.Thenable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object queryeditor {
  
  @JSImport("azdata", "queryeditor")
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def connect(fileUri: String, connectionId: String): Thenable[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("connect")(fileUri.asInstanceOf[js.Any], connectionId.asInstanceOf[js.Any])).asInstanceOf[Thenable[Unit]]
  
  @scala.inline
  def getQueryDocument(fileUri: String): Thenable[QueryDocument] = ^.asInstanceOf[js.Dynamic].applyDynamic("getQueryDocument")(fileUri.asInstanceOf[js.Any]).asInstanceOf[Thenable[QueryDocument]]
  
  @scala.inline
  def registerQueryEventListener(listener: QueryEventListener): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("registerQueryEventListener")(listener.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  @scala.inline
  def runQuery(fileUri: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("runQuery")(fileUri.asInstanceOf[js.Any]).asInstanceOf[Unit]
  @scala.inline
  def runQuery(fileUri: String, options: Unit, runCurrentQuery: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("runQuery")(fileUri.asInstanceOf[js.Any], options.asInstanceOf[js.Any], runCurrentQuery.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def runQuery(fileUri: String, options: Map[String, String]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("runQuery")(fileUri.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def runQuery(fileUri: String, options: Map[String, String], runCurrentQuery: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("runQuery")(fileUri.asInstanceOf[js.Any], options.asInstanceOf[js.Any], runCurrentQuery.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  trait QueryDocument extends StObject {
    
    // connect the query document using the given connection profile
    def connect(connectionProfile: ConnectionProfile): Thenable[Unit]
    
    // tab content is build using the modelview UI builder APIs
    // probably should rename DialogTab class since it is useful outside dialogs
    def createQueryTab(tab: DialogTab): Unit
    
    var providerId: String
    
    // set the document's execution options
    def setExecutionOptions(options: Map[String, js.Any]): Thenable[Unit]
    
    var uri: String
  }
  object QueryDocument {
    
    @scala.inline
    def apply(
      connect: ConnectionProfile => Thenable[Unit],
      createQueryTab: DialogTab => Unit,
      providerId: String,
      setExecutionOptions: Map[String, js.Any] => Thenable[Unit],
      uri: String
    ): QueryDocument = {
      val __obj = js.Dynamic.literal(connect = js.Any.fromFunction1(connect), createQueryTab = js.Any.fromFunction1(createQueryTab), providerId = providerId.asInstanceOf[js.Any], setExecutionOptions = js.Any.fromFunction1(setExecutionOptions), uri = uri.asInstanceOf[js.Any])
      __obj.asInstanceOf[QueryDocument]
    }
    
    @scala.inline
    implicit class QueryDocumentMutableBuilder[Self <: QueryDocument] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setConnect(value: ConnectionProfile => Thenable[Unit]): Self = StObject.set(x, "connect", js.Any.fromFunction1(value))
      
      @scala.inline
      def setCreateQueryTab(value: DialogTab => Unit): Self = StObject.set(x, "createQueryTab", js.Any.fromFunction1(value))
      
      @scala.inline
      def setProviderId(value: String): Self = StObject.set(x, "providerId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSetExecutionOptions(value: Map[String, js.Any] => Thenable[Unit]): Self = StObject.set(x, "setExecutionOptions", js.Any.fromFunction1(value))
      
      @scala.inline
      def setUri(value: String): Self = StObject.set(x, "uri", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait QueryEventListener extends StObject {
    
    def onQueryEvent(`type`: QueryEventType, document: QueryDocument): Unit = js.native
    def onQueryEvent(`type`: QueryEventType, document: QueryDocument, args: String): Unit = js.native
    def onQueryEvent(`type`: QueryEventType, document: QueryDocument, args: ResultSetSummary): Unit = js.native
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.azdata.azdataStrings.queryStart
    - typings.azdata.azdataStrings.queryUpdate
    - typings.azdata.azdataStrings.queryStop
    - typings.azdata.azdataStrings.executionPlan
    - typings.azdata.azdataStrings.visualize
  */
  trait QueryEventType extends StObject
  object QueryEventType {
    
    @scala.inline
    def executionPlan: typings.azdata.azdataStrings.executionPlan = "executionPlan".asInstanceOf[typings.azdata.azdataStrings.executionPlan]
    
    @scala.inline
    def queryStart: typings.azdata.azdataStrings.queryStart = "queryStart".asInstanceOf[typings.azdata.azdataStrings.queryStart]
    
    @scala.inline
    def queryStop: typings.azdata.azdataStrings.queryStop = "queryStop".asInstanceOf[typings.azdata.azdataStrings.queryStop]
    
    @scala.inline
    def queryUpdate: typings.azdata.azdataStrings.queryUpdate = "queryUpdate".asInstanceOf[typings.azdata.azdataStrings.queryUpdate]
    
    @scala.inline
    def visualize: typings.azdata.azdataStrings.visualize = "visualize".asInstanceOf[typings.azdata.azdataStrings.visualize]
  }
}
