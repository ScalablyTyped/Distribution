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

