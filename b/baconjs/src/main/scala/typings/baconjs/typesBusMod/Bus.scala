package typings.baconjs.typesBusMod

import typings.baconjs.typesObservableMod.EventStream
import typings.baconjs.typesReplyMod.Reply
import typings.baconjs.typesTypesMod.EventSink
import typings.baconjs.typesTypesMod.Unsub
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Bus[V] extends EventStream[V] {
  /** @hidden */
  var ended: Boolean = js.native
  /** @hidden */
  var pushQueue: js.UndefOr[js.Array[V]] = js.native
  /** @hidden */
  var pushing: Boolean = js.native
  /** @hidden */
  var sink: js.UndefOr[EventSink[V]] = js.native
  /** @hidden */
  var subscriptions: js.Array[Subscription[V]] = js.native
  /**
    Ends the stream. Sends an [End](end.html) event to all subscribers.
    After this call, there'll be no more events to the subscribers.
    Also, the [`push`](#push), [`error`](#error) and [`plug`](#plug) methods have no effect.
    */
  def end(): Reply = js.native
  /**
    * Pushes an error to this stream.
    */
  def error(error: js.Any): Reply = js.native
  /** @hidden */
  def guardedSink(input: typings.baconjs.typesObservableMod.default[V]): EventSink[V] = js.native
  /**
    Plugs the given stream as an input to the Bus. All events from
    the given stream will be delivered to the subscribers of the Bus.
    Returns a function that can be used to unplug the same stream.
    
    The plug method practically allows you to merge in other streams after
    the creation of the Bus.
    
    * @returns a function that can be called to "unplug" the source from Bus.
    */
  def plug[V2 /* <: V */](input: typings.baconjs.typesObservableMod.default[V2]): js.UndefOr[js.Function0[Unit]] = js.native
  /**
    * Pushes a new value to the stream.
    */
  def push(value: V): Reply = js.native
  /** @hidden */
  def subscribeAll(newSink: EventSink[V]): js.Function0[Unit] = js.native
  /** @hidden */
  def subscribeInput(subscription: Subscription[V]): Unsub = js.native
  /** @hidden */
  def unsubAll(): Unit = js.native
  /** @hidden */
  def unsubscribeInput(input: typings.baconjs.typesObservableMod.default[_]): Unit = js.native
}

