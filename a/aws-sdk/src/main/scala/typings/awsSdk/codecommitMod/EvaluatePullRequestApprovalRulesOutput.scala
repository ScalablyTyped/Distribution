package typings.awsSdk.codecommitMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EvaluatePullRequestApprovalRulesOutput extends js.Object {
  /**
    * The result of the evaluation, including the names of the rules whose conditions have been met (if any), the names of the rules whose conditions have not been met (if any), whether the pull request is in the approved state, and whether the pull request approval rule has been set aside by an override. 
    */
  var evaluation: Evaluation = js.native
}

object EvaluatePullRequestApprovalRulesOutput {
  @scala.inline
  def apply(evaluation: Evaluation): EvaluatePullRequestApprovalRulesOutput = {
    val __obj = js.Dynamic.literal(evaluation = evaluation.asInstanceOf[js.Any])
    __obj.asInstanceOf[EvaluatePullRequestApprovalRulesOutput]
  }
}

