package typings.chrome.global.chrome

import typings.chrome.chrome.debugger.Debuggee
import typings.chrome.chrome.debugger.DebuggerDetachedEvent
import typings.chrome.chrome.debugger.DebuggerEventEvent
import typings.chrome.chrome.debugger.TargetInfo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object debugger {
  
  @JSGlobal("chrome._debugger")
  @js.native
  val ^ : js.Any = js.native
  
  @JSGlobal("chrome._debugger.attach")
  @js.native
  def attach(target: Debuggee, requiredVersion: String): Unit = js.native
  @JSGlobal("chrome._debugger.attach")
  @js.native
  def attach(target: Debuggee, requiredVersion: String, callback: js.Function0[Unit]): Unit = js.native
  
  @JSGlobal("chrome._debugger.detach")
  @js.native
  def detach(target: Debuggee): Unit = js.native
  @JSGlobal("chrome._debugger.detach")
  @js.native
  def detach(target: Debuggee, callback: js.Function0[Unit]): Unit = js.native
  
  @JSGlobal("chrome._debugger.getTargets")
  @js.native
  def getTargets(callback: js.Function1[/* result */ js.Array[TargetInfo], Unit]): Unit = js.native
  
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
  
  @JSGlobal("chrome._debugger.sendCommand")
  @js.native
  def sendCommand(target: Debuggee, method: String): Unit = js.native
  @JSGlobal("chrome._debugger.sendCommand")
  @js.native
  def sendCommand(
    target: Debuggee,
    method: String,
    commandParams: js.UndefOr[scala.Nothing],
    callback: js.Function1[/* result */ js.UndefOr[js.Object], Unit]
  ): Unit = js.native
  @JSGlobal("chrome._debugger.sendCommand")
  @js.native
  def sendCommand(target: Debuggee, method: String, commandParams: js.Object): Unit = js.native
  @JSGlobal("chrome._debugger.sendCommand")
  @js.native
  def sendCommand(
    target: Debuggee,
    method: String,
    commandParams: js.Object,
    callback: js.Function1[/* result */ js.UndefOr[js.Object], Unit]
  ): Unit = js.native
}
