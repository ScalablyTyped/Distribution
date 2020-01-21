package typings.awsSdk.rekognitionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StartProjectVersionRequest extends js.Object {
  /**
    * The minimum number of inference units to use. A single inference unit represents 1 hour of processing and can support up to 5 Transaction Pers Second (TPS). Use a higher number to increase the TPS throughput of your model. You are charged for the number of inference units that you use. 
    */
  var MinInferenceUnits: InferenceUnits = js.native
  /**
    * The Amazon Resource Name(ARN) of the model version that you want to start.
    */
  var ProjectVersionArn: typings.awsSdk.rekognitionMod.ProjectVersionArn = js.native
}

object StartProjectVersionRequest {
  @scala.inline
  def apply(MinInferenceUnits: InferenceUnits, ProjectVersionArn: ProjectVersionArn): StartProjectVersionRequest = {
    val __obj = js.Dynamic.literal(MinInferenceUnits = MinInferenceUnits.asInstanceOf[js.Any], ProjectVersionArn = ProjectVersionArn.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[StartProjectVersionRequest]
  }
}

