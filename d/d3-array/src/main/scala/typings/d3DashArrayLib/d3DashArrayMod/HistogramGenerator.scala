package typings
package d3DashArrayLib.d3DashArrayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HistogramGenerator[Datum, Value /* <: js.UndefOr[scala.Double | stdLib.Date] */] extends js.Object {
  def apply(data: stdLib.ArrayLike[Datum]): js.Array[Bin[Datum, Value]] = js.native
  def domain(): js.Function1[
    /* values */ stdLib.ArrayLike[Value], 
    (js.Tuple2[Value, Value]) | (js.Tuple2[js.UndefOr[scala.Nothing], js.UndefOr[scala.Nothing]])
  ] = js.native
  def domain(
    domainAccessor: js.Function1[
      /* values */ stdLib.ArrayLike[Value], 
      (js.Tuple2[Value, Value]) | (js.Tuple2[js.UndefOr[scala.Nothing], js.UndefOr[scala.Nothing]])
    ]
  ): this.type = js.native
  def domain(domain: js.Tuple2[Value, Value]): this.type = js.native
  /**
       * Set the array of values to be used as thresholds in determining the bins.
       *
       * Any threshold values outside the domain are ignored. The first bin.x0 is always equal to the minimum domain value,
       * and the last bin.x1 is always equal to the maximum domain value.
       *
       * @param thresholds Array of threshold values used for binning. The elements must
       * be of the same type as the materialized values of the histogram.
       */
  def thresholds(thresholds: stdLib.ArrayLike[Value]): this.type = js.native
  def value(): js.Function3[/* d */ Datum, /* i */ scala.Double, /* data */ stdLib.ArrayLike[Datum], Value] = js.native
  def value(
    valueAccessor: js.Function3[/* d */ Datum, /* i */ scala.Double, /* data */ stdLib.ArrayLike[Datum], Value]
  ): this.type = js.native
}

