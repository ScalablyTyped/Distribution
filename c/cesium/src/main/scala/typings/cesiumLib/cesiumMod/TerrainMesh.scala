package typings
package cesiumLib.cesiumMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cesium", "TerrainMesh")
@js.native
class TerrainMesh protected ()
  extends cesiumLib.cesiumMod.CesiumNs.TerrainMesh {
  def this(center: cesiumLib.cesiumMod.CesiumNs.Cartesian3, vertices: stdLib.Float32Array, indices: stdLib.Uint16Array, minimumHeight: scala.Double, maximumHeight: scala.Double, boundingSphere3D: cesiumLib.cesiumMod.CesiumNs.BoundingSphere, occludeePointInScaledSpace: cesiumLib.cesiumMod.CesiumNs.Cartesian3) = this()
  def this(center: cesiumLib.cesiumMod.CesiumNs.Cartesian3, vertices: stdLib.Float32Array, indices: stdLib.Uint32Array, minimumHeight: scala.Double, maximumHeight: scala.Double, boundingSphere3D: cesiumLib.cesiumMod.CesiumNs.BoundingSphere, occludeePointInScaledSpace: cesiumLib.cesiumMod.CesiumNs.Cartesian3) = this()
  def this(center: cesiumLib.cesiumMod.CesiumNs.Cartesian3, vertices: stdLib.Float32Array, indices: stdLib.Uint16Array, minimumHeight: scala.Double, maximumHeight: scala.Double, boundingSphere3D: cesiumLib.cesiumMod.CesiumNs.BoundingSphere, occludeePointInScaledSpace: cesiumLib.cesiumMod.CesiumNs.Cartesian3, vertexStride: scala.Double) = this()
  def this(center: cesiumLib.cesiumMod.CesiumNs.Cartesian3, vertices: stdLib.Float32Array, indices: stdLib.Uint32Array, minimumHeight: scala.Double, maximumHeight: scala.Double, boundingSphere3D: cesiumLib.cesiumMod.CesiumNs.BoundingSphere, occludeePointInScaledSpace: cesiumLib.cesiumMod.CesiumNs.Cartesian3, vertexStride: scala.Double) = this()
  /* CompleteClass */
  override var boundingSphere3D: cesiumLib.cesiumMod.CesiumNs.BoundingSphere = js.native
  /* CompleteClass */
  override var center: cesiumLib.cesiumMod.CesiumNs.Cartesian3 = js.native
  /* CompleteClass */
  override var indices: stdLib.Uint16Array | stdLib.Uint32Array = js.native
  /* CompleteClass */
  override var maximumHeight: scala.Double = js.native
  /* CompleteClass */
  override var minimumHeight: scala.Double = js.native
  /* CompleteClass */
  override var occludeePointInScaledSpace: cesiumLib.cesiumMod.CesiumNs.Cartesian3 = js.native
  /* CompleteClass */
  override var stride: scala.Double = js.native
  /* CompleteClass */
  override var vertices: stdLib.Float32Array = js.native
}

