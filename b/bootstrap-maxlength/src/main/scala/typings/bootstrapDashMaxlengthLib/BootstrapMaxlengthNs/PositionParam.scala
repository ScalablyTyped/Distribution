package typings
package bootstrapDashMaxlengthLib.BootstrapMaxlengthNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Representation of the current input position
  */
trait PositionParam extends js.Object {
  var bottom: stdLib.Number
  var height: stdLib.Number
  var left: stdLib.Number
  var right: stdLib.Number
  var top: stdLib.Number
  var width: stdLib.Number
}

object PositionParam {
  @scala.inline
  def apply(
    bottom: stdLib.Number,
    height: stdLib.Number,
    left: stdLib.Number,
    right: stdLib.Number,
    top: stdLib.Number,
    width: stdLib.Number
  ): PositionParam = {
    val __obj = js.Dynamic.literal(bottom = bottom, height = height, left = left, right = right, top = top, width = width)
  
    __obj.asInstanceOf[PositionParam]
  }
}

