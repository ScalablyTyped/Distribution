package typings.detectIt.mod

import typings.detectIt.detectItStrings.coarse
import typings.detectIt.detectItStrings.fine
import typings.detectIt.detectItStrings.hover
import typings.detectIt.detectItStrings.hybrid
import typings.detectIt.detectItStrings.mouseOnly
import typings.detectIt.detectItStrings.none
import typings.detectIt.detectItStrings.touchOnly
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait detectIt extends js.Object {
  var deviceType: hybrid | mouseOnly | touchOnly = js.native
  var hasMouse: Boolean = js.native
  var hasTouch: Boolean = js.native
  var maxTouchPoints: Double = js.native
  var passiveEvents: Boolean = js.native
  var primaryHover: hover | none = js.native
  var primaryPointer: coarse | fine | none = js.native
  var state: typings.detectIt.mod.state = js.native
  def update(): Unit = js.native
}

object detectIt {
  @scala.inline
  def apply(
    deviceType: hybrid | mouseOnly | touchOnly,
    hasMouse: Boolean,
    hasTouch: Boolean,
    maxTouchPoints: Double,
    passiveEvents: Boolean,
    primaryHover: hover | none,
    primaryPointer: coarse | fine | none,
    state: state,
    update: () => Unit
  ): detectIt = {
    val __obj = js.Dynamic.literal(deviceType = deviceType.asInstanceOf[js.Any], hasMouse = hasMouse.asInstanceOf[js.Any], hasTouch = hasTouch.asInstanceOf[js.Any], maxTouchPoints = maxTouchPoints.asInstanceOf[js.Any], passiveEvents = passiveEvents.asInstanceOf[js.Any], primaryHover = primaryHover.asInstanceOf[js.Any], primaryPointer = primaryPointer.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any], update = js.Any.fromFunction0(update))
    __obj.asInstanceOf[detectIt]
  }
  @scala.inline
  implicit class detectItOps[Self <: detectIt] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setDeviceType(value: hybrid | mouseOnly | touchOnly): Self = this.set("deviceType", value.asInstanceOf[js.Any])
    @scala.inline
    def setHasMouse(value: Boolean): Self = this.set("hasMouse", value.asInstanceOf[js.Any])
    @scala.inline
    def setHasTouch(value: Boolean): Self = this.set("hasTouch", value.asInstanceOf[js.Any])
    @scala.inline
    def setMaxTouchPoints(value: Double): Self = this.set("maxTouchPoints", value.asInstanceOf[js.Any])
    @scala.inline
    def setPassiveEvents(value: Boolean): Self = this.set("passiveEvents", value.asInstanceOf[js.Any])
    @scala.inline
    def setPrimaryHover(value: hover | none): Self = this.set("primaryHover", value.asInstanceOf[js.Any])
    @scala.inline
    def setPrimaryPointer(value: coarse | fine | none): Self = this.set("primaryPointer", value.asInstanceOf[js.Any])
    @scala.inline
    def setState(value: state): Self = this.set("state", value.asInstanceOf[js.Any])
    @scala.inline
    def setUpdate(value: () => Unit): Self = this.set("update", js.Any.fromFunction0(value))
  }
  
}

