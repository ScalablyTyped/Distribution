package typings.crocks

import typings.crocks.internalTypesMod.UnaryFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object maybeFindMod {
  
  @JSImport("crocks/Maybe/find", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(pred: UnaryFunction): js.Function1[/* val */ js.Array[Any], typings.crocks.maybeMaybeMod.default] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(pred.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* val */ js.Array[Any], typings.crocks.maybeMaybeMod.default]]
  /**
    * find :: Foldable f => ((a -> Boolean) | Pred) -> f a -> Maybe a
    */
  inline def default(pred: UnaryFunction, `val`: js.Array[Any]): typings.crocks.maybeMaybeMod.default = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(pred.asInstanceOf[js.Any], `val`.asInstanceOf[js.Any])).asInstanceOf[typings.crocks.maybeMaybeMod.default]
  inline def default(pred: typings.crocks.predMod.default): js.Function1[/* val */ js.Array[Any], typings.crocks.maybeMaybeMod.default] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(pred.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* val */ js.Array[Any], typings.crocks.maybeMaybeMod.default]]
  inline def default(pred: typings.crocks.predMod.default, `val`: js.Array[Any]): typings.crocks.maybeMaybeMod.default = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(pred.asInstanceOf[js.Any], `val`.asInstanceOf[js.Any])).asInstanceOf[typings.crocks.maybeMaybeMod.default]
}
