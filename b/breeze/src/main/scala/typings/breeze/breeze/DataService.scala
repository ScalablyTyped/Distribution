package typings.breeze.breeze

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DataService extends js.Object {
  
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
  implicit class DataServiceOps[Self <: DataService] (val x: Self) extends AnyVal {
    
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
    def setAdapterInstance(value: DataServiceAdapter): Self = this.set("adapterInstance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAdapterName(value: String): Self = this.set("adapterName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHasServerMetadata(value: Boolean): Self = this.set("hasServerMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJsonResultsAdapter(value: JsonResultsAdapter): Self = this.set("jsonResultsAdapter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServiceName(value: String): Self = this.set("serviceName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUriBuilderName(value: String): Self = this.set("uriBuilderName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUseJsonp(value: Boolean): Self = this.set("useJsonp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUsing(value: DataServiceOptions => DataService): Self = this.set("using", js.Any.fromFunction1(value))
  }
}
