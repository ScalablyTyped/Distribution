package typings.baidumapWebSdk.BMap

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TrafficControl extends js.Object {
  def hide(): Unit
  def setPanelOffset(offset: Size): Unit
  def show(): Unit
}

object TrafficControl {
  @scala.inline
  def apply(hide: () => Unit, setPanelOffset: Size => Unit, show: () => Unit): TrafficControl = {
    val __obj = js.Dynamic.literal(hide = js.Any.fromFunction0(hide), setPanelOffset = js.Any.fromFunction1(setPanelOffset), show = js.Any.fromFunction0(show))
    __obj.asInstanceOf[TrafficControl]
  }
}

