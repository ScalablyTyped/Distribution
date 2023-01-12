package typings.baconjs

import typings.baconjs.typesEventMod.End
import typings.baconjs.typesEventMod.Event
import typings.baconjs.typesObservableMod.EventStream
import typings.baconjs.typesReplyMod.Reply
import typings.baconjs.typesTypesMod.EventSink
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesBufferMod {
  
  @JSImport("baconjs/types/buffer", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def buffer[V](src: EventStream[V]): EventStream[js.Array[V]] = ^.asInstanceOf[js.Dynamic].applyDynamic("buffer")(src.asInstanceOf[js.Any]).asInstanceOf[EventStream[js.Array[V]]]
  inline def buffer[V](src: EventStream[V], onInput: Unit, onFlush: BufferHandler[V]): EventStream[js.Array[V]] = (^.asInstanceOf[js.Dynamic].applyDynamic("buffer")(src.asInstanceOf[js.Any], onInput.asInstanceOf[js.Any], onFlush.asInstanceOf[js.Any])).asInstanceOf[EventStream[js.Array[V]]]
  inline def buffer[V](src: EventStream[V], onInput: BufferHandler[V]): EventStream[js.Array[V]] = (^.asInstanceOf[js.Dynamic].applyDynamic("buffer")(src.asInstanceOf[js.Any], onInput.asInstanceOf[js.Any])).asInstanceOf[EventStream[js.Array[V]]]
  inline def buffer[V](src: EventStream[V], onInput: BufferHandler[V], onFlush: BufferHandler[V]): EventStream[js.Array[V]] = (^.asInstanceOf[js.Dynamic].applyDynamic("buffer")(src.asInstanceOf[js.Any], onInput.asInstanceOf[js.Any], onFlush.asInstanceOf[js.Any])).asInstanceOf[EventStream[js.Array[V]]]
  
  inline def bufferWithCount[V](src: EventStream[V], count: Double): EventStream[js.Array[V]] = (^.asInstanceOf[js.Dynamic].applyDynamic("bufferWithCount")(src.asInstanceOf[js.Any], count.asInstanceOf[js.Any])).asInstanceOf[EventStream[js.Array[V]]]
  
  inline def bufferWithTime[V](src: EventStream[V], delay: Double): EventStream[js.Array[V]] = (^.asInstanceOf[js.Dynamic].applyDynamic("bufferWithTime")(src.asInstanceOf[js.Any], delay.asInstanceOf[js.Any])).asInstanceOf[EventStream[js.Array[V]]]
  inline def bufferWithTime[V](src: EventStream[V], delay: DelayFunction): EventStream[js.Array[V]] = (^.asInstanceOf[js.Dynamic].applyDynamic("bufferWithTime")(src.asInstanceOf[js.Any], delay.asInstanceOf[js.Any])).asInstanceOf[EventStream[js.Array[V]]]
  
  inline def bufferWithTimeOrCount[V](src: EventStream[V]): EventStream[js.Array[V]] = ^.asInstanceOf[js.Dynamic].applyDynamic("bufferWithTimeOrCount")(src.asInstanceOf[js.Any]).asInstanceOf[EventStream[js.Array[V]]]
  inline def bufferWithTimeOrCount[V](src: EventStream[V], delay: Double): EventStream[js.Array[V]] = (^.asInstanceOf[js.Dynamic].applyDynamic("bufferWithTimeOrCount")(src.asInstanceOf[js.Any], delay.asInstanceOf[js.Any])).asInstanceOf[EventStream[js.Array[V]]]
  inline def bufferWithTimeOrCount[V](src: EventStream[V], delay: Double, count: Double): EventStream[js.Array[V]] = (^.asInstanceOf[js.Dynamic].applyDynamic("bufferWithTimeOrCount")(src.asInstanceOf[js.Any], delay.asInstanceOf[js.Any], count.asInstanceOf[js.Any])).asInstanceOf[EventStream[js.Array[V]]]
  inline def bufferWithTimeOrCount[V](src: EventStream[V], delay: Unit, count: Double): EventStream[js.Array[V]] = (^.asInstanceOf[js.Dynamic].applyDynamic("bufferWithTimeOrCount")(src.asInstanceOf[js.Any], delay.asInstanceOf[js.Any], count.asInstanceOf[js.Any])).asInstanceOf[EventStream[js.Array[V]]]
  inline def bufferWithTimeOrCount[V](src: EventStream[V], delay: DelayFunction): EventStream[js.Array[V]] = (^.asInstanceOf[js.Dynamic].applyDynamic("bufferWithTimeOrCount")(src.asInstanceOf[js.Any], delay.asInstanceOf[js.Any])).asInstanceOf[EventStream[js.Array[V]]]
  inline def bufferWithTimeOrCount[V](src: EventStream[V], delay: DelayFunction, count: Double): EventStream[js.Array[V]] = (^.asInstanceOf[js.Dynamic].applyDynamic("bufferWithTimeOrCount")(src.asInstanceOf[js.Any], delay.asInstanceOf[js.Any], count.asInstanceOf[js.Any])).asInstanceOf[EventStream[js.Array[V]]]
  
  type BufferHandler[V] = js.Function1[/* buffer */ Buffer_[V], Any]
  
  trait Buffer_[V] extends StObject {
    
    var delay: js.UndefOr[DelayFunction] = js.undefined
    
    var end: js.UndefOr[End] = js.undefined
    
    def flush(): Any
    
    def onFlush(buffer: Buffer_[V]): Any
    @JSName("onFlush")
    var onFlush_Original: BufferHandler[V]
    
    def onInput(buffer: Buffer_[V]): Any
    @JSName("onInput")
    var onInput_Original: BufferHandler[V]
    
    def push(event: Event[js.Array[V]]): Reply
    @JSName("push")
    var push_Original: EventSink[js.Array[V]]
    
    def schedule(delay: DelayFunction): Any
    
    var scheduled: Double | Null
    
    var values: js.Array[V]
  }
  object Buffer_ {
    
    inline def apply[V](
      flush: () => Any,
      onFlush: /* buffer */ Buffer_[V] => Any,
      onInput: /* buffer */ Buffer_[V] => Any,
      push: /* event */ Event[js.Array[V]] => Reply,
      schedule: DelayFunction => Any,
      values: js.Array[V]
    ): Buffer_[V] = {
      val __obj = js.Dynamic.literal(flush = js.Any.fromFunction0(flush), onFlush = js.Any.fromFunction1(onFlush), onInput = js.Any.fromFunction1(onInput), push = js.Any.fromFunction1(push), schedule = js.Any.fromFunction1(schedule), values = values.asInstanceOf[js.Any], scheduled = null)
      __obj.asInstanceOf[Buffer_[V]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Buffer_[?], V] (val x: Self & Buffer_[V]) extends AnyVal {
      
      inline def setDelay(value: /* f */ VoidFunction => Any): Self = StObject.set(x, "delay", js.Any.fromFunction1(value))
      
      inline def setDelayUndefined: Self = StObject.set(x, "delay", js.undefined)
      
      inline def setEnd(value: End): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
      
      inline def setEndUndefined: Self = StObject.set(x, "end", js.undefined)
      
      inline def setFlush(value: () => Any): Self = StObject.set(x, "flush", js.Any.fromFunction0(value))
      
      inline def setOnFlush(value: /* buffer */ Buffer_[V] => Any): Self = StObject.set(x, "onFlush", js.Any.fromFunction1(value))
      
      inline def setOnInput(value: /* buffer */ Buffer_[V] => Any): Self = StObject.set(x, "onInput", js.Any.fromFunction1(value))
      
      inline def setPush(value: /* event */ Event[js.Array[V]] => Reply): Self = StObject.set(x, "push", js.Any.fromFunction1(value))
      
      inline def setSchedule(value: DelayFunction => Any): Self = StObject.set(x, "schedule", js.Any.fromFunction1(value))
      
      inline def setScheduled(value: Double): Self = StObject.set(x, "scheduled", value.asInstanceOf[js.Any])
      
      inline def setScheduledNull: Self = StObject.set(x, "scheduled", null)
      
      inline def setValues(value: js.Array[V]): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
      
      inline def setValuesVarargs(value: V*): Self = StObject.set(x, "values", js.Array(value*))
    }
  }
  
  type DelayFunction = js.Function1[/* f */ VoidFunction, Any]
  
  type VoidFunction = js.Function0[Unit]
}
