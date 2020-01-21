package typings.awsSdk.iamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ResourceSpecificResult extends js.Object {
  /**
    * Additional details about the results of the evaluation decision. When there are both IAM policies and resource policies, this parameter explains how each set of policies contributes to the final evaluation decision. When simulating cross-account access to a resource, both the resource-based policy and the caller's IAM policy must grant access.
    */
  var EvalDecisionDetails: js.UndefOr[EvalDecisionDetailsType] = js.native
  /**
    * The result of the simulation of the simulated API operation on the resource specified in EvalResourceName.
    */
  var EvalResourceDecision: PolicyEvaluationDecisionType = js.native
  /**
    * The name of the simulated resource, in Amazon Resource Name (ARN) format.
    */
  var EvalResourceName: ResourceNameType = js.native
  /**
    * A list of the statements in the input policies that determine the result for this part of the simulation. Remember that even if multiple statements allow the operation on the resource, if any statement denies that operation, then the explicit deny overrides any allow. In addition, the deny statement is the only entry included in the result.
    */
  var MatchedStatements: js.UndefOr[StatementListType] = js.native
  /**
    * A list of context keys that are required by the included input policies but that were not provided by one of the input parameters. This list is used when a list of ARNs is included in the ResourceArns parameter instead of "*". If you do not specify individual resources, by setting ResourceArns to "*" or by not including the ResourceArns parameter, then any missing context values are instead included under the EvaluationResults section. To discover the context keys used by a set of policies, you can call GetContextKeysForCustomPolicy or GetContextKeysForPrincipalPolicy.
    */
  var MissingContextValues: js.UndefOr[ContextKeyNamesResultListType] = js.native
}

object ResourceSpecificResult {
  @scala.inline
  def apply(
    EvalResourceDecision: PolicyEvaluationDecisionType,
    EvalResourceName: ResourceNameType,
    EvalDecisionDetails: EvalDecisionDetailsType = null,
    MatchedStatements: StatementListType = null,
    MissingContextValues: ContextKeyNamesResultListType = null
  ): ResourceSpecificResult = {
    val __obj = js.Dynamic.literal(EvalResourceDecision = EvalResourceDecision.asInstanceOf[js.Any], EvalResourceName = EvalResourceName.asInstanceOf[js.Any])
    if (EvalDecisionDetails != null) __obj.updateDynamic("EvalDecisionDetails")(EvalDecisionDetails.asInstanceOf[js.Any])
    if (MatchedStatements != null) __obj.updateDynamic("MatchedStatements")(MatchedStatements.asInstanceOf[js.Any])
    if (MissingContextValues != null) __obj.updateDynamic("MissingContextValues")(MissingContextValues.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResourceSpecificResult]
  }
}

