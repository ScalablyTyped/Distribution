package typings
package cypressLib.CypressNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ScrollIntoViewOptions extends ScrollToOptions {
  /**
    * Amount to scroll after the element has been scrolled into view
    *
    * @default {top: 0, left: 0}
    */
  var offset: Offset
}

object ScrollIntoViewOptions {
  @scala.inline
  def apply(
    duration: scala.Double,
    easing: cypressLib.cypressLibStrings.swing | cypressLib.cypressLibStrings.linear,
    log: scala.Boolean,
    offset: Offset,
    timeout: scala.Double
  ): ScrollIntoViewOptions = {
    val __obj = js.Dynamic.literal(duration = duration, easing = easing.asInstanceOf[js.Any], log = log, offset = offset, timeout = timeout)
  
    __obj.asInstanceOf[ScrollIntoViewOptions]
  }
}

