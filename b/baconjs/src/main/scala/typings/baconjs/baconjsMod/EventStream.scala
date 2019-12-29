package typings.baconjs.baconjsMod

import typings.baconjs.typesObservableMod.EventStreamOptions
import typings.baconjs.typesTypesMod.EventSink
import typings.baconjs.typesTypesMod.Subscribe
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("baconjs", "EventStream")
@js.native
class EventStream[V] protected ()
  extends typings.baconjs.typesObservableMod.EventStream[V] {
  def this(desc: typings.baconjs.typesDescribeMod.Desc, subscribe: Subscribe[V]) = this()
  def this(desc: typings.baconjs.typesDescribeMod.Desc, subscribe: Subscribe[V], handler: EventSink[V]) = this()
  def this(
    desc: typings.baconjs.typesDescribeMod.Desc,
    subscribe: Subscribe[V],
    handler: EventSink[V],
    options: EventStreamOptions
  ) = this()
}

