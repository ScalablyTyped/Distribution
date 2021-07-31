package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EnableVpcClassicLinkDnsSupportRequest extends StObject {
  
  /**
    * The ID of the VPC.
    */
  var VpcId: js.UndefOr[typings.awsSdk.ec2Mod.VpcId] = js.undefined
}
object EnableVpcClassicLinkDnsSupportRequest {
  
  @scala.inline
  def apply(): EnableVpcClassicLinkDnsSupportRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EnableVpcClassicLinkDnsSupportRequest]
  }
  
  @scala.inline
  implicit class EnableVpcClassicLinkDnsSupportRequestMutableBuilder[Self <: EnableVpcClassicLinkDnsSupportRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setVpcId(value: VpcId): Self = StObject.set(x, "VpcId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVpcIdUndefined: Self = StObject.set(x, "VpcId", js.undefined)
  }
}
