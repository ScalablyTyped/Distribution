package typings.breeze.breeze

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DataServiceOptions extends js.Object {
  
  var adapterName: js.UndefOr[String] = js.native
  
  var hasServerMetadata: js.UndefOr[Boolean] = js.native
  
  var jsonResultsAdapter: js.UndefOr[JsonResultsAdapter] = js.native
  
  var serviceName: js.UndefOr[String] = js.native
  
  var uriBuilderName: js.UndefOr[String] = js.native
  
  var useJsonp: js.UndefOr[Boolean] = js.native
}
object DataServiceOptions {
  
  @scala.inline
  def apply(): DataServiceOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DataServiceOptions]
  }
  
  @scala.inline
  implicit class DataServiceOptionsOps[Self <: DataServiceOptions] (val x: Self) extends AnyVal {
    
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
    def setAdapterName(value: String): Self = this.set("adapterName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAdapterName: Self = this.set("adapterName", js.undefined)
    
    @scala.inline
    def setHasServerMetadata(value: Boolean): Self = this.set("hasServerMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHasServerMetadata: Self = this.set("hasServerMetadata", js.undefined)
    
    @scala.inline
    def setJsonResultsAdapter(value: JsonResultsAdapter): Self = this.set("jsonResultsAdapter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteJsonResultsAdapter: Self = this.set("jsonResultsAdapter", js.undefined)
    
    @scala.inline
    def setServiceName(value: String): Self = this.set("serviceName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteServiceName: Self = this.set("serviceName", js.undefined)
    
    @scala.inline
    def setUriBuilderName(value: String): Self = this.set("uriBuilderName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUriBuilderName: Self = this.set("uriBuilderName", js.undefined)
    
    @scala.inline
    def setUseJsonp(value: Boolean): Self = this.set("useJsonp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUseJsonp: Self = this.set("useJsonp", js.undefined)
  }
}
