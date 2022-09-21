package typings.awsSdk.directconnectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeRouterConfigurationRequest extends StObject {
  
  /**
    * Identifies the router by a combination of vendor, platform, and software version. For example, CiscoSystemsInc-2900SeriesRouters-IOS124.
    */
  var routerTypeIdentifier: js.UndefOr[RouterTypeIdentifier] = js.undefined
  
  /**
    * The ID of the virtual interface.
    */
  var virtualInterfaceId: VirtualInterfaceId
}
object DescribeRouterConfigurationRequest {
  
  inline def apply(virtualInterfaceId: VirtualInterfaceId): DescribeRouterConfigurationRequest = {
    val __obj = js.Dynamic.literal(virtualInterfaceId = virtualInterfaceId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeRouterConfigurationRequest]
  }
  
  extension [Self <: DescribeRouterConfigurationRequest](x: Self) {
    
    inline def setRouterTypeIdentifier(value: RouterTypeIdentifier): Self = StObject.set(x, "routerTypeIdentifier", value.asInstanceOf[js.Any])
    
    inline def setRouterTypeIdentifierUndefined: Self = StObject.set(x, "routerTypeIdentifier", js.undefined)
    
    inline def setVirtualInterfaceId(value: VirtualInterfaceId): Self = StObject.set(x, "virtualInterfaceId", value.asInstanceOf[js.Any])
  }
}
