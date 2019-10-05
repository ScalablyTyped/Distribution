package typings.baconjs.baconjsMod

import typings.baconjs.Bacon.EventStream
import typings.baconjs.Bacon.More
import typings.baconjs.Bacon.NoMore
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("baconjs", "fromBinder")
@js.native
object fromBinder extends js.Object {
  /**
    * @callback Bacon.fromBinder~subscribe
    * @param {Bacon.fromBinder~sink} sink
    * @returns {Bacon.fromBinder~unsubscribe}
    */
  /**
    * @callback Bacon.fromBinder~sink
    * @param {More|NoMore|(A|Initial<A>|Next<A>|End<A>|Error<E>)|(A|Initial<A>|Next<A>|End<A>|Error<E>)[]} value
    * @returns {void}
    */
  /**
    * @callback Bacon.fromBinder~unsubscribe
    * @returns {void}
    */
  /**
    * @function Bacon.fromBinder
    * @description Creates an [EventStream]{@link Bacon.EventStream} with the given [subscribe]{@link Bacon.fromBinder~subscribe} function. The parameter `subscribe` is a function that accepts a [sink]{@link Bacon.fromBinder~sink} which is a function that your `subscribe` function can "push" events to. You can push: a plain value, like `"first value"`; an [Event]{@link Bacon.Event} object including [Error]{@link Bacon.Error} (wraps an error) and [End]{@link Bacon.End} (indicates stream end); an array of event objects at once. The `subscribe` function must return a function. Let's call that function [unsubscribe]{@link Bacon.fromBinder~unsubscribe}. The returned function can be used by the subscriber (directly or indirectly) to unsubscribe from the EventStream. It should release all resources that the `subscribe` function reserved. The `sink` function may return [noMore]{@link Bacon.noMore} (as well as [more]{@link Bacon.more} or any other value). If it returns `noMore`, no further events will be consumed by the subscriber. The `subscribe` function may choose to clean up all resources at this point (e.g., by calling `unsubscribe`). This is usually not necessary, because further calls to `sink` are ignored, but doing so can increase performance in rare cases. The EventStream will wrap your `subscribe` function so that it will only be called when the first stream listener is added, and the `unsubscribe` function is called only after the last listener has been removed. The subscribe-unsubscribe cycle may of course be repeated indefinitely, so prepare for multiple calls to the `subscribe` function.
    * @param {Bacon.fromBinder~subscribe} subscribe
    * @returns {EventStream<E, A>}
    * @example
    * let stream = Bacon.fromBinder(sink => {
    *     sink("first value");
    *     sink([new Bacon.Next("2nd"), new Bacon.Next("3rd")]);
    *     sink(new Bacon.Next(() => {
    *         return "This one will be evaluated lazily"
    *     }));
    *     sink(new Bacon.Error("oops, an error"));
    *     sink(new Bacon.End());
    *     return () => {
    *         // unsub functionality here, this one's a no-op
    *     };
    * });
    * stream.log();
    */
  def apply[E, A](
    subscribe: js.Function1[
      /* sink */ js.Function1[
        /* value */ More | NoMore | A | typings.baconjs.Bacon.Initial[A] | typings.baconjs.Bacon.Next[A] | typings.baconjs.Bacon.End[A] | typings.baconjs.Bacon.Error[E] | (js.Array[
          A | typings.baconjs.Bacon.Initial[A] | typings.baconjs.Bacon.Next[A] | typings.baconjs.Bacon.End[A] | typings.baconjs.Bacon.Error[E]
        ]), 
        Unit
      ], 
      js.Function0[Unit]
    ]
  ): EventStream[E, A] = js.native
}

