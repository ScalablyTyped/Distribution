package typings.d3Array.mod

import typings.std.ArrayLike
import typings.std.Iterable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HistogramGeneratorNumber[Datum, Value /* <: js.UndefOr[Double] */] extends HistogramCommon[Datum, Value] {
  def domain(): js.Function1[/* values */ Iterable[Value], js.Tuple2[js.UndefOr[Double], js.UndefOr[Double]]] = js.native
  def domain(
    domainAccessor: js.Function1[/* values */ Iterable[Value], js.Tuple2[js.UndefOr[Double], js.UndefOr[Double]]]
  ): this.type = js.native
  def domain(domain: js.Tuple2[Double, Double]): this.type = js.native
  def thresholds(): ThresholdCountGenerator[Value] | ThresholdNumberArrayGenerator[Value] = js.native
  /**
    * Set a threshold accessor function, which returns the desired number of bins.
    * Divides the domain uniformly into approximately count bins. IMPORTANT: This threshold
    * setting approach only works, when the materialized values are numbers!
    *
    * Any threshold values outside the domain are ignored. The first bin.x0 is always equal to the minimum domain value,
    * and the last bin.x1 is always equal to the maximum domain value.
    *
    * @param count A function which accepts as arguments the array of materialized values, and
    * optionally the domain minimum and maximum. The function calculates and returns the suggested
    * number of bins.
    */
  /**
    * Set a threshold accessor function, which returns the array of values to be used as
    * thresholds in determining the bins.
    *
    * Any threshold values outside the domain are ignored. The first bin.x0 is always equal to the minimum domain value,
    * and the last bin.x1 is always equal to the maximum domain value.
    *
    * @param thresholds A function which accepts as arguments the array of materialized values, and
    * optionally the domain minimum and maximum. The function calculates and returns the array of values to be used as
    * thresholds in determining the bins.
    */
  def thresholds(count: ThresholdCountGenerator[Value] | ThresholdNumberArrayGenerator[Value]): this.type = js.native
  /**
    * Divide the domain uniformly into approximately count bins. IMPORTANT: This threshold
    * setting approach only works, when the materialized values are numbers!
    *
    * Any threshold values outside the domain are ignored. The first bin.x0 is always equal to the minimum domain value,
    * and the last bin.x1 is always equal to the maximum domain value.
    *
    * @param count The desired number of uniform bins.
    */
  def thresholds(count: Double): this.type = js.native
  /**
    * Set the array of values to be used as thresholds in determining the bins.
    *
    * Any threshold values outside the domain are ignored. The first bin.x0 is always equal to the minimum domain value,
    * and the last bin.x1 is always equal to the maximum domain value.
    *
    * @param thresholds Array of threshold values used for binning. The elements must
    * be of the same type as the materialized values of the histogram.
    */
  def thresholds(thresholds: ArrayLike[Value]): this.type = js.native
}

