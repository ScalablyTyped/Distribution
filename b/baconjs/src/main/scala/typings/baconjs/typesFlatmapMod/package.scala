package typings.baconjs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object typesFlatmapMod {
  type EventOrValue[V] = typings.baconjs.eventMod.Event[V] | V
  type EventSpawner[V, V2] = js.Function1[
    /* e */ typings.baconjs.eventMod.Event[V], 
    typings.baconjs.observableMod.default[V2] | typings.baconjs.typesFlatmapMod.EventOrValue[V2]
  ]
  type SpawnerOrObservable[V, V2] = (typings.baconjs.typesFlatmapMod.ValueSpawner[V, V2]) | typings.baconjs.observableMod.default[V2]
  type ValueSpawner[V, V2] = js.Function1[
    /* value */ V, 
    typings.baconjs.observableMod.default[V2] | typings.baconjs.typesFlatmapMod.EventOrValue[V2]
  ]
}
