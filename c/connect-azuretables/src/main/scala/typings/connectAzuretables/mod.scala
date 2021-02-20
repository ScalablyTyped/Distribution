package typings.connectAzuretables

import typings.connectAzuretables.connectAzuretablesStrings.SET
import typings.connectAzuretables.connectAzuretablesStrings.TOUCH
import typings.express.mod.RequestHandler
import typings.expressServeStaticCore.mod.ParamsDictionary
import typings.expressServeStaticCore.mod.Query
import typings.expressSession.mod.SessionData
import typings.expressSession.mod.SessionOptions
import typings.expressSession.mod.Store
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("connect-azuretables", JSImport.Namespace)
  @js.native
  def apply(
    session: js.Function1[
      /* options */ js.UndefOr[SessionOptions], 
      RequestHandler[ParamsDictionary, _, _, Query]
    ]
  ): AzureTableStoreFactory = js.native
  
  @js.native
  trait AzureTableStore extends Store {
    
    def cleanUp(): Unit = js.native
    
    def startBackgroundCleanUp(): Unit = js.native
    
    @JSName("update")
    def update_SET(method: SET, sid: String, session: SessionData): Unit = js.native
    @JSName("update")
    def update_SET(method: SET, sid: String, session: SessionData, callback: js.Function1[/* err */ js.Any, Unit]): Unit = js.native
    @JSName("update")
    def update_TOUCH(method: TOUCH, sid: String, session: SessionData): Unit = js.native
    @JSName("update")
    def update_TOUCH(method: TOUCH, sid: String, session: SessionData, callback: js.Function1[/* err */ js.Any, Unit]): Unit = js.native
  }
  
  @js.native
  trait AzureTableStoreFactory extends StObject {
    
    def create(options: AzureTableStoreOptions): AzureTableStore = js.native
  }
  object AzureTableStoreFactory {
    
    @scala.inline
    def apply(create: AzureTableStoreOptions => AzureTableStore): AzureTableStoreFactory = {
      val __obj = js.Dynamic.literal(create = js.Any.fromFunction1(create))
      __obj.asInstanceOf[AzureTableStoreFactory]
    }
    
    @scala.inline
    implicit class AzureTableStoreFactoryMutableBuilder[Self <: AzureTableStoreFactory] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCreate(value: AzureTableStoreOptions => AzureTableStore): Self = StObject.set(x, "create", js.Any.fromFunction1(value))
    }
  }
  
  @js.native
  trait AzureTableStoreOptions extends StObject {
    
    var accessKey: js.UndefOr[String] = js.native
    
    var errorLogger: js.UndefOr[js.Function1[/* message */ String, Unit]] = js.native
    
    var logger: js.UndefOr[js.Function1[/* message */ String, Unit]] = js.native
    
    // sessionTimeOut in minutes
    var overrideCron: js.UndefOr[String] = js.native
    
    var sessionTimeOut: js.UndefOr[Double] = js.native
    
    // cron job description
    var storageAccount: js.UndefOr[String] = js.native
    
    var table: js.UndefOr[String] = js.native
  }
  object AzureTableStoreOptions {
    
    @scala.inline
    def apply(): AzureTableStoreOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AzureTableStoreOptions]
    }
    
    @scala.inline
    implicit class AzureTableStoreOptionsMutableBuilder[Self <: AzureTableStoreOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAccessKey(value: String): Self = StObject.set(x, "accessKey", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAccessKeyUndefined: Self = StObject.set(x, "accessKey", js.undefined)
      
      @scala.inline
      def setErrorLogger(value: /* message */ String => Unit): Self = StObject.set(x, "errorLogger", js.Any.fromFunction1(value))
      
      @scala.inline
      def setErrorLoggerUndefined: Self = StObject.set(x, "errorLogger", js.undefined)
      
      @scala.inline
      def setLogger(value: /* message */ String => Unit): Self = StObject.set(x, "logger", js.Any.fromFunction1(value))
      
      @scala.inline
      def setLoggerUndefined: Self = StObject.set(x, "logger", js.undefined)
      
      @scala.inline
      def setOverrideCron(value: String): Self = StObject.set(x, "overrideCron", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOverrideCronUndefined: Self = StObject.set(x, "overrideCron", js.undefined)
      
      @scala.inline
      def setSessionTimeOut(value: Double): Self = StObject.set(x, "sessionTimeOut", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSessionTimeOutUndefined: Self = StObject.set(x, "sessionTimeOut", js.undefined)
      
      @scala.inline
      def setStorageAccount(value: String): Self = StObject.set(x, "storageAccount", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStorageAccountUndefined: Self = StObject.set(x, "storageAccount", js.undefined)
      
      @scala.inline
      def setTable(value: String): Self = StObject.set(x, "table", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTableUndefined: Self = StObject.set(x, "table", js.undefined)
    }
  }
}
