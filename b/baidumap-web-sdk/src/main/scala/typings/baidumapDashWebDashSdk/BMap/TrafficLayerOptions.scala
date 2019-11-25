package typings.baidumapDashWebDashSdk.BMap

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TrafficLayerOptions extends js.Object {
  var predictDate: js.UndefOr[PredictDate] = js.undefined
}

object TrafficLayerOptions {
  @scala.inline
  def apply(predictDate: PredictDate = null): TrafficLayerOptions = {
    val __obj = js.Dynamic.literal()
    if (predictDate != null) __obj.updateDynamic("predictDate")(predictDate.asInstanceOf[js.Any])
    __obj.asInstanceOf[TrafficLayerOptions]
  }
}

