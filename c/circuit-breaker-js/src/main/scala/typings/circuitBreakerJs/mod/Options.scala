package typings.circuitBreakerJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var errorThreshold: js.UndefOr[Double] = js.undefined
  var numBuckets: js.UndefOr[Double] = js.undefined
  var onCircuitClose: js.UndefOr[js.Function1[/* m */ Metrics, Unit]] = js.undefined
  var onCircuitOpen: js.UndefOr[js.Function1[/* m */ Metrics, Unit]] = js.undefined
  var timeoutDuration: js.UndefOr[Double] = js.undefined
  var volumeThreshold: js.UndefOr[Double] = js.undefined
  var windowDuration: js.UndefOr[Double] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    errorThreshold: js.UndefOr[Double] = js.undefined,
    numBuckets: js.UndefOr[Double] = js.undefined,
    onCircuitClose: /* m */ Metrics => Unit = null,
    onCircuitOpen: /* m */ Metrics => Unit = null,
    timeoutDuration: js.UndefOr[Double] = js.undefined,
    volumeThreshold: js.UndefOr[Double] = js.undefined,
    windowDuration: js.UndefOr[Double] = js.undefined
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(errorThreshold)) __obj.updateDynamic("errorThreshold")(errorThreshold.get.asInstanceOf[js.Any])
    if (!js.isUndefined(numBuckets)) __obj.updateDynamic("numBuckets")(numBuckets.get.asInstanceOf[js.Any])
    if (onCircuitClose != null) __obj.updateDynamic("onCircuitClose")(js.Any.fromFunction1(onCircuitClose))
    if (onCircuitOpen != null) __obj.updateDynamic("onCircuitOpen")(js.Any.fromFunction1(onCircuitOpen))
    if (!js.isUndefined(timeoutDuration)) __obj.updateDynamic("timeoutDuration")(timeoutDuration.get.asInstanceOf[js.Any])
    if (!js.isUndefined(volumeThreshold)) __obj.updateDynamic("volumeThreshold")(volumeThreshold.get.asInstanceOf[js.Any])
    if (!js.isUndefined(windowDuration)) __obj.updateDynamic("windowDuration")(windowDuration.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

