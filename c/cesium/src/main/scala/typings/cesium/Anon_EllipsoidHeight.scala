package typings.cesium

import typings.cesium.cesiumMod.Cartesian3
import typings.cesium.cesiumMod.Ellipsoid
import typings.cesium.cesiumMod.Rectangle
import typings.std.Float32Array
import typings.std.Float64Array
import typings.std.Int16Array
import typings.std.Int8Array
import typings.std.Uint16Array
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_EllipsoidHeight extends js.Object {
  var ellipsoid: js.UndefOr[Ellipsoid] = js.undefined
  var height: Double
  var heightmap: Int8Array | Uint8Array | Int16Array | Uint16Array | Float32Array | Float64Array
  var isGeographic: js.UndefOr[Boolean] = js.undefined
  var nativeRectangle: Rectangle
  var rectangle: js.UndefOr[Rectangle] = js.undefined
  var relativetoCenter: js.UndefOr[Cartesian3] = js.undefined
  var skirtHeight: Double
  var structure: js.UndefOr[js.Any] = js.undefined
  var structureelementMultiplier: js.UndefOr[Double] = js.undefined
  var structureelementsPerHeight: js.UndefOr[Double] = js.undefined
  var structureheightOffset: js.UndefOr[Double] = js.undefined
  var structureheightScale: js.UndefOr[Double] = js.undefined
  var structureisBigEndian: js.UndefOr[Boolean] = js.undefined
  var structurestride: js.UndefOr[Double] = js.undefined
  var vertices: js.Array[_] | Float32Array
  var width: Double
}

object Anon_EllipsoidHeight {
  @scala.inline
  def apply(
    height: Double,
    heightmap: Int8Array | Uint8Array | Int16Array | Uint16Array | Float32Array | Float64Array,
    nativeRectangle: Rectangle,
    skirtHeight: Double,
    vertices: js.Array[_] | Float32Array,
    width: Double,
    ellipsoid: Ellipsoid = null,
    isGeographic: js.UndefOr[Boolean] = js.undefined,
    rectangle: Rectangle = null,
    relativetoCenter: Cartesian3 = null,
    structure: js.Any = null,
    structureelementMultiplier: Int | Double = null,
    structureelementsPerHeight: Int | Double = null,
    structureheightOffset: Int | Double = null,
    structureheightScale: Int | Double = null,
    structureisBigEndian: js.UndefOr[Boolean] = js.undefined,
    structurestride: Int | Double = null
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

