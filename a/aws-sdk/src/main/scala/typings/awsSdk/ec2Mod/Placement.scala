package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Placement extends StObject {
  
  /**
    * The affinity setting for the instance on the Dedicated Host. This parameter is not supported for the ImportInstance command. This parameter is not supported by CreateFleet.
    */
  var Affinity: js.UndefOr[String] = js.undefined
  
  /**
    * The Availability Zone of the instance. If not specified, an Availability Zone will be automatically chosen for you based on the load balancing criteria for the Region. This parameter is not supported by CreateFleet.
    */
  var AvailabilityZone: js.UndefOr[String] = js.undefined
  
  /**
    * The name of the placement group the instance is in.
    */
  var GroupName: js.UndefOr[String] = js.undefined
  
  /**
    * The ID of the Dedicated Host on which the instance resides. This parameter is not supported for the ImportInstance command. This parameter is not supported by CreateFleet.
    */
  var HostId: js.UndefOr[String] = js.undefined
  
  /**
    * The ARN of the host resource group in which to launch the instances. If you specify a host resource group ARN, omit the Tenancy parameter or set it to host. This parameter is not supported by CreateFleet.
    */
  var HostResourceGroupArn: js.UndefOr[String] = js.undefined
  
  /**
    * The number of the partition the instance is in. Valid only if the placement group strategy is set to partition. This parameter is not supported by CreateFleet.
    */
  var PartitionNumber: js.UndefOr[Integer] = js.undefined
  
  /**
    * Reserved for future use. This parameter is not supported by CreateFleet.
    */
  var SpreadDomain: js.UndefOr[String] = js.undefined
  
  /**
    * The tenancy of the instance (if the instance is running in a VPC). An instance with a tenancy of dedicated runs on single-tenant hardware. The host tenancy is not supported for the ImportInstance command. This parameter is not supported by CreateFleet.
    */
  var Tenancy: js.UndefOr[typings.awsSdk.ec2Mod.Tenancy] = js.undefined
}
object Placement {
  
  inline def apply(): Placement = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Placement]
  }
  
  extension [Self <: Placement](x: Self) {
    
    inline def setAffinity(value: String): Self = StObject.set(x, "Affinity", value.asInstanceOf[js.Any])
    
    inline def setAffinityUndefined: Self = StObject.set(x, "Affinity", js.undefined)
    
    inline def setAvailabilityZone(value: String): Self = StObject.set(x, "AvailabilityZone", value.asInstanceOf[js.Any])
    
    inline def setAvailabilityZoneUndefined: Self = StObject.set(x, "AvailabilityZone", js.undefined)
    
    inline def setGroupName(value: String): Self = StObject.set(x, "GroupName", value.asInstanceOf[js.Any])
    
    inline def setGroupNameUndefined: Self = StObject.set(x, "GroupName", js.undefined)
    
    inline def setHostId(value: String): Self = StObject.set(x, "HostId", value.asInstanceOf[js.Any])
    
    inline def setHostIdUndefined: Self = StObject.set(x, "HostId", js.undefined)
    
    inline def setHostResourceGroupArn(value: String): Self = StObject.set(x, "HostResourceGroupArn", value.asInstanceOf[js.Any])
    
    inline def setHostResourceGroupArnUndefined: Self = StObject.set(x, "HostResourceGroupArn", js.undefined)
    
    inline def setPartitionNumber(value: Integer): Self = StObject.set(x, "PartitionNumber", value.asInstanceOf[js.Any])
    
    inline def setPartitionNumberUndefined: Self = StObject.set(x, "PartitionNumber", js.undefined)
    
    inline def setSpreadDomain(value: String): Self = StObject.set(x, "SpreadDomain", value.asInstanceOf[js.Any])
    
    inline def setSpreadDomainUndefined: Self = StObject.set(x, "SpreadDomain", js.undefined)
    
    inline def setTenancy(value: Tenancy): Self = StObject.set(x, "Tenancy", value.asInstanceOf[js.Any])
    
    inline def setTenancyUndefined: Self = StObject.set(x, "Tenancy", js.undefined)
  }
}
