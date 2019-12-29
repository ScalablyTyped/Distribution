package typings.baconjs.baconjsMod

import typings.baconjs.typesTypesMod.EventSink
import typings.baconjs.typesTypesMod.Subscribe
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("baconjs", "Property")
@js.native
class Property[V] protected ()
  extends typings.baconjs.typesObservableMod.Property[V] {
  def this(desc: typings.baconjs.typesDescribeMod.Desc, subscribe: Subscribe[V]) = this()
  def this(desc: typings.baconjs.typesDescribeMod.Desc, subscribe: Subscribe[V], handler: EventSink[V]) = this()
}

