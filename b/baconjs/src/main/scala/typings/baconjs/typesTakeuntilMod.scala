package typings.baconjs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesTakeuntilMod {
  
  @JSImport("baconjs/types/takeuntil", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default[V](
    src: typings.baconjs.typesObservableMod.default[V],
    stopper: typings.baconjs.typesObservableMod.default[Any]
  ): typings.baconjs.typesObservableMod.default[V] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(src.asInstanceOf[js.Any], stopper.asInstanceOf[js.Any])).asInstanceOf[typings.baconjs.typesObservableMod.default[V]]
}
