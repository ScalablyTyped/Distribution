package typings.baconjs

import typings.baconjs.typesFlatmapMod.SpawnerOrObservable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("baconjs/types/flatmapwithconcurrencylimit", JSImport.Namespace)
@js.native
object flatmapwithconcurrencylimitMod extends js.Object {
  
  def default[V, V2](src: typings.baconjs.observableMod.default[V], limit: Double, f: SpawnerOrObservable[V, V2]): typings.baconjs.observableMod.default[V2] = js.native
}
