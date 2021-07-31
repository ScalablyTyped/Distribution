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
  
  @scala.inline
  def apply(): DataServiceOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DataServiceOptions]
  }
  
  @scala.inline
  implicit class DataServiceOptionsMutableBuilder[Self <: DataServiceOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAdapterName(value: String): Self = StObject.set(x, "adapterName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAdapterNameUndefined: Self = StObject.set(x, "adapterName", js.undefined)
    
    @scala.inline
    def setHasServerMetadata(value: Boolean): Self = StObject.set(x, "hasServerMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHasServerMetadataUndefined: Self = StObject.set(x, "hasServerMetadata", js.undefined)
    
    @scala.inline
    def setJsonResultsAdapter(value: JsonResultsAdapter): Self = StObject.set(x, "jsonResultsAdapter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJsonResultsAdapterUndefined: Self = StObject.set(x, "jsonResultsAdapter", js.undefined)
    
    @scala.inline
    def setServiceName(value: String): Self = StObject.set(x, "serviceName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServiceNameUndefined: Self = StObject.set(x, "serviceName", js.undefined)
    
    @scala.inline
    def setUriBuilderName(value: String): Self = StObject.set(x, "uriBuilderName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUriBuilderNameUndefined: Self = StObject.set(x, "uriBuilderName", js.undefined)
    
    @scala.inline
    def setUseJsonp(value: Boolean): Self = StObject.set(x, "useJsonp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUseJsonpUndefined: Self = StObject.set(x, "useJsonp", js.undefined)
  }
}
