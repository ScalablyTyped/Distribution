package typings.awsSdk.iotsitewiseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateGatewayRequest extends js.Object {
  
  /**
    * A unique, friendly name for the gateway.
    */
  var gatewayName: Name = js.native
  
  /**
    * The gateway's platform. You can only specify one platform in a gateway.
    */
  var gatewayPlatform: GatewayPlatform = js.native
  
  /**
    * A list of key-value pairs that contain metadata for the gateway. For more information, see Tagging your AWS IoT SiteWise resources in the AWS IoT SiteWise User Guide.
    */
  var tags: js.UndefOr[TagMap] = js.native
}
object CreateGatewayRequest {
  
  @scala.inline
  def apply(gatewayName: Name, gatewayPlatform: GatewayPlatform): CreateGatewayRequest = {
    val __obj = js.Dynamic.literal(gatewayName = gatewayName.asInstanceOf[js.Any], gatewayPlatform = gatewayPlatform.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateGatewayRequest]
  }
  
  @scala.inline
  implicit class CreateGatewayRequestOps[Self <: CreateGatewayRequest] (val x: Self) extends AnyVal {
    
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
    def setGatewayName(value: Name): Self = this.set("gatewayName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGatewayPlatform(value: GatewayPlatform): Self = this.set("gatewayPlatform", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTags(value: TagMap): Self = this.set("tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTags: Self = this.set("tags", js.undefined)
  }
}
