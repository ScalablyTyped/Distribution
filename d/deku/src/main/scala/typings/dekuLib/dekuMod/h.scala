package typings
package dekuLib.dekuMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("deku", "h")
@js.native
object h extends js.Object {
  def apply(`type`: dekuLib.dekuMod.Thunk): dekuLib.dekuMod.VirtualElement = js.native
  def apply(`type`: java.lang.String): dekuLib.dekuMod.VirtualElement = js.native
  def apply[A](`type`: dekuLib.dekuMod.Thunk, attributes: A, children: js.Any*): dekuLib.dekuMod.VirtualElement = js.native
  def apply[A](`type`: java.lang.String, attributes: A, children: js.Any*): dekuLib.dekuMod.VirtualElement = js.native
}

