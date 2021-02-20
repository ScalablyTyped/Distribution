package typings.awsSdk.sagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StopTrainingJobRequest extends StObject {
  
  /**
    * The name of the training job to stop.
    */
  var TrainingJobName: typings.awsSdk.sagemakerMod.TrainingJobName = js.native
}
object StopTrainingJobRequest {
  
  @scala.inline
  def apply(TrainingJobName: TrainingJobName): StopTrainingJobRequest = {
    val __obj = js.Dynamic.literal(TrainingJobName = TrainingJobName.asInstanceOf[js.Any])
    __obj.asInstanceOf[StopTrainingJobRequest]
  }
  
  @scala.inline
  implicit class StopTrainingJobRequestMutableBuilder[Self <: StopTrainingJobRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTrainingJobName(value: TrainingJobName): Self = StObject.set(x, "TrainingJobName", value.asInstanceOf[js.Any])
  }
}
