package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateDhcpOptionsRequest extends js.Object {
  
  /**
    * A DHCP configuration option.
    */
  var DhcpConfigurations: NewDhcpConfigurationList = js.native
  
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.native
  
  /**
    * The tags to assign to the DHCP option.
    */
  var TagSpecifications: js.UndefOr[TagSpecificationList] = js.native
}
object CreateDhcpOptionsRequest {
  
  @scala.inline
  def apply(DhcpConfigurations: NewDhcpConfigurationList): CreateDhcpOptionsRequest = {
    val __obj = js.Dynamic.literal(DhcpConfigurations = DhcpConfigurations.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateDhcpOptionsRequest]
  }
  
  @scala.inline
  implicit class CreateDhcpOptionsRequestOps[Self <: CreateDhcpOptionsRequest] (val x: Self) extends AnyVal {
    
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
    def setDhcpConfigurationsVarargs(value: NewDhcpConfiguration*): Self = this.set("DhcpConfigurations", js.Array(value :_*))
    
    @scala.inline
    def setDhcpConfigurations(value: NewDhcpConfigurationList): Self = this.set("DhcpConfigurations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDryRun(value: Boolean): Self = this.set("DryRun", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDryRun: Self = this.set("DryRun", js.undefined)
    
    @scala.inline
    def setTagSpecificationsVarargs(value: TagSpecification*): Self = this.set("TagSpecifications", js.Array(value :_*))
    
    @scala.inline
    def setTagSpecifications(value: TagSpecificationList): Self = this.set("TagSpecifications", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTagSpecifications: Self = this.set("TagSpecifications", js.undefined)
  }
}
