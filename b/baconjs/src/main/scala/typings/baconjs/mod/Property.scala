package typings.baconjs.mod

import typings.baconjs.typesMod.EventSink
import typings.baconjs.typesMod.Subscribe
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("baconjs", "Property")
@js.native
class Property[V] protected ()
  extends typings.baconjs.observableMod.Property[V] {
  def this(desc: typings.baconjs.describeMod.Desc, subscribe: Subscribe[V]) = this()
  def this(desc: typings.baconjs.describeMod.Desc, subscribe: Subscribe[V], handler: EventSink[V]) = this()
}

