package typings.baconjs.typesFlatmapUnderscoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("baconjs/types/flatmap_", JSImport.Default)
@js.native
object default extends js.Object {
  def apply[In, Out](spawner: EventSpawner[In, Out], src: typings.baconjs.typesObservableMod.default[In]): typings.baconjs.typesObservableMod.default[Out] = js.native
  def apply[In, Out](
    spawner: EventSpawner[In, Out],
    src: typings.baconjs.typesObservableMod.default[In],
    params: FlatMapParams
  ): typings.baconjs.typesObservableMod.default[Out] = js.native
}

