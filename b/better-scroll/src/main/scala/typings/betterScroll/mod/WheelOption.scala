package typings.betterScroll.mod

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
    val __obj = js.Dynamic.literal(adjustTime = adjustTime.asInstanceOf[js.Any], rotate = rotate.asInstanceOf[js.Any], selectedIndex = selectedIndex.asInstanceOf[js.Any], wheelItemClass = wheelItemClass.asInstanceOf[js.Any], wheelWrapperClass = wheelWrapperClass.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[WheelOption]
  }
}

