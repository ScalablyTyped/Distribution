package typings.crocks

import typings.crocks.internalTypesMod.UnaryFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object eitherFirstToEitherMod {
  
  @JSImport("crocks/Either/firstToEither", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(fn: UnaryFunction): UnaryFunction = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(fn.asInstanceOf[js.Any]).asInstanceOf[UnaryFunction]
  /**
    * firstToEither :: c -> First a -> Either c a
    * firstToEither :: c -> (a -> First b) -> a -> Either c a
    */
  inline def default(`val`: typings.crocks.firstMod.default): typings.crocks.eitherEitherMod.default = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(`val`.asInstanceOf[js.Any]).asInstanceOf[typings.crocks.eitherEitherMod.default]
}
