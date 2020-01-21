package typings.awsSdk.forecastserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Metrics extends js.Object {
  /**
    * The root mean square error (RMSE).
    */
  var RMSE: js.UndefOr[Double] = js.native
  /**
    * An array of weighted quantile losses. Quantiles divide a probability distribution into regions of equal probability. The distribution in this case is the loss function.
    */
  var WeightedQuantileLosses: js.UndefOr[typings.awsSdk.forecastserviceMod.WeightedQuantileLosses] = js.native
}

object Metrics {
  @scala.inline
  def apply(RMSE: Int | scala.Double = null, WeightedQuantileLosses: WeightedQuantileLosses = null): Metrics = {
    val __obj = js.Dynamic.literal()
    if (RMSE != null) __obj.updateDynamic("RMSE")(RMSE.asInstanceOf[js.Any])
    if (WeightedQuantileLosses != null) __obj.updateDynamic("WeightedQuantileLosses")(WeightedQuantileLosses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Metrics]
  }
}

