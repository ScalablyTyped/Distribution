package typings.baconjs

import typings.baconjs.typesEventMod.Value
import typings.baconjs.typesOptionalMod.Option
import typings.baconjs.typesTypesMod.EventSink
import typings.baconjs.typesTypesMod.Subscribe
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesInternalPropertydispatcherMod {
  
  @JSImport("baconjs/types/internal/propertydispatcher", JSImport.Default)
  @js.native
  open class default[V, O /* <: typings.baconjs.typesObservableMod.default[V] */] protected () extends PropertyDispatcher[V, O] {
    def this(property: O, subscribe: Subscribe[V]) = this()
    def this(property: O, subscribe: Subscribe[V], handleEvent: EventSink[V]) = this()
  }
  
  @js.native
  trait PropertyDispatcher[V, O /* <: typings.baconjs.typesObservableMod.default[V] */]
    extends typings.baconjs.typesInternalDispatcherMod.default[V, O] {
    
    var current: Option[Value[V]] = js.native
    
    var currentValueRootId: js.UndefOr[Double] = js.native
    
    def maybeSubSource(sink: EventSink[V], reply: Any): js.Function0[Unit] = js.native
    
    var propertyEnded: Boolean = js.native
  }
}
