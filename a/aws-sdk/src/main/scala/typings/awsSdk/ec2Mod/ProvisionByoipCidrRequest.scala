package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ProvisionByoipCidrRequest extends StObject {
  
  /**
    * The public IPv4 or IPv6 address range, in CIDR notation. The most specific IPv4 prefix that you can specify is /24. The most specific IPv6 prefix you can specify is /56. The address range cannot overlap with another address range that you've brought to this or another Region.
    */
  var Cidr: String = js.native
  
  /**
    * A signed document that proves that you are authorized to bring the specified IP address range to Amazon using BYOIP.
    */
  var CidrAuthorizationContext: js.UndefOr[typings.awsSdk.ec2Mod.CidrAuthorizationContext] = js.native
  
  /**
    * A description for the address range and the address pool.
    */
  var Description: js.UndefOr[String] = js.native
  
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.native
  
  /**
    * The tags to apply to the address pool.
    */
  var PoolTagSpecifications: js.UndefOr[TagSpecificationList] = js.native
  
  /**
    * (IPv6 only) Indicate whether the address range will be publicly advertised to the internet. Default: true
    */
  var PubliclyAdvertisable: js.UndefOr[Boolean] = js.native
}
object ProvisionByoipCidrRequest {
  
  @scala.inline
  def apply(Cidr: String): ProvisionByoipCidrRequest = {
    val __obj = js.Dynamic.literal(Cidr = Cidr.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProvisionByoipCidrRequest]
  }
  
  @scala.inline
  implicit class ProvisionByoipCidrRequestMutableBuilder[Self <: ProvisionByoipCidrRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCidr(value: String): Self = StObject.set(x, "Cidr", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCidrAuthorizationContext(value: CidrAuthorizationContext): Self = StObject.set(x, "CidrAuthorizationContext", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCidrAuthorizationContextUndefined: Self = StObject.set(x, "CidrAuthorizationContext", js.undefined)
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    @scala.inline
    def setDryRun(value: Boolean): Self = StObject.set(x, "DryRun", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDryRunUndefined: Self = StObject.set(x, "DryRun", js.undefined)
    
    @scala.inline
    def setPoolTagSpecifications(value: TagSpecificationList): Self = StObject.set(x, "PoolTagSpecifications", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPoolTagSpecificationsUndefined: Self = StObject.set(x, "PoolTagSpecifications", js.undefined)
    
    @scala.inline
    def setPoolTagSpecificationsVarargs(value: TagSpecification*): Self = StObject.set(x, "PoolTagSpecifications", js.Array(value :_*))
    
    @scala.inline
    def setPubliclyAdvertisable(value: Boolean): Self = StObject.set(x, "PubliclyAdvertisable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPubliclyAdvertisableUndefined: Self = StObject.set(x, "PubliclyAdvertisable", js.undefined)
  }
}
