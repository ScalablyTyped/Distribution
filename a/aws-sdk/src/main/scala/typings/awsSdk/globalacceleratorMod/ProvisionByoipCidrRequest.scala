package typings.awsSdk.globalacceleratorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
}

