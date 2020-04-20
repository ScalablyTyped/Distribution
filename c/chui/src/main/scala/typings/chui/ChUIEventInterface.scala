package typings.chui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChUIEventInterface extends js.Object {
  var doubletap: String
  var eventCancel: String
  var eventEnd: String
  var eventMove: String
  var eventStart: String
  var longtap: String
  var singletap: String
  var swipe: String
  var swipedown: String
  var swipeleft: String
  var swiperight: String
  var swipeup: String
  var tap: String
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
}

