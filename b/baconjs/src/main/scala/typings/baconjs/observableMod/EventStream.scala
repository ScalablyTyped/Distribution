package typings.baconjs.observableMod

import typings.baconjs.bufferMod.DelayFunction
import typings.baconjs.describeMod.Desc
import typings.baconjs.typesMod.EventSink
import typings.baconjs.typesMod.Function2
import typings.baconjs.typesMod.Subscribe
import typings.baconjs.typesMod.Unsub
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("baconjs/types/observable", "EventStream")
@js.native
class EventStream[V] protected () extends Observable[V] {
  def this(desc: Desc, subscribe: Subscribe[V]) = this()
  def this(desc: Desc, subscribe: Subscribe[V], handler: EventSink[V]) = this()
  def this(
    desc: Desc,
    subscribe: Subscribe[V],
    handler: js.UndefOr[scala.Nothing],
    options: EventStreamOptions
  ) = this()
  def this(desc: Desc, subscribe: Subscribe[V], handler: EventSink[V], options: EventStreamOptions) = this()
  
  /** @hidden */
  var _isEventStream: Boolean = js.native
  
  /**
    Buffers stream events with given count.
    The buffer is flushed when it contains the given number of elements or the source stream ends.
    
    So, if you buffer a stream of `[1, 2, 3, 4, 5]` with count `2`, you'll get output
    events with values `[1, 2]`, `[3, 4]` and `[5]`.
    
    * @param {number} count
    */
  def bufferWithCount(count: Double): EventStream[js.Array[V]] = js.native
  
  /**
    Buffers stream events with given delay.
    The buffer is flushed at most once in the given interval. So, if your input
    contains [1,2,3,4,5,6,7], then you might get two events containing [1,2,3,4]
    and [5,6,7] respectively, given that the flush occurs between numbers 4 and 5.
    
    Also works with a given "defer-function" instead
    of a delay. Here's a simple example, which is equivalent to
    stream.bufferWithTime(10):
    
    ```js
    stream.bufferWithTime(function(f) { setTimeout(f, 10) })
    ```
    
    * @param delay buffer duration in milliseconds
    */
  def bufferWithTime(delay: Double): EventStream[js.Array[V]] = js.native
  def bufferWithTime(delay: DelayFunction): EventStream[js.Array[V]] = js.native
  
  /**
    Buffers stream events and
    flushes when either the buffer contains the given number elements or the
    given amount of milliseconds has passed since last buffered event.
    
    * @param {number | DelayFunction} delay in milliseconds or as a function
    * @param {number} count  maximum buffer size
    */
  def bufferWithTimeOrCount(): EventStream[js.Array[V]] = js.native
  def bufferWithTimeOrCount(delay: js.UndefOr[scala.Nothing], count: Double): EventStream[js.Array[V]] = js.native
  def bufferWithTimeOrCount(delay: Double): EventStream[js.Array[V]] = js.native
  def bufferWithTimeOrCount(delay: Double, count: Double): EventStream[js.Array[V]] = js.native
  def bufferWithTimeOrCount(delay: DelayFunction): EventStream[js.Array[V]] = js.native
  def bufferWithTimeOrCount(delay: DelayFunction, count: Double): EventStream[js.Array[V]] = js.native
  
  def concat(other: Observable[V], options: EventStreamOptions): EventStream[V] = js.native
  @JSName("concat")
  def concat_V2[V2](other: Observable[V2], options: EventStreamOptions): EventStream[V | V2] = js.native
  
  /**
    Scans stream with given seed value and accumulator function, resulting to a Property.
    Difference to [`scan`](#scan) is that the function `f` can return an [`EventStream`](eventstream.html) or a [`Property`](property.html) instead
    of a pure value, meaning that you can use [`flatScan`](#flatscan) for asynchronous updates of state. It serializes
    updates so that that the next update will be queued until the previous one has completed.
    
    * @param seed initial value to start with
    * @param f transition function from previous state and new value to next state
    * @typeparam V2 state and result type
    */
  def flatScan[V2](seed: V2, f: Function2[V2, V, Observable[V2]]): Property[V2] = js.native
  
  /**
    Merges two streams into one stream that delivers events from both
    */
  def merge(other: EventStream[V]): EventStream[V] = js.native
  @JSName("merge")
  def merge_V2[V2](other: EventStream[V2]): EventStream[V | V2] = js.native
  
  /** @hidden */
  def subscribeInternal(): Unsub = js.native
  
  def toProperty(initValue: V): Property[V] = js.native
}
