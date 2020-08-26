package typings.chui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ChUIEventInterface extends js.Object {
  var doubletap: String = js.native
  var eventCancel: String = js.native
  var eventEnd: String = js.native
  var eventMove: String = js.native
  var eventStart: String = js.native
  var longtap: String = js.native
  var singletap: String = js.native
  var swipe: String = js.native
  var swipedown: String = js.native
  var swipeleft: String = js.native
  var swiperight: String = js.native
  var swipeup: String = js.native
  var tap: String = js.native
}

object ChUIEventInterface {
  @scala.inline
  def apply(
    doubletap: String,
    eventCancel: String,
    eventEnd: String,
    eventMove: String,
    eventStart: String,
    longtap: String,
    singletap: String,
    swipe: String,
    swipedown: String,
    swipeleft: String,
    swiperight: String,
    swipeup: String,
    tap: String
  ): ChUIEventInterface = {
    val __obj = js.Dynamic.literal(doubletap = doubletap.asInstanceOf[js.Any], eventCancel = eventCancel.asInstanceOf[js.Any], eventEnd = eventEnd.asInstanceOf[js.Any], eventMove = eventMove.asInstanceOf[js.Any], eventStart = eventStart.asInstanceOf[js.Any], longtap = longtap.asInstanceOf[js.Any], singletap = singletap.asInstanceOf[js.Any], swipe = swipe.asInstanceOf[js.Any], swipedown = swipedown.asInstanceOf[js.Any], swipeleft = swipeleft.asInstanceOf[js.Any], swiperight = swiperight.asInstanceOf[js.Any], swipeup = swipeup.asInstanceOf[js.Any], tap = tap.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChUIEventInterface]
  }
  @scala.inline
  implicit class ChUIEventInterfaceOps[Self <: ChUIEventInterface] (val x: Self) extends AnyVal {
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
    def setDoubletap(value: String): Self = this.set("doubletap", value.asInstanceOf[js.Any])
    @scala.inline
    def setEventCancel(value: String): Self = this.set("eventCancel", value.asInstanceOf[js.Any])
    @scala.inline
    def setEventEnd(value: String): Self = this.set("eventEnd", value.asInstanceOf[js.Any])
    @scala.inline
    def setEventMove(value: String): Self = this.set("eventMove", value.asInstanceOf[js.Any])
    @scala.inline
    def setEventStart(value: String): Self = this.set("eventStart", value.asInstanceOf[js.Any])
    @scala.inline
    def setLongtap(value: String): Self = this.set("longtap", value.asInstanceOf[js.Any])
    @scala.inline
    def setSingletap(value: String): Self = this.set("singletap", value.asInstanceOf[js.Any])
    @scala.inline
    def setSwipe(value: String): Self = this.set("swipe", value.asInstanceOf[js.Any])
    @scala.inline
    def setSwipedown(value: String): Self = this.set("swipedown", value.asInstanceOf[js.Any])
    @scala.inline
    def setSwipeleft(value: String): Self = this.set("swipeleft", value.asInstanceOf[js.Any])
    @scala.inline
    def setSwiperight(value: String): Self = this.set("swiperight", value.asInstanceOf[js.Any])
    @scala.inline
    def setSwipeup(value: String): Self = this.set("swipeup", value.asInstanceOf[js.Any])
    @scala.inline
    def setTap(value: String): Self = this.set("tap", value.asInstanceOf[js.Any])
  }
  
}

