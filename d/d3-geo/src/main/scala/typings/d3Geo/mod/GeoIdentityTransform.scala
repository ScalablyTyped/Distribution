package typings.d3Geo.mod

import typings.geojson.mod.GeoJsonProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GeoIdentityTransform extends GeoStreamWrapper {
  /**
    * Returns the current viewport clip extent which defaults to null.
    */
  def clipExtent(): (js.Tuple2[js.Tuple2[Double, Double], js.Tuple2[Double, Double]]) | Null = js.native
  /**
    * Sets the projection’s viewport clip extent to the specified bounds in pixels and returns the projection.
    * The extent bounds are specified as an array [[x₀, y₀], [x₁, y₁]], where x₀ is the left-side of the viewport, y₀ is the top, x₁ is the right and y₁ is the bottom.
    *
    * Viewport clipping is independent of small-circle clipping via projection.clipAngle.
    *
    * @param extent The extent bounds are specified as an array [[x₀, y₀], [x₁, y₁]], where x₀ is the left-side of the viewport, y₀ is the top, x₁ is the right and y₁ is the bottom.
    */
  def clipExtent(extent: js.Tuple2[js.Tuple2[Double, Double], js.Tuple2[Double, Double]]): this.type = js.native
  /**
    * Sets the clip extent to null and returns the projection.
    * With a clip extent of null, no viewport clipping is performed.
    *
    * Viewport clipping is independent of small-circle clipping via projection.clipAngle.
    *
    * @param extent Set to null to disable viewport clipping.
    */
  def clipExtent(extent: Null): this.type = js.native
  /**
    * Sets the projection’s scale and translate to fit the specified geographic feature in the center of the given extent.
    * Returns the projection.
    *
    * Any clip extent is ignored when determining the new scale and translate. The precision used to compute the bounding box of the given object is computed at an effective scale of 150.
    *
    * @param extent The extent, specified as an array [[x₀, y₀], [x₁, y₁]], where x₀ is the left side of the bounding box, y₀ is the top, x₁ is the right and y₁ is the bottom.
    * @param object A geographic feature supported by d3-geo (An extension of GeoJSON feature).
    */
  def fitExtent(
    extent: js.Tuple2[js.Tuple2[Double, Double], js.Tuple2[Double, Double]],
    `object`: ExtendedFeature[GeoGeometryObjects | Null, GeoJsonProperties]
  ): this.type = js.native
  /**
    * Sets the projection’s scale and translate to fit the specified geographic feature collection in the center of the given extent.
    * Returns the projection.
    *
    * Any clip extent is ignored when determining the new scale and translate. The precision used to compute the bounding box of the given object is computed at an effective scale of 150.
    *
    * @param extent The extent, specified as an array [[x₀, y₀], [x₁, y₁]], where x₀ is the left side of the bounding box, y₀ is the top, x₁ is the right and y₁ is the bottom.
    * @param object A geographic feature collection supported by d3-geo (An extension of GeoJSON feature collection).
    */
  def fitExtent(
    extent: js.Tuple2[js.Tuple2[Double, Double], js.Tuple2[Double, Double]],
    `object`: ExtendedFeatureCollection[ExtendedFeature[GeoGeometryObjects | Null, GeoJsonProperties]]
  ): this.type = js.native
  /**
    * Sets the projection’s scale and translate to fit the specified geographic geometry collection in the center of the given extent.
    * Returns the projection.
    *
    * Any clip extent is ignored when determining the new scale and translate. The precision used to compute the bounding box of the given object is computed at an effective scale of 150.
    *
    * @param extent The extent, specified as an array [[x₀, y₀], [x₁, y₁]], where x₀ is the left side of the bounding box, y₀ is the top, x₁ is the right and y₁ is the bottom.
    * @param object A geographic geometry collection supported by d3-geo (An extension of GeoJSON geometry collection).
    */
  def fitExtent(
    extent: js.Tuple2[js.Tuple2[Double, Double], js.Tuple2[Double, Double]],
    `object`: ExtendedGeometryCollection[GeoGeometryObjects]
  ): this.type = js.native
  /**
    * Sets the projection’s scale and translate to fit the specified geographic geometry object in the center of the given extent.
    * Returns the projection.
    *
    * Any clip extent is ignored when determining the new scale and translate. The precision used to compute the bounding box of the given object is computed at an effective scale of 150.
    *
    * @param extent The extent, specified as an array [[x₀, y₀], [x₁, y₁]], where x₀ is the left side of the bounding box, y₀ is the top, x₁ is the right and y₁ is the bottom.
    * @param object A GeoJson Geometry Object or GeoSphere object supported by d3-geo (An extension of GeoJSON).
    */
  def fitExtent(
    extent: js.Tuple2[js.Tuple2[Double, Double], js.Tuple2[Double, Double]],
    `object`: GeoGeometryObjects
  ): this.type = js.native
  /**
    * Sets the projection’s scale and translate to fit the specified geographic feature in the center of an extent with the given size and top-left corner of [0, 0].
    * Returns the projection.
    *
    * Any clip extent is ignored when determining the new scale and translate. The precision used to compute the bounding box of the given object is computed at an effective scale of 150.
    *
    * @param size The size of the extent, specified as an array [width, height].
    * @param object A geographic feature supported by d3-geo (An extension of GeoJSON feature).
    */
  def fitSize(
    size: js.Tuple2[Double, Double],
    `object`: ExtendedFeature[GeoGeometryObjects | Null, GeoJsonProperties]
  ): this.type = js.native
  /**
    * Sets the projection’s scale and translate to fit the specified geographic feature collection in the center of an extent with the given size and top-left corner of [0, 0].
    * Returns the projection.
    *
    * Any clip extent is ignored when determining the new scale and translate. The precision used to compute the bounding box of the given object is computed at an effective scale of 150.
    *
    * @param size The size of the extent, specified as an array [width, height].
    * @param object A geographic feature collection supported by d3-geo (An extension of GeoJSON feature collection).
    */
  def fitSize(
    size: js.Tuple2[Double, Double],
    `object`: ExtendedFeatureCollection[ExtendedFeature[GeoGeometryObjects | Null, GeoJsonProperties]]
  ): this.type = js.native
  /**
    * Sets the projection’s scale and translate to fit the specified geographic geometry collection in the center of an extent with the given size and top-left corner of [0, 0].
    * Returns the projection.
    *
    * Any clip extent is ignored when determining the new scale and translate. The precision used to compute the bounding box of the given object is computed at an effective scale of 150.
    *
    * @param size The size of the extent, specified as an array [width, height].
    * @param object A geographic geometry collection supported by d3-geo (An extension of GeoJSON geometry collection).
    */
  def fitSize(size: js.Tuple2[Double, Double], `object`: ExtendedGeometryCollection[GeoGeometryObjects]): this.type = js.native
  /**
    * Sets the projection’s scale and translate to fit the specified geographic geometry object in the center of an extent with the given size and top-left corner of [0, 0].
    * Returns the projection.
    *
    * Any clip extent is ignored when determining the new scale and translate. The precision used to compute the bounding box of the given object is computed at an effective scale of 150.
    *
    * @param size The size of the extent, specified as an array [width, height].
    * @param object A GeoJson Geometry Object or GeoSphere object supported by d3-geo (An extension of GeoJSON).
    */
  def fitSize(size: js.Tuple2[Double, Double], `object`: GeoGeometryObjects): this.type = js.native
  /**
    * Returns true if x-reflection is enabled, which defaults to false.
    */
  def reflectX(): Boolean = js.native
  /**
    * Sets whether or not the x-dimension is reflected (negated) in the output.
    *
    * @param reflect true = reflect x-dimension, false = do not reflect x-dimension.
    */
  def reflectX(reflect: Boolean): this.type = js.native
  /**
    * Returns true if y-reflection is enabled, which defaults to false.
    */
  def reflectY(): Boolean = js.native
  /**
    * Sets whether or not the y-dimension is reflected (negated) in the output.
    *
    * This is especially useful for transforming from standard spatial reference systems,
    * which treat positive y as pointing up, to display coordinate systems such as Canvas and SVG,
    * which treat positive y as pointing down.
    *
    * @param reflect true = reflect y-dimension, false = do not reflect y-dimension.
    */
  def reflectY(reflect: Boolean): this.type = js.native
  /**
    * Returns the current scale factor.
    *
    * The scale factor corresponds linearly to the distance between projected points; however, absolute scale factors are not equivalent across projections.
    */
  def scale(): Double = js.native
  /**
    * Sets the projection’s scale factor to the specified value and returns the projection.
    * The scale factor corresponds linearly to the distance between projected points; however, absolute scale factors are not equivalent across projections.
    *
    * @param scale Scale factor to be used for the projection.
    */
  def scale(scale: Double): this.type = js.native
  /**
    * Returns the current translation offset.
    * The translation offset determines the pixel coordinates of the projection’s center.
    */
  def translate(): js.Tuple2[Double, Double] = js.native
  /**
    * Sets the projection’s translation offset to the specified two-element array [tx, ty] and returns the projection.
    * The translation offset determines the pixel coordinates of the projection’s center.
    *
    * @param point A two-element array [tx, ty] specifying the translation offset.
    */
  def translate(point: js.Tuple2[Double, Double]): this.type = js.native
}

