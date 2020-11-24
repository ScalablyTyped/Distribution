package typings.baconjs.typesFlatmapMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("baconjs/types/flatmap_", "flatMap_")
@js.native
object flatMap extends js.Object {
  
  def apply[In, Out](spawner: EventSpawner[In, Out], src: typings.baconjs.observableMod.default[In]): typings.baconjs.observableMod.default[Out] = js.native
  def apply[In, Out](
    spawner: EventSpawner[In, Out],
    src: typings.baconjs.observableMod.default[In],
    params: FlatMapParams
  ): typings.baconjs.observableMod.default[Out] = js.native
}
