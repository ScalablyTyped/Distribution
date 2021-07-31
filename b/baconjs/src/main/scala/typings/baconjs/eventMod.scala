package typings.baconjs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object eventMod {
  
  @JSImport("baconjs/types/event", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("baconjs/types/event", JSImport.Default)
  @js.native
  abstract class default[V] () extends Event[V]
  
  @JSImport("baconjs/types/event", "End")
  @js.native
  class End () extends NoValue
  
  @JSImport("baconjs/types/event", "Error")
  @js.native
  class Error protected () extends NoValue {
    def this(error: js.Any) = this()
    
    /**
      * The actual error object carried by this event
      */
    var error: js.Any = js.native
  }
  
  @JSImport("baconjs/types/event", "Event")
  @js.native
  abstract class Event[V] () extends StObject {
    
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
    def log(): js.Any = js.native
    
    /** @hidden */
    def toNext(): Event[V] = js.native
  }
  
  @JSImport("baconjs/types/event", "Initial")
  @js.native
  class Initial[V] protected () extends Value[V] {
    def this(value: V) = this()
    
    /** @hidden */
    var _isInitial: Boolean = js.native
  }
  
  @JSImport("baconjs/types/event", "Next")
  @js.native
  class Next[V] protected () extends Value[V] {
    def this(value: V) = this()
    
    /** @hidden */
    var _isNext: Boolean = js.native
  }
  
  @JSImport("baconjs/types/event", "NoValue")
  @js.native
  abstract class NoValue ()
    extends Event[js.Any] {
    
    /** @hidden */
    def fmap[V2](f: js.Function): NoValue = js.native
  }
  
  @JSImport("baconjs/types/event", "Value")
  @js.native
  abstract class Value[V] protected () extends Event[V] {
    def this(value: V) = this()
    
    /** @hidden */
    @JSName("apply")
    def apply[V2](value: V2): Value[V2] = js.native
    
    var value: V = js.native
  }
  
  @scala.inline
  def endEvent(): End = ^.asInstanceOf[js.Dynamic].applyDynamic("endEvent")().asInstanceOf[End]
  
  @scala.inline
  def hasValue[V](e: Event[V]): /* is baconjs.baconjs/types/event.Value<V> */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("hasValue")(e.asInstanceOf[js.Any]).asInstanceOf[/* is baconjs.baconjs/types/event.Value<V> */ Boolean]
  
  @scala.inline
  def initialEvent[V](value: V): Initial[V] = ^.asInstanceOf[js.Dynamic].applyDynamic("initialEvent")(value.asInstanceOf[js.Any]).asInstanceOf[Initial[V]]
  
  @scala.inline
  def isEnd[V](e: Event[V]): /* is baconjs.baconjs/types/event.End */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isEnd")(e.asInstanceOf[js.Any]).asInstanceOf[/* is baconjs.baconjs/types/event.End */ Boolean]
  
  @scala.inline
  def isError[V](e: Event[V]): /* is baconjs.baconjs/types/event.Error */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isError")(e.asInstanceOf[js.Any]).asInstanceOf[/* is baconjs.baconjs/types/event.Error */ Boolean]
  
  @scala.inline
  def isEvent[V](e: js.Any): /* is baconjs.baconjs/types/event.Event<V> */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isEvent")(e.asInstanceOf[js.Any]).asInstanceOf[/* is baconjs.baconjs/types/event.Event<V> */ Boolean]
  
  @scala.inline
  def isInitial[V](e: Event[V]): /* is baconjs.baconjs/types/event.Initial<V> */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInitial")(e.asInstanceOf[js.Any]).asInstanceOf[/* is baconjs.baconjs/types/event.Initial<V> */ Boolean]
  
  @scala.inline
  def isNext[V](e: Event[V]): /* is baconjs.baconjs/types/event.Next<V> */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isNext")(e.asInstanceOf[js.Any]).asInstanceOf[/* is baconjs.baconjs/types/event.Next<V> */ Boolean]
  
  @scala.inline
  def nextEvent[V](value: V): Next[V] = ^.asInstanceOf[js.Dynamic].applyDynamic("nextEvent")(value.asInstanceOf[js.Any]).asInstanceOf[Next[V]]
  
  @scala.inline
  def toEvent[V](x: V): Event[V] = ^.asInstanceOf[js.Dynamic].applyDynamic("toEvent")(x.asInstanceOf[js.Any]).asInstanceOf[Event[V]]
  @scala.inline
  def toEvent[V](x: Event[V]): Event[V] = ^.asInstanceOf[js.Dynamic].applyDynamic("toEvent")(x.asInstanceOf[js.Any]).asInstanceOf[Event[V]]
}
