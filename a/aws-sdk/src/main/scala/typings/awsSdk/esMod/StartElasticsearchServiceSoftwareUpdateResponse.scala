package typings.awsSdk.esMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StartElasticsearchServiceSoftwareUpdateResponse extends js.Object {
  
  /**
    * The current status of the Elasticsearch service software update.
    */
  var ServiceSoftwareOptions: js.UndefOr[typings.awsSdk.esMod.ServiceSoftwareOptions] = js.native
}
object StartElasticsearchServiceSoftwareUpdateResponse {
  
  @scala.inline
  def apply(): StartElasticsearchServiceSoftwareUpdateResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StartElasticsearchServiceSoftwareUpdateResponse]
  }
  
  @scala.inline
  implicit class StartElasticsearchServiceSoftwareUpdateResponseOps[Self <: StartElasticsearchServiceSoftwareUpdateResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setServiceSoftwareOptions(value: ServiceSoftwareOptions): Self = this.set("ServiceSoftwareOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteServiceSoftwareOptions: Self = this.set("ServiceSoftwareOptions", js.undefined)
  }
}
