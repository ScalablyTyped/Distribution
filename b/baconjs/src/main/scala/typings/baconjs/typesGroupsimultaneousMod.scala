package typings.baconjs

import typings.baconjs.typesObservableMod.EventStream
import typings.baconjs.typesObservableMod.EventStreamOptions
import typings.baconjs.typesObservableMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesGroupsimultaneousMod {
  
  @JSImport("baconjs/types/groupsimultaneous", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default[V](
    streams: (typings.baconjs.typesObservableMod.default[V] | js.Array[typings.baconjs.typesObservableMod.default[V]])*
  ): EventStream[js.Array[js.Array[V]]] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(streams.asInstanceOf[Seq[js.Any]]*).asInstanceOf[EventStream[js.Array[js.Array[V]]]]
  
  inline def groupSimultaneous[V](streams: js.Array[default[V]]): EventStream[js.Array[js.Array[V]]] = ^.asInstanceOf[js.Dynamic].applyDynamic("groupSimultaneous_")(streams.asInstanceOf[js.Any]).asInstanceOf[EventStream[js.Array[js.Array[V]]]]
  inline def groupSimultaneous[V](streams: js.Array[default[V]], options: EventStreamOptions): EventStream[js.Array[js.Array[V]]] = (^.asInstanceOf[js.Dynamic].applyDynamic("groupSimultaneous_")(streams.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[EventStream[js.Array[js.Array[V]]]]
}
