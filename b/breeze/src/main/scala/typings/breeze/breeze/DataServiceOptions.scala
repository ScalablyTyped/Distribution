package typings.breeze.breeze

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DataServiceOptions extends StObject {
  
  var adapterName: js.UndefOr[String] = js.undefined
  
  var hasServerMetadata: js.UndefOr[Boolean] = js.undefined
  
  var jsonResultsAdapter: js.UndefOr[JsonResultsAdapter] = js.undefined
  
  var serviceName: js.UndefOr[String] = js.undefined
  
  var uriBuilderName: js.UndefOr[String] = js.undefined
  
  var useJsonp: js.UndefOr[Boolean] = js.undefined
}
object DataServiceOptions {
  
  inline def apply(): DataServiceOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DataServiceOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DataServiceOptions] (val x: Self) extends AnyVal {
    
    inline def setAdapterName(value: String): Self = StObject.set(x, "adapterName", value.asInstanceOf[js.Any])
    
    inline def setAdapterNameUndefined: Self = StObject.set(x, "adapterName", js.undefined)
    
    inline def setHasServerMetadata(value: Boolean): Self = StObject.set(x, "hasServerMetadata", value.asInstanceOf[js.Any])
    
    inline def setHasServerMetadataUndefined: Self = StObject.set(x, "hasServerMetadata", js.undefined)
    
    inline def setJsonResultsAdapter(value: JsonResultsAdapter): Self = StObject.set(x, "jsonResultsAdapter", value.asInstanceOf[js.Any])
    
    inline def setJsonResultsAdapterUndefined: Self = StObject.set(x, "jsonResultsAdapter", js.undefined)
    
    inline def setServiceName(value: String): Self = StObject.set(x, "serviceName", value.asInstanceOf[js.Any])
    
    inline def setServiceNameUndefined: Self = StObject.set(x, "serviceName", js.undefined)
    
    inline def setUriBuilderName(value: String): Self = StObject.set(x, "uriBuilderName", value.asInstanceOf[js.Any])
    
    inline def setUriBuilderNameUndefined: Self = StObject.set(x, "uriBuilderName", js.undefined)
    
    inline def setUseJsonp(value: Boolean): Self = StObject.set(x, "useJsonp", value.asInstanceOf[js.Any])
    
    inline def setUseJsonpUndefined: Self = StObject.set(x, "useJsonp", js.undefined)
  }
}
