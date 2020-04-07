package typings.babylonjs.mathLikeMod

import typings.babylonjs.typesMod.float
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IVector4Like extends js.Object {
  var w: float
  var x: float
  var y: float
  var z: float
}

object IVector4Like {
  @scala.inline
  def apply(w: float, x: float, y: float, z: float): IVector4Like = {
    val __obj = js.Dynamic.literal(w = w.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any], z = z.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[IVector4Like]
  }
}

