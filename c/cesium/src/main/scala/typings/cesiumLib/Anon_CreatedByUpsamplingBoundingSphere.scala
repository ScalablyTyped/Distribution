package typings
package cesiumLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait Anon_CreatedByUpsamplingBoundingSphere extends js.Object {
  var boundingSphere: cesiumLib.cesiumMod.CesiumNs.BoundingSphere
  var childTileMask: js.UndefOr[scala.Double] = js.undefined
  var createdByUpsampling: js.UndefOr[scala.Boolean] = js.undefined
  var eastIndices: js.Array[scala.Double]
  var eastSkirtHeight: scala.Double
  var encodedNormals: js.UndefOr[stdLib.Uint8Array] = js.undefined
  var horizonOcclusionPoint: cesiumLib.cesiumMod.CesiumNs.Cartesian3
  var indices: stdLib.Uint16Array | stdLib.Uint32Array
  var maximumHeight: scala.Double
  var minimumHeight: scala.Double
  var northIndices: js.Array[scala.Double]
  var northSkirtHeight: scala.Double
  var quantizedVertices: stdLib.Uint16Array
  var southIndices: js.Array[scala.Double]
  var southSkirtHeight: scala.Double
  var waterMask: js.UndefOr[stdLib.Uint8Array] = js.undefined
  var westIndices: js.Array[scala.Double]
  var westSkirtHeight: scala.Double
}

