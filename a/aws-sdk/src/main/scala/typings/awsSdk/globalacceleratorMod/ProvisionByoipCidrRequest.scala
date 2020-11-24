package typings.awsSdk.globalacceleratorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ProvisionByoipCidrRequest extends js.Object {
  
  /**
    * The public IPv4 address range, in CIDR notation. The most specific IP prefix that you can specify is /24. The address range cannot overlap with another address range that you've brought to this or another Region.
    */
  var Cidr: GenericString = js.native
  
  /**
    * A signed document that proves that you are authorized to bring the specified IP address range to Amazon using BYOIP. 
    */
  var CidrAuthorizationContext: typings.awsSdk.globalacceleratorMod.CidrAuthorizationContext = js.native
}
object ProvisionByoipCidrRequest {
  
  @scala.inline
  def apply(Cidr: GenericString, CidrAuthorizationContext: CidrAuthorizationContext): ProvisionByoipCidrRequest = {
    val __obj = js.Dynamic.literal(Cidr = Cidr.asInstanceOf[js.Any], CidrAuthorizationContext = CidrAuthorizationContext.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProvisionByoipCidrRequest]
  }
  
  @scala.inline
  implicit class ProvisionByoipCidrRequestOps[Self <: ProvisionByoipCidrRequest] (val x: Self) extends AnyVal {
    
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
    def setCidr(value: GenericString): Self = this.set("Cidr", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCidrAuthorizationContext(value: CidrAuthorizationContext): Self = this.set("CidrAuthorizationContext", value.asInstanceOf[js.Any])
  }
}
