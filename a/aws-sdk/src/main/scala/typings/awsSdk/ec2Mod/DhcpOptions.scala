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
    * The ID of the Amazon Web Services account that owns the DHCP options set.
    */
  var OwnerId: js.UndefOr[String] = js.undefined
  
  /**
    * Any tags assigned to the DHCP options set.
    */
  var Tags: js.UndefOr[TagList] = js.undefined
}
object DhcpOptions {
  
  inline def apply(): DhcpOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DhcpOptions]
  }
  
  extension [Self <: DhcpOptions](x: Self) {
    
    inline def setDhcpConfigurations(value: DhcpConfigurationList): Self = StObject.set(x, "DhcpConfigurations", value.asInstanceOf[js.Any])
    
    inline def setDhcpConfigurationsUndefined: Self = StObject.set(x, "DhcpConfigurations", js.undefined)
    
    inline def setDhcpConfigurationsVarargs(value: DhcpConfiguration*): Self = StObject.set(x, "DhcpConfigurations", js.Array(value*))
    
    inline def setDhcpOptionsId(value: String): Self = StObject.set(x, "DhcpOptionsId", value.asInstanceOf[js.Any])
    
    inline def setDhcpOptionsIdUndefined: Self = StObject.set(x, "DhcpOptionsId", js.undefined)
    
    inline def setOwnerId(value: String): Self = StObject.set(x, "OwnerId", value.asInstanceOf[js.Any])
    
    inline def setOwnerIdUndefined: Self = StObject.set(x, "OwnerId", js.undefined)
    
    inline def setTags(value: TagList): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    inline def setTagsVarargs(value: Tag*): Self = StObject.set(x, "Tags", js.Array(value*))
  }
}
