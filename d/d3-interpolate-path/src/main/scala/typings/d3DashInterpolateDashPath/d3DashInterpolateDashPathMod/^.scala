package typings.d3DashInterpolateDashPath.d3DashInterpolateDashPathMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("d3-interpolate-path", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def interpolatePath(a: String, b: String): js.Function1[/* t */ Double, String] = js.native
  def interpolatePath(
    a: String,
    b: String,
    excludeSegment: js.Function2[/* a */ PathCommandObject, /* b */ PathCommandObject, Boolean]
  ): js.Function1[/* t */ Double, String] = js.native
}

