package typings
package baconjsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Context[E, A] extends js.Object {
  var delay: js.UndefOr[js.Function1[/* context */ Anon_Error[E], scala.Double]] = js.undefined
  var isRetryable: js.UndefOr[js.Function1[/* error */ E, scala.Boolean]] = js.undefined
  var retries: scala.Double
  def source(): baconjsLib.BaconNs.EventStream[E, A]
}

object Anon_Context {
  @scala.inline
  def apply[E, A](
    retries: scala.Double,
    source: js.Function0[baconjsLib.BaconNs.EventStream[E, A]],
    delay: js.Function1[/* context */ Anon_Error[E], scala.Double] = null,
    isRetryable: js.Function1[/* error */ E, scala.Boolean] = null
  ): Anon_Context[E, A] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("retries")(retries)
    __obj.updateDynamic("source")(source)
    if (delay != null) __obj.updateDynamic("delay")(delay)
    if (isRetryable != null) __obj.updateDynamic("isRetryable")(isRetryable)
    __obj.asInstanceOf[Anon_Context[E, A]]
  }
}

