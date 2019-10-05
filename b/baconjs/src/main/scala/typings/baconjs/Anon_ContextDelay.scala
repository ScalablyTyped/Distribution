package typings.baconjs

import typings.baconjs.Bacon.Property
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ContextDelay[E, A] extends js.Object {
  var delay: js.UndefOr[js.Function1[/* context */ Anon_Error[E], Double]] = js.undefined
  var isRetryable: js.UndefOr[js.Function1[/* error */ E, Boolean]] = js.undefined
  var retries: Double
  def source(): Property[E, A]
}

object Anon_ContextDelay {
  @scala.inline
  def apply[E, A](
    retries: Double,
    source: () => Property[E, A],
    delay: /* context */ Anon_Error[E] => Double = null,
    isRetryable: /* error */ E => Boolean = null
  ): Anon_ContextDelay[E, A] = {
    val __obj = js.Dynamic.literal(retries = retries, source = js.Any.fromFunction0(source))
    if (delay != null) __obj.updateDynamic("delay")(js.Any.fromFunction1(delay))
    if (isRetryable != null) __obj.updateDynamic("isRetryable")(js.Any.fromFunction1(isRetryable))
    __obj.asInstanceOf[Anon_ContextDelay[E, A]]
  }
}

