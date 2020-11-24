package typings.breeze.breeze

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EntityManagerOptions extends js.Object {
  
  var dataService: js.UndefOr[DataService] = js.native
  
  var keyGeneratorCtor: js.UndefOr[js.Function] = js.native
  
  var metadataStore: js.UndefOr[MetadataStore] = js.native
  
  var queryOptions: js.UndefOr[QueryOptions] = js.native
  
  var saveOptions: js.UndefOr[SaveOptions] = js.native
  
  var serviceName: js.UndefOr[String] = js.native
  
  var validationOptions: js.UndefOr[ValidationOptions] = js.native
}
object EntityManagerOptions {
  
  @scala.inline
  def apply(): EntityManagerOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EntityManagerOptions]
  }
  
  @scala.inline
  implicit class EntityManagerOptionsOps[Self <: EntityManagerOptions] (val x: Self) extends AnyVal {
    
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
    def setDataService(value: DataService): Self = this.set("dataService", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDataService: Self = this.set("dataService", js.undefined)
    
    @scala.inline
    def setKeyGeneratorCtor(value: js.Function): Self = this.set("keyGeneratorCtor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKeyGeneratorCtor: Self = this.set("keyGeneratorCtor", js.undefined)
    
    @scala.inline
    def setMetadataStore(value: MetadataStore): Self = this.set("metadataStore", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMetadataStore: Self = this.set("metadataStore", js.undefined)
    
    @scala.inline
    def setQueryOptions(value: QueryOptions): Self = this.set("queryOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteQueryOptions: Self = this.set("queryOptions", js.undefined)
    
    @scala.inline
    def setSaveOptions(value: SaveOptions): Self = this.set("saveOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSaveOptions: Self = this.set("saveOptions", js.undefined)
    
    @scala.inline
    def setServiceName(value: String): Self = this.set("serviceName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteServiceName: Self = this.set("serviceName", js.undefined)
    
    @scala.inline
    def setValidationOptions(value: ValidationOptions): Self = this.set("validationOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValidationOptions: Self = this.set("validationOptions", js.undefined)
  }
}
