package typings.breeze.breeze

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EntityManagerProperties extends StObject {
  
  var dataService: js.UndefOr[DataService] = js.undefined
  
  var keyGeneratorCtor: js.UndefOr[js.Function] = js.undefined
  
  var metadataStore: js.UndefOr[MetadataStore] = js.undefined
  
  var queryOptions: js.UndefOr[QueryOptions] = js.undefined
  
  var saveOptions: js.UndefOr[SaveOptions] = js.undefined
  
  var serviceName: js.UndefOr[String] = js.undefined
  
  var validationOptions: js.UndefOr[ValidationOptions] = js.undefined
}
object EntityManagerProperties {
  
  inline def apply(): EntityManagerProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EntityManagerProperties]
  }
  
  extension [Self <: EntityManagerProperties](x: Self) {
    
    inline def setDataService(value: DataService): Self = StObject.set(x, "dataService", value.asInstanceOf[js.Any])
    
    inline def setDataServiceUndefined: Self = StObject.set(x, "dataService", js.undefined)
    
    inline def setKeyGeneratorCtor(value: js.Function): Self = StObject.set(x, "keyGeneratorCtor", value.asInstanceOf[js.Any])
    
    inline def setKeyGeneratorCtorUndefined: Self = StObject.set(x, "keyGeneratorCtor", js.undefined)
    
    inline def setMetadataStore(value: MetadataStore): Self = StObject.set(x, "metadataStore", value.asInstanceOf[js.Any])
    
    inline def setMetadataStoreUndefined: Self = StObject.set(x, "metadataStore", js.undefined)
    
    inline def setQueryOptions(value: QueryOptions): Self = StObject.set(x, "queryOptions", value.asInstanceOf[js.Any])
    
    inline def setQueryOptionsUndefined: Self = StObject.set(x, "queryOptions", js.undefined)
    
    inline def setSaveOptions(value: SaveOptions): Self = StObject.set(x, "saveOptions", value.asInstanceOf[js.Any])
    
    inline def setSaveOptionsUndefined: Self = StObject.set(x, "saveOptions", js.undefined)
    
    inline def setServiceName(value: String): Self = StObject.set(x, "serviceName", value.asInstanceOf[js.Any])
    
    inline def setServiceNameUndefined: Self = StObject.set(x, "serviceName", js.undefined)
    
    inline def setValidationOptions(value: ValidationOptions): Self = StObject.set(x, "validationOptions", value.asInstanceOf[js.Any])
    
    inline def setValidationOptionsUndefined: Self = StObject.set(x, "validationOptions", js.undefined)
  }
}
