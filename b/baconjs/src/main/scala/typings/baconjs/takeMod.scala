package typings.baconjs

import typings.baconjs.describeMod.Desc
import typings.baconjs.eventMod.Event
import typings.baconjs.observableMod.default
import typings.baconjs.replyMod.Reply
import typings.baconjs.typesMod.EventSink
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object takeMod {
  
  @JSImport("baconjs/types/take", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def take[V](count: Double, src: default[V]): default[V] = (^.asInstanceOf[js.Dynamic].applyDynamic("take")(count.asInstanceOf[js.Any], src.asInstanceOf[js.Any])).asInstanceOf[default[V]]
  inline def take[V](count: Double, src: default[V], desc: Desc): default[V] = (^.asInstanceOf[js.Dynamic].applyDynamic("take")(count.asInstanceOf[js.Any], src.asInstanceOf[js.Any], desc.asInstanceOf[js.Any])).asInstanceOf[default[V]]
  
  inline def takeT[V](count: Double): js.Function2[/* e */ Event[V], /* sink */ EventSink[V], Reply] = ^.asInstanceOf[js.Dynamic].applyDynamic("takeT")(count.asInstanceOf[js.Any]).asInstanceOf[js.Function2[/* e */ Event[V], /* sink */ EventSink[V], Reply]]
}
