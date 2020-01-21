package typings.awsSdk.machinelearningMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PredictOutput extends js.Object {
  var Prediction: js.UndefOr[typings.awsSdk.machinelearningMod.Prediction] = js.native
}

object PredictOutput {
  @scala.inline
  def apply(Prediction: Prediction = null): PredictOutput = {
    val __obj = js.Dynamic.literal()
    if (Prediction != null) __obj.updateDynamic("Prediction")(Prediction.asInstanceOf[js.Any])
    __obj.asInstanceOf[PredictOutput]
  }
}

