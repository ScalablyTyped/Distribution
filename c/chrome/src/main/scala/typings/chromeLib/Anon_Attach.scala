package typings
package chromeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_Attach extends js.Object {
  var onDetach: chromeLib.chromeNs.underscoreDebuggerNs.DebuggerDetachedEvent = js.native
  var onEvent: chromeLib.chromeNs.underscoreDebuggerNs.DebuggerEventEvent = js.native
  def attach(target: chromeLib.chromeNs.underscoreDebuggerNs.Debuggee, requiredVersion: java.lang.String): scala.Unit = js.native
  def attach(
    target: chromeLib.chromeNs.underscoreDebuggerNs.Debuggee,
    requiredVersion: java.lang.String,
    callback: js.Function0[scala.Unit]
  ): scala.Unit = js.native
  def detach(target: chromeLib.chromeNs.underscoreDebuggerNs.Debuggee): scala.Unit = js.native
  def detach(target: chromeLib.chromeNs.underscoreDebuggerNs.Debuggee, callback: js.Function0[scala.Unit]): scala.Unit = js.native
  def getTargets(
    callback: js.Function1[
      /* result */ js.Array[chromeLib.chromeNs.underscoreDebuggerNs.TargetInfo], 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def sendCommand(target: chromeLib.chromeNs.underscoreDebuggerNs.Debuggee, method: java.lang.String): scala.Unit = js.native
  def sendCommand(
    target: chromeLib.chromeNs.underscoreDebuggerNs.Debuggee,
    method: java.lang.String,
    commandParams: js.Object
  ): scala.Unit = js.native
  def sendCommand(
    target: chromeLib.chromeNs.underscoreDebuggerNs.Debuggee,
    method: java.lang.String,
    commandParams: js.Object,
    callback: js.Function1[/* result */ js.UndefOr[js.Object], scala.Unit]
  ): scala.Unit = js.native
}

