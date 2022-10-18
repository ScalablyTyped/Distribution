package typings.chrome.global.chrome

import typings.chrome.chrome.scripting.Awaited
import typings.chrome.chrome.scripting.CSSInjection
import typings.chrome.chrome.scripting.InjectionResult
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
  
  inline def insertCSS(injection: CSSInjection): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("insertCSS")(injection.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def insertCSS(injection: CSSInjection, callback: js.Function0[Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("insertCSS")(injection.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def insertCSS_Promise(injection: CSSInjection): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("insertCSS")(injection.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  
  inline def removeCSS(injection: CSSInjection): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("removeCSS")(injection.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def removeCSS(injection: CSSInjection, callback: js.Function0[Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeCSS")(injection.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def removeCSS_Promise(injection: CSSInjection): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("removeCSS")(injection.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
}
