package typings.braintreeWeb.clientMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Configuration extends js.Object {
  
  var analyticsMetadata: ClientAnalyticsMetadata = js.native
  
  var client: Client = js.native
  
  var gatewayConfiguration: js.Any = js.native
}
object Configuration {
  
  @scala.inline
  def apply(analyticsMetadata: ClientAnalyticsMetadata, client: Client, gatewayConfiguration: js.Any): Configuration = {
    val __obj = js.Dynamic.literal(analyticsMetadata = analyticsMetadata.asInstanceOf[js.Any], client = client.asInstanceOf[js.Any], gatewayConfiguration = gatewayConfiguration.asInstanceOf[js.Any])
    __obj.asInstanceOf[Configuration]
  }
  
  @scala.inline
  implicit class ConfigurationOps[Self <: Configuration] (val x: Self) extends AnyVal {
    
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
    def setAnalyticsMetadata(value: ClientAnalyticsMetadata): Self = this.set("analyticsMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClient(value: Client): Self = this.set("client", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGatewayConfiguration(value: js.Any): Self = this.set("gatewayConfiguration", value.asInstanceOf[js.Any])
  }
}
