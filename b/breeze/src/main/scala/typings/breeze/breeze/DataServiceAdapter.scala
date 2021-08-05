package typings.breeze.breeze

import typings.breeze.anon.InterfaceName
import typings.breeze.anon.ResourceName
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DataServiceAdapter extends StObject {
  
  var JsonResultsAdapter: typings.breeze.breeze.JsonResultsAdapter
  
  def checkForRecomposition(interfaceInitializedArgs: InterfaceName): Unit
  
  def executeQuery(mappingContext: typings.breeze.anon.DataService): js.Promise[js.Any]
  
  def fetchMetadata(metadataStore: MetadataStore, dataService: DataService): js.Promise[js.Any]
  
  def initialize(): Unit
  
  def saveChanges(saveContext: ResourceName, saveBundle: js.Object): js.Promise[SaveResult]
}
object DataServiceAdapter {
  
  inline def apply(
    JsonResultsAdapter: JsonResultsAdapter,
    checkForRecomposition: InterfaceName => Unit,
    executeQuery: typings.breeze.anon.DataService => js.Promise[js.Any],
    fetchMetadata: (MetadataStore, DataService) => js.Promise[js.Any],
    initialize: () => Unit,
    saveChanges: (ResourceName, js.Object) => js.Promise[SaveResult]
  ): DataServiceAdapter = {
    val __obj = js.Dynamic.literal(JsonResultsAdapter = JsonResultsAdapter.asInstanceOf[js.Any], checkForRecomposition = js.Any.fromFunction1(checkForRecomposition), executeQuery = js.Any.fromFunction1(executeQuery), fetchMetadata = js.Any.fromFunction2(fetchMetadata), initialize = js.Any.fromFunction0(initialize), saveChanges = js.Any.fromFunction2(saveChanges))
    __obj.asInstanceOf[DataServiceAdapter]
  }
  
  extension [Self <: DataServiceAdapter](x: Self) {
    
    inline def setCheckForRecomposition(value: InterfaceName => Unit): Self = StObject.set(x, "checkForRecomposition", js.Any.fromFunction1(value))
    
    inline def setExecuteQuery(value: typings.breeze.anon.DataService => js.Promise[js.Any]): Self = StObject.set(x, "executeQuery", js.Any.fromFunction1(value))
    
    inline def setFetchMetadata(value: (MetadataStore, DataService) => js.Promise[js.Any]): Self = StObject.set(x, "fetchMetadata", js.Any.fromFunction2(value))
    
    inline def setInitialize(value: () => Unit): Self = StObject.set(x, "initialize", js.Any.fromFunction0(value))
    
    inline def setJsonResultsAdapter(value: JsonResultsAdapter): Self = StObject.set(x, "JsonResultsAdapter", value.asInstanceOf[js.Any])
    
    inline def setSaveChanges(value: (ResourceName, js.Object) => js.Promise[SaveResult]): Self = StObject.set(x, "saveChanges", js.Any.fromFunction2(value))
  }
}
