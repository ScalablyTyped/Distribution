package typings.awsSdk.dlmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
  def apply(
    CopyTags: js.UndefOr[CopyTags] = js.undefined,
    CreateRule: CreateRule = null,
    CrossRegionCopyRules: CrossRegionCopyRules = null,
    FastRestoreRule: FastRestoreRule = null,
    Name: ScheduleName = null,
    RetainRule: RetainRule = null,
    TagsToAdd: TagsToAddList = null,
    VariableTags: VariableTagsList = null
  ): Schedule = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(CopyTags)) __obj.updateDynamic("CopyTags")(CopyTags.get.asInstanceOf[js.Any])
    if (CreateRule != null) __obj.updateDynamic("CreateRule")(CreateRule.asInstanceOf[js.Any])
    if (CrossRegionCopyRules != null) __obj.updateDynamic("CrossRegionCopyRules")(CrossRegionCopyRules.asInstanceOf[js.Any])
    if (FastRestoreRule != null) __obj.updateDynamic("FastRestoreRule")(FastRestoreRule.asInstanceOf[js.Any])
    if (Name != null) __obj.updateDynamic("Name")(Name.asInstanceOf[js.Any])
    if (RetainRule != null) __obj.updateDynamic("RetainRule")(RetainRule.asInstanceOf[js.Any])
    if (TagsToAdd != null) __obj.updateDynamic("TagsToAdd")(TagsToAdd.asInstanceOf[js.Any])
    if (VariableTags != null) __obj.updateDynamic("VariableTags")(VariableTags.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schedule]
  }
}

