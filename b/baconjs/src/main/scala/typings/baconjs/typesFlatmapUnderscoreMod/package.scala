package typings.baconjs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object typesFlatmapUnderscoreMod {
  import typings.baconjs.typesEventMod.Event

  type EventOrValue[V] = Event[V] | V
  type EventSpawner[V, V2] = js.Function1[
    /* e */ Event[V], 
    typings.baconjs.typesObservableMod.default[V2] | EventOrValue[V2]
  ]
  type SpawnerOrObservable[V, V2] = (ValueSpawner[V, V2]) | typings.baconjs.typesObservableMod.default[V2]
  type ValueSpawner[V, V2] = js.Function1[/* value */ V, typings.baconjs.typesObservableMod.default[V2] | EventOrValue[V2]]
}
