package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DisableVpcClassicLinkDnsSupportRequest extends StObject {
  
  /**
    * The ID of the VPC.
    */
  var VpcId: js.UndefOr[typings.awsSdk.ec2Mod.VpcId] = js.native
}
object DisableVpcClassicLinkDnsSupportRequest {
  
  @scala.inline
  def apply(): DisableVpcClassicLinkDnsSupportRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DisableVpcClassicLinkDnsSupportRequest]
  }
  
  @scala.inline
  implicit class DisableVpcClassicLinkDnsSupportRequestMutableBuilder[Self <: DisableVpcClassicLinkDnsSupportRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setVpcId(value: VpcId): Self = StObject.set(x, "VpcId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVpcIdUndefined: Self = StObject.set(x, "VpcId", js.undefined)
  }
}
