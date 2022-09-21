package typings.breeze.mod

import typings.breeze.anon.Done
import typings.breeze.anon.InterfaceName
import typings.breeze.breeze.DataServiceSaveContext
import typings.breeze.breeze.MappingContext
import typings.breeze.breeze.SaveBundle
import typings.breeze.breeze.SaveResult
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("breeze", "DataServiceAdapter")
@js.native
open class DataServiceAdapter ()
  extends StObject
     with typings.breeze.breeze.DataServiceAdapter {
  
  /* CompleteClass */
  var JsonResultsAdapter: typings.breeze.breeze.JsonResultsAdapter = js.native
  
  /* CompleteClass */
  override def _catchNoConnectionError(err: js.Error): Any = js.native
  
  /* CompleteClass */
  override def _createChangeRequestInterceptor(saveContext: DataServiceSaveContext, saveBundle: SaveBundle): Done = js.native
  
  /* CompleteClass */
  override def _prepareSaveBundle(saveContext: DataServiceSaveContext, saveBundle: SaveBundle): SaveBundle = js.native
  
  /* CompleteClass */
  override def _prepareSaveResult(saveContext: DataServiceSaveContext, data: SaveResult): SaveResult = js.native
  
  /* CompleteClass */
  var changeRequestInterceptor: Done = js.native
  
  /* CompleteClass */
  override def checkForRecomposition(interfaceInitializedArgs: InterfaceName): Unit = js.native
  
  /* CompleteClass */
  override def executeQuery(mappingContext: MappingContext): js.Promise[Any] = js.native
  
  /* CompleteClass */
  override def fetchMetadata(metadataStore: typings.breeze.breeze.MetadataStore, dataService: typings.breeze.breeze.DataService): js.Promise[Any] = js.native
  
  /* CompleteClass */
  override def initialize(): Unit = js.native
  
  /* CompleteClass */
  override def saveChanges(saveContext: typings.breeze.anon.DataService, saveBundle: SaveBundle): js.Promise[SaveResult] = js.native
}
