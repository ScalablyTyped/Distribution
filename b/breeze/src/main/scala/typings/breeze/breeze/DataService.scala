package typings.breeze.breeze

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DataService extends StObject {
  
  var adapterInstance: DataServiceAdapter = js.native
  
  var adapterName: String = js.native
  
  var hasServerMetadata: Boolean = js.native
  
  var jsonResultsAdapter: JsonResultsAdapter = js.native
  
  var serviceName: String = js.native
  
  var uriBuilderName: String = js.native
  
  var useJsonp: Boolean = js.native
  
  def using(config: DataServiceOptions): DataService = js.native
}
object DataService {
  
  @scala.inline
  def apply(
    adapterInstance: DataServiceAdapter,
    adapterName: String,
    hasServerMetadata: Boolean,
    jsonResultsAdapter: JsonResultsAdapter,
    serviceName: String,
    uriBuilderName: String,
    useJsonp: Boolean,
    using: DataServiceOptions => DataService
  ): DataService = {
    val __obj = js.Dynamic.literal(adapterInstance = adapterInstance.asInstanceOf[js.Any], adapterName = adapterName.asInstanceOf[js.Any], hasServerMetadata = hasServerMetadata.asInstanceOf[js.Any], jsonResultsAdapter = jsonResultsAdapter.asInstanceOf[js.Any], serviceName = serviceName.asInstanceOf[js.Any], uriBuilderName = uriBuilderName.asInstanceOf[js.Any], useJsonp = useJsonp.asInstanceOf[js.Any], using = js.Any.fromFunction1(using))
    __obj.asInstanceOf[DataService]
  }
  
  @scala.inline
  implicit class DataServiceMutableBuilder[Self <: DataService] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAdapterInstance(value: DataServiceAdapter): Self = StObject.set(x, "adapterInstance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAdapterName(value: String): Self = StObject.set(x, "adapterName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHasServerMetadata(value: Boolean): Self = StObject.set(x, "hasServerMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJsonResultsAdapter(value: JsonResultsAdapter): Self = StObject.set(x, "jsonResultsAdapter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServiceName(value: String): Self = StObject.set(x, "serviceName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUriBuilderName(value: String): Self = StObject.set(x, "uriBuilderName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUseJsonp(value: Boolean): Self = StObject.set(x, "useJsonp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUsing(value: DataServiceOptions => DataService): Self = StObject.set(x, "using", js.Any.fromFunction1(value))
  }
}
