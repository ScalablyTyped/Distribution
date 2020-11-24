package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LaunchTemplatePlacement extends js.Object {
  
  /**
    * The affinity setting for the instance on the Dedicated Host.
    */
  var Affinity: js.UndefOr[String] = js.native
  
  /**
    * The Availability Zone of the instance.
    */
  var AvailabilityZone: js.UndefOr[String] = js.native
  
  /**
    * The name of the placement group for the instance.
    */
  var GroupName: js.UndefOr[String] = js.native
  
  /**
    * The ID of the Dedicated Host for the instance.
    */
  var HostId: js.UndefOr[String] = js.native
  
  /**
    * The ARN of the host resource group in which to launch the instances. 
    */
  var HostResourceGroupArn: js.UndefOr[String] = js.native
  
  /**
    * The number of the partition the instance should launch in. Valid only if the placement group strategy is set to partition.
    */
  var PartitionNumber: js.UndefOr[Integer] = js.native
  
  /**
    * Reserved for future use.
    */
  var SpreadDomain: js.UndefOr[String] = js.native
  
  /**
    * The tenancy of the instance (if the instance is running in a VPC). An instance with a tenancy of dedicated runs on single-tenant hardware. 
    */
  var Tenancy: js.UndefOr[typings.awsSdk.ec2Mod.Tenancy] = js.native
}
object LaunchTemplatePlacement {
  
  @scala.inline
  def apply(): LaunchTemplatePlacement = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LaunchTemplatePlacement]
  }
  
  @scala.inline
  implicit class LaunchTemplatePlacementOps[Self <: LaunchTemplatePlacement] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAffinity(value: String): Self = this.set("Affinity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAffinity: Self = this.set("Affinity", js.undefined)
    
    @scala.inline
    def setAvailabilityZone(value: String): Self = this.set("AvailabilityZone", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAvailabilityZone: Self = this.set("AvailabilityZone", js.undefined)
    
    @scala.inline
    def setGroupName(value: String): Self = this.set("GroupName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGroupName: Self = this.set("GroupName", js.undefined)
    
    @scala.inline
    def setHostId(value: String): Self = this.set("HostId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHostId: Self = this.set("HostId", js.undefined)
    
    @scala.inline
    def setHostResourceGroupArn(value: String): Self = this.set("HostResourceGroupArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHostResourceGroupArn: Self = this.set("HostResourceGroupArn", js.undefined)
    
    @scala.inline
    def setPartitionNumber(value: Integer): Self = this.set("PartitionNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePartitionNumber: Self = this.set("PartitionNumber", js.undefined)
    
    @scala.inline
    def setSpreadDomain(value: String): Self = this.set("SpreadDomain", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSpreadDomain: Self = this.set("SpreadDomain", js.undefined)
    
    @scala.inline
    def setTenancy(value: Tenancy): Self = this.set("Tenancy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTenancy: Self = this.set("Tenancy", js.undefined)
  }
}
