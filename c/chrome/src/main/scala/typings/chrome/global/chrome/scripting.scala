package typings.chrome.global.chrome

import typings.chrome.chrome.scripting.Awaited
import typings.chrome.chrome.scripting.CSSInjection
import typings.chrome.chrome.scripting.ContentScriptFilter
import typings.chrome.chrome.scripting.InjectionResult
import typings.chrome.chrome.scripting.RegisteredContentScript
import typings.chrome.chrome.scripting.ScriptInjection
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

////////////////////
// Scripting
////////////////////
/**
  * Use the chrome.scripting API to execute script in different contexts.
  * Permissions: "scripting", Manifest v3+
  * @since Chrome 88.
  */
object scripting {
  
  @JSGlobal("chrome.scripting")
  @js.native
  val ^ : js.Any = js.native
  
  inline def executeScript[Args /* <: js.Array[Any] */, Result](injection: ScriptInjection[Args, Result]): js.Promise[js.Array[InjectionResult[Awaited[Result]]]] = ^.asInstanceOf[js.Dynamic].applyDynamic("executeScript")(injection.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Array[InjectionResult[Awaited[Result]]]]]
  inline def executeScript[Args /* <: js.Array[Any] */, Result](
    injection: ScriptInjection[Args, Result],
    callback: js.Function1[/* results */ js.Array[InjectionResult[Awaited[Result]]], Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("executeScript")(injection.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def executeScript_ArgsResult_Unit[Args /* <: js.Array[Any] */, Result](injection: ScriptInjection[Args, Result]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("executeScript")(injection.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def getRegisteredContentScripts(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("getRegisteredContentScripts")().asInstanceOf[Unit]
  inline def getRegisteredContentScripts(filter: Unit, callback: js.Function1[/* scripts */ js.Array[RegisteredContentScript], Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("getRegisteredContentScripts")(filter.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def getRegisteredContentScripts(filter: ContentScriptFilter): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("getRegisteredContentScripts")(filter.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def getRegisteredContentScripts(
    filter: ContentScriptFilter,
    callback: js.Function1[/* scripts */ js.Array[RegisteredContentScript], Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("getRegisteredContentScripts")(filter.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def getRegisteredContentScripts_Promise(): js.Promise[js.Array[RegisteredContentScript]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getRegisteredContentScripts")().asInstanceOf[js.Promise[js.Array[RegisteredContentScript]]]
  inline def getRegisteredContentScripts_Promise(filter: ContentScriptFilter): js.Promise[js.Array[RegisteredContentScript]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getRegisteredContentScripts")(filter.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Array[RegisteredContentScript]]]
  
  inline def insertCSS(injection: CSSInjection): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("insertCSS")(injection.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def insertCSS(injection: CSSInjection, callback: js.Function0[Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("insertCSS")(injection.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def insertCSS_Promise(injection: CSSInjection): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("insertCSS")(injection.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  
  inline def registerContentScripts(scripts: js.Array[RegisteredContentScript]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("registerContentScripts")(scripts.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def registerContentScripts(scripts: js.Array[RegisteredContentScript], callback: js.Function0[Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("registerContentScripts")(scripts.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def registerContentScripts_Promise(scripts: js.Array[RegisteredContentScript]): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("registerContentScripts")(scripts.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  
  inline def removeCSS(injection: CSSInjection): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("removeCSS")(injection.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def removeCSS(injection: CSSInjection, callback: js.Function0[Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeCSS")(injection.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def removeCSS_Promise(injection: CSSInjection): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("removeCSS")(injection.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  
  inline def unregisterContentScripts(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("unregisterContentScripts")().asInstanceOf[Unit]
  inline def unregisterContentScripts(filter: Unit, callback: js.Function0[Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("unregisterContentScripts")(filter.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def unregisterContentScripts(filter: ContentScriptFilter): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("unregisterContentScripts")(filter.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def unregisterContentScripts(filter: ContentScriptFilter, callback: js.Function0[Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("unregisterContentScripts")(filter.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def unregisterContentScripts_Promise(): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("unregisterContentScripts")().asInstanceOf[js.Promise[Unit]]
  inline def unregisterContentScripts_Promise(filter: ContentScriptFilter): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("unregisterContentScripts")(filter.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
}
