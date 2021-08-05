package typings.baconjs

import typings.baconjs.typesFlatmapMod.EventOrValue
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object flatmaperrorMod {
  
  @JSImport("baconjs/types/flatmaperror", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default[V, V2](
    src: typings.baconjs.observableMod.default[V],
    f: js.Function1[/* error */ js.Any, typings.baconjs.observableMod.default[V2] | EventOrValue[V2]]
  ): typings.baconjs.observableMod.default[V | V2] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(src.asInstanceOf[js.Any], f.asInstanceOf[js.Any])).asInstanceOf[typings.baconjs.observableMod.default[V | V2]]
}
