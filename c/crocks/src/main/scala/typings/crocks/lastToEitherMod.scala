package typings.crocks

import typings.crocks.typesMod.UnaryFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object lastToEitherMod {
  
  @JSImport("crocks/Either/lastToEither", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(fn: UnaryFunction): UnaryFunction = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(fn.asInstanceOf[js.Any]).asInstanceOf[UnaryFunction]
  /**
    * lastToEither :: c -> Last a -> Either c a
    * lastToEither :: c -> (a -> Last b) -> a -> Either c a
    */
  inline def default(`val`: typings.crocks.crocksLastMod.default): typings.crocks.eitherEitherMod.default = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(`val`.asInstanceOf[js.Any]).asInstanceOf[typings.crocks.eitherEitherMod.default]
}
