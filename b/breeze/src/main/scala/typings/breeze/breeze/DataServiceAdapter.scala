package typings.breeze.breeze

import typings.breeze.anon.InterfaceName
import typings.breeze.anon.ResourceName
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DataServiceAdapter extends js.Object {
  
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
  implicit class DataServiceAdapterOps[Self <: DataServiceAdapter] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setJsonResultsAdapter(value: JsonResultsAdapter): Self = this.set("JsonResultsAdapter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCheckForRecomposition(value: InterfaceName => Unit): Self = this.set("checkForRecomposition", js.Any.fromFunction1(value))
    
    @scala.inline
    def setExecuteQuery(value: typings.breeze.anon.DataService => js.Promise[_]): Self = this.set("executeQuery", js.Any.fromFunction1(value))
    
    @scala.inline
    def setFetchMetadata(value: (MetadataStore, DataService) => js.Promise[_]): Self = this.set("fetchMetadata", js.Any.fromFunction2(value))
    
    @scala.inline
    def setInitialize(value: () => Unit): Self = this.set("initialize", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSaveChanges(value: (ResourceName, js.Object) => js.Promise[SaveResult]): Self = this.set("saveChanges", js.Any.fromFunction2(value))
  }
}
