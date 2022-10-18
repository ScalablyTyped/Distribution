package typings.crocks

import typings.crocks.internalTypesMod.UnaryFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object maybeFirstToMaybeMod {
  
  @JSImport("crocks/Maybe/firstToMaybe", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(fn: UnaryFunction): UnaryFunction = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(fn.asInstanceOf[js.Any]).asInstanceOf[UnaryFunction]
  /**
    * firstToMaybe :: First a -> Maybe a
    * firstToMaybe :: (a -> First b) -> a -> Maybe b
    */
  inline def default(`val`: typings.crocks.firstMod.default): typings.crocks.maybeMaybeMod.default = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(`val`.asInstanceOf[js.Any]).asInstanceOf[typings.crocks.maybeMaybeMod.default]
}
