package typings.baconjs

import typings.baconjs.observableMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object debounceMod {
  
  @JSImport("baconjs/types/debounce", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default[V](src: typings.baconjs.observableMod.default[V], delay: Double): typings.baconjs.observableMod.default[V] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(src.asInstanceOf[js.Any], delay.asInstanceOf[js.Any])).asInstanceOf[typings.baconjs.observableMod.default[V]]
  
  inline def debounce[V](src: default[V], delay: Double): default[V] = (^.asInstanceOf[js.Dynamic].applyDynamic("debounce")(src.asInstanceOf[js.Any], delay.asInstanceOf[js.Any])).asInstanceOf[default[V]]
  
  inline def debounceImmediate[V](src: default[V], delay: Double): default[V] = (^.asInstanceOf[js.Dynamic].applyDynamic("debounceImmediate")(src.asInstanceOf[js.Any], delay.asInstanceOf[js.Any])).asInstanceOf[default[V]]
}
