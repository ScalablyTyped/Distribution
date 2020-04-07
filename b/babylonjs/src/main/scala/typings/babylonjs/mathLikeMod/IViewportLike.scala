package typings.babylonjs.mathLikeMod

import typings.babylonjs.typesMod.float
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IViewportLike extends js.Object {
  var height: float
  var width: float
  var x: float
  var y: float
}

object IViewportLike {
  @scala.inline
  def apply(height: float, width: float, x: float, y: float): IViewportLike = {
    val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[IViewportLike]
  }
}

