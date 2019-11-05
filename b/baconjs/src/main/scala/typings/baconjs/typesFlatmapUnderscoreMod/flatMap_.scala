package typings.baconjs.typesFlatmapUnderscoreMod

import typings.baconjs.typesObservableMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("baconjs/types/flatmap_", "flatMap_")
@js.native
object flatMap_ extends js.Object {
  def apply[In, Out](spawner: EventSpawner[In, Out], src: default[In]): default[Out] = js.native
  def apply[In, Out](spawner: EventSpawner[In, Out], src: default[In], params: FlatMapParams): default[Out] = js.native
}

