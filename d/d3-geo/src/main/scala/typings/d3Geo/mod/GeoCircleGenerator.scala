package typings.d3Geo.mod

import typings.geojson.mod.Polygon
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GeoCircleGenerator[This, Datum] extends js.Object {
  
  /**
    * Returns a new GeoJSON geometry object of type “Polygon” approximating a circle on the surface of a sphere,
    * with the current center, radius and precision. Any arguments are passed to the accessors.
    */
  def apply(d: Datum, args: js.Any*): Polygon = js.native
  def apply(d: js.UndefOr[scala.Nothing], args: js.Any*): Polygon = js.native
  
  /**
    * Returns the current center accessor, which defaults to a function returning [0, 0].
    */
  def center(): js.ThisFunction2[/* this */ This, /* d */ Datum, /* repeated */ js.Any, js.Tuple2[Double, Double]] = js.native
  /**
    * Sets the circle center to the specified center point accessor function, and returns this circle generator.
    *
    * @param center An accessor function which will be invoked whenever a circle is generated, being passed any arguments passed to the circle generator.
    * It returns the center point specified as [longitude, latitude] in degrees.
    */
  def center(
    center: js.ThisFunction2[/* this */ This, /* d */ Datum, /* repeated */ js.Any, js.Tuple2[Double, Double]]
  ): this.type = js.native
  /**
    * Sets the circle center to the specified point [longitude, latitude] in degrees, and returns this circle generator.
    *
    * @param center Center point specified as [longitude, latitude] in degrees.
    */
  def center(center: js.Tuple2[Double, Double]): this.type = js.native
  
  /**
    * Returns the current precision accessor, which defaults to a function returning 6.
    */
  def precision(): js.ThisFunction2[/* this */ This, /* d */ Datum, /* repeated */ js.Any, Double] = js.native
  /**
    * Sets the circle precision to the precision accessor function, and returns this circle generator.
    *
    * Small circles do not follow great arcs and thus the generated polygon is only an approximation.
    * Specifying a smaller precision angle improves the accuracy of the approximate polygon, but also increase the cost to generate and render it.
    *
    * @param precision An accessor function which will be invoked whenever a circle is generated, being passed any arguments passed to the circle generator.
    * It returns the precision as the specified angle in degrees.
    */
  def precision(precision: js.ThisFunction2[/* this */ This, /* d */ Datum, /* repeated */ js.Any, Double]): this.type = js.native
  /**
    * Sets the circle precision to the specified angle in degrees, and returns this circle generator.
    *
    * Small circles do not follow great arcs and thus the generated polygon is only an approximation.
    * Specifying a smaller precision angle improves the accuracy of the approximate polygon, but also increase the cost to generate and render it.
    *
    * @param precision Precision as specified angle in degrees.
    */
  def precision(precision: Double): this.type = js.native
  
  /**
    * Returns the current radius accessor, which defaults to a function returning 90.
    */
  def radius(): js.ThisFunction2[/* this */ This, /* d */ Datum, /* repeated */ js.Any, Double] = js.native
  /**
    * Sets the circle radius to the specified radius accessor function, and returns this circle generator.
    *
    * @param radius An accessor function which will be invoked whenever a circle is generated, being passed any arguments passed to the circle generator.
    * It returns the radius as the specified angle in degrees.
    */
  def radius(radius: js.ThisFunction2[/* this */ This, /* d */ Datum, /* repeated */ js.Any, Double]): this.type = js.native
  /**
    * Sets the circle radius to the specified angle in degrees, and returns this circle generator.
    *
    * @param radius Circle radius as the specified angle in degrees.
    */
  def radius(radius: Double): this.type = js.native
}
