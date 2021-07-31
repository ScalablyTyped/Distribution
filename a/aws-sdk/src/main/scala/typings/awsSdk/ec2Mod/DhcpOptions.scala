package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DhcpOptions extends StObject {
  
  /**
    * One or more DHCP options in the set.
    */
  var DhcpConfigurations: js.UndefOr[DhcpConfigurationList] = js.undefined
  
  /**
    * The ID of the set of DHCP options.
    */
  var DhcpOptionsId: js.UndefOr[String] = js.undefined
  
  /**
    * The ID of the AWS account that owns the DHCP options set.
    */
  var OwnerId: js.UndefOr[String] = js.undefined
  
  /**
    * Any tags assigned to the DHCP options set.
    */
  var Tags: js.UndefOr[TagList] = js.undefined
}
object DhcpOptions {
  
  @scala.inline
  def apply(): DhcpOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DhcpOptions]
  }
  
  @scala.inline
  implicit class DhcpOptionsMutableBuilder[Self <: DhcpOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDhcpConfigurations(value: DhcpConfigurationList): Self = StObject.set(x, "DhcpConfigurations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDhcpConfigurationsUndefined: Self = StObject.set(x, "DhcpConfigurations", js.undefined)
    
    @scala.inline
    def setDhcpConfigurationsVarargs(value: DhcpConfiguration*): Self = StObject.set(x, "DhcpConfigurations", js.Array(value :_*))
    
    @scala.inline
    def setDhcpOptionsId(value: String): Self = StObject.set(x, "DhcpOptionsId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDhcpOptionsIdUndefined: Self = StObject.set(x, "DhcpOptionsId", js.undefined)
    
    @scala.inline
    def setOwnerId(value: String): Self = StObject.set(x, "OwnerId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOwnerIdUndefined: Self = StObject.set(x, "OwnerId", js.undefined)
    
    @scala.inline
    def setTags(value: TagList): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    @scala.inline
    def setTagsVarargs(value: Tag*): Self = StObject.set(x, "Tags", js.Array(value :_*))
  }
}
