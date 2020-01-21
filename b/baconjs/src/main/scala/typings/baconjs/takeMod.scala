package typings.baconjs

import typings.baconjs.describeMod.Desc
import typings.baconjs.eventMod.Event
import typings.baconjs.observableMod.default
import typings.baconjs.replyMod.Reply
import typings.baconjs.typesMod.EventSink
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("baconjs/types/take", JSImport.Namespace)
@js.native
object takeMod extends js.Object {
  def take[V](count: Double, src: default[V]): default[V] = js.native
  def take[V](count: Double, src: default[V], desc: Desc): default[V] = js.native
  def takeT[V](count: Double): js.Function2[/* e */ Event[V], /* sink */ EventSink[V], Reply] = js.native
}

