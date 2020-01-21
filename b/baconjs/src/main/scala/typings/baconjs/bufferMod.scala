package typings.baconjs

import typings.baconjs.eventMod.End
import typings.baconjs.eventMod.Event
import typings.baconjs.observableMod.EventStream
import typings.baconjs.replyMod.Reply
import typings.baconjs.typesMod.EventSink
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("baconjs/types/buffer", JSImport.Namespace)
@js.native
object bufferMod extends js.Object {
  @js.native
  trait Buffer_[V] extends js.Object {
    var delay: js.UndefOr[DelayFunction] = js.native
    var end: js.UndefOr[End] = js.native
    @JSName("onFlush")
    var onFlush_Original: BufferHandler[V] = js.native
    @JSName("onInput")
    var onInput_Original: BufferHandler[V] = js.native
    @JSName("push")
    var push_Original: EventSink[js.Array[V]] = js.native
    var scheduled: Double | Null = js.native
    var values: js.Array[V] = js.native
    def flush(): js.Any = js.native
    def onFlush(buffer: Buffer_[V]): js.Any = js.native
    def onInput(buffer: Buffer_[V]): js.Any = js.native
    def push(event: Event[js.Array[V]]): Reply = js.native
    def schedule(delay: DelayFunction): js.Any = js.native
  }
  
  def buffer[V](src: EventStream[V]): EventStream[js.Array[V]] = js.native
  def buffer[V](src: EventStream[V], onInput: BufferHandler[V]): EventStream[js.Array[V]] = js.native
  def buffer[V](src: EventStream[V], onInput: BufferHandler[V], onFlush: BufferHandler[V]): EventStream[js.Array[V]] = js.native
  def bufferWithCount[V](src: EventStream[V], count: Double): EventStream[js.Array[V]] = js.native
  def bufferWithTime[V](src: EventStream[V], delay: Double): EventStream[js.Array[V]] = js.native
  def bufferWithTime[V](src: EventStream[V], delay: DelayFunction): EventStream[js.Array[V]] = js.native
  def bufferWithTimeOrCount[V](src: EventStream[V]): EventStream[js.Array[V]] = js.native
  def bufferWithTimeOrCount[V](src: EventStream[V], delay: Double): EventStream[js.Array[V]] = js.native
  def bufferWithTimeOrCount[V](src: EventStream[V], delay: Double, count: Double): EventStream[js.Array[V]] = js.native
  def bufferWithTimeOrCount[V](src: EventStream[V], delay: DelayFunction): EventStream[js.Array[V]] = js.native
  def bufferWithTimeOrCount[V](src: EventStream[V], delay: DelayFunction, count: Double): EventStream[js.Array[V]] = js.native
  type BufferHandler[V] = js.Function1[/* buffer */ Buffer_[V], js.Any]
  type DelayFunction = js.Function1[/* f */ VoidFunction, js.Any]
  type VoidFunction = js.Function0[Unit]
}

