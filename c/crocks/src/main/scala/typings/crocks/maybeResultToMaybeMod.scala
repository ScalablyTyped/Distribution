package typings.crocks

import typings.crocks.internalTypesMod.UnaryFunction
import typings.crocks.resultResultMod.Result
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object maybeResultToMaybeMod {
  
  @JSImport("crocks/Maybe/resultToMaybe", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(fn: UnaryFunction): UnaryFunction = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(fn.asInstanceOf[js.Any]).asInstanceOf[UnaryFunction]
  /**
    * resultToMaybe :: Result e a -> Maybe a
    * resultToMaybe :: (a -> Result e b) -> a -> Maybe b
    */
  inline def default(`val`: Result): typings.crocks.maybeMaybeMod.default = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(`val`.asInstanceOf[js.Any]).asInstanceOf[typings.crocks.maybeMaybeMod.default]
}
