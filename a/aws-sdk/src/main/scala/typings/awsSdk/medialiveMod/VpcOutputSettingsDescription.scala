package typings.awsSdk.medialiveMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VpcOutputSettingsDescription extends StObject {
  
  /**
    * The Availability Zones where the vpc subnets are located.
  The first Availability Zone applies to the first subnet in the list of subnets.
  The second Availability Zone applies to the second subnet.
    */
  var AvailabilityZones: js.UndefOr[listOfString] = js.undefined
  
  /**
    * A list of Elastic Network Interfaces created by MediaLive in the customer's VPC
    */
  var NetworkInterfaceIds: js.UndefOr[listOfString] = js.undefined
  
  /**
    * A list of up EC2 VPC security group IDs attached to the Output VPC network interfaces.
    */
  var SecurityGroupIds: js.UndefOr[listOfString] = js.undefined
  
  /**
    * A list of VPC subnet IDs from the same VPC.
  If STANDARD channel, subnet IDs must be mapped to two unique availability zones (AZ).
    */
  var SubnetIds: js.UndefOr[listOfString] = js.undefined
}
object VpcOutputSettingsDescription {
  
  inline def apply(): VpcOutputSettingsDescription = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VpcOutputSettingsDescription]
  }
  
  extension [Self <: VpcOutputSettingsDescription](x: Self) {
    
    inline def setAvailabilityZones(value: listOfString): Self = StObject.set(x, "AvailabilityZones", value.asInstanceOf[js.Any])
    
    inline def setAvailabilityZonesUndefined: Self = StObject.set(x, "AvailabilityZones", js.undefined)
    
    inline def setAvailabilityZonesVarargs(value: string*): Self = StObject.set(x, "AvailabilityZones", js.Array(value*))
    
    inline def setNetworkInterfaceIds(value: listOfString): Self = StObject.set(x, "NetworkInterfaceIds", value.asInstanceOf[js.Any])
    
    inline def setNetworkInterfaceIdsUndefined: Self = StObject.set(x, "NetworkInterfaceIds", js.undefined)
    
    inline def setNetworkInterfaceIdsVarargs(value: string*): Self = StObject.set(x, "NetworkInterfaceIds", js.Array(value*))
    
    inline def setSecurityGroupIds(value: listOfString): Self = StObject.set(x, "SecurityGroupIds", value.asInstanceOf[js.Any])
    
    inline def setSecurityGroupIdsUndefined: Self = StObject.set(x, "SecurityGroupIds", js.undefined)
    
    inline def setSecurityGroupIdsVarargs(value: string*): Self = StObject.set(x, "SecurityGroupIds", js.Array(value*))
    
    inline def setSubnetIds(value: listOfString): Self = StObject.set(x, "SubnetIds", value.asInstanceOf[js.Any])
    
    inline def setSubnetIdsUndefined: Self = StObject.set(x, "SubnetIds", js.undefined)
    
    inline def setSubnetIdsVarargs(value: string*): Self = StObject.set(x, "SubnetIds", js.Array(value*))
  }
}
