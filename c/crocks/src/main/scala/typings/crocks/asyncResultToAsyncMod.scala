package typings.crocks

import typings.crocks.internalTypesMod.UnaryFunction
import typings.crocks.resultResultMod.Result
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object asyncResultToAsyncMod {
  
  @JSImport("crocks/Async/resultToAsync", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(fn: UnaryFunction): UnaryFunction = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(fn.asInstanceOf[js.Any]).asInstanceOf[UnaryFunction]
  /**
    * resultToAsync :: Result b a -> Async b a
    * resultToAsync :: (a -> Result c b) -> a -> Async c b
    */
  inline def default(`val`: Result): typings.crocks.asyncAsyncMod.default = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(`val`.asInstanceOf[js.Any]).asInstanceOf[typings.crocks.asyncAsyncMod.default]
}
