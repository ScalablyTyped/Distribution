package typings.babylonjs.BABYLON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IColor4Like extends js.Object {
  var a: float
  var b: float
  var g: float
  var r: float
}

object IColor4Like {
  @scala.inline
  def apply(a: float, b: float, g: float, r: float): IColor4Like = {
    val __obj = js.Dynamic.literal(a = a.asInstanceOf[js.Any], b = b.asInstanceOf[js.Any], g = g.asInstanceOf[js.Any], r = r.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[IColor4Like]
  }
}

