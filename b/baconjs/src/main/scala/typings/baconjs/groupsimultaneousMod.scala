package typings.baconjs

import typings.baconjs.observableMod.EventStream
import typings.baconjs.observableMod.EventStreamOptions
import typings.baconjs.observableMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object groupsimultaneousMod {
  
  @JSImport("baconjs/types/groupsimultaneous", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default[V](
    streams: (typings.baconjs.observableMod.default[V] | js.Array[typings.baconjs.observableMod.default[V]])*
  ): EventStream[js.Array[js.Array[V]]] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(streams.asInstanceOf[Seq[js.Any]]*).asInstanceOf[EventStream[js.Array[js.Array[V]]]]
  
  inline def groupSimultaneous[V](streams: js.Array[default[V]]): EventStream[js.Array[js.Array[V]]] = ^.asInstanceOf[js.Dynamic].applyDynamic("groupSimultaneous_")(streams.asInstanceOf[js.Any]).asInstanceOf[EventStream[js.Array[js.Array[V]]]]
  inline def groupSimultaneous[V](streams: js.Array[default[V]], options: EventStreamOptions): EventStream[js.Array[js.Array[V]]] = (^.asInstanceOf[js.Dynamic].applyDynamic("groupSimultaneous_")(streams.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[EventStream[js.Array[js.Array[V]]]]
}
