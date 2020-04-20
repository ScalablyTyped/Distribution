package typings.babylonjs.mathLikeMod

import typings.babylonjs.typesMod.float
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IVector2Like extends js.Object {
  var x: float
  var y: float
}

object IVector2Like {
  @scala.inline
  def apply(x: float, y: float): IVector2Like = {
    val __obj = js.Dynamic.literal(x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.asInstanceOf[IVector2Like]
  }
}

