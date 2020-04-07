package typings.babylonjs.BABYLON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IVector3Like extends js.Object {
  var x: float
  var y: float
  var z: float
}

object IVector3Like {
  @scala.inline
  def apply(x: float, y: float, z: float): IVector3Like = {
    val __obj = js.Dynamic.literal(x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any], z = z.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[IVector3Like]
  }
}

