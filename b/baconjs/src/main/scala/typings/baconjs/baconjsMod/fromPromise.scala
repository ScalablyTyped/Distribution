package typings.baconjs.baconjsMod

import typings.baconjs.Bacon.EventStream
import typings.jquery.JQueryXHR
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("baconjs", "fromPromise")
@js.native
object fromPromise extends js.Object {
  /**
    * @function
    * @description Creates an [EventStream]{@link Bacon.EventStream} from a `promise` Promise object such as JQuery Ajax. This stream will contain a single value or an error, followed immediately by stream end. You can use the optional `abort` flag (i.e. ´Bacon.fromPromise(p, true)´ to have the `abort` method of the given promise be called when all subscribers have been removed from the created stream.
    * @param {PromiseLike<A>|JQueryXHR} promise
    * @param {boolean} [abort]
    * @returns {EventStream<E, A>}
    * @example
    * Bacon.fromPromise($.ajax("https://baconjs.github.io/"));
    * Bacon.fromPromise(Promise.resolve(1));
    * Bacon.fromPromise($.ajax("https://baconjs.github.io/"), true);
    * Bacon.fromPromise(Promise.resolve(1), false);
    */
  def apply[E, A](promise: js.Thenable[A]): EventStream[E, A] = js.native
  def apply[E, A](promise: js.Thenable[A], abort: Boolean): EventStream[E, A] = js.native
  def apply[E, A](promise: JQueryXHR): EventStream[E, A] = js.native
  def apply[E, A](promise: JQueryXHR, abort: Boolean): EventStream[E, A] = js.native
  /**
    * @callback Bacon.fromPromise~eventTransformer
    * @param {A} value
    * @returns {(Initial<B>|Next<B>|End<B>|Error<E>)[]}
    */
  /**
    * @function Bacon.fromPromise
    * @description Creates an [EventStream]{@link Bacon.EventStream} from a `promise` Promise object such as JQuery Ajax. This stream will contain a single value or an error, followed immediately by stream end. You can use the `abort` flag (i.e. ´Bacon.fromPromise(p, true)´ to have the `abort` method of the given promise be called when all subscribers have been removed from the created stream, and also pass a function `eventTransformer` that transforms the promise value into Events. The default is to transform the value into `[new Bacon.Next(value), new Bacon.End()]`.
    * @param {PromiseLike<A>|JQueryXHR} promise
    * @param {boolean} abort
    * @param {Bacon.fromPromise~eventTransformer} eventTransformer
    * @returns {EventStream<E, B>}
    * @example
    * Bacon.fromPromise($.ajax("https://baconjs.github.io/"), true, (n:string) => {
    *     return [new Bacon.Next(n), new Bacon.Next(() => n), new Bacon.End()];
    * });
    * Bacon.fromPromise(Promise.resolve(1), false, n => {
    *     return [new Bacon.Next(n), new Bacon.Next(() => n), new Bacon.End()];
    * });
    */
  def apply[E, A, B](
    promise: js.Thenable[A],
    abort: Boolean,
    eventTransformer: js.Function1[
      /* value */ A, 
      js.Array[
        typings.baconjs.Bacon.Initial[B] | typings.baconjs.Bacon.Next[B] | typings.baconjs.Bacon.End[B] | typings.baconjs.Bacon.Error[E]
      ]
    ]
  ): EventStream[E, B] = js.native
  def apply[E, A, B](
    promise: JQueryXHR,
    abort: Boolean,
    eventTransformer: js.Function1[
      /* value */ A, 
      js.Array[
        typings.baconjs.Bacon.Initial[B] | typings.baconjs.Bacon.Next[B] | typings.baconjs.Bacon.End[B] | typings.baconjs.Bacon.Error[E]
      ]
    ]
  ): EventStream[E, B] = js.native
}

