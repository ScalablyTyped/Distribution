package typings.awsSdk.cloudwatchlogsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ResourcePolicy extends js.Object {
  /**
    * Timestamp showing when this policy was last updated, expressed as the number of milliseconds after Jan 1, 1970 00:00:00 UTC.
    */
  var lastUpdatedTime: js.UndefOr[Timestamp] = js.native
  /**
    * The details of the policy.
    */
  var policyDocument: js.UndefOr[PolicyDocument] = js.native
  /**
    * The name of the resource policy.
    */
  var policyName: js.UndefOr[PolicyName] = js.native
}

object ResourcePolicy {
  @scala.inline
  def apply(
    lastUpdatedTime: Int | Double = null,
    policyDocument: PolicyDocument = null,
    policyName: PolicyName = null
  ): ResourcePolicy = {
    val __obj = js.Dynamic.literal()
    if (lastUpdatedTime != null) __obj.updateDynamic("lastUpdatedTime")(lastUpdatedTime.asInstanceOf[js.Any])
    if (policyDocument != null) __obj.updateDynamic("policyDocument")(policyDocument.asInstanceOf[js.Any])
    if (policyName != null) __obj.updateDynamic("policyName")(policyName.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResourcePolicy]
  }
}

