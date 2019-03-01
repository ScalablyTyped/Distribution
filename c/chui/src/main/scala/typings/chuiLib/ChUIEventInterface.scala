package typings
package chuiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChUIEventInterface extends js.Object {
  var doubletap: java.lang.String
  var eventCancel: java.lang.String
  var eventEnd: java.lang.String
  var eventMove: java.lang.String
  var eventStart: java.lang.String
  var longtap: java.lang.String
  var singletap: java.lang.String
  var swipe: java.lang.String
  var swipedown: java.lang.String
  var swipeleft: java.lang.String
  var swiperight: java.lang.String
  var swipeup: java.lang.String
  var tap: java.lang.String
}

object ChUIEventInterface {
  @scala.inline
  def apply(
    doubletap: java.lang.String,
    eventCancel: java.lang.String,
    eventEnd: java.lang.String,
    eventMove: java.lang.String,
    eventStart: java.lang.String,
    longtap: java.lang.String,
    singletap: java.lang.String,
    swipe: java.lang.String,
    swipedown: java.lang.String,
    swipeleft: java.lang.String,
    swiperight: java.lang.String,
    swipeup: java.lang.String,
    tap: java.lang.String
  ): ChUIEventInterface = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("doubletap")(doubletap)
    __obj.updateDynamic("eventCancel")(eventCancel)
    __obj.updateDynamic("eventEnd")(eventEnd)
    __obj.updateDynamic("eventMove")(eventMove)
    __obj.updateDynamic("eventStart")(eventStart)
    __obj.updateDynamic("longtap")(longtap)
    __obj.updateDynamic("singletap")(singletap)
    __obj.updateDynamic("swipe")(swipe)
    __obj.updateDynamic("swipedown")(swipedown)
    __obj.updateDynamic("swipeleft")(swipeleft)
    __obj.updateDynamic("swiperight")(swiperight)
    __obj.updateDynamic("swipeup")(swipeup)
    __obj.updateDynamic("tap")(tap)
    __obj.asInstanceOf[ChUIEventInterface]
  }
}

