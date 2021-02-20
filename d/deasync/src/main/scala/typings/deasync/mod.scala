package typings.deasync

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("deasync", JSImport.Namespace)
  @js.native
  def apply(fn: js.Function1[/* repeated */ js.Any, Unit]): js.Function1[/* repeated */ js.Any, _] = js.native
  
  @JSImport("deasync", "loopWhile")
  @js.native
  def loopWhile(pred: js.Function0[Boolean]): Unit = js.native
  
  @JSImport("deasync", "runLoopOnce")
  @js.native
  def runLoopOnce(): Unit = js.native
  
  @JSImport("deasync", "sleep")
  @js.native
  def sleep(ms: Double): Unit = js.native
}
