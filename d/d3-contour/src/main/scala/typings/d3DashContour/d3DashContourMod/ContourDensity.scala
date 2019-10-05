package typings.d3DashContour.d3DashContourMod

import typings.d3DashArray.d3DashArrayMod.ThresholdCountGenerator
import typings.d3DashArray.d3DashArrayMod.ThresholdNumberArrayGenerator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ContourDensity[Datum] extends js.Object {
  /**
    * Estimates the density contours for the given array of data, returning an array of GeoJSON MultiPolygon geometry objects.
    * Each geometry object represents the area where the estimated number of points per square pixel is greater than or equal to
    * the corresponding threshold value; the threshold value for each geometry object is exposed as geometry.value.
    * The returned geometry objects are typically passed to d3.geoPath to display, using null or d3.geoIdentity as the associated projection.
    * See also d3.contours.
    *
    * The x- and y-coordinate for each data point are computed using density.x and density.y.
    * The generated contours are only accurate within the estimator’s defined size.
    *
    * @param data Array of input data.
    */
  def apply(data: js.Array[Datum]): js.Array[ContourMultiPolygon] = js.native
  /**
    * Returns the current bandwidth, which defaults to 20.4939….
    */
  def bandwidth(): Double = js.native
  /**
    * Sets the bandwidth (the standard deviation) of the Gaussian kernel and returns the density contour estimator.
    *
    * @param bandwidth Bandwidth (the standard deviation) of the Gaussian kernel.
    * The specified bandwidth is currently rounded to the nearest supported value by this implementation, and must be nonnegative.
    */
  def bandwidth(bandwidth: Double): this.type = js.native
  /**
    * Returns the current cell size, which defaults to 4.
    */
  def cellSize(): Double = js.native
  /**
    * Sets the size of individual cells in the underlying bin grid to the specified positive integer and returns the density contour estimator.
    *
    * The cell size is rounded down to the nearest power of two. Smaller cells produce more detailed contour polygons, but are more expensive to compute.
    *
    * @param cellSize Cell size, a positive integer.
    */
  def cellSize(cellSize: Double): this.type = js.native
  /**
    * Returns the current size, which defaults to [960, 500].
    */
  def size(): js.Tuple2[Double, Double] = js.native
  /**
    * Sets the size of the density estimator to the specified bounds and returns the density contour estimator.
    *
    * @param size The size is specified as an array [width, height], where width is the maximum x-value and height is the maximum y-value.
    */
  def size(size: js.Tuple2[Double, Double]): this.type = js.native
  /**
    * Returns the current threshold generator, which by default generates about twenty nicely-rounded density thresholds.
    */
  def thresholds(): ThresholdCountGenerator[Double] | ThresholdNumberArrayGenerator[Double] = js.native
  /**
    * Sets the threshold generator to use the specified count and returns this density contour estimator.
    * Approximately count uniformly-spaced nicely-rounded thresholds will be generated.
    *
    * @param count Expected number of thresholds.
    */
  def thresholds(count: Double): this.type = js.native
  /**
    * Sets the threshold generator to the specified function and returns this density contour estimator.
    *
    * Thresholds are defined as an array of values [x0, x1, …]. The first generated density contour corresponds to the area
    * where the estimated density is greater than or equal to x0; the second contour corresponds to the area
    * where the estimated density is greater than or equal to x1, and so on.
    * Thus, there is exactly one generated MultiPolygon geometry object for each specified threshold value;
    *  the threshold value is exposed as geometry.value. The first value x0 should typically be greater than zero.
    *
    * @param thresholds A threshold generator function. The threshold generator function is passed the array of input values
    * as its argument and returns either an array of calculated thresholds, or the count of thresholds to use.
    */
  def thresholds(thresholds: ThresholdCountGenerator[Double] | ThresholdNumberArrayGenerator[Double]): this.type = js.native
  /**
    * Sets the threshold generator to the specified array and returns this density contour estimator.
    *
    * Thresholds are defined as an array of values [x0, x1, …]. The first generated density contour corresponds to the area
    * where the estimated density is greater than or equal to x0; the second contour corresponds to the area
    * where the estimated density is greater than or equal to x1, and so on.
    * Thus, there is exactly one generated MultiPolygon geometry object for each specified threshold value;
    *  the threshold value is exposed as geometry.value. The first value x0 should typically be greater than zero.
    *
    * @param thresholds Array of thresholds to use.
    */
  def thresholds(thresholds: js.Array[Double]): this.type = js.native
  /**
    * Returns the current point weight accessor.
    */
  def weight(): js.Function1[/* d */ Datum, Double] = js.native
  /**
    * Sets the point weight accessor and returns the density contour estimator.
    *
    * @param weight A point weight accessor function.
    */
  def weight(weight: js.Function1[/* d */ Datum, Double]): this.type = js.native
  /**
    * Returns the current x-coordinate accessor.
    * The default x-coordinate accessor is a functions which accepts as input a two-element array of numbers
    * and returns the element at index 0.
    */
  def x(): js.Function1[/* d */ Datum, Double] = js.native
  /**
    * Sets the x-coordinate accessor and returns the density contour estimator.
    *
    * @param x An x-coordinate accessor function, which accepts as input an element of the input data array and returns the
    * x-coordinate.
    */
  def x(x: js.Function1[/* d */ Datum, Double]): this.type = js.native
  /**
    * Returns the current y-coordinate accessor.
    * The default y-coordinate accessor is a functions which accepts as input a two-element array of numbers
    * and returns the element at index 1.
    */
  def y(): js.Function1[/* d */ Datum, Double] = js.native
  /**
    * Sets the y-coordinate accessor and returns the density contour estimator.
    *
    * @param y An y-coordinate accessor function, which accepts as input an element of the input data array and returns the
    * y-coordinate.
    */
  def y(y: js.Function1[/* d */ Datum, Double]): this.type = js.native
}

@JSImport("d3-contour", "contourDensity")
@js.native
object contourDensity extends js.Object {
  def apply[Datum](): ContourDensity[Datum] = js.native
}

