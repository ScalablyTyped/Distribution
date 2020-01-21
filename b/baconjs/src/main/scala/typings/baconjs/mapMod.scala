package typings.baconjs

import typings.baconjs.eventMod.Event
import typings.baconjs.observableMod.Property
import typings.baconjs.observableMod.default
import typings.baconjs.replyMod.Reply
import typings.baconjs.typesMod.EventSink
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("baconjs/types/map", JSImport.Namespace)
@js.native
object mapMod extends js.Object {
  def default[V, V2](src: typings.baconjs.observableMod.default[V], f: V2): typings.baconjs.observableMod.default[V2] = js.native
  def default[V, V2](src: typings.baconjs.observableMod.default[V], f: js.Function1[/* value */ V, V2]): typings.baconjs.observableMod.default[V2] = js.native
  def default[V, V2](src: typings.baconjs.observableMod.default[V], f: Property[V2]): typings.baconjs.observableMod.default[V2] = js.native
  def map[V, V2](src: default[V], f: V2): default[V2] = js.native
  def map[V, V2](src: default[V], f: js.Function1[/* value */ V, V2]): default[V2] = js.native
  def map[V, V2](src: default[V], f: Property[V2]): default[V2] = js.native
  def mapT[V, V2](f: V2): js.Function2[/* e */ Event[V], /* sink */ EventSink[V2], Reply] = js.native
  def mapT[V, V2](f: js.Function1[/* value */ V, V2]): js.Function2[/* e */ Event[V], /* sink */ EventSink[V2], Reply] = js.native
}

