package typings
package cesiumLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_BoundingSphere extends js.Object {
  var boundingSphere: cesiumLib.cesiumMod.BoundingSphere
  var childTileMask: js.UndefOr[scala.Double] = js.undefined
  var createdByUpsampling: js.UndefOr[scala.Boolean] = js.undefined
  var eastIndices: js.Array[scala.Double]
  var eastSkirtHeight: scala.Double
  var encodedNormals: js.UndefOr[stdLib.Uint8Array] = js.undefined
  var horizonOcclusionPoint: cesiumLib.cesiumMod.Cartesian3
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

object Anon_BoundingSphere {
  @scala.inline
  def apply(
    boundingSphere: cesiumLib.cesiumMod.BoundingSphere,
    eastIndices: js.Array[scala.Double],
    eastSkirtHeight: scala.Double,
    horizonOcclusionPoint: cesiumLib.cesiumMod.Cartesian3,
    indices: stdLib.Uint16Array | stdLib.Uint32Array,
    maximumHeight: scala.Double,
    minimumHeight: scala.Double,
    northIndices: js.Array[scala.Double],
    northSkirtHeight: scala.Double,
    quantizedVertices: stdLib.Uint16Array,
    southIndices: js.Array[scala.Double],
    southSkirtHeight: scala.Double,
    westIndices: js.Array[scala.Double],
    westSkirtHeight: scala.Double,
    childTileMask: scala.Int | scala.Double = null,
    createdByUpsampling: js.UndefOr[scala.Boolean] = js.undefined,
    encodedNormals: stdLib.Uint8Array = null,
    waterMask: stdLib.Uint8Array = null
  ): Anon_BoundingSphere = {
    val __obj = js.Dynamic.literal(boundingSphere = boundingSphere, eastIndices = eastIndices, eastSkirtHeight = eastSkirtHeight, horizonOcclusionPoint = horizonOcclusionPoint, indices = indices.asInstanceOf[js.Any], maximumHeight = maximumHeight, minimumHeight = minimumHeight, northIndices = northIndices, northSkirtHeight = northSkirtHeight, quantizedVertices = quantizedVertices, southIndices = southIndices, southSkirtHeight = southSkirtHeight, westIndices = westIndices, westSkirtHeight = westSkirtHeight)
    if (childTileMask != null) __obj.updateDynamic("childTileMask")(childTileMask.asInstanceOf[js.Any])
    if (!js.isUndefined(createdByUpsampling)) __obj.updateDynamic("createdByUpsampling")(createdByUpsampling)
    if (encodedNormals != null) __obj.updateDynamic("encodedNormals")(encodedNormals)
    if (waterMask != null) __obj.updateDynamic("waterMask")(waterMask)
    __obj.asInstanceOf[Anon_BoundingSphere]
  }
}

