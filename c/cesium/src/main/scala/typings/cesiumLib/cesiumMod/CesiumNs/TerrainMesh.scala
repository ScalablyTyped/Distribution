package typings
package cesiumLib.cesiumMod.CesiumNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TerrainMesh extends js.Object {
  var boundingSphere3D: BoundingSphere
  var center: Cartesian3
  var indices: stdLib.Uint16Array | stdLib.Uint32Array
  var maximumHeight: scala.Double
  var minimumHeight: scala.Double
  var occludeePointInScaledSpace: Cartesian3
  var stride: scala.Double
  var vertices: stdLib.Float32Array
}

object TerrainMesh {
  @scala.inline
  def apply(
    boundingSphere3D: BoundingSphere,
    center: Cartesian3,
    indices: stdLib.Uint16Array | stdLib.Uint32Array,
    maximumHeight: scala.Double,
    minimumHeight: scala.Double,
    occludeePointInScaledSpace: Cartesian3,
    stride: scala.Double,
    vertices: stdLib.Float32Array
  ): TerrainMesh = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("boundingSphere3D")(boundingSphere3D)
    __obj.updateDynamic("center")(center)
    __obj.updateDynamic("indices")(indices.asInstanceOf[js.Any])
    __obj.updateDynamic("maximumHeight")(maximumHeight)
    __obj.updateDynamic("minimumHeight")(minimumHeight)
    __obj.updateDynamic("occludeePointInScaledSpace")(occludeePointInScaledSpace)
    __obj.updateDynamic("stride")(stride)
    __obj.updateDynamic("vertices")(vertices)
    __obj.asInstanceOf[TerrainMesh]
  }
}

