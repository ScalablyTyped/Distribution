package typings.awsSdk.dlmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PolicyDetails extends StObject {
  
  /**
    * A set of optional parameters for the policy. 
    */
  var Parameters: js.UndefOr[typings.awsSdk.dlmMod.Parameters] = js.undefined
  
  /**
    * The valid target resource types and actions a policy can manage. Specify EBS_SNAPSHOT_MANAGEMENT to create a lifecycle policy that manages the lifecycle of Amazon EBS snapshots. Specify IMAGE_MANAGEMENT to create a lifecycle policy that manages the lifecycle of EBS-backed AMIs. The default is EBS_SNAPSHOT_MANAGEMENT.
    */
  var PolicyType: js.UndefOr[PolicyTypeValues] = js.undefined
  
  /**
    * The resource type. Use VOLUME to create snapshots of individual volumes or use INSTANCE to create multi-volume snapshots from the volumes for an instance.
    */
  var ResourceTypes: js.UndefOr[ResourceTypeValuesList] = js.undefined
  
  /**
    * The schedules of policy-defined actions. A policy can have up to four schedules - one mandatory schedule and up to three optional schedules.
    */
  var Schedules: js.UndefOr[ScheduleList] = js.undefined
  
  /**
    * The single tag that identifies targeted resources for this policy.
    */
  var TargetTags: js.UndefOr[TargetTagList] = js.undefined
}
object PolicyDetails {
  
  @scala.inline
  def apply(): PolicyDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PolicyDetails]
  }
  
  @scala.inline
  implicit class PolicyDetailsMutableBuilder[Self <: PolicyDetails] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: Parameters): Self = StObject.set(x, "Parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParametersUndefined: Self = StObject.set(x, "Parameters", js.undefined)
    
    @scala.inline
    def setPolicyType(value: PolicyTypeValues): Self = StObject.set(x, "PolicyType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPolicyTypeUndefined: Self = StObject.set(x, "PolicyType", js.undefined)
    
    @scala.inline
    def setResourceTypes(value: ResourceTypeValuesList): Self = StObject.set(x, "ResourceTypes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceTypesUndefined: Self = StObject.set(x, "ResourceTypes", js.undefined)
    
    @scala.inline
    def setResourceTypesVarargs(value: ResourceTypeValues*): Self = StObject.set(x, "ResourceTypes", js.Array(value :_*))
    
    @scala.inline
    def setSchedules(value: ScheduleList): Self = StObject.set(x, "Schedules", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSchedulesUndefined: Self = StObject.set(x, "Schedules", js.undefined)
    
    @scala.inline
    def setSchedulesVarargs(value: Schedule*): Self = StObject.set(x, "Schedules", js.Array(value :_*))
    
    @scala.inline
    def setTargetTags(value: TargetTagList): Self = StObject.set(x, "TargetTags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetTagsUndefined: Self = StObject.set(x, "TargetTags", js.undefined)
    
    @scala.inline
    def setTargetTagsVarargs(value: Tag*): Self = StObject.set(x, "TargetTags", js.Array(value :_*))
  }
}
