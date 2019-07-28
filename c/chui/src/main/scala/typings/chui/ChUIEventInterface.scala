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
    val __obj = js.Dynamic.literal(doubletap = doubletap, eventCancel = eventCancel, eventEnd = eventEnd, eventMove = eventMove, eventStart = eventStart, longtap = longtap, singletap = singletap, swipe = swipe, swipedown = swipedown, swipeleft = swipeleft, swiperight = swiperight, swipeup = swipeup, tap = tap)
  
    __obj.asInstanceOf[ChUIEventInterface]
  }
}

