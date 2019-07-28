package typings.betterDashScroll.betterDashScrollMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WheelOption extends js.Object {
  var adjustTime: Double
  var rotate: Double
  var selectedIndex: Double
  var wheelItemClass: String
  var wheelWrapperClass: String
}

object WheelOption {
  @scala.inline
  def apply(
    adjustTime: Double,
    rotate: Double,
    selectedIndex: Double,
    wheelItemClass: String,
    wheelWrapperClass: String
  ): WheelOption = {
    val __obj = js.Dynamic.literal(adjustTime = adjustTime, rotate = rotate, selectedIndex = selectedIndex, wheelItemClass = wheelItemClass, wheelWrapperClass = wheelWrapperClass)
  
    __obj.asInstanceOf[WheelOption]
  }
}

