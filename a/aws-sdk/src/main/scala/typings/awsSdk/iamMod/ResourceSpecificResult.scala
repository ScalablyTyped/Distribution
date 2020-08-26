package typings.awsSdk.iamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ResourceSpecificResult extends js.Object {
  /**
    * Additional details about the results of the evaluation decision on a single resource. This parameter is returned only for cross-account simulations. This parameter explains how each policy type contributes to the resource-specific evaluation decision.
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
  /**
    * Contains information about the effect that a permissions boundary has on a policy simulation when that boundary is applied to an IAM entity.
    */
  var PermissionsBoundaryDecisionDetail: js.UndefOr[typings.awsSdk.iamMod.PermissionsBoundaryDecisionDetail] = js.native
}

object ResourceSpecificResult {
  @scala.inline
  def apply(EvalResourceDecision: PolicyEvaluationDecisionType, EvalResourceName: ResourceNameType): ResourceSpecificResult = {
    val __obj = js.Dynamic.literal(EvalResourceDecision = EvalResourceDecision.asInstanceOf[js.Any], EvalResourceName = EvalResourceName.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResourceSpecificResult]
  }
  @scala.inline
  implicit class ResourceSpecificResultOps[Self <: ResourceSpecificResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setEvalResourceDecision(value: PolicyEvaluationDecisionType): Self = this.set("EvalResourceDecision", value.asInstanceOf[js.Any])
    @scala.inline
    def setEvalResourceName(value: ResourceNameType): Self = this.set("EvalResourceName", value.asInstanceOf[js.Any])
    @scala.inline
    def setEvalDecisionDetails(value: EvalDecisionDetailsType): Self = this.set("EvalDecisionDetails", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEvalDecisionDetails: Self = this.set("EvalDecisionDetails", js.undefined)
    @scala.inline
    def setMatchedStatementsVarargs(value: Statement*): Self = this.set("MatchedStatements", js.Array(value :_*))
    @scala.inline
    def setMatchedStatements(value: StatementListType): Self = this.set("MatchedStatements", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMatchedStatements: Self = this.set("MatchedStatements", js.undefined)
    @scala.inline
    def setMissingContextValuesVarargs(value: ContextKeyNameType*): Self = this.set("MissingContextValues", js.Array(value :_*))
    @scala.inline
    def setMissingContextValues(value: ContextKeyNamesResultListType): Self = this.set("MissingContextValues", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMissingContextValues: Self = this.set("MissingContextValues", js.undefined)
    @scala.inline
    def setPermissionsBoundaryDecisionDetail(value: PermissionsBoundaryDecisionDetail): Self = this.set("PermissionsBoundaryDecisionDetail", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePermissionsBoundaryDecisionDetail: Self = this.set("PermissionsBoundaryDecisionDetail", js.undefined)
  }
  
}

