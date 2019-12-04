package typings.baconjs

import typings.baconjs.typesDescribeMod.Desc
import typings.baconjs.typesEventMod.Event
import typings.baconjs.typesObservableMod.default
import typings.baconjs.typesReplyMod.Reply
import typings.baconjs.typesTypesMod.EventSink
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("baconjs/types/take", JSImport.Namespace)
@js.native
object typesTakeMod extends js.Object {
  def take[V](count: Double, src: default[V]): default[V] = js.native
  def take[V](count: Double, src: default[V], desc: Desc): default[V] = js.native
  def takeT[V](count: Double): js.Function2[/* e */ Event[V], /* sink */ EventSink[V], Reply] = js.native
}

