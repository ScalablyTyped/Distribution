package typings.baconjs

import typings.baconjs.typesFlatmapMod.EventSpawner
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object flatmapeventMod {
  
  @JSImport("baconjs/types/flatmapevent", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def default[V, V2](src: typings.baconjs.observableMod.default[V], f: EventSpawner[V, V2]): typings.baconjs.observableMod.default[V2] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(src.asInstanceOf[js.Any], f.asInstanceOf[js.Any])).asInstanceOf[typings.baconjs.observableMod.default[V2]]
}
