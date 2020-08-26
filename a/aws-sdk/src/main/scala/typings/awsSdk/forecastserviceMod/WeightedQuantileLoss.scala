package typings.awsSdk.forecastserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WeightedQuantileLoss extends js.Object {
  /**
    * The difference between the predicted value and the actual value over the quantile, weighted (normalized) by dividing by the sum over all quantiles.
    */
  var LossValue: js.UndefOr[Double] = js.native
  /**
    * The quantile. Quantiles divide a probability distribution into regions of equal probability. For example, if the distribution was divided into 5 regions of equal probability, the quantiles would be 0.2, 0.4, 0.6, and 0.8.
    */
  var Quantile: js.UndefOr[Double] = js.native
}

object WeightedQuantileLoss {
  @scala.inline
  def apply(): WeightedQuantileLoss = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WeightedQuantileLoss]
  }
  @scala.inline
  implicit class WeightedQuantileLossOps[Self <: WeightedQuantileLoss] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setLossValue(value: Double): Self = this.set("LossValue", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLossValue: Self = this.set("LossValue", js.undefined)
    @scala.inline
    def setQuantile(value: Double): Self = this.set("Quantile", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteQuantile: Self = this.set("Quantile", js.undefined)
  }
  
}

