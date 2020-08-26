package typings.awsSdk.machinelearningMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Prediction extends js.Object {
  var details: js.UndefOr[DetailsMap] = js.native
  /**
    * The prediction label for either a BINARY or MULTICLASS MLModel.
    */
  var predictedLabel: js.UndefOr[Label] = js.native
  var predictedScores: js.UndefOr[ScoreValuePerLabelMap] = js.native
  /**
    * The prediction value for REGRESSION MLModel.
    */
  var predictedValue: js.UndefOr[floatLabel] = js.native
}

object Prediction {
  @scala.inline
  def apply(): Prediction = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Prediction]
  }
  @scala.inline
  implicit class PredictionOps[Self <: Prediction] (val x: Self) extends AnyVal {
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
    def setDetails(value: DetailsMap): Self = this.set("details", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDetails: Self = this.set("details", js.undefined)
    @scala.inline
    def setPredictedLabel(value: Label): Self = this.set("predictedLabel", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePredictedLabel: Self = this.set("predictedLabel", js.undefined)
    @scala.inline
    def setPredictedScores(value: ScoreValuePerLabelMap): Self = this.set("predictedScores", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePredictedScores: Self = this.set("predictedScores", js.undefined)
    @scala.inline
    def setPredictedValue(value: floatLabel): Self = this.set("predictedValue", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePredictedValue: Self = this.set("predictedValue", js.undefined)
  }
  
}

