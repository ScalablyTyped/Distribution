package typings.chrome.anon

import typings.chrome.chrome.debugger.Debuggee
import typings.chrome.chrome.debugger.DebuggerDetachedEvent
import typings.chrome.chrome.debugger.DebuggerEventEvent
import typings.chrome.chrome.debugger.TargetInfo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofDebugger extends StObject {
  
  def attach(target: Debuggee, requiredVersion: String): js.Promise[Unit] = js.native
  def attach(target: Debuggee, requiredVersion: String, callback: js.Function0[Unit]): Unit = js.native
  
  def detach(target: Debuggee): js.Promise[Unit] = js.native
  def detach(target: Debuggee, callback: js.Function0[Unit]): Unit = js.native
  
  def getTargets(): js.Promise[js.Array[TargetInfo]] = js.native
  def getTargets(callback: js.Function1[/* result */ js.Array[TargetInfo], Unit]): Unit = js.native
  
  var onDetach: DebuggerDetachedEvent = js.native
  
  var onEvent: DebuggerEventEvent = js.native
  
  def sendCommand(target: Debuggee, method: String): Unit = js.native
  def sendCommand(target: Debuggee, method: String, commandParams: js.Object): Unit = js.native
  def sendCommand(
    target: Debuggee,
    method: String,
    commandParams: js.Object,
    callback: js.Function1[/* result */ js.UndefOr[js.Object], Unit]
  ): Unit = js.native
  def sendCommand(
    target: Debuggee,
    method: String,
    commandParams: Unit,
    callback: js.Function1[/* result */ js.UndefOr[js.Object], Unit]
  ): Unit = js.native
  @JSName("sendCommand")
  def sendCommand_Promise(target: Debuggee, method: String): js.Promise[js.Object] = js.native
  @JSName("sendCommand")
  def sendCommand_Promise(target: Debuggee, method: String, commandParams: js.Object): js.Promise[js.Object] = js.native
}
