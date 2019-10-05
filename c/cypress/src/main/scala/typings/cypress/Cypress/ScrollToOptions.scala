package typings.cypress.Cypress

import typings.cypress.cypressStrings.linear
import typings.cypress.cypressStrings.swing
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ScrollToOptions
  extends Loggable
     with Timeoutable {
  /**
    * Scrolls over the duration (in ms)
    *
    * @default 0
    */
  var duration: Double
  /**
    * Will scroll with the easing animation
    *
    * @default 'swing'
    */
  var easing: swing | linear
}

object ScrollToOptions {
  @scala.inline
  def apply(duration: Double, easing: swing | linear, log: Boolean, timeout: Double): ScrollToOptions = {
    val __obj = js.Dynamic.literal(duration = duration, easing = easing.asInstanceOf[js.Any], log = log, timeout = timeout)
  
    __obj.asInstanceOf[ScrollToOptions]
  }
}

