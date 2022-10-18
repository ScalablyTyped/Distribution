package typings.crocks

import typings.crocks.internalTypesMod.BinaryFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object helpersLiftA2Mod {
  
  @JSImport("crocks/helpers/liftA2", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(fn: BinaryFunction): js.Function1[/* a */ Any, js.Function1[/* b */ Any, Any]] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(fn.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* a */ Any, js.Function1[/* b */ Any, Any]]]
  
  /**
    * liftA2 :: Applicative m => (a -> b -> c) -> m a -> m b -> m c
    */
  inline def default_Function2(fn: BinaryFunction): js.Function2[/* a */ Any, /* b */ Any, Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(fn.asInstanceOf[js.Any]).asInstanceOf[js.Function2[/* a */ Any, /* b */ Any, Any]]
}
