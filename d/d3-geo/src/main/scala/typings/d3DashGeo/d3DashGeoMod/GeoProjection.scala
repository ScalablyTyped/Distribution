package typings.d3DashGeo.d3DashGeoMod

import typings.geojson.geojsonMod.GeoJsonProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GeoProjection extends GeoStreamWrapper {
  /**
    * Returns a new array [longitude, latitude] in degrees representing the unprojected point of the given projected point.
    * May return null if the specified point has no defined projected position, such as when the point is outside the clipping bounds of the projection.
    *
    * @param point The projected point, specified as a two-element array [x, y] (typically in pixels).
    */
  var invert: js.UndefOr[
    js.Function1[/* point */ js.Tuple2[Double, Double], (js.Tuple2[Double, Double]) | Null]
  ] = js.native
  /**
    * Returns a new array [x, y] (typically in pixels) representing the projected point of the given point.
    * The point must be specified as a two-element array [longitude, latitude] in degrees.
    * May return null if the specified point has no defined projected position, such as when the point is outside the clipping bounds of the projection.
    *
    * @param point A point specified as a two-dimensional array [longitude, latitude] in degrees.
    */
  def apply(point: js.Tuple2[Double, Double]): (js.Tuple2[Double, Double]) | Null = js.native
  /**
    * Returns the projection’s current angle, which defaults to 0°.
    */
  def angle(): Double = js.native
  /**
    * Sets the projection’s post-projection planar rotation angle to the specified angle in degrees and returns the projection.
    * @param angle The new rotation angle of the projection.
    */
  def angle(angle: Double): this.type = js.native
  /**
    * Returns the current center of the projection, which defaults to ⟨0°,0°⟩.
    */
  def center(): js.Tuple2[Double, Double] = js.native
  /**
    * Sets the projection’s center to the specified center,
    * a two-element array of longitude and latitude in degrees and returns the projection.
    * The default is ⟨0°,0°⟩.
    *
    * @param point A point specified as a two-dimensional array [longitude, latitude] in degrees.
    */
  def center(point: js.Tuple2[Double, Double]): this.type = js.native
  /**
    * Returns the current clip angle which defaults to null.
    *
    * null switches to antimeridian cutting rather than small-circle clipping.
    */
  def clipAngle(): Double | Null = js.native
  /**
    * Sets the projection’s clipping circle radius to the specified angle in degrees and returns the projection.
    * Small-circle clipping is independent of viewport clipping via projection.clipExtent.
    *
    * See also projection.preclip, d3.geoClipAntimeridian, d3.geoClipCircle.
    *
    * @param angle Angle in degrees.
    */
  def clipAngle(angle: Double): this.type = js.native
  /**
    * Switches to antimeridian cutting rather than small-circle clipping.
    * See also projection.preclip, d3.geoClipAntimeridian, d3.geoClipCircle.
    *
    * @param angle Set to null to switch to antimeridian cutting.
    */
  @JSName("clipAngle")
  def clipAngle_This(): this.type = js.native
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
    * See also projection.postclip, d3.geoClipRectangle.
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
    * See also projection.postclip, d3.geoClipRectangle.
    *
    * @param extent Set to null to disable viewport clipping.
    */
  @JSName("clipExtent")
  def clipExtent_This(): this.type = js.native
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
    * A convenience method for projection.fitSize where the width is automatically chosen from the aspect ratio of object and the given constraint on height.
    *
    * @param height The height of the extent.
    * @param object A geographic feature supported by d3-geo (An extension of GeoJSON feature).
    */
  def fitHeight(height: Double, `object`: ExtendedFeature[GeoGeometryObjects | Null, GeoJsonProperties]): this.type = js.native
  /**
    * A convenience method for projection.fitSize where the width is automatically chosen from the aspect ratio of object and the given constraint on height.
    *
    * @param height The height of the extent.
    * @param object A GeoJson Geometry Object or GeoSphere object supported by d3-geo (An extension of GeoJSON).
    */
  def fitHeight(
    height: Double,
    `object`: ExtendedFeatureCollection[ExtendedFeature[GeoGeometryObjects | Null, GeoJsonProperties]]
  ): this.type = js.native
  /**
    * A convenience method for projection.fitSize where the width is automatically chosen from the aspect ratio of object and the given constraint on height.
    *
    * @param height The height of the extent.
    * @param object A geographic geometry collection supported by d3-geo (An extension of GeoJSON geometry collection).
    */
  def fitHeight(height: Double, `object`: ExtendedGeometryCollection[GeoGeometryObjects]): this.type = js.native
  /**
    * A convenience method for projection.fitSize where the width is automatically chosen from the aspect ratio of object and the given constraint on height.
    *
    * @param height The height of the extent.
    * @param object A geographic feature supported by d3-geo (An extension of GeoJSON feature).
    */
  def fitHeight(height: Double, `object`: GeoGeometryObjects): this.type = js.native
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
    * A convenience method for projection.fitSize where the height is automatically chosen from the aspect ratio of object and the given constraint on width.
    *
    * @param width The width of the extent.
    * @param object A geographic feature supported by d3-geo (An extension of GeoJSON feature).
    */
  def fitWidth(width: Double, `object`: ExtendedFeature[GeoGeometryObjects | Null, GeoJsonProperties]): this.type = js.native
  /**
    * A convenience method for projection.fitSize where the height is automatically chosen from the aspect ratio of object and the given constraint on width.
    *
    * @param width The width of the extent.
    * @param object A GeoJson Geometry Object or GeoSphere object supported by d3-geo (An extension of GeoJSON).
    */
  def fitWidth(
    width: Double,
    `object`: ExtendedFeatureCollection[ExtendedFeature[GeoGeometryObjects | Null, GeoJsonProperties]]
  ): this.type = js.native
  /**
    * A convenience method for projection.fitSize where the height is automatically chosen from the aspect ratio of object and the given constraint on width.
    *
    * @param width The width of the extent.
    * @param object A geographic geometry collection supported by d3-geo (An extension of GeoJSON geometry collection).
    */
  def fitWidth(width: Double, `object`: ExtendedGeometryCollection[GeoGeometryObjects]): this.type = js.native
  /**
    * A convenience method for projection.fitSize where the height is automatically chosen from the aspect ratio of object and the given constraint on width.
    *
    * @param width The width of the extent.
    * @param object A geographic feature supported by d3-geo (An extension of GeoJSON feature).
    */
  def fitWidth(width: Double, `object`: GeoGeometryObjects): this.type = js.native
  /**
    * Returns the current cartesian clipping function.
    * Post-clipping occurs on the plane, when a projection is bounded to a certain extent such as a rectangle.
    */
  def postclip(): js.Function1[/* stream */ GeoStream, GeoStream] = js.native
  /**
    * Sets the projection’s cartesian clipping to the specified function and returns the projection.
    *
    * @param postclip A cartesian clipping function. Clipping functions are implemented as transformations of a projection stream.
    * Post-clipping operates on planar coordinates, in pixels.
    */
  def postclip(postclip: js.Function1[/* stream */ GeoStream, GeoStream]): this.type = js.native
  /**
    * Returns the projection’s current resampling precision which defaults to square root of 0.5.
    * This value corresponds to the Douglas–Peucker distance.
    */
  def precision(): Double = js.native
  /**
    * Sets the threshold for the projection’s adaptive resampling to the specified value in pixels and returns the projection.
    * This value corresponds to the Douglas–Peucker distance.
    *
    * @param precision A numeric value in pixels to use as the threshold for the projection’s adaptive resampling.
    */
  def precision(precision: Double): this.type = js.native
  /**
    * Returns the current spherical clipping function.
    * Pre-clipping occurs in geographic coordinates. Cutting along the antimeridian line,
    * or clipping along a small circle are the most common strategies.
    */
  def preclip(): js.Function1[/* stream */ GeoStream, GeoStream] = js.native
  /**
    * Sets the projection’s spherical clipping to the specified function and returns the projection.
    * Pre-clipping occurs in geographic coordinates. Cutting along the antimeridian line, or clipping along a small circle are the most common strategies.
    *
    * @param preclip A spherical clipping function. Clipping functions are implemented as transformations of a projection stream.
    * Pre-clipping operates on spherical coordinates, in radians.
    */
  def preclip(preclip: js.Function1[/* stream */ GeoStream, GeoStream]): this.type = js.native
  /**
    * Returns the current rotation [lambda, phi, gamma] specifying the rotation angles in degrees about each spherical axis.
    * (These correspond to yaw, pitch and roll.) which defaults [0, 0, 0].
    */
  def rotate(): js.Tuple3[Double, Double, Double] = js.native
  /**
    * Sets the projection’s three-axis rotation to the specified angles, which must be a two- or three-element array of numbers.
    *
    * @param angles  A two- or three-element array of numbers [lambda, phi, gamma] specifying the rotation angles in degrees about each spherical axis.
    * (These correspond to yaw, pitch and roll.) If the rotation angle gamma is omitted, it defaults to 0.
    */
  def rotate(angles: js.Tuple2[Double, Double]): this.type = js.native
  def rotate(angles: js.Tuple3[Double, Double, Double]): this.type = js.native
  /**
    * Returns the current scale factor; the default scale is projection-specific.
    *
    * The scale factor corresponds linearly to the distance between projected points; however, absolute scale factors are not equivalent across projections.
    */
  def scale(): Double = js.native
  /**
    * Sets the projection’s scale factor to the specified value and returns the projection.
    * The scale factor corresponds linearly to the distance between projected points; however, absolute scale factors are not equivalent across projections.
    *
    * @param scale Scale factor to be used for the projection; the default scale is projection-specific.
    */
  def scale(scale: Double): this.type = js.native
  /**
    * Returns the current translation offset which defaults to [480, 250] and places ⟨0°,0°⟩ at the center of a 960×500 area.
    * The translation offset determines the pixel coordinates of the projection’s center.
    */
  def translate(): js.Tuple2[Double, Double] = js.native
  /**
    * Sets the projection’s translation offset to the specified two-element array [tx, ty] and returns the projection.
    * The translation offset determines the pixel coordinates of the projection’s center. The default translation offset places ⟨0°,0°⟩ at the center of a 960×500 area.
    *
    * @param point A two-element array [tx, ty] specifying the translation offset. The default translation offset of defaults to [480, 250] places ⟨0°,0°⟩ at the center of a 960×500 area.
    */
  def translate(point: js.Tuple2[Double, Double]): this.type = js.native
}

