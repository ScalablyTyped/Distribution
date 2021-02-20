package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateDhcpOptionsRequest extends StObject {
  
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
  implicit class CreateDhcpOptionsRequestMutableBuilder[Self <: CreateDhcpOptionsRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDhcpConfigurations(value: NewDhcpConfigurationList): Self = StObject.set(x, "DhcpConfigurations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDhcpConfigurationsVarargs(value: NewDhcpConfiguration*): Self = StObject.set(x, "DhcpConfigurations", js.Array(value :_*))
    
    @scala.inline
    def setDryRun(value: Boolean): Self = StObject.set(x, "DryRun", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDryRunUndefined: Self = StObject.set(x, "DryRun", js.undefined)
    
    @scala.inline
    def setTagSpecifications(value: TagSpecificationList): Self = StObject.set(x, "TagSpecifications", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagSpecificationsUndefined: Self = StObject.set(x, "TagSpecifications", js.undefined)
    
    @scala.inline
    def setTagSpecificationsVarargs(value: TagSpecification*): Self = StObject.set(x, "TagSpecifications", js.Array(value :_*))
  }
}
