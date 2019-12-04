package typings.baconjs

import typings.baconjs.typesEventMod.Value
import typings.baconjs.typesInternalPropertydispatcherMod.PropertyDispatcher
import typings.baconjs.typesOptionalMod.Option
import typings.baconjs.typesTypesMod.EventSink
import typings.baconjs.typesTypesMod.Subscribe
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("baconjs/types/internal/propertydispatcher", JSImport.Namespace)
@js.native
object typesInternalPropertydispatcherMod extends js.Object {
  @js.native
  trait PropertyDispatcher[V, O /* <: typings.baconjs.typesObservableMod.default[V] */]
    extends typings.baconjs.typesInternalDispatcherMod.default[V, O] {
    var current: Option[Value[V]] = js.native
    var currentValueRootId: js.UndefOr[Double] = js.native
    var propertyEnded: Boolean = js.native
    def maybeSubSource(sink: EventSink[V], reply: js.Any): js.Function0[Unit] = js.native
  }
  
  @js.native
  class default[V, O /* <: typings.baconjs.typesObservableMod.default[V] */] protected () extends PropertyDispatcher[V, O] {
    def this(property: O, subscribe: Subscribe[V]) = this()
    def this(property: O, subscribe: Subscribe[V], handleEvent: EventSink[V]) = this()
  }
  
}

