package typings.awsSdk.codecommitMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
  
  @scala.inline
  implicit class EvaluatePullRequestApprovalRulesOutputOps[Self <: EvaluatePullRequestApprovalRulesOutput] (val x: Self) extends AnyVal {
    
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
    def setEvaluation(value: Evaluation): Self = this.set("evaluation", value.asInstanceOf[js.Any])
  }
}
