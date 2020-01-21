package typings.awsSdk.dlmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LifecyclePolicySummary extends js.Object {
  /**
    * The description of the lifecycle policy.
    */
  var Description: js.UndefOr[PolicyDescription] = js.native
  /**
    * The identifier of the lifecycle policy.
    */
  var PolicyId: js.UndefOr[typings.awsSdk.dlmMod.PolicyId] = js.native
  /**
    * The activation state of the lifecycle policy.
    */
  var State: js.UndefOr[GettablePolicyStateValues] = js.native
  /**
    * The tags.
    */
  var Tags: js.UndefOr[TagMap] = js.native
}

object LifecyclePolicySummary {
  @scala.inline
  def apply(
    Description: PolicyDescription = null,
    PolicyId: PolicyId = null,
    State: GettablePolicyStateValues = null,
    Tags: TagMap = null
  ): LifecyclePolicySummary = {
    val __obj = js.Dynamic.literal()
    if (Description != null) __obj.updateDynamic("Description")(Description.asInstanceOf[js.Any])
    if (PolicyId != null) __obj.updateDynamic("PolicyId")(PolicyId.asInstanceOf[js.Any])
    if (State != null) __obj.updateDynamic("State")(State.asInstanceOf[js.Any])
    if (Tags != null) __obj.updateDynamic("Tags")(Tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[LifecyclePolicySummary]
  }
}

