package typings
package circuitDashBreakerDashJsLib.circuitDashBreakerDashJsMod.CircuitBreakerNs

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

