package typings.baconjs

import typings.baconjs.eventMod.Value
import typings.baconjs.optionalMod.Option
import typings.baconjs.typesMod.EventSink
import typings.baconjs.typesMod.Subscribe
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object propertydispatcherMod {
  
  @JSImport("baconjs/types/internal/propertydispatcher", JSImport.Default)
  @js.native
  class default[V, O /* <: typings.baconjs.observableMod.default[V] */] protected () extends PropertyDispatcher[V, O] {
    def this(property: O, subscribe: Subscribe[V]) = this()
    def this(property: O, subscribe: Subscribe[V], handleEvent: EventSink[V]) = this()
  }
  
  @js.native
  trait PropertyDispatcher[V, O /* <: typings.baconjs.observableMod.default[V] */]
    extends typings.baconjs.dispatcherMod.default[V, O] {
    
    var current: Option[Value[V]] = js.native
    
    var currentValueRootId: js.UndefOr[Double] = js.native
    
    def maybeSubSource(sink: EventSink[V], reply: js.Any): js.Function0[Unit] = js.native
    
    var propertyEnded: Boolean = js.native
  }
}
