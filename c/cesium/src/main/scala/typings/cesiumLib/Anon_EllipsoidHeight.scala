package typings
package cesiumLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_EllipsoidHeight extends js.Object {
  var ellipsoid: js.UndefOr[cesiumLib.cesiumMod.Ellipsoid] = js.undefined
  var height: scala.Double
  var heightmap: stdLib.Int8Array | stdLib.Uint8Array | stdLib.Int16Array | stdLib.Uint16Array | stdLib.Float32Array | stdLib.Float64Array
  var isGeographic: js.UndefOr[scala.Boolean] = js.undefined
  var nativeRectangle: cesiumLib.cesiumMod.Rectangle
  var rectangle: js.UndefOr[cesiumLib.cesiumMod.Rectangle] = js.undefined
  var relativetoCenter: js.UndefOr[cesiumLib.cesiumMod.Cartesian3] = js.undefined
  var skirtHeight: scala.Double
  var structure: js.UndefOr[js.Any] = js.undefined
  var structureelementMultiplier: js.UndefOr[scala.Double] = js.undefined
  var structureelementsPerHeight: js.UndefOr[scala.Double] = js.undefined
  var structureheightOffset: js.UndefOr[scala.Double] = js.undefined
  var structureheightScale: js.UndefOr[scala.Double] = js.undefined
  var structureisBigEndian: js.UndefOr[scala.Boolean] = js.undefined
  var structurestride: js.UndefOr[scala.Double] = js.undefined
  var vertices: js.Array[_] | stdLib.Float32Array
  var width: scala.Double
}

object Anon_EllipsoidHeight {
  @scala.inline
  def apply(
    height: scala.Double,
    heightmap: stdLib.Int8Array | stdLib.Uint8Array | stdLib.Int16Array | stdLib.Uint16Array | stdLib.Float32Array | stdLib.Float64Array,
    nativeRectangle: cesiumLib.cesiumMod.Rectangle,
    skirtHeight: scala.Double,
    vertices: js.Array[_] | stdLib.Float32Array,
    width: scala.Double,
    ellipsoid: cesiumLib.cesiumMod.Ellipsoid = null,
    isGeographic: js.UndefOr[scala.Boolean] = js.undefined,
    rectangle: cesiumLib.cesiumMod.Rectangle = null,
    relativetoCenter: cesiumLib.cesiumMod.Cartesian3 = null,
    structure: js.Any = null,
    structureelementMultiplier: scala.Int | scala.Double = null,
    structureelementsPerHeight: scala.Int | scala.Double = null,
    structureheightOffset: scala.Int | scala.Double = null,
    structureheightScale: scala.Int | scala.Double = null,
    structureisBigEndian: js.UndefOr[scala.Boolean] = js.undefined,
    structurestride: scala.Int | scala.Double = null
  ): Anon_EllipsoidHeight = {
    val __obj = js.Dynamic.literal(height = height, heightmap = heightmap.asInstanceOf[js.Any], nativeRectangle = nativeRectangle, skirtHeight = skirtHeight, vertices = vertices.asInstanceOf[js.Any], width = width)
    if (ellipsoid != null) __obj.updateDynamic("ellipsoid")(ellipsoid)
    if (!js.isUndefined(isGeographic)) __obj.updateDynamic("isGeographic")(isGeographic)
    if (rectangle != null) __obj.updateDynamic("rectangle")(rectangle)
    if (relativetoCenter != null) __obj.updateDynamic("relativetoCenter")(relativetoCenter)
    if (structure != null) __obj.updateDynamic("structure")(structure)
    if (structureelementMultiplier != null) __obj.updateDynamic("structureelementMultiplier")(structureelementMultiplier.asInstanceOf[js.Any])
    if (structureelementsPerHeight != null) __obj.updateDynamic("structureelementsPerHeight")(structureelementsPerHeight.asInstanceOf[js.Any])
    if (structureheightOffset != null) __obj.updateDynamic("structureheightOffset")(structureheightOffset.asInstanceOf[js.Any])
    if (structureheightScale != null) __obj.updateDynamic("structureheightScale")(structureheightScale.asInstanceOf[js.Any])
    if (!js.isUndefined(structureisBigEndian)) __obj.updateDynamic("structureisBigEndian")(structureisBigEndian)
    if (structurestride != null) __obj.updateDynamic("structurestride")(structurestride.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_EllipsoidHeight]
  }
}

