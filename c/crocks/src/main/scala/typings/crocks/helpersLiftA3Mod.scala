package typings.crocks

import typings.crocks.internalTypesMod.TernaryFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object helpersLiftA3Mod {
  
  @JSImport("crocks/helpers/liftA3", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(fn: TernaryFunction): js.Function1[/* a */ Any, js.Function1[/* b */ Any, js.Function1[/* c */ Any, Any]]] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(fn.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* a */ Any, js.Function1[/* b */ Any, js.Function1[/* c */ Any, Any]]]]
  
  inline def default_Function2(fn: TernaryFunction): js.Function2[/* a */ Any, /* b */ Any, js.Function1[/* c */ Any, Any]] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(fn.asInstanceOf[js.Any]).asInstanceOf[js.Function2[/* a */ Any, /* b */ Any, js.Function1[/* c */ Any, Any]]]
  
  /**
    * liftA3 :: Applicative m => (a -> b -> c -> d) -> m a -> m b -> m c -> m d
    */
  inline def default_Function3(fn: TernaryFunction): js.Function3[/* a */ Any, /* b */ Any, /* c */ Any, Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(fn.asInstanceOf[js.Any]).asInstanceOf[js.Function3[/* a */ Any, /* b */ Any, /* c */ Any, Any]]
}
