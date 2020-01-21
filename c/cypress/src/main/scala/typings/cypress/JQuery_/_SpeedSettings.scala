package typings.cypress.JQuery_

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _SpeedSettings[TElement] extends js.Object

object _SpeedSettings {
  @scala.inline
  def AnonDuration[TElement](duration: Duration): _SpeedSettings[TElement] = {
    val __obj = js.Dynamic.literal(duration = duration.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[_SpeedSettings[TElement]]
  }
  @scala.inline
  def AnonEasing[TElement](easing: String): _SpeedSettings[TElement] = {
    val __obj = js.Dynamic.literal(easing = easing.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[_SpeedSettings[TElement]]
  }
  @scala.inline
  def AnonComplete[TElement](complete: () => Unit): _SpeedSettings[TElement] = {
    val __obj = js.Dynamic.literal(complete = js.Any.fromFunction0(complete))
  
    __obj.asInstanceOf[_SpeedSettings[TElement]]
  }
}

