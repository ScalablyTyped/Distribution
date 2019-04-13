package typings
package circuitDashBreakerDashJsLib.circuitDashBreakerDashJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var errorThreshold: js.UndefOr[scala.Double] = js.undefined
  var numBuckets: js.UndefOr[scala.Double] = js.undefined
  var onCircuitClose: js.UndefOr[js.Function1[/* m */ Metrics, scala.Unit]] = js.undefined
  var onCircuitOpen: js.UndefOr[js.Function1[/* m */ Metrics, scala.Unit]] = js.undefined
  var timeoutDuration: js.UndefOr[scala.Double] = js.undefined
  var volumeThreshold: js.UndefOr[scala.Double] = js.undefined
  var windowDuration: js.UndefOr[scala.Double] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    errorThreshold: scala.Int | scala.Double = null,
    numBuckets: scala.Int | scala.Double = null,
    onCircuitClose: /* m */ Metrics => scala.Unit = null,
    onCircuitOpen: /* m */ Metrics => scala.Unit = null,
    timeoutDuration: scala.Int | scala.Double = null,
    volumeThreshold: scala.Int | scala.Double = null,
    windowDuration: scala.Int | scala.Double = null
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

