package typings.awsSdk.dlmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Schedule extends js.Object {
  
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
  implicit class ScheduleOps[Self <: Schedule] (val x: Self) extends AnyVal {
    
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
    def setCopyTags(value: CopyTags): Self = this.set("CopyTags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCopyTags: Self = this.set("CopyTags", js.undefined)
    
    @scala.inline
    def setCreateRule(value: CreateRule): Self = this.set("CreateRule", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreateRule: Self = this.set("CreateRule", js.undefined)
    
    @scala.inline
    def setCrossRegionCopyRulesVarargs(value: CrossRegionCopyRule*): Self = this.set("CrossRegionCopyRules", js.Array(value :_*))
    
    @scala.inline
    def setCrossRegionCopyRules(value: CrossRegionCopyRules): Self = this.set("CrossRegionCopyRules", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCrossRegionCopyRules: Self = this.set("CrossRegionCopyRules", js.undefined)
    
    @scala.inline
    def setFastRestoreRule(value: FastRestoreRule): Self = this.set("FastRestoreRule", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFastRestoreRule: Self = this.set("FastRestoreRule", js.undefined)
    
    @scala.inline
    def setName(value: ScheduleName): Self = this.set("Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("Name", js.undefined)
    
    @scala.inline
    def setRetainRule(value: RetainRule): Self = this.set("RetainRule", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRetainRule: Self = this.set("RetainRule", js.undefined)
    
    @scala.inline
    def setTagsToAddVarargs(value: Tag*): Self = this.set("TagsToAdd", js.Array(value :_*))
    
    @scala.inline
    def setTagsToAdd(value: TagsToAddList): Self = this.set("TagsToAdd", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTagsToAdd: Self = this.set("TagsToAdd", js.undefined)
    
    @scala.inline
    def setVariableTagsVarargs(value: Tag*): Self = this.set("VariableTags", js.Array(value :_*))
    
    @scala.inline
    def setVariableTags(value: VariableTagsList): Self = this.set("VariableTags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVariableTags: Self = this.set("VariableTags", js.undefined)
  }
}
