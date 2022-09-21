package typings.awsSdk.directconnectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeRouterConfigurationResponse extends StObject {
  
  /**
    * The customer router configuration.
    */
  var customerRouterConfig: js.UndefOr[RouterConfig] = js.undefined
  
  /**
    * The details about the router.
    */
  var router: js.UndefOr[RouterType] = js.undefined
  
  /**
    * The ID assigned to the virtual interface.
    */
  var virtualInterfaceId: js.UndefOr[VirtualInterfaceId] = js.undefined
  
  /**
    * Provides the details about a virtual interface's router.
    */
  var virtualInterfaceName: js.UndefOr[VirtualInterfaceName] = js.undefined
}
object DescribeRouterConfigurationResponse {
  
  inline def apply(): DescribeRouterConfigurationResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeRouterConfigurationResponse]
  }
  
  extension [Self <: DescribeRouterConfigurationResponse](x: Self) {
    
    inline def setCustomerRouterConfig(value: RouterConfig): Self = StObject.set(x, "customerRouterConfig", value.asInstanceOf[js.Any])
    
    inline def setCustomerRouterConfigUndefined: Self = StObject.set(x, "customerRouterConfig", js.undefined)
    
    inline def setRouter(value: RouterType): Self = StObject.set(x, "router", value.asInstanceOf[js.Any])
    
    inline def setRouterUndefined: Self = StObject.set(x, "router", js.undefined)
    
    inline def setVirtualInterfaceId(value: VirtualInterfaceId): Self = StObject.set(x, "virtualInterfaceId", value.asInstanceOf[js.Any])
    
    inline def setVirtualInterfaceIdUndefined: Self = StObject.set(x, "virtualInterfaceId", js.undefined)
    
    inline def setVirtualInterfaceName(value: VirtualInterfaceName): Self = StObject.set(x, "virtualInterfaceName", value.asInstanceOf[js.Any])
    
    inline def setVirtualInterfaceNameUndefined: Self = StObject.set(x, "virtualInterfaceName", js.undefined)
  }
}
