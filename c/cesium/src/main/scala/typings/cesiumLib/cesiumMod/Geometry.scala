package typings
package cesiumLib.cesiumMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cesium", "Geometry")
@js.native
class Geometry protected ()
  extends cesiumLib.cesiumMod.CesiumNs.Geometry {
  def this(options: cesiumLib.Anon_Indices) = this()
  /* CompleteClass */
  override var attributes: cesiumLib.cesiumMod.CesiumNs.GeometryAttributes = js.native
  /* CompleteClass */
  override var boundingSphere: cesiumLib.cesiumMod.CesiumNs.BoundingSphere = js.native
  /* CompleteClass */
  override var indices: js.Array[_] = js.native
  /* CompleteClass */
  override var primitiveType: cesiumLib.cesiumMod.CesiumNs.PrimitiveType = js.native
}

@JSImport("cesium", "Geometry")
@js.native
object Geometry extends js.Object {
  def computeNumberOfVertices(geometry: cesiumLib.cesiumMod.CesiumNs.Cartesian3): scala.Double = js.native
}

