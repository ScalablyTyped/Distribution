package typings.bull.bullMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BackoffOptions extends js.Object {
  /**
    * Backoff delay, in milliseconds
    */
  var delay: js.UndefOr[Double] = js.undefined
  /**
    * Backoff type, which can be either `fixed` or `exponential`
    */
  var `type`: String
}

object BackoffOptions {
  @scala.inline
  def apply(`type`: String, delay: Int | Double = null): BackoffOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (delay != null) __obj.updateDynamic("delay")(delay.asInstanceOf[js.Any])
    __obj.asInstanceOf[BackoffOptions]
  }
}

