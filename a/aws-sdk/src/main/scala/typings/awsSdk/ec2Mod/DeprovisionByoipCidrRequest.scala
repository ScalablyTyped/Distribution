package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeprovisionByoipCidrRequest extends StObject {
  
  /**
    * The address range, in CIDR notation. The prefix must be the same prefix that you specified when you provisioned the address range.
    */
  var Cidr: String = js.native
  
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.native
}
object DeprovisionByoipCidrRequest {
  
  @scala.inline
  def apply(Cidr: String): DeprovisionByoipCidrRequest = {
    val __obj = js.Dynamic.literal(Cidr = Cidr.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeprovisionByoipCidrRequest]
  }
  
  @scala.inline
  implicit class DeprovisionByoipCidrRequestMutableBuilder[Self <: DeprovisionByoipCidrRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCidr(value: String): Self = StObject.set(x, "Cidr", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDryRun(value: Boolean): Self = StObject.set(x, "DryRun", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDryRunUndefined: Self = StObject.set(x, "DryRun", js.undefined)
  }
}
