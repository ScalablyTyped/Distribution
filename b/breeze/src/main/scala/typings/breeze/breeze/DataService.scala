package typings.breeze.breeze

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DataService extends StObject {
  
  var adapterInstance: DataServiceAdapter
  
  var adapterName: String
  
  var hasServerMetadata: Boolean
  
  var jsonResultsAdapter: JsonResultsAdapter
  
  def qualifyUrl(suffix: String): String
  
  var serviceName: String
  
  var uriBuilder: UriBuilder
  
  var uriBuilderName: String
  
  var useJsonp: Boolean
  
  def `using`(config: DataServiceOptions): DataService
}
object DataService {
  
  inline def apply(
    adapterInstance: DataServiceAdapter,
    adapterName: String,
    hasServerMetadata: Boolean,
    jsonResultsAdapter: JsonResultsAdapter,
    qualifyUrl: String => String,
    serviceName: String,
    uriBuilder: UriBuilder,
    uriBuilderName: String,
    useJsonp: Boolean,
    `using`: DataServiceOptions => DataService
  ): DataService = {
    val __obj = js.Dynamic.literal(adapterInstance = adapterInstance.asInstanceOf[js.Any], adapterName = adapterName.asInstanceOf[js.Any], hasServerMetadata = hasServerMetadata.asInstanceOf[js.Any], jsonResultsAdapter = jsonResultsAdapter.asInstanceOf[js.Any], qualifyUrl = js.Any.fromFunction1(qualifyUrl), serviceName = serviceName.asInstanceOf[js.Any], uriBuilder = uriBuilder.asInstanceOf[js.Any], uriBuilderName = uriBuilderName.asInstanceOf[js.Any], useJsonp = useJsonp.asInstanceOf[js.Any])
    __obj.updateDynamic("using")(js.Any.fromFunction1(`using`))
    __obj.asInstanceOf[DataService]
  }
  
  extension [Self <: DataService](x: Self) {
    
    inline def setAdapterInstance(value: DataServiceAdapter): Self = StObject.set(x, "adapterInstance", value.asInstanceOf[js.Any])
    
    inline def setAdapterName(value: String): Self = StObject.set(x, "adapterName", value.asInstanceOf[js.Any])
    
    inline def setHasServerMetadata(value: Boolean): Self = StObject.set(x, "hasServerMetadata", value.asInstanceOf[js.Any])
    
    inline def setJsonResultsAdapter(value: JsonResultsAdapter): Self = StObject.set(x, "jsonResultsAdapter", value.asInstanceOf[js.Any])
    
    inline def setQualifyUrl(value: String => String): Self = StObject.set(x, "qualifyUrl", js.Any.fromFunction1(value))
    
    inline def setServiceName(value: String): Self = StObject.set(x, "serviceName", value.asInstanceOf[js.Any])
    
    inline def setUriBuilder(value: UriBuilder): Self = StObject.set(x, "uriBuilder", value.asInstanceOf[js.Any])
    
    inline def setUriBuilderName(value: String): Self = StObject.set(x, "uriBuilderName", value.asInstanceOf[js.Any])
    
    inline def setUseJsonp(value: Boolean): Self = StObject.set(x, "useJsonp", value.asInstanceOf[js.Any])
    
    inline def setUsing(value: DataServiceOptions => DataService): Self = StObject.set(x, "using", js.Any.fromFunction1(value))
  }
}
