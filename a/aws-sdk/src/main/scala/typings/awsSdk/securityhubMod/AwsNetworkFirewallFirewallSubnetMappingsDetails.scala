package typings.awsSdk.securityhubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AwsNetworkFirewallFirewallSubnetMappingsDetails extends StObject {
  
  /**
    * The identifier of the subnet
    */
  var SubnetId: js.UndefOr[NonEmptyString] = js.undefined
}
object AwsNetworkFirewallFirewallSubnetMappingsDetails {
  
  inline def apply(): AwsNetworkFirewallFirewallSubnetMappingsDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AwsNetworkFirewallFirewallSubnetMappingsDetails]
  }
  
  extension [Self <: AwsNetworkFirewallFirewallSubnetMappingsDetails](x: Self) {
    
    inline def setSubnetId(value: NonEmptyString): Self = StObject.set(x, "SubnetId", value.asInstanceOf[js.Any])
    
    inline def setSubnetIdUndefined: Self = StObject.set(x, "SubnetId", js.undefined)
  }
}
