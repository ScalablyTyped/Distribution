package typings.detectDashHover.detectDashHoverMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait detectHover extends js.Object {
  var anyHover: Boolean
  var anyNone: Boolean
  var hover: Boolean
  var none: Boolean
  def update(): Unit
}

object detectHover {
  @scala.inline
  def apply(anyHover: Boolean, anyNone: Boolean, hover: Boolean, none: Boolean, update: () => Unit): detectHover = {
    val __obj = js.Dynamic.literal(anyHover = anyHover, anyNone = anyNone, hover = hover, none = none, update = js.Any.fromFunction0(update))
  
    __obj.asInstanceOf[detectHover]
  }
}

