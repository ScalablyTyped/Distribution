package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ProvisionByoipCidrRequest extends js.Object {
  
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
  implicit class ProvisionByoipCidrRequestOps[Self <: ProvisionByoipCidrRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setCidr(value: String): Self = this.set("Cidr", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCidrAuthorizationContext(value: CidrAuthorizationContext): Self = this.set("CidrAuthorizationContext", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCidrAuthorizationContext: Self = this.set("CidrAuthorizationContext", js.undefined)
    
    @scala.inline
    def setDescription(value: String): Self = this.set("Description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDescription: Self = this.set("Description", js.undefined)
    
    @scala.inline
    def setDryRun(value: Boolean): Self = this.set("DryRun", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDryRun: Self = this.set("DryRun", js.undefined)
    
    @scala.inline
    def setPoolTagSpecificationsVarargs(value: TagSpecification*): Self = this.set("PoolTagSpecifications", js.Array(value :_*))
    
    @scala.inline
    def setPoolTagSpecifications(value: TagSpecificationList): Self = this.set("PoolTagSpecifications", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePoolTagSpecifications: Self = this.set("PoolTagSpecifications", js.undefined)
    
    @scala.inline
    def setPubliclyAdvertisable(value: Boolean): Self = this.set("PubliclyAdvertisable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePubliclyAdvertisable: Self = this.set("PubliclyAdvertisable", js.undefined)
  }
}
