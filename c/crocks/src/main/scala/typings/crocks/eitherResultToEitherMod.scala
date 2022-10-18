package typings.crocks

import typings.crocks.internalTypesMod.UnaryFunction
import typings.crocks.resultResultMod.Result
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object eitherResultToEitherMod {
  
  @JSImport("crocks/Either/resultToEither", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(fn: UnaryFunction): UnaryFunction = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(fn.asInstanceOf[js.Any]).asInstanceOf[UnaryFunction]
  /**
    * resultToEither :: Result e a -> Either e a
    * resultToEither :: (a -> Result e b) -> a -> Either e a
    */
  inline def default(`val`: Result): typings.crocks.eitherEitherMod.default = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(`val`.asInstanceOf[js.Any]).asInstanceOf[typings.crocks.eitherEitherMod.default]
}
