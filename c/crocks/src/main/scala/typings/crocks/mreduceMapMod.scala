package typings.crocks

import typings.crocks.typesMod.UnaryFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mreduceMapMod {
  
  @JSImport("crocks/helpers/mreduceMap", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(m: js.Object): js.Function1[/* fn */ UnaryFunction, js.Function1[/* f */ js.Object, Any]] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(m.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* fn */ UnaryFunction, js.Function1[/* f */ js.Object, Any]]]
  inline def default(m: js.Object, fn: UnaryFunction): js.Function1[/* f */ js.Object, Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(m.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* f */ js.Object, Any]]
  /**
    * mreduceMap :: Monoid m, Foldable f => m -> (b -> a) -> f b -> a
    */
  inline def default(m: js.Object, fn: UnaryFunction, f: js.Object): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(m.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], f.asInstanceOf[js.Any])).asInstanceOf[Any]
}
