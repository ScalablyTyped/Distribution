package typings.cesium

import typings.cesium.cesiumMod.BoundingSphere
import typings.cesium.cesiumMod.Cartesian3
import typings.std.Uint16Array
import typings.std.Uint32Array
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_BoundingSphere extends js.Object {
  var boundingSphere: BoundingSphere
  var childTileMask: js.UndefOr[Double] = js.undefined
  var createdByUpsampling: js.UndefOr[Boolean] = js.undefined
  var eastIndices: js.Array[Double]
  var eastSkirtHeight: Double
  var encodedNormals: js.UndefOr[Uint8Array] = js.undefined
  var horizonOcclusionPoint: Cartesian3
  var indices: Uint16Array | Uint32Array
  var maximumHeight: Double
  var minimumHeight: Double
  var northIndices: js.Array[Double]
  var northSkirtHeight: Double
  var quantizedVertices: Uint16Array
  var southIndices: js.Array[Double]
  var southSkirtHeight: Double
  var waterMask: js.UndefOr[Uint8Array] = js.undefined
  var westIndices: js.Array[Double]
  var westSkirtHeight: Double
}

object Anon_BoundingSphere {
  @scala.inline
  def apply(
    boundingSphere: BoundingSphere,
    eastIndices: js.Array[Double],
    eastSkirtHeight: Double,
    horizonOcclusionPoint: Cartesian3,
    indices: Uint16Array | Uint32Array,
    maximumHeight: Double,
    minimumHeight: Double,
    northIndices: js.Array[Double],
    northSkirtHeight: Double,
    quantizedVertices: Uint16Array,
    southIndices: js.Array[Double],
    southSkirtHeight: Double,
    westIndices: js.Array[Double],
    westSkirtHeight: Double,
    childTileMask: Int | Double = null,
    createdByUpsampling: js.UndefOr[Boolean] = js.undefined,
    encodedNormals: Uint8Array = null,
    waterMask: Uint8Array = null
  ): Anon_BoundingSphere = {
    val __obj = js.Dynamic.literal(boundingSphere = boundingSphere, eastIndices = eastIndices, eastSkirtHeight = eastSkirtHeight, horizonOcclusionPoint = horizonOcclusionPoint, indices = indices.asInstanceOf[js.Any], maximumHeight = maximumHeight, minimumHeight = minimumHeight, northIndices = northIndices, northSkirtHeight = northSkirtHeight, quantizedVertices = quantizedVertices, southIndices = southIndices, southSkirtHeight = southSkirtHeight, westIndices = westIndices, westSkirtHeight = westSkirtHeight)
    if (childTileMask != null) __obj.updateDynamic("childTileMask")(childTileMask.asInstanceOf[js.Any])
    if (!js.isUndefined(createdByUpsampling)) __obj.updateDynamic("createdByUpsampling")(createdByUpsampling)
    if (encodedNormals != null) __obj.updateDynamic("encodedNormals")(encodedNormals)
    if (waterMask != null) __obj.updateDynamic("waterMask")(waterMask)
    __obj.asInstanceOf[Anon_BoundingSphere]
  }
}

