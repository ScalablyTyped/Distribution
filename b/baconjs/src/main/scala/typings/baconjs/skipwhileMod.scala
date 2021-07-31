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

object skipwhileMod {
  
  @JSImport("baconjs/types/skipwhile", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def default[V](src: typings.baconjs.observableMod.default[V], f: PredicateOrProperty[V]): typings.baconjs.observableMod.default[V] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(src.asInstanceOf[js.Any], f.asInstanceOf[js.Any])).asInstanceOf[typings.baconjs.observableMod.default[V]]
  
  @scala.inline
  def skipWhile[V](src: default[V], f: PredicateOrProperty[V]): default[V] = (^.asInstanceOf[js.Dynamic].applyDynamic("skipWhile")(src.asInstanceOf[js.Any], f.asInstanceOf[js.Any])).asInstanceOf[default[V]]
  
  @scala.inline
  def skipWhileT[V](f: Predicate[V]): js.Function2[/* event */ Event[V], /* sink */ EventSink[V], Reply] = ^.asInstanceOf[js.Dynamic].applyDynamic("skipWhileT")(f.asInstanceOf[js.Any]).asInstanceOf[js.Function2[/* event */ Event[V], /* sink */ EventSink[V], Reply]]
}
