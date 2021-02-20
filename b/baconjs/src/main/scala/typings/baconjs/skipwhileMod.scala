package typings.baconjs

import typings.baconjs.eventMod.Event
import typings.baconjs.observableMod.default
import typings.baconjs.predicateMod.Predicate
import typings.baconjs.predicateMod.PredicateOrProperty
import typings.baconjs.replyMod.Reply
import typings.baconjs.typesMod.EventSink
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object skipwhileMod {
  
  @JSImport("baconjs/types/skipwhile", JSImport.Default)
  @js.native
  def default[V](src: typings.baconjs.observableMod.default[V], f: PredicateOrProperty[V]): typings.baconjs.observableMod.default[V] = js.native
  
  @JSImport("baconjs/types/skipwhile", "skipWhile")
  @js.native
  def skipWhile[V](src: default[V], f: PredicateOrProperty[V]): default[V] = js.native
  
  @JSImport("baconjs/types/skipwhile", "skipWhileT")
  @js.native
  def skipWhileT[V](f: Predicate[V]): js.Function2[/* event */ Event[V], /* sink */ EventSink[V], Reply] = js.native
}
