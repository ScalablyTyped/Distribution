package typings.baconjs

import typings.baconjs.typesEventMod.Event
import typings.baconjs.typesObservableMod.default
import typings.baconjs.typesPredicateMod.Predicate
import typings.baconjs.typesPredicateMod.PredicateOrProperty
import typings.baconjs.typesReplyMod.Reply
import typings.baconjs.typesTypesMod.EventSink
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("baconjs/types/filter", JSImport.Namespace)
@js.native
object typesFilterMod extends js.Object {
  def filter[V](src: default[V], f: PredicateOrProperty[V]): default[V] = js.native
  def filterT[V](f: Predicate[V]): js.Function2[/* e */ Event[V], /* sink */ EventSink[V], Reply] = js.native
}

