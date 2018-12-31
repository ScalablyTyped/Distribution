package typings
package d3DashGeoLib.d3DashGeoMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GeoPath[This, DatumObject /* <: GeoPermissibleObjects */] extends js.Object {
  /**
    * Renders the given object, which may be any GeoJSON feature or geometry object:
    *
    * + Point - a single position.
    * + MultiPoint - an array of positions.
    * + LineString - an array of positions forming a continuous line.
    * + MultiLineString - an array of arrays of positions forming several lines.
    * + Polygon - an array of arrays of positions forming a polygon (possibly with holes).
    * + MultiPolygon - a multidimensional array of positions forming multiple polygons.
    * + GeometryCollection - an array of geometry objects.
    * + Feature - a feature containing one of the above geometry objects.
    * + FeatureCollection - an array of feature objects.
    *
    * The type Sphere is also supported, which is useful for rendering the outline of the globe; a sphere has no coordinates.
    *
    *
    * Any additional arguments are passed along to the pointRadius accessor.
    *
    * IMPORTANT: If the rendering context of the geoPath generator is null,
    * then the geoPath is returned as an SVG path data string.
    *
    * Separate path elements are typically slower than a single path element. However, distinct path elements are useful for styling and interaction (e.g., click or mouseover).
    * Canvas rendering (see path.context) is typically faster than SVG, but requires more effort to implement styling and interaction.
    *
    * The first generic type of the GeoPath generator used, must correspond to the "this" context bound to the function upon invocation.
    *
    * @param object An object to be rendered.
    */
  def apply(`this`: This, `object`: DatumObject, args: js.Any*): java.lang.String | scala.Null = js.native
  /**
    * Returns the projected planar area (typically in square pixels) for the specified GeoJSON object.
    * Point, MultiPoint, LineString and MultiLineString geometries have zero area. For Polygon and MultiPolygon geometries,
    * this method first computes the area of the exterior ring, and then subtracts the area of any interior holes.
    * This method observes any clipping performed by the projection; see projection.clipAngle and projection.clipExtent. This is the planar equivalent of d3.geoArea.
    *
    * @param object An object for which the area is to be calculated.
    */
  def area(`object`: DatumObject): scala.Double = js.native
  /**
    * Returns the projected planar bounding box (typically in pixels) for the specified GeoJSON object.
    * The bounding box is represented by a two-dimensional array: [[x₀, y₀], [x₁, y₁]], where x₀ is the minimum x-coordinate, y₀ is the minimum y-coordinate,
    * x₁ is maximum x-coordinate, and y₁ is the maximum y-coordinate.
    *
    * This is handy for, say, zooming in to a particular feature. (Note that in projected planar coordinates,
    * the minimum latitude is typically the maximum y-value, and the maximum latitude is typically the minimum y-value.)
    * This method observes any clipping performed by the projection; see projection.clipAngle and projection.clipExtent. This is the planar equivalent of d3.geoBounds.
    *
    * @param object An object for which the bounds are to be calculated.
    */
  def bounds(`object`: DatumObject): js.Tuple2[js.Tuple2[scala.Double, scala.Double], js.Tuple2[scala.Double, scala.Double]] = js.native
  /**
    * Returns the projected planar centroid (typically in pixels) for the specified GeoJSON object.
    * This is handy for, say, labeling state or county boundaries, or displaying a symbol map.
    * For example, a noncontiguous cartogram might scale each state around its centroid.
    * This method observes any clipping performed by the projection; see projection.clipAngle and projection.clipExtent. This is the planar equivalent of d3.geoCentroid.
    *
    * @param object An object for which the centroid is to be calculated.
    */
  def centroid(`object`: DatumObject): js.Tuple2[scala.Double, scala.Double] = js.native
  /**
    * Set the current rendering context to null and return the path generator.
    * The path generator will return an SVG path string;
    *
    * @param context Null to remove the current rendering context, if any.
    */
  def context(): this.type = js.native
  /**
    * Set the current rendering context and return the path generator.
    * The path generator will render to the specified context.
    *
    * @param context Rendering context to be used by the path generator.
    * The context must at least implement GeoContext, a subset of the CanvasRenderingContext2D API.
    */
  def context(context: GeoContext): this.type = js.native
  /**
    * Returns the current render context which defaults to null.
    *
    * Use the generic to cast the return type of the rendering context, if it is known for a specific application.
    */
  @JSName("context")
  def `context_C<union>C`[C /* <: GeoContext | scala.Null */](): C = js.native
  /**
    * Returns the projected planar length (typically in pixels) for the specified GeoJSON object.
    * Point and MultiPoint geometries have zero length. For Polygon and MultiPolygon geometries, this method computes the summed length of all rings.
    *
    * This method observes any clipping performed by the projection; see projection.clipAngle and projection.clipExtent. This is the planar equivalent of d3.geoLength.
    *
    * @param object An object for which the measure is to be calculated.
    */
  def measure(`object`: DatumObject): scala.Double = js.native
  /**
    * Returns the current radius or radius accessor used to determine the radius for the display of Point and MultiPoint geometries.
    * The default is a constant radius of 4.5.
    */
  def pointRadius(): (js.ThisFunction2[/* this */ This, /* object */ DatumObject, /* repeated */ js.Any, scala.Double]) | scala.Double = js.native
  /**
    * Sets the radius used to display Point and MultiPoint geometries to use the specified radius accessor function.
    *
    * While the radius is commonly specified as a number constant, it may also be specified as a function which is computed per feature,
    * being passed the any arguments passed to the path generator. For example, if your GeoJSON data has additional properties,
    * you might access those properties inside the radius function to vary the point size;
    * alternatively, you could d3.symbol and a projection for greater flexibility.
    *
    * @param value A value accessor function for the radius which is evaluated for each path to be rendered.
    * The value accessor function is invoked within the "this" context in which the path generator is used.
    * It is passed the object to be rendered, and any additional arguments which have been passed into the call to the render function of the path generator.
    */
  def pointRadius(
    value: js.ThisFunction2[/* this */ This, /* object */ DatumObject, /* repeated */ js.Any, scala.Double]
  ): this.type = js.native
  /**
    * Sets the radius used to display Point and MultiPoint geometries to the specified number and return the geo path generator.
    *
    * @param value Fixed radius value.
    */
  def pointRadius(value: scala.Double): this.type = js.native
  /**
    * Set the projection to the identity projection.
    *
    * @param projection Use null to set the identity projection.
    */
  def projection(): this.type = js.native
  /**
    * Set the current projection to be used with the geo path generator.
    *
    * The given projection is typically one of D3’s built-in geographic projections;
    * however, any object that exposes a projection.stream function can be used, enabling the use of custom projections.
    * See D3’s transforms for more examples of arbitrary geometric transformations.
    *
    * @param projection A projection.
    */
  def projection(projection: GeoProjection): this.type = js.native
  /**
    * Set the projection to be used with the geo path generator to a custom projection.
    * Custom projections must minimally contain a stream method.
    *
    * The given projection is typically one of D3’s built-in geographic projections;
    * however, any object that exposes a projection.stream function can be used, enabling the use of custom projections.
    * See D3’s transforms for more examples of arbitrary geometric transformations.
    *
    * @param projection A wrapper object exposing, at a minimum a "stream" method to be used for custom projections.
    */
  def projection(projection: GeoStreamWrapper): this.type = js.native
  /**
    * Get the current projection. The generic parameter can be used to cast the result to the
    * correct, known type of the projection, e.g. GeoProjection or GeoConicProjection. Otherwise,
    * the return type defaults to the minimum type requirement for a projection which
    * can be passed into a GeoPath.
    *
    * Use the generic to cast the return type of the projection, if it is known for a specific application.
    */
  @JSName("projection")
  def `projection_P<union>P`[P /* <: GeoConicProjection | GeoProjection | GeoStreamWrapper | scala.Null */](): P = js.native
}

