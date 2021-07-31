package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ModifyInstancePlacementRequest extends StObject {
  
  /**
    * The affinity setting for the instance.
    */
  var Affinity: js.UndefOr[typings.awsSdk.ec2Mod.Affinity] = js.undefined
  
  /**
    * The name of the placement group in which to place the instance. For spread placement groups, the instance must have a tenancy of default. For cluster and partition placement groups, the instance must have a tenancy of default or dedicated. To remove an instance from a placement group, specify an empty string ("").
    */
  var GroupName: js.UndefOr[PlacementGroupName] = js.undefined
  
  /**
    * The ID of the Dedicated Host with which to associate the instance.
    */
  var HostId: js.UndefOr[DedicatedHostId] = js.undefined
  
  /**
    * The ARN of the host resource group in which to place the instance.
    */
  var HostResourceGroupArn: js.UndefOr[String] = js.undefined
  
  /**
    * The ID of the instance that you are modifying.
    */
  var InstanceId: typings.awsSdk.ec2Mod.InstanceId
  
  /**
    * Reserved for future use.
    */
  var PartitionNumber: js.UndefOr[Integer] = js.undefined
  
  /**
    * The tenancy for the instance.
    */
  var Tenancy: js.UndefOr[HostTenancy] = js.undefined
}
object ModifyInstancePlacementRequest {
  
  @scala.inline
  def apply(InstanceId: InstanceId): ModifyInstancePlacementRequest = {
    val __obj = js.Dynamic.literal(InstanceId = InstanceId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModifyInstancePlacementRequest]
  }
  
  @scala.inline
  implicit class ModifyInstancePlacementRequestMutableBuilder[Self <: ModifyInstancePlacementRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAffinity(value: Affinity): Self = StObject.set(x, "Affinity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAffinityUndefined: Self = StObject.set(x, "Affinity", js.undefined)
    
    @scala.inline
    def setGroupName(value: PlacementGroupName): Self = StObject.set(x, "GroupName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGroupNameUndefined: Self = StObject.set(x, "GroupName", js.undefined)
    
    @scala.inline
    def setHostId(value: DedicatedHostId): Self = StObject.set(x, "HostId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHostIdUndefined: Self = StObject.set(x, "HostId", js.undefined)
    
    @scala.inline
    def setHostResourceGroupArn(value: String): Self = StObject.set(x, "HostResourceGroupArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHostResourceGroupArnUndefined: Self = StObject.set(x, "HostResourceGroupArn", js.undefined)
    
    @scala.inline
    def setInstanceId(value: InstanceId): Self = StObject.set(x, "InstanceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPartitionNumber(value: Integer): Self = StObject.set(x, "PartitionNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPartitionNumberUndefined: Self = StObject.set(x, "PartitionNumber", js.undefined)
    
    @scala.inline
    def setTenancy(value: HostTenancy): Self = StObject.set(x, "Tenancy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTenancyUndefined: Self = StObject.set(x, "Tenancy", js.undefined)
  }
}
