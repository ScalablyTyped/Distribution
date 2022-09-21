package typings.chrome.anon

import typings.chrome.chrome.scripting.Awaited
import typings.chrome.chrome.scripting.CSSInjection
import typings.chrome.chrome.scripting.InjectionResult
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
  @JSName("executeScript")
  def executeScript_Args_ArrayAnyResult_Unit[Args /* <: js.Array[Any] */, Result](injection: ScriptInjection[Args, Result]): Unit = js.native
  
  def insertCSS(injection: CSSInjection): Unit = js.native
  def insertCSS(injection: CSSInjection, callback: js.Function0[Unit]): Unit = js.native
  @JSName("insertCSS")
  def insertCSS_Promise(injection: CSSInjection): js.Promise[Unit] = js.native
}
