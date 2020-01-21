package typings.bootstrapMaxlength.BootstrapMaxlength

import typings.std.Number
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Representation of the current input position
  */
trait PositionParam extends js.Object {
  var bottom: Number
  var height: Number
  var left: Number
  var right: Number
  var top: Number
  var width: Number
}

object PositionParam {
  @scala.inline
  def apply(bottom: Number, height: Number, left: Number, right: Number, top: Number, width: Number): PositionParam = {
    val __obj = js.Dynamic.literal(bottom = bottom.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], left = left.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any], top = top.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[PositionParam]
  }
}

