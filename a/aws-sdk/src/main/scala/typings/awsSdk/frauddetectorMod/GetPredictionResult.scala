package typings.awsSdk.frauddetectorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetPredictionResult extends js.Object {
  /**
    * The model scores for models used in the detector version.
    */
  var modelScores: js.UndefOr[ListOfModelScores] = js.native
  /**
    * The prediction outcomes.
    */
  var outcomes: js.UndefOr[ListOfStrings] = js.native
}

object GetPredictionResult {
  @scala.inline
  def apply(modelScores: ListOfModelScores = null, outcomes: ListOfStrings = null): GetPredictionResult = {
    val __obj = js.Dynamic.literal()
    if (modelScores != null) __obj.updateDynamic("modelScores")(modelScores.asInstanceOf[js.Any])
    if (outcomes != null) __obj.updateDynamic("outcomes")(outcomes.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetPredictionResult]
  }
}

