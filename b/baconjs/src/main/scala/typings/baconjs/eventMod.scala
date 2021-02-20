package typings.baconjs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object eventMod {
  
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
  
  @JSImport("baconjs/types/event", "endEvent")
  @js.native
  def endEvent(): End = js.native
  
  @JSImport("baconjs/types/event", "hasValue")
  @js.native
  def hasValue[V](e: Event[V]): /* is baconjs.baconjs/types/event.Value<V> */ Boolean = js.native
  
  @JSImport("baconjs/types/event", "initialEvent")
  @js.native
  def initialEvent[V](value: V): Initial[V] = js.native
  
  @JSImport("baconjs/types/event", "isEnd")
  @js.native
  def isEnd[V](e: Event[V]): /* is baconjs.baconjs/types/event.End */ Boolean = js.native
  
  @JSImport("baconjs/types/event", "isError")
  @js.native
  def isError[V](e: Event[V]): /* is baconjs.baconjs/types/event.Error */ Boolean = js.native
  
  @JSImport("baconjs/types/event", "isEvent")
  @js.native
  def isEvent[V](e: js.Any): /* is baconjs.baconjs/types/event.Event<V> */ Boolean = js.native
  
  @JSImport("baconjs/types/event", "isInitial")
  @js.native
  def isInitial[V](e: Event[V]): /* is baconjs.baconjs/types/event.Initial<V> */ Boolean = js.native
  
  @JSImport("baconjs/types/event", "isNext")
  @js.native
  def isNext[V](e: Event[V]): /* is baconjs.baconjs/types/event.Next<V> */ Boolean = js.native
  
  @JSImport("baconjs/types/event", "nextEvent")
  @js.native
  def nextEvent[V](value: V): Next[V] = js.native
  
  @JSImport("baconjs/types/event", "toEvent")
  @js.native
  def toEvent[V](x: V): Event[V] = js.native
  @JSImport("baconjs/types/event", "toEvent")
  @js.native
  def toEvent[V](x: Event[V]): Event[V] = js.native
}
