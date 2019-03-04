package typings
package bullLib.bullMod.BullNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BackoffOptions extends js.Object {
  /**
    * Backoff delay, in milliseconds
    */
  var delay: js.UndefOr[scala.Double] = js.undefined
  /**
    * Backoff type, which can be either `fixed` or `exponential`
    */
  var `type`: java.lang.String
}

object BackoffOptions {
  @scala.inline
  def apply(`type`: java.lang.String, delay: scala.Int | scala.Double = null): BackoffOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`)
    if (delay != null) __obj.updateDynamic("delay")(delay.asInstanceOf[js.Any])
    __obj.asInstanceOf[BackoffOptions]
  }
}

