package typings
package baconjsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ContextDelay[E, A] extends js.Object {
  var delay: js.UndefOr[js.Function1[/* context */ Anon_Error[E], scala.Double]] = js.undefined
  var isRetryable: js.UndefOr[js.Function1[/* error */ E, scala.Boolean]] = js.undefined
  var retries: scala.Double
  def source(): baconjsLib.BaconNs.Property[E, A]
}

object Anon_ContextDelay {
  @scala.inline
  def apply[E, A](
    retries: scala.Double,
    source: () => baconjsLib.BaconNs.Property[E, A],
    delay: /* context */ Anon_Error[E] => scala.Double = null,
    isRetryable: /* error */ E => scala.Boolean = null
  ): Anon_ContextDelay[E, A] = {
    val __obj = js.Dynamic.literal(retries = retries, source = js.Any.fromFunction0(source))
    if (delay != null) __obj.updateDynamic("delay")(js.Any.fromFunction1(delay))
    if (isRetryable != null) __obj.updateDynamic("isRetryable")(js.Any.fromFunction1(isRetryable))
    __obj.asInstanceOf[Anon_ContextDelay[E, A]]
  }
}

