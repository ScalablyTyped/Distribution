package typings.awsSdk.shieldMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateProtectionGroupRequest extends js.Object {
  
  /**
    * Defines how AWS Shield combines resource data for the group in order to detect, mitigate, and report events.   Sum - Use the total traffic across the group. This is a good choice for most cases. Examples include Elastic IP addresses for EC2 instances that scale manually or automatically.   Mean - Use the average of the traffic across the group. This is a good choice for resources that share traffic uniformly. Examples include accelerators and load balancers.   Max - Use the highest traffic from each resource. This is useful for resources that don't share traffic and for resources that share that traffic in a non-uniform way. Examples include CloudFront distributions and origin resources for CloudFront distributions.  
    */
  var Aggregation: ProtectionGroupAggregation = js.native
  
  /**
    * The Amazon Resource Names (ARNs) of the resources to include in the protection group. You must set this when you set Pattern to ARBITRARY and you must not set it for any other Pattern setting. 
    */
  var Members: js.UndefOr[ProtectionGroupMembers] = js.native
  
  /**
    * The criteria to use to choose the protected resources for inclusion in the group. You can include all resources that have protections, provide a list of resource Amazon Resource Names (ARNs), or include all resources of a specified resource type.
    */
  var Pattern: ProtectionGroupPattern = js.native
  
  /**
    * The name of the protection group. You use this to identify the protection group in lists and to manage the protection group, for example to update, delete, or describe it. 
    */
  var ProtectionGroupId: typings.awsSdk.shieldMod.ProtectionGroupId = js.native
  
  /**
    * The resource type to include in the protection group. All protected resources of this type are included in the protection group. You must set this when you set Pattern to BY_RESOURCE_TYPE and you must not set it for any other Pattern setting. 
    */
  var ResourceType: js.UndefOr[ProtectedResourceType] = js.native
}
object UpdateProtectionGroupRequest {
  
  @scala.inline
  def apply(
    Aggregation: ProtectionGroupAggregation,
    Pattern: ProtectionGroupPattern,
    ProtectionGroupId: ProtectionGroupId
  ): UpdateProtectionGroupRequest = {
    val __obj = js.Dynamic.literal(Aggregation = Aggregation.asInstanceOf[js.Any], Pattern = Pattern.asInstanceOf[js.Any], ProtectionGroupId = ProtectionGroupId.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateProtectionGroupRequest]
  }
  
  @scala.inline
  implicit class UpdateProtectionGroupRequestOps[Self <: UpdateProtectionGroupRequest] (val x: Self) extends AnyVal {
    
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
    def setAggregation(value: ProtectionGroupAggregation): Self = this.set("Aggregation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPattern(value: ProtectionGroupPattern): Self = this.set("Pattern", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProtectionGroupId(value: ProtectionGroupId): Self = this.set("ProtectionGroupId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMembersVarargs(value: ResourceArn*): Self = this.set("Members", js.Array(value :_*))
    
    @scala.inline
    def setMembers(value: ProtectionGroupMembers): Self = this.set("Members", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMembers: Self = this.set("Members", js.undefined)
    
    @scala.inline
    def setResourceType(value: ProtectedResourceType): Self = this.set("ResourceType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResourceType: Self = this.set("ResourceType", js.undefined)
  }
}
