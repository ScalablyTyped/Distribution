package typings.d3DashArray.d3DashArrayMod

import typings.std.ArrayLike
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HistogramGeneratorDate[Datum, Value /* <: js.UndefOr[Date] */] extends HistogramCommon[Datum, Date] {
  def domain(): js.Function1[/* values */ ArrayLike[Value], js.Tuple2[Date, Date]] = js.native
  def domain(domainAccessor: js.Function1[/* values */ ArrayLike[Value], js.Tuple2[Date, Date]]): this.type = js.native
  def domain(domain: js.Tuple2[Date, Date]): this.type = js.native
  def thresholds(): ThresholdDateArrayGenerator[Value] = js.native
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
  def thresholds(thresholds: ThresholdDateArrayGenerator[Value]): this.type = js.native
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

