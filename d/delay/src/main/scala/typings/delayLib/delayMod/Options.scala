package typings
package delayLib.delayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  /**
  	 * An optional AbortSignal to abort the delay.
  	 * If aborted, the Promise will be rejected with an AbortError.
  	 */
  var signal: js.UndefOr[AbortSignal] = js.undefined
}

object Options {
  @scala.inline
  def apply(signal: AbortSignal = null): Options = {
    val __obj = js.Dynamic.literal()
    if (signal != null) __obj.updateDynamic("signal")(signal)
    __obj.asInstanceOf[Options]
  }
}

