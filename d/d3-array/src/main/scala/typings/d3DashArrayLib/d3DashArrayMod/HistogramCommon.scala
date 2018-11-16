package typings
package d3DashArrayLib.d3DashArrayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HistogramCommon[Datum, Value /* <: js.UndefOr[scala.Double | stdLib.Date] */] extends js.Object {
  def apply(data: stdLib.ArrayLike[Datum]): js.Array[Bin[Datum, Value]] = js.native
  def value(): js.Function3[/* d */ Datum, /* i */ scala.Double, /* data */ stdLib.ArrayLike[Datum], Value] = js.native
  def value(
    valueAccessor: js.Function3[/* d */ Datum, /* i */ scala.Double, /* data */ stdLib.ArrayLike[Datum], Value]
  ): this.type = js.native
}

