package typings
package cesiumLib.cesiumMod.CesiumNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DebugModelMatrixPrimitive extends js.Object {
  var id: js.Any
  var length: scala.Double
  var modelMatrix: Matrix4
  var show: scala.Boolean
  var width: scala.Double
  def destroy(): scala.Unit
  def isDestroyed(): scala.Boolean
}

object DebugModelMatrixPrimitive {
  @scala.inline
  def apply(
    destroy: js.Function0[scala.Unit],
    id: js.Any,
    isDestroyed: js.Function0[scala.Boolean],
    length: scala.Double,
    modelMatrix: Matrix4,
    show: scala.Boolean,
    width: scala.Double
  ): DebugModelMatrixPrimitive = {
    val __obj = js.Dynamic.literal(destroy = destroy, id = id, isDestroyed = isDestroyed, length = length, modelMatrix = modelMatrix, show = show, width = width)
  
    __obj.asInstanceOf[DebugModelMatrixPrimitive]
  }
}

