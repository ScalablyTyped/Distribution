package typings.breeze.breeze

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EntityManagerProperties extends StObject {
  
  var dataService: js.UndefOr[DataService] = js.native
  
  var keyGeneratorCtor: js.UndefOr[js.Function] = js.native
  
  var metadataStore: js.UndefOr[MetadataStore] = js.native
  
  var queryOptions: js.UndefOr[QueryOptions] = js.native
  
  var saveOptions: js.UndefOr[SaveOptions] = js.native
  
  var serviceName: js.UndefOr[String] = js.native
  
  var validationOptions: js.UndefOr[ValidationOptions] = js.native
}
object EntityManagerProperties {
  
  @scala.inline
  def apply(): EntityManagerProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EntityManagerProperties]
  }
  
  @scala.inline
  implicit class EntityManagerPropertiesMutableBuilder[Self <: EntityManagerProperties] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDataService(value: DataService): Self = StObject.set(x, "dataService", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataServiceUndefined: Self = StObject.set(x, "dataService", js.undefined)
    
    @scala.inline
    def setKeyGeneratorCtor(value: js.Function): Self = StObject.set(x, "keyGeneratorCtor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeyGeneratorCtorUndefined: Self = StObject.set(x, "keyGeneratorCtor", js.undefined)
    
    @scala.inline
    def setMetadataStore(value: MetadataStore): Self = StObject.set(x, "metadataStore", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMetadataStoreUndefined: Self = StObject.set(x, "metadataStore", js.undefined)
    
    @scala.inline
    def setQueryOptions(value: QueryOptions): Self = StObject.set(x, "queryOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQueryOptionsUndefined: Self = StObject.set(x, "queryOptions", js.undefined)
    
    @scala.inline
    def setSaveOptions(value: SaveOptions): Self = StObject.set(x, "saveOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSaveOptionsUndefined: Self = StObject.set(x, "saveOptions", js.undefined)
    
    @scala.inline
    def setServiceName(value: String): Self = StObject.set(x, "serviceName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServiceNameUndefined: Self = StObject.set(x, "serviceName", js.undefined)
    
    @scala.inline
    def setValidationOptions(value: ValidationOptions): Self = StObject.set(x, "validationOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValidationOptionsUndefined: Self = StObject.set(x, "validationOptions", js.undefined)
  }
}
