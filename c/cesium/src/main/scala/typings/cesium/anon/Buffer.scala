package typings.cesium.anon

import typings.std.Float32Array
import typings.std.Float64Array
import typings.std.Int16Array
import typings.std.Int8Array
import typings.std.Uint16Array
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Buffer extends js.Object {
  var buffer: Int8Array | Uint8Array | Int16Array | Uint16Array | Float32Array | Float64Array
  var childTileMask: js.UndefOr[Double] = js.undefined
  var createdByUpsampling: js.UndefOr[Boolean] = js.undefined
  var height: Double
  var structure: js.UndefOr[js.Any] = js.undefined
  var structureelementMultiplier: js.UndefOr[Double] = js.undefined
  var structureelementsPerHeight: js.UndefOr[Double] = js.undefined
  var structureheightOffset: js.UndefOr[Double] = js.undefined
  var structureheightScale: js.UndefOr[Double] = js.undefined
  var structureisBigEndian: js.UndefOr[Boolean] = js.undefined
  var structurestride: js.UndefOr[Double] = js.undefined
  var width: Double
}

object Buffer {
  @scala.inline
  def apply(
    buffer: Int8Array | Uint8Array | Int16Array | Uint16Array | Float32Array | Float64Array,
    height: Double,
    width: Double,
    childTileMask: js.UndefOr[Double] = js.undefined,
    createdByUpsampling: js.UndefOr[Boolean] = js.undefined,
    structure: js.Any = null,
    structureelementMultiplier: js.UndefOr[Double] = js.undefined,
    structureelementsPerHeight: js.UndefOr[Double] = js.undefined,
    structureheightOffset: js.UndefOr[Double] = js.undefined,
    structureheightScale: js.UndefOr[Double] = js.undefined,
    structureisBigEndian: js.UndefOr[Boolean] = js.undefined,
    structurestride: js.UndefOr[Double] = js.undefined
  ): Buffer = {
    val __obj = js.Dynamic.literal(buffer = buffer.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    if (!js.isUndefined(childTileMask)) __obj.updateDynamic("childTileMask")(childTileMask.get.asInstanceOf[js.Any])
    if (!js.isUndefined(createdByUpsampling)) __obj.updateDynamic("createdByUpsampling")(createdByUpsampling.get.asInstanceOf[js.Any])
    if (structure != null) __obj.updateDynamic("structure")(structure.asInstanceOf[js.Any])
    if (!js.isUndefined(structureelementMultiplier)) __obj.updateDynamic("structureelementMultiplier")(structureelementMultiplier.get.asInstanceOf[js.Any])
    if (!js.isUndefined(structureelementsPerHeight)) __obj.updateDynamic("structureelementsPerHeight")(structureelementsPerHeight.get.asInstanceOf[js.Any])
    if (!js.isUndefined(structureheightOffset)) __obj.updateDynamic("structureheightOffset")(structureheightOffset.get.asInstanceOf[js.Any])
    if (!js.isUndefined(structureheightScale)) __obj.updateDynamic("structureheightScale")(structureheightScale.get.asInstanceOf[js.Any])
    if (!js.isUndefined(structureisBigEndian)) __obj.updateDynamic("structureisBigEndian")(structureisBigEndian.get.asInstanceOf[js.Any])
    if (!js.isUndefined(structurestride)) __obj.updateDynamic("structurestride")(structurestride.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Buffer]
  }
}

