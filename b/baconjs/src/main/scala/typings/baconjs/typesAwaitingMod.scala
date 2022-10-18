package typings.baconjs

import typings.baconjs.typesObservableMod.Property
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesAwaitingMod {
  
  @JSImport("baconjs/types/awaiting", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(
    src: typings.baconjs.typesObservableMod.default[Any],
    other: typings.baconjs.typesObservableMod.default[Any]
  ): Property[Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(src.asInstanceOf[js.Any], other.asInstanceOf[js.Any])).asInstanceOf[Property[Boolean]]
}
