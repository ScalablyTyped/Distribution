package typings.baconjs

import typings.baconjs.typesEventMod.End
import typings.baconjs.typesEventMod.Event
import typings.baconjs.typesEventMod.Initial
import typings.baconjs.typesEventMod.Next
import typings.baconjs.typesEventMod.NoValue
import typings.baconjs.typesEventMod.Value
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("baconjs/types/event", JSImport.Namespace)
@js.native
object typesEventMod extends js.Object {
  @js.native
  class End () extends NoValue
  
  @js.native
  class Error protected () extends NoValue {
    def this(error: js.Any) = this()
    /**
      * The actual error object carried by this event
      */
    var error: js.Any = js.native
  }
  
  @js.native
  abstract class Event[V] () extends js.Object {
    /** @hidden */
    var _isEvent: Boolean = js.native
    var hasValue: Boolean = js.native
    var id: Double = js.native
    var isEnd: Boolean = js.native
    var isError: Boolean = js.native
    /** @hidden */
    var isEvent: Boolean = js.native
    var isInitial: Boolean = js.native
    var isNext: Boolean = js.native
    /** @hidden */
    def filter(f: js.Function1[/* value */ V, Boolean]): Boolean = js.native
    /** @hidden */
    def fmap[V2](f: js.Function1[/* value */ V, V2]): Event[V2] = js.native
    /** @hidden */
    def inspect(): String = js.native
    /** @hidden */
    def log(): js.Any = js.native
    /** @hidden */
    def toNext(): Event[V] = js.native
  }
  
  @js.native
  class Initial[V] protected () extends Value[V] {
    def this(value: V) = this()
    /** @hidden */
    var _isInitial: Boolean = js.native
  }
  
  @js.native
  class Next[V] protected () extends Value[V] {
    def this(value: V) = this()
    /** @hidden */
    var _isNext: Boolean = js.native
  }
  
  @js.native
  abstract class NoValue ()
    extends Event[js.Any] {
    /** @hidden */
    def fmap[V2](f: js.Function): NoValue = js.native
  }
  
  @js.native
  abstract class Value[V] protected () extends Event[V] {
    def this(value: V) = this()
    var value: V = js.native
    /** @hidden */
    @JSName("apply")
    def apply[V2](value: V2): Value[V2] = js.native
  }
  
  @js.native
  abstract class default[V] () extends Event[V]
  
  def endEvent(): End = js.native
  def hasValue[V](e: Event[V]): /* is baconjs.baconjs/types/event.Value<V> */ Boolean = js.native
  def initialEvent[V](value: V): Initial[V] = js.native
  def isEnd[V](e: Event[V]): /* is baconjs.baconjs/types/event.End */ Boolean = js.native
  def isError[V](e: Event[V]): /* is baconjs.baconjs/types/event.Error */ Boolean = js.native
  def isEvent[V](e: js.Any): /* is baconjs.baconjs/types/event.Event<V> */ Boolean = js.native
  def isInitial[V](e: js.Any): /* is baconjs.baconjs/types/event.Initial<V> */ Boolean = js.native
  def isNext[V](e: Event[V]): /* is baconjs.baconjs/types/event.Next<V> */ Boolean = js.native
  def nextEvent[V](value: V): Next[V] = js.native
  def toEvent[V](x: V): Event[V] = js.native
  def toEvent[V](x: Event[V]): Event[V] = js.native
}

