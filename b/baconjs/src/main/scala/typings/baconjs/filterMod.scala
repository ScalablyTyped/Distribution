package typings.baconjs

import typings.baconjs.eventMod.Event
import typings.baconjs.observableMod.default
import typings.baconjs.predicateMod.Predicate
import typings.baconjs.predicateMod.PredicateOrProperty
import typings.baconjs.replyMod.Reply
import typings.baconjs.typesMod.EventSink
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object filterMod {
  
  @JSImport("baconjs/types/filter", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def filter[V](src: default[V], f: PredicateOrProperty[V]): default[V] = (^.asInstanceOf[js.Dynamic].applyDynamic("filter")(src.asInstanceOf[js.Any], f.asInstanceOf[js.Any])).asInstanceOf[default[V]]
  
  inline def filterT[V](f: Predicate[V]): js.Function2[/* e */ Event[V], /* sink */ EventSink[V], Reply] = ^.asInstanceOf[js.Dynamic].applyDynamic("filterT")(f.asInstanceOf[js.Any]).asInstanceOf[js.Function2[/* e */ Event[V], /* sink */ EventSink[V], Reply]]
}
