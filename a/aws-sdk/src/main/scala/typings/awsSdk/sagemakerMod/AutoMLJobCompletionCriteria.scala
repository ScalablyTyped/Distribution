package typings.awsSdk.sagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AutoMLJobCompletionCriteria extends StObject {
  
  /**
    * The maximum time, in seconds, an AutoML job is allowed to wait for a trial to complete. It must be equal to or greater than MaxRuntimePerTrainingJobInSeconds.
    */
  var MaxAutoMLJobRuntimeInSeconds: js.UndefOr[typings.awsSdk.sagemakerMod.MaxAutoMLJobRuntimeInSeconds] = js.native
  
  /**
    * The maximum number of times a training job is allowed to run.
    */
  var MaxCandidates: js.UndefOr[typings.awsSdk.sagemakerMod.MaxCandidates] = js.native
  
  /**
    * The maximum time, in seconds, a job is allowed to run.
    */
  var MaxRuntimePerTrainingJobInSeconds: js.UndefOr[typings.awsSdk.sagemakerMod.MaxRuntimePerTrainingJobInSeconds] = js.native
}
object AutoMLJobCompletionCriteria {
  
  @scala.inline
  def apply(): AutoMLJobCompletionCriteria = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AutoMLJobCompletionCriteria]
  }
  
  @scala.inline
  implicit class AutoMLJobCompletionCriteriaMutableBuilder[Self <: AutoMLJobCompletionCriteria] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMaxAutoMLJobRuntimeInSeconds(value: MaxAutoMLJobRuntimeInSeconds): Self = StObject.set(x, "MaxAutoMLJobRuntimeInSeconds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxAutoMLJobRuntimeInSecondsUndefined: Self = StObject.set(x, "MaxAutoMLJobRuntimeInSeconds", js.undefined)
    
    @scala.inline
    def setMaxCandidates(value: MaxCandidates): Self = StObject.set(x, "MaxCandidates", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxCandidatesUndefined: Self = StObject.set(x, "MaxCandidates", js.undefined)
    
    @scala.inline
    def setMaxRuntimePerTrainingJobInSeconds(value: MaxRuntimePerTrainingJobInSeconds): Self = StObject.set(x, "MaxRuntimePerTrainingJobInSeconds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxRuntimePerTrainingJobInSecondsUndefined: Self = StObject.set(x, "MaxRuntimePerTrainingJobInSeconds", js.undefined)
  }
}
