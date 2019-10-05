package typings.d3DashContour.d3DashContourMod

import typings.d3DashArray.d3DashArrayMod.ThresholdCountGenerator
import typings.d3DashArray.d3DashArrayMod.ThresholdNumberArrayGenerator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Contours extends js.Object {
  /**
    * Computes the contours for the given array of values, returning an array of GeoJSON MultiPolygon geometry objects.
    * Each geometry object represents the area where the input values are greater than or equal to the corresponding threshold value;
    * the threshold value for each geometry object is exposed as geometry.value.
    *
    * The returned geometry objects are typically passed to d3.geoPath to display,
    * using null or d3.geoIdentity as the associated projection
    *
    * @param values Array of input values. The input values must be an array of length n×m where [n, m] is the contour generator’s size;
    * furthermore, each values[i + jn] must represent the value at the position ⟨i, j⟩.
    */
  def apply(values: js.Array[Double]): js.Array[ContourMultiPolygon] = js.native
  /**
    * Computes a single contour, returning a GeoJSON MultiPolygon geometry object.
    * This geometry object represents the area where the input values are greater than or equal to the given threshold value;
    * the threshold value for the geometry object is exposed as geometry.value.
    *
    * @param values  Array of input values. The input values must be an array of length n×m where [n, m] is the contour generator’s size;
    * furthermore, each values[i + jn] must represent the value at the position ⟨i, j⟩.
    * @param threshold Threshold value.
    */
  def contour(values: js.Array[Double], threshold: Double): ContourMultiPolygon = js.native
  /**
    * Return the expected size of the input values grid, which defaults to [1,1].
    */
  def size(): js.Tuple2[Double, Double] = js.native
  /**
    * Sets the expected size of the input values grid to the contour generator and returns the contour generator.
    *
    * @param size Size of the input values grid specified as an array [n, m]
    * where n is the number of columns in the grid and m is the number of rows; n and m must be positive integers.
    */
  def size(size: js.Tuple2[Double, Double]): this.type = js.native
  /**
    * Returns the current smoothing flag, which defaults to true.
    */
  def smooth(): Boolean = js.native
  /**
    * Sets whether or not the generated contour polygons are smoothed using linear interpolation and returns the contour generator.
    *
    * @param smooth Flag to enable linear interpolation. The default is "true".
    */
  def smooth(smooth: Boolean): this.type = js.native
  /**
    * Returns the current threshold generator, which by default implements Sturges’ formula.
    */
  def thresholds(): ThresholdCountGenerator[Double] | ThresholdNumberArrayGenerator[Double] = js.native
  /**
    * Sets the threshold generator to use the specified count and returns this contour generator.
    * The input values’ extent will be uniformly divided into approximately count bins.
    *
    * @param count Expected number of threshold bins.
    */
  def thresholds(count: Double): this.type = js.native
  /**
    * Sets the threshold generator to the specified function and returns this contour generator.
    *
    * Thresholds are defined as an array of values [x0, x1, …].
    * The first generated contour corresponds to the area where the input values are greater than or equal to x0;
    * the second contour corresponds to the area where the input values are greater than or equal to x1, and so on.
    * Thus, there is exactly one generated MultiPolygon geometry object for each specified threshold value;
    * the threshold value is exposed as geometry.value.
    *
    * @param thresholds A threshold generator function. The threshold generator function is passed the array of input values
    * as its argument and returns either an array of calculated thresholds, or the count of thresholds to use.
    */
  def thresholds(thresholds: ThresholdCountGenerator[Double] | ThresholdNumberArrayGenerator[Double]): this.type = js.native
  /**
    * Sets the threshold generator to the specified array and returns this contour generator.
    *
    * Thresholds are defined as an array of values [x0, x1, …].
    * The first generated contour corresponds to the area where the input values are greater than or equal to x0;
    * the second contour corresponds to the area where the input values are greater than or equal to x1, and so on.
    * Thus, there is exactly one generated MultiPolygon geometry object for each specified threshold value;
    * the threshold value is exposed as geometry.value.
    *
    * @param thresholds Array of thresholds to use.
    */
  def thresholds(thresholds: js.Array[Double]): this.type = js.native
}

@JSImport("d3-contour", "contours")
@js.native
object contours extends js.Object {
  def apply(): Contours = js.native
}

