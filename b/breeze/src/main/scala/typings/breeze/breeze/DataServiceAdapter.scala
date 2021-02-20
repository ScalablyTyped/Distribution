package typings.breeze.breeze

import typings.breeze.anon.InterfaceName
import typings.breeze.anon.ResourceName
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DataServiceAdapter extends StObject {
  
  var JsonResultsAdapter: typings.breeze.breeze.JsonResultsAdapter = js.native
  
  def checkForRecomposition(interfaceInitializedArgs: InterfaceName): Unit = js.native
  
  def executeQuery(mappingContext: typings.breeze.anon.DataService): js.Promise[_] = js.native
  
  def fetchMetadata(metadataStore: MetadataStore, dataService: DataService): js.Promise[_] = js.native
  
  def initialize(): Unit = js.native
  
  def saveChanges(saveContext: ResourceName, saveBundle: js.Object): js.Promise[SaveResult] = js.native
}
object DataServiceAdapter {
  
  @scala.inline
  def apply(
    JsonResultsAdapter: JsonResultsAdapter,
    checkForRecomposition: InterfaceName => Unit,
    executeQuery: typings.breeze.anon.DataService => js.Promise[_],
    fetchMetadata: (MetadataStore, DataService) => js.Promise[_],
    initialize: () => Unit,
    saveChanges: (ResourceName, js.Object) => js.Promise[SaveResult]
  ): DataServiceAdapter = {
    val __obj = js.Dynamic.literal(JsonResultsAdapter = JsonResultsAdapter.asInstanceOf[js.Any], checkForRecomposition = js.Any.fromFunction1(checkForRecomposition), executeQuery = js.Any.fromFunction1(executeQuery), fetchMetadata = js.Any.fromFunction2(fetchMetadata), initialize = js.Any.fromFunction0(initialize), saveChanges = js.Any.fromFunction2(saveChanges))
    __obj.asInstanceOf[DataServiceAdapter]
  }
  
  @scala.inline
  implicit class DataServiceAdapterMutableBuilder[Self <: DataServiceAdapter] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCheckForRecomposition(value: InterfaceName => Unit): Self = StObject.set(x, "checkForRecomposition", js.Any.fromFunction1(value))
    
    @scala.inline
    def setExecuteQuery(value: typings.breeze.anon.DataService => js.Promise[_]): Self = StObject.set(x, "executeQuery", js.Any.fromFunction1(value))
    
    @scala.inline
    def setFetchMetadata(value: (MetadataStore, DataService) => js.Promise[_]): Self = StObject.set(x, "fetchMetadata", js.Any.fromFunction2(value))
    
    @scala.inline
    def setInitialize(value: () => Unit): Self = StObject.set(x, "initialize", js.Any.fromFunction0(value))
    
    @scala.inline
    def setJsonResultsAdapter(value: JsonResultsAdapter): Self = StObject.set(x, "JsonResultsAdapter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSaveChanges(value: (ResourceName, js.Object) => js.Promise[SaveResult]): Self = StObject.set(x, "saveChanges", js.Any.fromFunction2(value))
  }
}
