package typings
package cesiumLib.cesiumMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cesium", "DebugModelMatrixPrimitive")
@js.native
class DebugModelMatrixPrimitive ()
  extends cesiumLib.cesiumMod.CesiumNs.DebugModelMatrixPrimitive {
  def this(options: cesiumLib.Anon_ShowModelMatrix) = this()
  /* CompleteClass */
  override var id: js.Any = js.native
  /* CompleteClass */
  override var length: scala.Double = js.native
  /* CompleteClass */
  override var modelMatrix: cesiumLib.cesiumMod.CesiumNs.Matrix4 = js.native
  /* CompleteClass */
  override var show: scala.Boolean = js.native
  /* CompleteClass */
  override var width: scala.Double = js.native
  /* CompleteClass */
  override def destroy(): scala.Unit = js.native
  /* CompleteClass */
  override def isDestroyed(): scala.Boolean = js.native
}

