package typings
package d3DashInterpolateDashPathLib.d3DashInterpolateDashPathMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("d3-interpolate-path", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def interpolatePath(a: java.lang.String, b: java.lang.String): js.Function1[/* t */ scala.Double, java.lang.String] = js.native
  def interpolatePath(
    a: java.lang.String,
    b: java.lang.String,
    excludeSegment: js.Function2[/* a */ PathCommandObject, /* b */ PathCommandObject, scala.Boolean]
  ): js.Function1[/* t */ scala.Double, java.lang.String] = js.native
}

