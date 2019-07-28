package typings.circuitDashBreakerDashJs.circuitDashBreakerDashJsMod

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
    errorThreshold: Int | Double = null,
    numBuckets: Int | Double = null,
    onCircuitClose: /* m */ Metrics => Unit = null,
    onCircuitOpen: /* m */ Metrics => Unit = null,
    timeoutDuration: Int | Double = null,
    volumeThreshold: Int | Double = null,
    windowDuration: Int | Double = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (errorThreshold != null) __obj.updateDynamic("errorThreshold")(errorThreshold.asInstanceOf[js.Any])
    if (numBuckets != null) __obj.updateDynamic("numBuckets")(numBuckets.asInstanceOf[js.Any])
    if (onCircuitClose != null) __obj.updateDynamic("onCircuitClose")(js.Any.fromFunction1(onCircuitClose))
    if (onCircuitOpen != null) __obj.updateDynamic("onCircuitOpen")(js.Any.fromFunction1(onCircuitOpen))
    if (timeoutDuration != null) __obj.updateDynamic("timeoutDuration")(timeoutDuration.asInstanceOf[js.Any])
    if (volumeThreshold != null) __obj.updateDynamic("volumeThreshold")(volumeThreshold.asInstanceOf[js.Any])
    if (windowDuration != null) __obj.updateDynamic("windowDuration")(windowDuration.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

