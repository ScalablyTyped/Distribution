package typings.babylonjs.mathLikeMod

import typings.babylonjs.typesMod.float
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IColor3Like extends js.Object {
  var b: float
  var g: float
  var r: float
}

object IColor3Like {
  @scala.inline
  def apply(b: float, g: float, r: float): IColor3Like = {
    val __obj = js.Dynamic.literal(b = b.asInstanceOf[js.Any], g = g.asInstanceOf[js.Any], r = r.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[IColor3Like]
  }
}

