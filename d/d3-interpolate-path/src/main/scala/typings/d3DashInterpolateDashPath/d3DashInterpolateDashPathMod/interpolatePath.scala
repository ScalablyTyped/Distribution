package typings.d3DashInterpolateDashPath.d3DashInterpolateDashPathMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("d3-interpolate-path", "interpolatePath")
@js.native
object interpolatePath extends js.Object {
  def apply(a: String, b: String): js.Function1[/* t */ Double, String] = js.native
  def apply(
    a: String,
    b: String,
    excludeSegment: js.Function2[/* a */ PathCommandObject, /* b */ PathCommandObject, Boolean]
  ): js.Function1[/* t */ Double, String] = js.native
}

