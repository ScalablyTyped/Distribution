package typings.awsSdk.shieldMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ProtectionGroup extends StObject {
  
  /**
    * Defines how AWS Shield combines resource data for the group in order to detect, mitigate, and report events.   Sum - Use the total traffic across the group. This is a good choice for most cases. Examples include Elastic IP addresses for EC2 instances that scale manually or automatically.   Mean - Use the average of the traffic across the group. This is a good choice for resources that share traffic uniformly. Examples include accelerators and load balancers.   Max - Use the highest traffic from each resource. This is useful for resources that don't share traffic and for resources that share that traffic in a non-uniform way. Examples include CloudFront distributions and origin resources for CloudFront distributions.  
    */
  var Aggregation: ProtectionGroupAggregation
  
  /**
    * The Amazon Resource Names (ARNs) of the resources to include in the protection group. You must set this when you set Pattern to ARBITRARY and you must not set it for any other Pattern setting. 
    */
  var Members: ProtectionGroupMembers
  
  /**
    * The criteria to use to choose the protected resources for inclusion in the group. You can include all resources that have protections, provide a list of resource Amazon Resource Names (ARNs), or include all resources of a specified resource type.
    */
  var Pattern: ProtectionGroupPattern
  
  /**
    * The name of the protection group. You use this to identify the protection group in lists and to manage the protection group, for example to update, delete, or describe it. 
    */
  var ProtectionGroupId: typings.awsSdk.shieldMod.ProtectionGroupId
  
  /**
    * The resource type to include in the protection group. All protected resources of this type are included in the protection group. You must set this when you set Pattern to BY_RESOURCE_TYPE and you must not set it for any other Pattern setting. 
    */
  var ResourceType: js.UndefOr[ProtectedResourceType] = js.undefined
}
object ProtectionGroup {
  
  inline def apply(
    Aggregation: ProtectionGroupAggregation,
    Members: ProtectionGroupMembers,
    Pattern: ProtectionGroupPattern,
    ProtectionGroupId: ProtectionGroupId
  ): ProtectionGroup = {
    val __obj = js.Dynamic.literal(Aggregation = Aggregation.asInstanceOf[js.Any], Members = Members.asInstanceOf[js.Any], Pattern = Pattern.asInstanceOf[js.Any], ProtectionGroupId = ProtectionGroupId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProtectionGroup]
  }
  
  extension [Self <: ProtectionGroup](x: Self) {
    
    inline def setAggregation(value: ProtectionGroupAggregation): Self = StObject.set(x, "Aggregation", value.asInstanceOf[js.Any])
    
    inline def setMembers(value: ProtectionGroupMembers): Self = StObject.set(x, "Members", value.asInstanceOf[js.Any])
    
    inline def setMembersVarargs(value: ResourceArn*): Self = StObject.set(x, "Members", js.Array(value :_*))
    
    inline def setPattern(value: ProtectionGroupPattern): Self = StObject.set(x, "Pattern", value.asInstanceOf[js.Any])
    
    inline def setProtectionGroupId(value: ProtectionGroupId): Self = StObject.set(x, "ProtectionGroupId", value.asInstanceOf[js.Any])
    
    inline def setResourceType(value: ProtectedResourceType): Self = StObject.set(x, "ResourceType", value.asInstanceOf[js.Any])
    
    inline def setResourceTypeUndefined: Self = StObject.set(x, "ResourceType", js.undefined)
  }
}
