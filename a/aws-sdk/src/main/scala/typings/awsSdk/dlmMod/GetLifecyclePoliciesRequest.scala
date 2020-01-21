package typings.awsSdk.dlmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetLifecyclePoliciesRequest extends js.Object {
  /**
    * The identifiers of the data lifecycle policies.
    */
  var PolicyIds: js.UndefOr[PolicyIdList] = js.native
  /**
    * The resource type.
    */
  var ResourceTypes: js.UndefOr[ResourceTypeValuesList] = js.native
  /**
    * The activation state.
    */
  var State: js.UndefOr[GettablePolicyStateValues] = js.native
  /**
    * The tags to add to objects created by the policy. Tags are strings in the format key=value. These user-defined tags are added in addition to the AWS-added lifecycle tags.
    */
  var TagsToAdd: js.UndefOr[TagsToAddFilterList] = js.native
  /**
    * The target tag for a policy. Tags are strings in the format key=value.
    */
  var TargetTags: js.UndefOr[TargetTagsFilterList] = js.native
}

object GetLifecyclePoliciesRequest {
  @scala.inline
  def apply(
    PolicyIds: PolicyIdList = null,
    ResourceTypes: ResourceTypeValuesList = null,
    State: GettablePolicyStateValues = null,
    TagsToAdd: TagsToAddFilterList = null,
    TargetTags: TargetTagsFilterList = null
  ): GetLifecyclePoliciesRequest = {
    val __obj = js.Dynamic.literal()
    if (PolicyIds != null) __obj.updateDynamic("PolicyIds")(PolicyIds.asInstanceOf[js.Any])
    if (ResourceTypes != null) __obj.updateDynamic("ResourceTypes")(ResourceTypes.asInstanceOf[js.Any])
    if (State != null) __obj.updateDynamic("State")(State.asInstanceOf[js.Any])
    if (TagsToAdd != null) __obj.updateDynamic("TagsToAdd")(TagsToAdd.asInstanceOf[js.Any])
    if (TargetTags != null) __obj.updateDynamic("TargetTags")(TargetTags.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetLifecyclePoliciesRequest]
  }
}

