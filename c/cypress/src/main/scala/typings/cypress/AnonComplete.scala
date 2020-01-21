package typings.cypress

import typings.cypress.JQuery_._SpeedSettings
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonComplete[TElement] extends _SpeedSettings[TElement] {
  /**
    * A function to call once the animation is complete.
    */
  def complete(): Unit
}

object AnonComplete {
  @scala.inline
  def apply[TElement](complete: () => Unit): AnonComplete[TElement] = {
    val __obj = js.Dynamic.literal(complete = js.Any.fromFunction0(complete))
  
    __obj.asInstanceOf[AnonComplete[TElement]]
  }
}

