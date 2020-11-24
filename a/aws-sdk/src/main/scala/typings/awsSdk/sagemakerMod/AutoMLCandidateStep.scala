package typings.awsSdk.sagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AutoMLCandidateStep extends js.Object {
  
  /**
    * The ARN for the Candidate's step.
    */
  var CandidateStepArn: typings.awsSdk.sagemakerMod.CandidateStepArn = js.native
  
  /**
    * The name for the Candidate's step.
    */
  var CandidateStepName: typings.awsSdk.sagemakerMod.CandidateStepName = js.native
  
  /**
    * Whether the Candidate is at the transform, training, or processing step.
    */
  var CandidateStepType: typings.awsSdk.sagemakerMod.CandidateStepType = js.native
}
object AutoMLCandidateStep {
  
  @scala.inline
  def apply(
    CandidateStepArn: CandidateStepArn,
    CandidateStepName: CandidateStepName,
    CandidateStepType: CandidateStepType
  ): AutoMLCandidateStep = {
    val __obj = js.Dynamic.literal(CandidateStepArn = CandidateStepArn.asInstanceOf[js.Any], CandidateStepName = CandidateStepName.asInstanceOf[js.Any], CandidateStepType = CandidateStepType.asInstanceOf[js.Any])
    __obj.asInstanceOf[AutoMLCandidateStep]
  }
  
  @scala.inline
  implicit class AutoMLCandidateStepOps[Self <: AutoMLCandidateStep] (val x: Self) extends AnyVal {
    
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
    def setCandidateStepArn(value: CandidateStepArn): Self = this.set("CandidateStepArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCandidateStepName(value: CandidateStepName): Self = this.set("CandidateStepName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCandidateStepType(value: CandidateStepType): Self = this.set("CandidateStepType", value.asInstanceOf[js.Any])
  }
}
