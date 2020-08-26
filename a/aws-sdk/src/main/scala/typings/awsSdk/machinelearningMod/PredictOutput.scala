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
  def apply(): PredictOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PredictOutput]
  }
  @scala.inline
  implicit class PredictOutputOps[Self <: PredictOutput] (val x: Self) extends AnyVal {
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
    def setPrediction(value: Prediction): Self = this.set("Prediction", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePrediction: Self = this.set("Prediction", js.undefined)
  }
  
}

