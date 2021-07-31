package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LaunchTemplatePlacement extends StObject {
  
  /**
    * The affinity setting for the instance on the Dedicated Host.
    */
  var Affinity: js.UndefOr[String] = js.undefined
  
  /**
    * The Availability Zone of the instance.
    */
  var AvailabilityZone: js.UndefOr[String] = js.undefined
  
  /**
    * The name of the placement group for the instance.
    */
  var GroupName: js.UndefOr[String] = js.undefined
  
  /**
    * The ID of the Dedicated Host for the instance.
    */
  var HostId: js.UndefOr[String] = js.undefined
  
  /**
    * The ARN of the host resource group in which to launch the instances. 
    */
  var HostResourceGroupArn: js.UndefOr[String] = js.undefined
  
  /**
    * The number of the partition the instance should launch in. Valid only if the placement group strategy is set to partition.
    */
  var PartitionNumber: js.UndefOr[Integer] = js.undefined
  
  /**
    * Reserved for future use.
    */
  var SpreadDomain: js.UndefOr[String] = js.undefined
  
  /**
    * The tenancy of the instance (if the instance is running in a VPC). An instance with a tenancy of dedicated runs on single-tenant hardware. 
    */
  var Tenancy: js.UndefOr[typings.awsSdk.ec2Mod.Tenancy] = js.undefined
}
object LaunchTemplatePlacement {
  
  @scala.inline
  def apply(): LaunchTemplatePlacement = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LaunchTemplatePlacement]
  }
  
  @scala.inline
  implicit class LaunchTemplatePlacementMutableBuilder[Self <: LaunchTemplatePlacement] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAffinity(value: String): Self = StObject.set(x, "Affinity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAffinityUndefined: Self = StObject.set(x, "Affinity", js.undefined)
    
    @scala.inline
    def setAvailabilityZone(value: String): Self = StObject.set(x, "AvailabilityZone", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAvailabilityZoneUndefined: Self = StObject.set(x, "AvailabilityZone", js.undefined)
    
    @scala.inline
    def setGroupName(value: String): Self = StObject.set(x, "GroupName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGroupNameUndefined: Self = StObject.set(x, "GroupName", js.undefined)
    
    @scala.inline
    def setHostId(value: String): Self = StObject.set(x, "HostId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHostIdUndefined: Self = StObject.set(x, "HostId", js.undefined)
    
    @scala.inline
    def setHostResourceGroupArn(value: String): Self = StObject.set(x, "HostResourceGroupArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHostResourceGroupArnUndefined: Self = StObject.set(x, "HostResourceGroupArn", js.undefined)
    
    @scala.inline
    def setPartitionNumber(value: Integer): Self = StObject.set(x, "PartitionNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPartitionNumberUndefined: Self = StObject.set(x, "PartitionNumber", js.undefined)
    
    @scala.inline
    def setSpreadDomain(value: String): Self = StObject.set(x, "SpreadDomain", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSpreadDomainUndefined: Self = StObject.set(x, "SpreadDomain", js.undefined)
    
    @scala.inline
    def setTenancy(value: Tenancy): Self = StObject.set(x, "Tenancy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTenancyUndefined: Self = StObject.set(x, "Tenancy", js.undefined)
  }
}
