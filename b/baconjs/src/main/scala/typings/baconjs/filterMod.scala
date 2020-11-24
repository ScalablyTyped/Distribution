package typings.baconjs

import typings.baconjs.eventMod.Event
import typings.baconjs.observableMod.default
import typings.baconjs.predicateMod.Predicate
import typings.baconjs.predicateMod.PredicateOrProperty
import typings.baconjs.replyMod.Reply
import typings.baconjs.typesMod.EventSink
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("baconjs/types/filter", JSImport.Namespace)
@js.native
object filterMod extends js.Object {
  
  def filter[V](src: default[V], f: PredicateOrProperty[V]): default[V] = js.native
  
  def filterT[V](f: Predicate[V]): js.Function2[/* e */ Event[V], /* sink */ EventSink[V], Reply] = js.native
}
