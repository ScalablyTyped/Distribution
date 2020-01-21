package typings.awsSdk.sagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
}

