package typings.cesium.global.Cesium

import typings.std.Float32Array
import typings.std.Uint16Array
import typings.std.Uint32Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Cesium.TerrainMesh")
@js.native
class TerrainMesh protected ()
  extends typings.cesium.mod.TerrainMesh {
  def this(
    center: typings.cesium.mod.Cartesian3,
    vertices: Float32Array,
    indices: Uint16Array,
    minimumHeight: Double,
    maximumHeight: Double,
    boundingSphere3D: typings.cesium.mod.BoundingSphere,
    occludeePointInScaledSpace: typings.cesium.mod.Cartesian3
  ) = this()
  def this(
    center: typings.cesium.mod.Cartesian3,
    vertices: Float32Array,
    indices: Uint32Array,
    minimumHeight: Double,
    maximumHeight: Double,
    boundingSphere3D: typings.cesium.mod.BoundingSphere,
    occludeePointInScaledSpace: typings.cesium.mod.Cartesian3
  ) = this()
  def this(
    center: typings.cesium.mod.Cartesian3,
    vertices: Float32Array,
    indices: Uint16Array,
    minimumHeight: Double,
    maximumHeight: Double,
    boundingSphere3D: typings.cesium.mod.BoundingSphere,
    occludeePointInScaledSpace: typings.cesium.mod.Cartesian3,
    vertexStride: Double
  ) = this()
  def this(
    center: typings.cesium.mod.Cartesian3,
    vertices: Float32Array,
    indices: Uint32Array,
    minimumHeight: Double,
    maximumHeight: Double,
    boundingSphere3D: typings.cesium.mod.BoundingSphere,
    occludeePointInScaledSpace: typings.cesium.mod.Cartesian3,
    vertexStride: Double
  ) = this()
}
