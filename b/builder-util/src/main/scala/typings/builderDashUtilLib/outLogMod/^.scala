package typings
package builderDashUtilLib.outLogMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("builder-util/out/log", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val PADDING: /* 2 */ scala.Double = js.native
  val debug: debugLib.debugMod.debugNs.IDebugger = js.native
  val log: builderDashUtilLib.outLogMod.Logger = js.native
  def setPrinter(): scala.Unit = js.native
  def setPrinter(value: js.Function1[/* message */ java.lang.String, scala.Unit]): scala.Unit = js.native
}

