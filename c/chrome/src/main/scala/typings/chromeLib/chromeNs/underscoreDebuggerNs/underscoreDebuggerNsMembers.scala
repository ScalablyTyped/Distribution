package typings
package chromeLib.chromeNs.underscoreDebuggerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("chrome._debugger")
@js.native
object underscoreDebuggerNsMembers extends js.Object {
  var onDetach: DebuggerDetachedEvent = js.native
  var onEvent: DebuggerEventEvent = js.native
  def attach(target: Debuggee, requiredVersion: java.lang.String): scala.Unit = js.native
  def attach(target: Debuggee, requiredVersion: java.lang.String, callback: js.Function0[scala.Unit]): scala.Unit = js.native
  def detach(target: Debuggee): scala.Unit = js.native
  def detach(target: Debuggee, callback: js.Function0[scala.Unit]): scala.Unit = js.native
  def getTargets(callback: js.Function1[/* result */ js.Array[TargetInfo], scala.Unit]): scala.Unit = js.native
  def sendCommand(target: Debuggee, method: java.lang.String): scala.Unit = js.native
  def sendCommand(target: Debuggee, method: java.lang.String, commandParams: js.Object): scala.Unit = js.native
  def sendCommand(
    target: Debuggee,
    method: java.lang.String,
    commandParams: js.Object,
    callback: js.Function1[/* result */ js.UndefOr[js.Object], scala.Unit]
  ): scala.Unit = js.native
}

