package typings.boxIntersect

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("box-intersect", JSImport.Namespace)
@js.native
object mod extends js.Object {
  def apply(x: js.Array[js.Array[Double]]): js.Array[js.Tuple2[Double, Double]] = js.native
  def apply(x: js.Array[js.Array[Double]], visit: js.Function2[/* i */ Double, /* j */ Double, Unit]): js.Array[js.Tuple2[Double, Double]] = js.native
  def apply[T /* <: js.Array[Double] */](
    red: js.Array[T],
    blue: js.UndefOr[scala.Nothing],
    visit: js.Function2[/* i */ Double, /* j */ Double, Unit]
  ): js.Array[js.Tuple2[Double, Double]] = js.native
  def apply[T /* <: js.Array[Double] */](red: js.Array[T], blue: js.Array[T]): js.Array[js.Tuple2[Double, Double]] = js.native
  def apply[T /* <: js.Array[Double] */](red: js.Array[T], blue: js.Array[T], visit: js.Function2[/* i */ Double, /* j */ Double, Unit]): js.Array[js.Tuple2[Double, Double]] = js.native
}

