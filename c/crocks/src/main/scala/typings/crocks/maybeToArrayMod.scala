package typings.crocks

import typings.crocks.typesMod.UnaryFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object maybeToArrayMod {
  
  @JSImport("crocks/Maybe/maybeToArray", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(fn: UnaryFunction): UnaryFunction = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(fn.asInstanceOf[js.Any]).asInstanceOf[UnaryFunction]
  /**
    * maybeToArray :: Maybe a -> [ a ]
    * maybeToArray :: (a -> Maybe b) -> a -> [ b ]
    */
  inline def default(`val`: typings.crocks.maybeMaybeMod.default): js.Array[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(`val`.asInstanceOf[js.Any]).asInstanceOf[js.Array[Any]]
}
