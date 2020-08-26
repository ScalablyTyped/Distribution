package typings.d3.mod

import typings.d3Color.mod.ColorCommonInstance
import typings.d3Interpolate.anon.ToString
import typings.d3Interpolate.anon.ValueOf
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("d3", "interpolate")
@js.native
object interpolate extends js.Object {
  def apply(a: String, b: String): js.Function1[/* t */ Double, String] = js.native
  def apply(a: String, b: ColorCommonInstance): js.Function1[/* t */ Double, String] = js.native
  def apply(a: js.Any, b: Boolean): js.Function1[/* t */ Double, Boolean] = js.native
  def apply(a: js.Any, b: Null): js.Function1[/* t */ Double, Null] = js.native
  def apply(a: Double, b: Double): js.Function1[/* t */ Double, Double] = js.native
  def apply(a: Double, b: ValueOf): js.Function1[/* t */ Double, Double] = js.native
  def apply(a: ColorCommonInstance, b: ColorCommonInstance): js.Function1[/* t */ Double, String] = js.native
  def apply(a: ToString, b: String): js.Function1[/* t */ Double, String] = js.native
  def apply(a: ValueOf, b: Double): js.Function1[/* t */ Double, Double] = js.native
  def apply(a: ValueOf, b: ValueOf): js.Function1[/* t */ Double, Double] = js.native
  def apply(a: Date, b: Date): js.Function1[/* t */ Double, Date] = js.native
  def apply[U /* <: js.Object */](a: js.Any, b: U): js.Function1[/* t */ Double, U] = js.native
  def apply[U /* <: js.Array[_] */](a: js.Array[_], b: U): js.Function1[/* t */ Double, U] = js.native
}

