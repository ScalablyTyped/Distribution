package typings.awsSdk.rekognitionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EvaluationResult extends js.Object {
  /**
    * The F1 score for the evaluation of all labels. The F1 score metric evaluates the overall precision and recall performance of the model as a single value. A higher value indicates better precision and recall performance. A lower score indicates that precision, recall, or both are performing poorly. 
    */
  var F1Score: js.UndefOr[Float] = js.native
  /**
    * The S3 bucket that contains the training summary.
    */
  var Summary: js.UndefOr[typings.awsSdk.rekognitionMod.Summary] = js.native
}

object EvaluationResult {
  @scala.inline
  def apply(F1Score: js.UndefOr[Float] = js.undefined, Summary: Summary = null): EvaluationResult = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(F1Score)) __obj.updateDynamic("F1Score")(F1Score.get.asInstanceOf[js.Any])
    if (Summary != null) __obj.updateDynamic("Summary")(Summary.asInstanceOf[js.Any])
    __obj.asInstanceOf[EvaluationResult]
  }
}

