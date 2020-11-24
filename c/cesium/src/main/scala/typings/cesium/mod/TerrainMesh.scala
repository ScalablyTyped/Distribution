package typings.cesium.mod

import typings.std.Float32Array
import typings.std.Uint16Array
import typings.std.Uint32Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("cesium", "TerrainMesh")
@js.native
class TerrainMesh protected () extends js.Object {
  def this(
    center: Cartesian3,
    vertices: Float32Array,
    indices: Uint16Array,
    minimumHeight: Double,
    maximumHeight: Double,
    boundingSphere3D: BoundingSphere,
    occludeePointInScaledSpace: Cartesian3
  ) = this()
  def this(
    center: Cartesian3,
    vertices: Float32Array,
    indices: Uint32Array,
    minimumHeight: Double,
    maximumHeight: Double,
    boundingSphere3D: BoundingSphere,
    occludeePointInScaledSpace: Cartesian3
  ) = this()
  def this(
    center: Cartesian3,
    vertices: Float32Array,
    indices: Uint16Array,
    minimumHeight: Double,
    maximumHeight: Double,
    boundingSphere3D: BoundingSphere,
    occludeePointInScaledSpace: Cartesian3,
    vertexStride: Double
  ) = this()
  def this(
    center: Cartesian3,
    vertices: Float32Array,
    indices: Uint32Array,
    minimumHeight: Double,
    maximumHeight: Double,
    boundingSphere3D: BoundingSphere,
    occludeePointInScaledSpace: Cartesian3,
    vertexStride: Double
  ) = this()
  
  var boundingSphere3D: BoundingSphere = js.native
  
  var center: Cartesian3 = js.native
  
  var indices: Uint16Array | Uint32Array = js.native
  
  var maximumHeight: Double = js.native
  
  var minimumHeight: Double = js.native
  
  var occludeePointInScaledSpace: Cartesian3 = js.native
  
  var stride: Double = js.native
  
  var vertices: Float32Array = js.native
}
