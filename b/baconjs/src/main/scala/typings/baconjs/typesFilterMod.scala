package typings.baconjs

import typings.baconjs.typesEventMod.Event
import typings.baconjs.typesObservableMod.default
import typings.baconjs.typesPredicateMod.Predicate
import typings.baconjs.typesPredicateMod.PredicateOrProperty
import typings.baconjs.typesReplyMod.Reply
import typings.baconjs.typesTypesMod.EventSink
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesFilterMod {
  
  @JSImport("baconjs/types/filter", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def filter[V](src: default[V], f: PredicateOrProperty[V]): default[V] = (^.asInstanceOf[js.Dynamic].applyDynamic("filter")(src.asInstanceOf[js.Any], f.asInstanceOf[js.Any])).asInstanceOf[default[V]]
  
  inline def filterT[V](f: Predicate[V]): js.Function2[/* e */ Event[V], /* sink */ EventSink[V], Reply] = ^.asInstanceOf[js.Dynamic].applyDynamic("filterT")(f.asInstanceOf[js.Any]).asInstanceOf[js.Function2[/* e */ Event[V], /* sink */ EventSink[V], Reply]]
}
