package typings.awsSdk.iamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Statement extends js.Object {
  /**
    * The row and column of the end of a Statement in an IAM policy.
    */
  var EndPosition: js.UndefOr[Position] = js.native
  /**
    * The identifier of the policy that was provided as an input.
    */
  var SourcePolicyId: js.UndefOr[PolicyIdentifierType] = js.native
  /**
    * The type of the policy.
    */
  var SourcePolicyType: js.UndefOr[PolicySourceType] = js.native
  /**
    * The row and column of the beginning of the Statement in an IAM policy.
    */
  var StartPosition: js.UndefOr[Position] = js.native
}

object Statement {
  @scala.inline
  def apply(
    EndPosition: Position = null,
    SourcePolicyId: PolicyIdentifierType = null,
    SourcePolicyType: PolicySourceType = null,
    StartPosition: Position = null
  ): Statement = {
    val __obj = js.Dynamic.literal()
    if (EndPosition != null) __obj.updateDynamic("EndPosition")(EndPosition.asInstanceOf[js.Any])
    if (SourcePolicyId != null) __obj.updateDynamic("SourcePolicyId")(SourcePolicyId.asInstanceOf[js.Any])
    if (SourcePolicyType != null) __obj.updateDynamic("SourcePolicyType")(SourcePolicyType.asInstanceOf[js.Any])
    if (StartPosition != null) __obj.updateDynamic("StartPosition")(StartPosition.asInstanceOf[js.Any])
    __obj.asInstanceOf[Statement]
  }
}

