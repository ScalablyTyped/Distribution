package typings.baconjs

import typings.baconjs.typesObservableMod.default
import typings.baconjs.typesTypesMod.EventSink
import typings.baconjs.typesTypesMod.Unsub
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesInternalSourceMod {
  
  @JSImport("baconjs/types/internal/source", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("baconjs/types/internal/source", "BufferingSource")
  @js.native
  open class BufferingSource[V] protected ()
    extends Source[V, js.Array[V]] {
    def this(obs: default[V]) = this()
    
    var queue: js.Array[V] = js.native
  }
  
  @JSImport("baconjs/types/internal/source", "ConsumingSource")
  @js.native
  open class ConsumingSource[V] protected () extends Source[V, V] {
    def this(obs: default[V], sync: Boolean) = this()
    
    var queue: js.Array[Event[V]] = js.native
  }
  
  @JSImport("baconjs/types/internal/source", "DefaultSource")
  @js.native
  open class DefaultSource[V] protected () extends Source[V, V] {
    def this(obs: default[V], sync: Boolean) = this()
    
    var value: js.UndefOr[Event[V]] = js.native
  }
  
  /* note: abstract class */ @JSImport("baconjs/types/internal/source", "Source")
  @js.native
  open class Source[In, Out] protected () extends StObject {
    def this(obs: default[In], sync: Boolean) = this()
    
    var _isSource: Boolean = js.native
    
    def consume(): js.UndefOr[Event[Out]] = js.native
    
    var ended: Boolean = js.native
    
    var flatten: Boolean = js.native
    
    def hasAtLeast(count: Double): Boolean = js.native
    
    def markEnded(): Unit = js.native
    
    def mayHave(count: Double): Boolean = js.native
    
    var obs: default[In] = js.native
    
    def push(event: Event[In]): Unit = js.native
    
    def subscribe(sink: EventSink[In]): Unsub = js.native
    
    var sync: Boolean = js.native
  }
  
  inline def fromObservable[V](s: Source[V, V]): Source[V, V] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObservable")(s.asInstanceOf[js.Any]).asInstanceOf[Source[V, V]]
  inline def fromObservable[V](s: default[V]): Source[V, V] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObservable")(s.asInstanceOf[js.Any]).asInstanceOf[Source[V, V]]
  
  inline def isTrigger(s: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isTrigger")(s.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  trait Event[V] extends StObject {
    
    var value: V
  }
  object Event {
    
    inline def apply[V](value: V): Event[V] = {
      val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[Event[V]]
    }
    
    extension [Self <: Event[?], V](x: Self & Event[V]) {
      
      inline def setValue(value: V): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
}
