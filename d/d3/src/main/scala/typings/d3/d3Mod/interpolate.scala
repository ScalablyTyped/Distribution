package typings.d3.d3Mod

import typings.d3DashColor.d3DashColorMod.ColorCommonInstance
import typings.d3DashInterpolate.Anon_ToString
import typings.d3DashInterpolate.Anon_ValueOf
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("d3", "interpolate")
@js.native
object interpolate extends js.Object {
  def apply(a: String, b: String): js.Function1[/* t */ Double, String] = js.native
  def apply(a: String, b: ColorCommonInstance): js.Function1[/* t */ Double, String] = js.native
  def apply(a: js.Any): js.Function1[/* t */ Double, Null] = js.native
  def apply(a: js.Any, b: Boolean): js.Function1[/* t */ Double, Boolean] = js.native
  def apply(a: Double, b: Double): js.Function1[/* t */ Double, Double] = js.native
  def apply(a: Double, b: Anon_ValueOf): js.Function1[/* t */ Double, Double] = js.native
  def apply(a: ColorCommonInstance, b: ColorCommonInstance): js.Function1[/* t */ Double, String] = js.native
  def apply(a: Anon_ToString, b: String): js.Function1[/* t */ Double, String] = js.native
  def apply(a: Anon_ValueOf, b: Double): js.Function1[/* t */ Double, Double] = js.native
  def apply(a: Anon_ValueOf, b: Anon_ValueOf): js.Function1[/* t */ Double, Double] = js.native
  def apply(a: Date, b: Date): js.Function1[/* t */ Double, Date] = js.native
  def apply[U /* <: js.Object */](a: js.Any, b: U): js.Function1[/* t */ Double, U] = js.native
  def apply[U /* <: js.Array[_] */](a: js.Array[_], b: U): js.Function1[/* t */ Double, U] = js.native
}

