package typings
package detectDashHoverLib.detectDashHoverMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait detectHover extends js.Object {
  var anyHover: scala.Boolean
  var anyNone: scala.Boolean
  var hover: scala.Boolean
  var none: scala.Boolean
  def update(): scala.Unit
}

object detectHover {
  @scala.inline
  def apply(
    anyHover: scala.Boolean,
    anyNone: scala.Boolean,
    hover: scala.Boolean,
    none: scala.Boolean,
    update: js.Function0[scala.Unit]
  ): detectHover = {
    val __obj = js.Dynamic.literal(anyHover = anyHover, anyNone = anyNone, hover = hover, none = none, update = update)
  
    __obj.asInstanceOf[detectHover]
  }
}

