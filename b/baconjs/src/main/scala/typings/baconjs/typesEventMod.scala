package typings.baconjs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesEventMod {
  
  @JSImport("baconjs/types/event", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /* note: abstract class */ @JSImport("baconjs/types/event", JSImport.Default)
  @js.native
  open class default[V] () extends Event[V]
  
  @JSImport("baconjs/types/event", "End")
  @js.native
  open class End () extends NoValue
  
  @JSImport("baconjs/types/event", "Error")
  @js.native
  open class Error protected () extends NoValue {
    def this(error: Any) = this()
    
    /**
      * The actual error object carried by this event
      */
    var error: Any = js.native
  }
  
  /* note: abstract class */ @JSImport("baconjs/types/event", "Event")
  @js.native
  open class Event[V] () extends StObject {
    
    /** @hidden */
    var _isEvent: Boolean = js.native
    
    /** @hidden */
    def filter(f: js.Function1[/* value */ V, Boolean]): Boolean = js.native
    
    /** @hidden */
    def fmap[V2](f: js.Function1[/* value */ V, V2]): Event[V2] = js.native
    
    var hasValue: Boolean = js.native
    
    var id: Double = js.native
    
    /** @hidden */
    def inspect(): String = js.native
    
    var isEnd: Boolean = js.native
    
    var isError: Boolean = js.native
    
    /** @hidden */
    var isEvent: Boolean = js.native
    
    var isInitial: Boolean = js.native
    
    var isNext: Boolean = js.native
    
    /** @hidden */
    def log(): Any = js.native
    
    /** @hidden */
    def toNext(): Event[V] = js.native
  }
  
  @JSImport("baconjs/types/event", "Initial")
  @js.native
  open class Initial[V] protected () extends Value[V] {
    def this(value: V) = this()
    
    /** @hidden */
    var _isInitial: Boolean = js.native
  }
  
  @JSImport("baconjs/types/event", "Next")
  @js.native
  open class Next[V] protected () extends Value[V] {
    def this(value: V) = this()
    
    /** @hidden */
    var _isNext: Boolean = js.native
  }
  
  /* note: abstract class */ @JSImport("baconjs/types/event", "NoValue")
  @js.native
  open class NoValue () extends Event[Any] {
    
    /** @hidden */
    def fmap[V2](f: js.Function): NoValue = js.native
  }
  
  /* note: abstract class */ @JSImport("baconjs/types/event", "Value")
  @js.native
  open class Value[V] protected () extends Event[V] {
    def this(value: V) = this()
    
    /** @hidden */
    @JSName("apply")
    def apply[V2](value: V2): Value[V2] = js.native
    
    var value: V = js.native
  }
  
  inline def endEvent(): End = ^.asInstanceOf[js.Dynamic].applyDynamic("endEvent")().asInstanceOf[End]
  
  inline def hasValue[V](e: Event[V]): /* is baconjs.baconjs/types/event.Value<V> */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("hasValue")(e.asInstanceOf[js.Any]).asInstanceOf[/* is baconjs.baconjs/types/event.Value<V> */ Boolean]
  
  inline def initialEvent[V](value: V): Initial[V] = ^.asInstanceOf[js.Dynamic].applyDynamic("initialEvent")(value.asInstanceOf[js.Any]).asInstanceOf[Initial[V]]
  
  inline def isEnd[V](e: Event[V]): /* is baconjs.baconjs/types/event.End */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isEnd")(e.asInstanceOf[js.Any]).asInstanceOf[/* is baconjs.baconjs/types/event.End */ Boolean]
  
  inline def isError[V](e: Event[V]): /* is baconjs.baconjs/types/event.Error */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isError")(e.asInstanceOf[js.Any]).asInstanceOf[/* is baconjs.baconjs/types/event.Error */ Boolean]
  
  inline def isEvent[V](e: Any): /* is baconjs.baconjs/types/event.Event<V> */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isEvent")(e.asInstanceOf[js.Any]).asInstanceOf[/* is baconjs.baconjs/types/event.Event<V> */ Boolean]
  
  inline def isInitial[V](e: Event[V]): /* is baconjs.baconjs/types/event.Initial<V> */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInitial")(e.asInstanceOf[js.Any]).asInstanceOf[/* is baconjs.baconjs/types/event.Initial<V> */ Boolean]
  
  inline def isNext[V](e: Event[V]): /* is baconjs.baconjs/types/event.Next<V> */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isNext")(e.asInstanceOf[js.Any]).asInstanceOf[/* is baconjs.baconjs/types/event.Next<V> */ Boolean]
  
  inline def nextEvent[V](value: V): Next[V] = ^.asInstanceOf[js.Dynamic].applyDynamic("nextEvent")(value.asInstanceOf[js.Any]).asInstanceOf[Next[V]]
  
  inline def toEvent[V](x: V): Event[V] = ^.asInstanceOf[js.Dynamic].applyDynamic("toEvent")(x.asInstanceOf[js.Any]).asInstanceOf[Event[V]]
  inline def toEvent[V](x: Event[V]): Event[V] = ^.asInstanceOf[js.Dynamic].applyDynamic("toEvent")(x.asInstanceOf[js.Any]).asInstanceOf[Event[V]]
}
