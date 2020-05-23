package typings.cesium.anon

import typings.cesium.mod.Cartesian3
import typings.std.Float32Array
import typings.std.Float64Array
import typings.std.Int16Array
import typings.std.Int8Array
import typings.std.Uint16Array
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Heightmap extends js.Object {
  var ellipsoid: js.UndefOr[typings.cesium.mod.Ellipsoid] = js.undefined
  var height: Double
  var heightmap: Int8Array | Uint8Array | Int16Array | Uint16Array | Float32Array | Float64Array
  var isGeographic: js.UndefOr[Boolean] = js.undefined
  var nativeRectangle: typings.cesium.mod.Rectangle
  var rectangle: js.UndefOr[typings.cesium.mod.Rectangle] = js.undefined
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

object Heightmap {
  @scala.inline
  def apply(
    height: Double,
    heightmap: Int8Array | Uint8Array | Int16Array | Uint16Array | Float32Array | Float64Array,
    nativeRectangle: typings.cesium.mod.Rectangle,
    skirtHeight: Double,
    vertices: js.Array[_] | Float32Array,
    width: Double,
    ellipsoid: typings.cesium.mod.Ellipsoid = null,
    isGeographic: js.UndefOr[Boolean] = js.undefined,
    rectangle: typings.cesium.mod.Rectangle = null,
    relativetoCenter: Cartesian3 = null,
    structure: js.Any = null,
    structureelementMultiplier: js.UndefOr[Double] = js.undefined,
    structureelementsPerHeight: js.UndefOr[Double] = js.undefined,
    structureheightOffset: js.UndefOr[Double] = js.undefined,
    structureheightScale: js.UndefOr[Double] = js.undefined,
    structureisBigEndian: js.UndefOr[Boolean] = js.undefined,
    structurestride: js.UndefOr[Double] = js.undefined
  ): Heightmap = {
    val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], heightmap = heightmap.asInstanceOf[js.Any], nativeRectangle = nativeRectangle.asInstanceOf[js.Any], skirtHeight = skirtHeight.asInstanceOf[js.Any], vertices = vertices.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    if (ellipsoid != null) __obj.updateDynamic("ellipsoid")(ellipsoid.asInstanceOf[js.Any])
    if (!js.isUndefined(isGeographic)) __obj.updateDynamic("isGeographic")(isGeographic.get.asInstanceOf[js.Any])
    if (rectangle != null) __obj.updateDynamic("rectangle")(rectangle.asInstanceOf[js.Any])
    if (relativetoCenter != null) __obj.updateDynamic("relativetoCenter")(relativetoCenter.asInstanceOf[js.Any])
    if (structure != null) __obj.updateDynamic("structure")(structure.asInstanceOf[js.Any])
    if (!js.isUndefined(structureelementMultiplier)) __obj.updateDynamic("structureelementMultiplier")(structureelementMultiplier.get.asInstanceOf[js.Any])
    if (!js.isUndefined(structureelementsPerHeight)) __obj.updateDynamic("structureelementsPerHeight")(structureelementsPerHeight.get.asInstanceOf[js.Any])
    if (!js.isUndefined(structureheightOffset)) __obj.updateDynamic("structureheightOffset")(structureheightOffset.get.asInstanceOf[js.Any])
    if (!js.isUndefined(structureheightScale)) __obj.updateDynamic("structureheightScale")(structureheightScale.get.asInstanceOf[js.Any])
    if (!js.isUndefined(structureisBigEndian)) __obj.updateDynamic("structureisBigEndian")(structureisBigEndian.get.asInstanceOf[js.Any])
    if (!js.isUndefined(structurestride)) __obj.updateDynamic("structurestride")(structurestride.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Heightmap]
  }
}

