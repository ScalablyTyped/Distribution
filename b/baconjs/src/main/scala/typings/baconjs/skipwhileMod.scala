package typings.baconjs

import typings.baconjs.eventMod.Event
import typings.baconjs.observableMod.default
import typings.baconjs.predicateMod.Predicate
import typings.baconjs.predicateMod.PredicateOrProperty
import typings.baconjs.replyMod.Reply
import typings.baconjs.typesMod.EventSink
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("baconjs/types/skipwhile", JSImport.Namespace)
@js.native
object skipwhileMod extends js.Object {
  def default[V](src: typings.baconjs.observableMod.default[V], f: PredicateOrProperty[V]): typings.baconjs.observableMod.default[V] = js.native
  def skipWhile[V](src: default[V], f: PredicateOrProperty[V]): default[V] = js.native
  def skipWhileT[V](f: Predicate[V]): js.Function2[/* event */ Event[V], /* sink */ EventSink[V], Reply] = js.native
}

