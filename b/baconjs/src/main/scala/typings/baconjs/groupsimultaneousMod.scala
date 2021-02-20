package typings.baconjs

import typings.baconjs.observableMod.EventStream
import typings.baconjs.observableMod.EventStreamOptions
import typings.baconjs.observableMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object groupsimultaneousMod {
  
  @JSImport("baconjs/types/groupsimultaneous", JSImport.Default)
  @js.native
  def default[V](
    streams: (typings.baconjs.observableMod.default[V] | js.Array[typings.baconjs.observableMod.default[V]])*
  ): EventStream[js.Array[js.Array[V]]] = js.native
  
  @JSImport("baconjs/types/groupsimultaneous", "groupSimultaneous_")
  @js.native
  def groupSimultaneous[V](streams: js.Array[default[V]]): EventStream[js.Array[js.Array[V]]] = js.native
  @JSImport("baconjs/types/groupsimultaneous", "groupSimultaneous_")
  @js.native
  def groupSimultaneous[V](streams: js.Array[default[V]], options: EventStreamOptions): EventStream[js.Array[js.Array[V]]] = js.native
}
