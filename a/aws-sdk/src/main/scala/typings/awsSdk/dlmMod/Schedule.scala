package typings.awsSdk.dlmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Schedule extends StObject {
  
  /**
    * Copy all user-defined tags on a source volume to snapshots of the volume created by this policy.
    */
  var CopyTags: js.UndefOr[typings.awsSdk.dlmMod.CopyTags] = js.native
  
  /**
    * The creation rule.
    */
  var CreateRule: js.UndefOr[typings.awsSdk.dlmMod.CreateRule] = js.native
  
  /**
    * The rule for cross-Region snapshot copies.
    */
  var CrossRegionCopyRules: js.UndefOr[typings.awsSdk.dlmMod.CrossRegionCopyRules] = js.native
  
  /**
    * The rule for enabling fast snapshot restore.
    */
  var FastRestoreRule: js.UndefOr[typings.awsSdk.dlmMod.FastRestoreRule] = js.native
  
  /**
    * The name of the schedule.
    */
  var Name: js.UndefOr[ScheduleName] = js.native
  
  /**
    * The retention rule.
    */
  var RetainRule: js.UndefOr[typings.awsSdk.dlmMod.RetainRule] = js.native
  
  /**
    * The tags to apply to policy-created resources. These user-defined tags are in addition to the AWS-added lifecycle tags.
    */
  var TagsToAdd: js.UndefOr[TagsToAddList] = js.native
  
  /**
    * A collection of key/value pairs with values determined dynamically when the policy is executed. Keys may be any valid Amazon EC2 tag key. Values must be in one of the two following formats: $(instance-id) or $(timestamp). Variable tags are only valid for EBS Snapshot Management – Instance policies.
    */
  var VariableTags: js.UndefOr[VariableTagsList] = js.native
}
object Schedule {
  
  @scala.inline
  def apply(): Schedule = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Schedule]
  }
  
  @scala.inline
  implicit class ScheduleMutableBuilder[Self <: Schedule] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCopyTags(value: CopyTags): Self = StObject.set(x, "CopyTags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCopyTagsUndefined: Self = StObject.set(x, "CopyTags", js.undefined)
    
    @scala.inline
    def setCreateRule(value: CreateRule): Self = StObject.set(x, "CreateRule", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreateRuleUndefined: Self = StObject.set(x, "CreateRule", js.undefined)
    
    @scala.inline
    def setCrossRegionCopyRules(value: CrossRegionCopyRules): Self = StObject.set(x, "CrossRegionCopyRules", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCrossRegionCopyRulesUndefined: Self = StObject.set(x, "CrossRegionCopyRules", js.undefined)
    
    @scala.inline
    def setCrossRegionCopyRulesVarargs(value: CrossRegionCopyRule*): Self = StObject.set(x, "CrossRegionCopyRules", js.Array(value :_*))
    
    @scala.inline
    def setFastRestoreRule(value: FastRestoreRule): Self = StObject.set(x, "FastRestoreRule", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFastRestoreRuleUndefined: Self = StObject.set(x, "FastRestoreRule", js.undefined)
    
    @scala.inline
    def setName(value: ScheduleName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    @scala.inline
    def setRetainRule(value: RetainRule): Self = StObject.set(x, "RetainRule", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRetainRuleUndefined: Self = StObject.set(x, "RetainRule", js.undefined)
    
    @scala.inline
    def setTagsToAdd(value: TagsToAddList): Self = StObject.set(x, "TagsToAdd", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagsToAddUndefined: Self = StObject.set(x, "TagsToAdd", js.undefined)
    
    @scala.inline
    def setTagsToAddVarargs(value: Tag*): Self = StObject.set(x, "TagsToAdd", js.Array(value :_*))
    
    @scala.inline
    def setVariableTags(value: VariableTagsList): Self = StObject.set(x, "VariableTags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVariableTagsUndefined: Self = StObject.set(x, "VariableTags", js.undefined)
    
    @scala.inline
    def setVariableTagsVarargs(value: Tag*): Self = StObject.set(x, "VariableTags", js.Array(value :_*))
  }
}
