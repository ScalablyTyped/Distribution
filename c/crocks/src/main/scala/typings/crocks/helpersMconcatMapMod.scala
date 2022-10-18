package typings.crocks

import typings.crocks.internalTypesMod.UnaryFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object helpersMconcatMapMod {
  
  @JSImport("crocks/helpers/mconcatMap", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(m: js.Object): js.Function1[/* fn */ UnaryFunction, js.Function1[/* f */ js.Object, js.Object]] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(m.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* fn */ UnaryFunction, js.Function1[/* f */ js.Object, js.Object]]]
  inline def default(m: js.Object, fn: UnaryFunction): js.Function1[/* f */ js.Object, js.Object] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(m.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* f */ js.Object, js.Object]]
  /**
    * mconcatMap :: Monoid m, Foldable f => m -> (b -> a) -> f b -> m a
    */
  inline def default(m: js.Object, fn: UnaryFunction, f: js.Object): js.Object = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(m.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], f.asInstanceOf[js.Any])).asInstanceOf[js.Object]
}
