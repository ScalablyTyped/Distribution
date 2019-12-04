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

@JSImport("baconjs/types/skipwhile", JSImport.Namespace)
@js.native
object typesSkipwhileMod extends js.Object {
  def default[V](src: typings.baconjs.typesObservableMod.default[V], f: PredicateOrProperty[V]): typings.baconjs.typesObservableMod.default[V] = js.native
  def skipWhile[V](src: default[V], f: PredicateOrProperty[V]): default[V] = js.native
  def skipWhileT[V](f: Predicate[V]): js.Function2[/* event */ Event[V], /* sink */ EventSink[V], Reply] = js.native
}

