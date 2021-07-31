package typings.chrome.global.chrome

import typings.chrome.chrome.debugger.Debuggee
import typings.chrome.chrome.debugger.DebuggerDetachedEvent
import typings.chrome.chrome.debugger.DebuggerEventEvent
import typings.chrome.chrome.debugger.TargetInfo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object debugger {
  
  @JSGlobal("chrome._debugger")
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def attach(target: Debuggee, requiredVersion: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("attach")(target.asInstanceOf[js.Any], requiredVersion.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def attach(target: Debuggee, requiredVersion: String, callback: js.Function0[Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("attach")(target.asInstanceOf[js.Any], requiredVersion.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def detach(target: Debuggee): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("detach")(target.asInstanceOf[js.Any]).asInstanceOf[Unit]
  @scala.inline
  def detach(target: Debuggee, callback: js.Function0[Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("detach")(target.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def getTargets(callback: js.Function1[/* result */ js.Array[TargetInfo], Unit]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("getTargets")(callback.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  @JSGlobal("chrome._debugger.onDetach")
  @js.native
  def onDetach: DebuggerDetachedEvent = js.native
  @scala.inline
  def onDetach_=(x: DebuggerDetachedEvent): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onDetach")(x.asInstanceOf[js.Any])
  
  @JSGlobal("chrome._debugger.onEvent")
  @js.native
  def onEvent: DebuggerEventEvent = js.native
  @scala.inline
  def onEvent_=(x: DebuggerEventEvent): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onEvent")(x.asInstanceOf[js.Any])
  
  @scala.inline
  def sendCommand(target: Debuggee, method: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("sendCommand")(target.asInstanceOf[js.Any], method.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def sendCommand(target: Debuggee, method: String, commandParams: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("sendCommand")(target.asInstanceOf[js.Any], method.asInstanceOf[js.Any], commandParams.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def sendCommand(
    target: Debuggee,
    method: String,
    commandParams: js.Object,
    callback: js.Function1[/* result */ js.UndefOr[js.Object], Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("sendCommand")(target.asInstanceOf[js.Any], method.asInstanceOf[js.Any], commandParams.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def sendCommand(
    target: Debuggee,
    method: String,
    commandParams: Unit,
    callback: js.Function1[/* result */ js.UndefOr[js.Object], Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("sendCommand")(target.asInstanceOf[js.Any], method.asInstanceOf[js.Any], commandParams.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
