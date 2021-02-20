package typings.awsSdk.sagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AutoMLCandidateStep extends StObject {
  
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
  implicit class AutoMLCandidateStepMutableBuilder[Self <: AutoMLCandidateStep] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCandidateStepArn(value: CandidateStepArn): Self = StObject.set(x, "CandidateStepArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCandidateStepName(value: CandidateStepName): Self = StObject.set(x, "CandidateStepName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCandidateStepType(value: CandidateStepType): Self = StObject.set(x, "CandidateStepType", value.asInstanceOf[js.Any])
  }
}
