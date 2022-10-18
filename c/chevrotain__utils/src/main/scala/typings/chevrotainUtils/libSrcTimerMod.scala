package typings.chevrotainUtils

import typings.chevrotainUtils.anon.Time
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libSrcTimerMod {
  
  @JSImport("@chevrotain/utils/lib/src/timer", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def timer[T](func: js.Function0[T]): Time[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("timer")(func.asInstanceOf[js.Any]).asInstanceOf[Time[T]]
}
