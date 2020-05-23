package typings.d3.mod

import typings.d3Interpolate.anon.ToString
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("d3", "interpolateString")
@js.native
object interpolateString extends js.Object {
  def apply(a: String, b: String): js.Function1[/* t */ Double, String] = js.native
  def apply(a: String, b: ToString): js.Function1[/* t */ Double, String] = js.native
  def apply(a: ToString, b: String): js.Function1[/* t */ Double, String] = js.native
  def apply(a: ToString, b: ToString): js.Function1[/* t */ Double, String] = js.native
}

