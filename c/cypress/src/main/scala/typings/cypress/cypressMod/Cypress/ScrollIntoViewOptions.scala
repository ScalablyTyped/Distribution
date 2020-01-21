package typings.cypress.cypressMod.Cypress

import typings.cypress.cypressStrings.linear
import typings.cypress.cypressStrings.swing
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
  def apply(duration: Double, easing: swing | linear, log: Boolean, offset: Offset, timeout: Double): ScrollIntoViewOptions = {
    val __obj = js.Dynamic.literal(duration = duration.asInstanceOf[js.Any], easing = easing.asInstanceOf[js.Any], log = log.asInstanceOf[js.Any], offset = offset.asInstanceOf[js.Any], timeout = timeout.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ScrollIntoViewOptions]
  }
}

