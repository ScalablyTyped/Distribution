package typings.awsSdk.iotsitewiseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateGatewayRequest extends StObject {
  
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
  implicit class CreateGatewayRequestMutableBuilder[Self <: CreateGatewayRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGatewayName(value: Name): Self = StObject.set(x, "gatewayName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGatewayPlatform(value: GatewayPlatform): Self = StObject.set(x, "gatewayPlatform", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTags(value: TagMap): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
  }
}
