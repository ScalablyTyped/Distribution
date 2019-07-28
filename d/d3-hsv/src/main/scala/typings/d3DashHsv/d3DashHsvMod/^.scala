package typings.d3DashHsv.d3DashHsvMod

import typings.d3DashColor.d3DashColorMod.ColorCommonInstance
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("d3-hsv", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val hsv: HSVColorFactory = js.native
  def interpolateHsv(a: String, b: String): js.Function1[/* t */ Double, String] = js.native
  def interpolateHsv(a: String, b: ColorCommonInstance): js.Function1[/* t */ Double, String] = js.native
  def interpolateHsv(a: ColorCommonInstance, b: String): js.Function1[/* t */ Double, String] = js.native
  def interpolateHsv(a: ColorCommonInstance, b: ColorCommonInstance): js.Function1[/* t */ Double, String] = js.native
  def interpolateHsvLong(a: String, b: String): js.Function1[/* t */ Double, String] = js.native
  def interpolateHsvLong(a: String, b: ColorCommonInstance): js.Function1[/* t */ Double, String] = js.native
  def interpolateHsvLong(a: ColorCommonInstance, b: String): js.Function1[/* t */ Double, String] = js.native
  def interpolateHsvLong(a: ColorCommonInstance, b: ColorCommonInstance): js.Function1[/* t */ Double, String] = js.native
}

