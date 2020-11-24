package typings.datadogWinston.mod

import typings.winstonTransport.mod.TransportStreamOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DatadogTransportOptions extends TransportStreamOptions {
  
  var apiKey: String = js.native
  
  var ddsource: js.UndefOr[String] = js.native
  
  var ddtags: js.UndefOr[String] = js.native
  
  var hostname: js.UndefOr[String] = js.native
  
  var service: js.UndefOr[String] = js.native
}
object DatadogTransportOptions {
  
  @scala.inline
  def apply(apiKey: String): DatadogTransportOptions = {
    val __obj = js.Dynamic.literal(apiKey = apiKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[DatadogTransportOptions]
  }
  
  @scala.inline
  implicit class DatadogTransportOptionsOps[Self <: DatadogTransportOptions] (val x: Self) extends AnyVal {
    
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
    def setApiKey(value: String): Self = this.set("apiKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDdsource(value: String): Self = this.set("ddsource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDdsource: Self = this.set("ddsource", js.undefined)
    
    @scala.inline
    def setDdtags(value: String): Self = this.set("ddtags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDdtags: Self = this.set("ddtags", js.undefined)
    
    @scala.inline
    def setHostname(value: String): Self = this.set("hostname", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHostname: Self = this.set("hostname", js.undefined)
    
    @scala.inline
    def setService(value: String): Self = this.set("service", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteService: Self = this.set("service", js.undefined)
  }
}
