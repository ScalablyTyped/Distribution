package typings.chrome.anon

import typings.chrome.chrome.scripting.Awaited
import typings.chrome.chrome.scripting.CSSInjection
import typings.chrome.chrome.scripting.ContentScriptFilter
import typings.chrome.chrome.scripting.InjectionResult
import typings.chrome.chrome.scripting.RegisteredContentScript
import typings.chrome.chrome.scripting.ScriptInjection
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Typeofscripting extends StObject {
  
  def executeScript[Args /* <: js.Array[Any] */, Result](injection: ScriptInjection[Args, Result]): js.Promise[js.Array[InjectionResult[Awaited[Result]]]] = js.native
  def executeScript[Args /* <: js.Array[Any] */, Result](
    injection: ScriptInjection[Args, Result],
    callback: js.Function1[/* results */ js.Array[InjectionResult[Awaited[Result]]], Unit]
  ): Unit = js.native
  
  def getRegisteredContentScripts(): js.Promise[js.Array[RegisteredContentScript]] = js.native
  def getRegisteredContentScripts(callback: js.Function1[/* scripts */ js.Array[RegisteredContentScript], Unit]): Unit = js.native
  def getRegisteredContentScripts(filter: ContentScriptFilter): js.Promise[js.Array[RegisteredContentScript]] = js.native
  def getRegisteredContentScripts(
    filter: ContentScriptFilter,
    callback: js.Function1[/* scripts */ js.Array[RegisteredContentScript], Unit]
  ): Unit = js.native
  
  def insertCSS(injection: CSSInjection): js.Promise[Unit] = js.native
  def insertCSS(injection: CSSInjection, callback: js.Function0[Unit]): Unit = js.native
  
  def registerContentScripts(scripts: js.Array[RegisteredContentScript]): js.Promise[Unit] = js.native
  def registerContentScripts(scripts: js.Array[RegisteredContentScript], callback: js.Function0[Unit]): Unit = js.native
  
  def removeCSS(injection: CSSInjection): js.Promise[Unit] = js.native
  def removeCSS(injection: CSSInjection, callback: js.Function0[Unit]): Unit = js.native
  
  def unregisterContentScripts(): js.Promise[Unit] = js.native
  def unregisterContentScripts(callback: js.Function0[Unit]): Unit = js.native
  def unregisterContentScripts(filter: ContentScriptFilter): js.Promise[Unit] = js.native
  def unregisterContentScripts(filter: ContentScriptFilter, callback: js.Function0[Unit]): Unit = js.native
  
  def updateContentScripts(scripts: js.Array[RegisteredContentScript]): js.Promise[Unit] = js.native
  def updateContentScripts(scripts: js.Array[RegisteredContentScript], callback: js.Function0[Unit]): Unit = js.native
}
