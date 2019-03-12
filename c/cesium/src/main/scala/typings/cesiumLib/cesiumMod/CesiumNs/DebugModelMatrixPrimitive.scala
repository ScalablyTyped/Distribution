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
    destroy: () => scala.Unit,
    id: js.Any,
    isDestroyed: () => scala.Boolean,
    length: scala.Double,
    modelMatrix: Matrix4,
    show: scala.Boolean,
    width: scala.Double
  ): DebugModelMatrixPrimitive = {
    val __obj = js.Dynamic.literal(destroy = js.Any.fromFunction0(destroy), id = id, isDestroyed = js.Any.fromFunction0(isDestroyed), length = length, modelMatrix = modelMatrix, show = show, width = width)
  
    __obj.asInstanceOf[DebugModelMatrixPrimitive]
  }
}

