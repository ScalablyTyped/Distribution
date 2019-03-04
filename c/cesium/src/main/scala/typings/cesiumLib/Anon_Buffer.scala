package typings
package cesiumLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Buffer extends js.Object {
  var buffer: stdLib.Int8Array | stdLib.Uint8Array | stdLib.Int16Array | stdLib.Uint16Array | stdLib.Float32Array | stdLib.Float64Array
  var childTileMask: js.UndefOr[scala.Double] = js.undefined
  var createdByUpsampling: js.UndefOr[scala.Boolean] = js.undefined
  var height: scala.Double
  var structure: js.UndefOr[js.Any] = js.undefined
  var structureelementMultiplier: js.UndefOr[scala.Double] = js.undefined
  var structureelementsPerHeight: js.UndefOr[scala.Double] = js.undefined
  var structureheightOffset: js.UndefOr[scala.Double] = js.undefined
  var structureheightScale: js.UndefOr[scala.Double] = js.undefined
  var structureisBigEndian: js.UndefOr[scala.Boolean] = js.undefined
  var structurestride: js.UndefOr[scala.Double] = js.undefined
  var width: scala.Double
}

object Anon_Buffer {
  @scala.inline
  def apply(
    buffer: stdLib.Int8Array | stdLib.Uint8Array | stdLib.Int16Array | stdLib.Uint16Array | stdLib.Float32Array | stdLib.Float64Array,
    height: scala.Double,
    width: scala.Double,
    childTileMask: scala.Int | scala.Double = null,
    createdByUpsampling: js.UndefOr[scala.Boolean] = js.undefined,
    structure: js.Any = null,
    structureelementMultiplier: scala.Int | scala.Double = null,
    structureelementsPerHeight: scala.Int | scala.Double = null,
    structureheightOffset: scala.Int | scala.Double = null,
    structureheightScale: scala.Int | scala.Double = null,
    structureisBigEndian: js.UndefOr[scala.Boolean] = js.undefined,
    structurestride: scala.Int | scala.Double = null
  ): Anon_Buffer = {
    val __obj = js.Dynamic.literal(buffer = buffer.asInstanceOf[js.Any], height = height, width = width)
    if (childTileMask != null) __obj.updateDynamic("childTileMask")(childTileMask.asInstanceOf[js.Any])
    if (!js.isUndefined(createdByUpsampling)) __obj.updateDynamic("createdByUpsampling")(createdByUpsampling)
    if (structure != null) __obj.updateDynamic("structure")(structure)
    if (structureelementMultiplier != null) __obj.updateDynamic("structureelementMultiplier")(structureelementMultiplier.asInstanceOf[js.Any])
    if (structureelementsPerHeight != null) __obj.updateDynamic("structureelementsPerHeight")(structureelementsPerHeight.asInstanceOf[js.Any])
    if (structureheightOffset != null) __obj.updateDynamic("structureheightOffset")(structureheightOffset.asInstanceOf[js.Any])
    if (structureheightScale != null) __obj.updateDynamic("structureheightScale")(structureheightScale.asInstanceOf[js.Any])
    if (!js.isUndefined(structureisBigEndian)) __obj.updateDynamic("structureisBigEndian")(structureisBigEndian)
    if (structurestride != null) __obj.updateDynamic("structurestride")(structurestride.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Buffer]
  }
}

