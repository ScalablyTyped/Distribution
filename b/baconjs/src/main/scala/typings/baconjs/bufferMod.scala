package typings.baconjs

import typings.baconjs.eventMod.End
import typings.baconjs.eventMod.Event
import typings.baconjs.observableMod.EventStream
import typings.baconjs.replyMod.Reply
import typings.baconjs.typesMod.EventSink
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object bufferMod {
  
  @JSImport("baconjs/types/buffer", "buffer")
  @js.native
  def buffer[V](src: EventStream[V]): EventStream[js.Array[V]] = js.native
  @JSImport("baconjs/types/buffer", "buffer")
  @js.native
  def buffer[V](src: EventStream[V], onInput: js.UndefOr[scala.Nothing], onFlush: BufferHandler[V]): EventStream[js.Array[V]] = js.native
  @JSImport("baconjs/types/buffer", "buffer")
  @js.native
  def buffer[V](src: EventStream[V], onInput: BufferHandler[V]): EventStream[js.Array[V]] = js.native
  @JSImport("baconjs/types/buffer", "buffer")
  @js.native
  def buffer[V](src: EventStream[V], onInput: BufferHandler[V], onFlush: BufferHandler[V]): EventStream[js.Array[V]] = js.native
  
  @JSImport("baconjs/types/buffer", "bufferWithCount")
  @js.native
  def bufferWithCount[V](src: EventStream[V], count: Double): EventStream[js.Array[V]] = js.native
  
  @JSImport("baconjs/types/buffer", "bufferWithTime")
  @js.native
  def bufferWithTime[V](src: EventStream[V], delay: Double): EventStream[js.Array[V]] = js.native
  @JSImport("baconjs/types/buffer", "bufferWithTime")
  @js.native
  def bufferWithTime[V](src: EventStream[V], delay: DelayFunction): EventStream[js.Array[V]] = js.native
  
  @JSImport("baconjs/types/buffer", "bufferWithTimeOrCount")
  @js.native
  def bufferWithTimeOrCount[V](src: EventStream[V]): EventStream[js.Array[V]] = js.native
  @JSImport("baconjs/types/buffer", "bufferWithTimeOrCount")
  @js.native
  def bufferWithTimeOrCount[V](src: EventStream[V], delay: js.UndefOr[scala.Nothing], count: Double): EventStream[js.Array[V]] = js.native
  @JSImport("baconjs/types/buffer", "bufferWithTimeOrCount")
  @js.native
  def bufferWithTimeOrCount[V](src: EventStream[V], delay: Double): EventStream[js.Array[V]] = js.native
  @JSImport("baconjs/types/buffer", "bufferWithTimeOrCount")
  @js.native
  def bufferWithTimeOrCount[V](src: EventStream[V], delay: Double, count: Double): EventStream[js.Array[V]] = js.native
  @JSImport("baconjs/types/buffer", "bufferWithTimeOrCount")
  @js.native
  def bufferWithTimeOrCount[V](src: EventStream[V], delay: DelayFunction): EventStream[js.Array[V]] = js.native
  @JSImport("baconjs/types/buffer", "bufferWithTimeOrCount")
  @js.native
  def bufferWithTimeOrCount[V](src: EventStream[V], delay: DelayFunction, count: Double): EventStream[js.Array[V]] = js.native
  
  type BufferHandler[V] = js.Function1[/* buffer */ Buffer_[V], js.Any]
  
  @js.native
  trait Buffer_[V] extends StObject {
    
    var delay: js.UndefOr[DelayFunction] = js.native
    
    var end: js.UndefOr[End] = js.native
    
    def flush(): js.Any = js.native
    
    def onFlush(buffer: Buffer_[V]): js.Any = js.native
    @JSName("onFlush")
    var onFlush_Original: BufferHandler[V] = js.native
    
    def onInput(buffer: Buffer_[V]): js.Any = js.native
    @JSName("onInput")
    var onInput_Original: BufferHandler[V] = js.native
    
    def push(event: Event[js.Array[V]]): Reply = js.native
    @JSName("push")
    var push_Original: EventSink[js.Array[V]] = js.native
    
    def schedule(delay: DelayFunction): js.Any = js.native
    
    var scheduled: Double | Null = js.native
    
    var values: js.Array[V] = js.native
  }
  
  type DelayFunction = js.Function1[/* f */ VoidFunction, js.Any]
  
  type VoidFunction = js.Function0[Unit]
}
