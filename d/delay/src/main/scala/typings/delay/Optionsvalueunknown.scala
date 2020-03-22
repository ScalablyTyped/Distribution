package typings.delay

import typings.delay.mod.AbortSignal
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined delay.delay.Options & {  value ? :unknown} */
trait Optionsvalueunknown extends js.Object {
  /**
  		An optional AbortSignal to abort the delay.
  		If aborted, the Promise will be rejected with an AbortError.
  		*/
  var signal: js.UndefOr[AbortSignal] = js.undefined
  /**
  			Value to reject in the returned promise.
  			*/
  var value: js.UndefOr[js.Any] = js.undefined
}

object Optionsvalueunknown {
  @scala.inline
  def apply(signal: AbortSignal = null, value: js.Any = null): Optionsvalueunknown = {
    val __obj = js.Dynamic.literal()
    if (signal != null) __obj.updateDynamic("signal")(signal.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Optionsvalueunknown]
  }
}

