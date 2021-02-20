package typings.baconjs

import typings.baconjs.describeMod.Desc
import typings.baconjs.eventMod.Event
import typings.baconjs.observableMod.default
import typings.baconjs.replyMod.Reply
import typings.baconjs.typesMod.EventSink
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object takeMod {
  
  @JSImport("baconjs/types/take", "take")
  @js.native
  def take[V](count: Double, src: default[V]): default[V] = js.native
  @JSImport("baconjs/types/take", "take")
  @js.native
  def take[V](count: Double, src: default[V], desc: Desc): default[V] = js.native
  
  @JSImport("baconjs/types/take", "takeT")
  @js.native
  def takeT[V](count: Double): js.Function2[/* e */ Event[V], /* sink */ EventSink[V], Reply] = js.native
}
