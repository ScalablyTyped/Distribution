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

