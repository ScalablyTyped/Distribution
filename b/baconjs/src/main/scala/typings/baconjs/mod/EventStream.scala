package typings.baconjs.mod

import typings.baconjs.observableMod.EventStreamOptions
import typings.baconjs.typesMod.EventSink
import typings.baconjs.typesMod.Subscribe
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("baconjs", "EventStream")
@js.native
class EventStream[V] protected ()
  extends typings.baconjs.observableMod.EventStream[V] {
  def this(desc: typings.baconjs.describeMod.Desc, subscribe: Subscribe[V]) = this()
  def this(desc: typings.baconjs.describeMod.Desc, subscribe: Subscribe[V], handler: EventSink[V]) = this()
  def this(
    desc: typings.baconjs.describeMod.Desc,
    subscribe: Subscribe[V],
    handler: EventSink[V],
    options: EventStreamOptions
  ) = this()
}

