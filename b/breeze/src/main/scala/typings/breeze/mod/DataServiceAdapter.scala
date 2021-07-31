package typings.breeze.mod

import typings.breeze.anon.InterfaceName
import typings.breeze.anon.ResourceName
import typings.breeze.breeze.SaveResult
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("breeze", "DataServiceAdapter")
@js.native
class DataServiceAdapter ()
  extends StObject
     with typings.breeze.breeze.DataServiceAdapter {
  
  /* CompleteClass */
  var JsonResultsAdapter: typings.breeze.breeze.JsonResultsAdapter = js.native
  
  /* CompleteClass */
  override def checkForRecomposition(interfaceInitializedArgs: InterfaceName): Unit = js.native
  
  /* CompleteClass */
  override def executeQuery(mappingContext: typings.breeze.anon.DataService): js.Promise[js.Any] = js.native
  
  /* CompleteClass */
  override def fetchMetadata(metadataStore: typings.breeze.breeze.MetadataStore, dataService: typings.breeze.breeze.DataService): js.Promise[js.Any] = js.native
  
  /* CompleteClass */
  override def initialize(): Unit = js.native
  
  /* CompleteClass */
  override def saveChanges(saveContext: ResourceName, saveBundle: js.Object): js.Promise[SaveResult] = js.native
}
