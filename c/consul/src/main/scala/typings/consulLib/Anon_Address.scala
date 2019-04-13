package typings
package consulLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_Address extends js.Object {
  def apply[TData](address: java.lang.String): consulLib.consulMod.Thenable[TData] = js.native
  def apply[TData](address: java.lang.String, callback: consulLib.consulMod.Callback[TData]): scala.Unit = js.native
  def apply[TData](opts: consulLib.consulMod.AgentNs.JoinOptions): consulLib.consulMod.Thenable[TData] = js.native
  def apply[TData](opts: consulLib.consulMod.AgentNs.JoinOptions, callback: consulLib.consulMod.Callback[TData]): scala.Unit = js.native
}

