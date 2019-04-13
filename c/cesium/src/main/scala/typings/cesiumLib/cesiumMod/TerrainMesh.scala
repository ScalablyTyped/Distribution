package typings
package cesiumLib.cesiumMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cesium", "TerrainMesh")
@js.native
class TerrainMesh protected () extends js.Object {
  def this(center: Cartesian3, vertices: stdLib.Float32Array, indices: stdLib.Uint16Array, minimumHeight: scala.Double, maximumHeight: scala.Double, boundingSphere3D: BoundingSphere, occludeePointInScaledSpace: Cartesian3) = this()
  def this(center: Cartesian3, vertices: stdLib.Float32Array, indices: stdLib.Uint32Array, minimumHeight: scala.Double, maximumHeight: scala.Double, boundingSphere3D: BoundingSphere, occludeePointInScaledSpace: Cartesian3) = this()
  def this(center: Cartesian3, vertices: stdLib.Float32Array, indices: stdLib.Uint16Array, minimumHeight: scala.Double, maximumHeight: scala.Double, boundingSphere3D: BoundingSphere, occludeePointInScaledSpace: Cartesian3, vertexStride: scala.Double) = this()
  def this(center: Cartesian3, vertices: stdLib.Float32Array, indices: stdLib.Uint32Array, minimumHeight: scala.Double, maximumHeight: scala.Double, boundingSphere3D: BoundingSphere, occludeePointInScaledSpace: Cartesian3, vertexStride: scala.Double) = this()
  var boundingSphere3D: BoundingSphere = js.native
  var center: Cartesian3 = js.native
  var indices: stdLib.Uint16Array | stdLib.Uint32Array = js.native
  var maximumHeight: scala.Double = js.native
  var minimumHeight: scala.Double = js.native
  var occludeePointInScaledSpace: Cartesian3 = js.native
  var stride: scala.Double = js.native
  var vertices: stdLib.Float32Array = js.native
}

