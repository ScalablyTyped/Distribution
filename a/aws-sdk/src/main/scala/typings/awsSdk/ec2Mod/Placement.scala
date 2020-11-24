package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Placement extends js.Object {
  
  /**
    * The affinity setting for the instance on the Dedicated Host. This parameter is not supported for the ImportInstance command. This parameter is not supported by CreateFleet.
    */
  var Affinity: js.UndefOr[String] = js.native
  
  /**
    * The Availability Zone of the instance. If not specified, an Availability Zone will be automatically chosen for you based on the load balancing criteria for the Region. This parameter is not supported by CreateFleet.
    */
  var AvailabilityZone: js.UndefOr[String] = js.native
  
  /**
    * The name of the placement group the instance is in.
    */
  var GroupName: js.UndefOr[String] = js.native
  
  /**
    * The ID of the Dedicated Host on which the instance resides. This parameter is not supported for the ImportInstance command. This parameter is not supported by CreateFleet.
    */
  var HostId: js.UndefOr[String] = js.native
  
  /**
    * The ARN of the host resource group in which to launch the instances. If you specify a host resource group ARN, omit the Tenancy parameter or set it to host. This parameter is not supported by CreateFleet.
    */
  var HostResourceGroupArn: js.UndefOr[String] = js.native
  
  /**
    * The number of the partition the instance is in. Valid only if the placement group strategy is set to partition. This parameter is not supported by CreateFleet.
    */
  var PartitionNumber: js.UndefOr[Integer] = js.native
  
  /**
    * Reserved for future use. This parameter is not supported by CreateFleet.
    */
  var SpreadDomain: js.UndefOr[String] = js.native
  
  /**
    * The tenancy of the instance (if the instance is running in a VPC). An instance with a tenancy of dedicated runs on single-tenant hardware. The host tenancy is not supported for the ImportInstance command. This parameter is not supported by CreateFleet.
    */
  var Tenancy: js.UndefOr[typings.awsSdk.ec2Mod.Tenancy] = js.native
}
object Placement {
  
  @scala.inline
  def apply(): Placement = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Placement]
  }
  
  @scala.inline
  implicit class PlacementOps[Self <: Placement] (val x: Self) extends AnyVal {
    
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
