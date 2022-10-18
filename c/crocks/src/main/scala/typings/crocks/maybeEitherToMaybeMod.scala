package typings.crocks

import typings.crocks.internalTypesMod.UnaryFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object maybeEitherToMaybeMod {
  
  @JSImport("crocks/Maybe/eitherToMaybe", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(fn: UnaryFunction): UnaryFunction = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(fn.asInstanceOf[js.Any]).asInstanceOf[UnaryFunction]
  /**
    * eitherToMaybe :: Either b a -> Maybe a
    * eitherToMaybe :: (a -> Either c b) -> a -> Maybe b
    */
  inline def default(`val`: typings.crocks.eitherMod.default): typings.crocks.maybeMaybeMod.default = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(`val`.asInstanceOf[js.Any]).asInstanceOf[typings.crocks.maybeMaybeMod.default]
}
