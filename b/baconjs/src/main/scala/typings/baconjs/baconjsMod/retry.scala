package typings.baconjs.baconjsMod

import typings.baconjs.Anon_Context
import typings.baconjs.Anon_ContextDelay
import typings.baconjs.Bacon.EventStream
import typings.baconjs.Bacon.Property
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("baconjs", "retry")
@js.native
object retry extends js.Object {
  /**
    * @callback Bacon.retry1~source
    * @description Function that produces an [EventStream]{@link Bacon.EventStream}.
    * @returns {EventStream<E, A>}
    */
  /**
    * @callback Bacon.retry1~isRetryable
    * @description Function returning `true` to continue retrying, `false` to stop. Defaults to `true`. The [Error]{@link Bacon.Error} that occurred is given as a parameter. For example, there is usually no reason to retry a 404 HTTP error, whereas a 500 or a timeout might work on the next attempt.
    * @param {E} error
    * @returns {boolean}
    */
  /**
    * @callback Bacon.retry1~delay
    * @description Function that returns the time in milliseconds to wait before retrying. Defaults to `0`. The function is given a `context` object with the keys `error` (the [Error]{@link Bacon.Error} that occurred) and `retriesDone` (the number of retries already performed) to help determine the appropriate delay, e.g. for an incremental backoff.
    * @param {Object} context
    * @param {E} context.error [Error]{@link Bacon.Error} that occurred
    * @param {number} context.retriesDone number of retries already performed
    * @returns {number}
    */
  /**
    * @function Bacon.retry1
    * @description Is used to retry the call when there is an [Error]{@link Bacon.Error} event in the [EventStream]{@link Bacon.EventStream} produced by the `source` function.
    * @param {Object} options
    * @param {Bacon.retry1~source} options.source function that produces an [EventStream]{@link Bacon.EventStream}
    * @param {number} options.retries number of times to retry the `source` function in addition to the initial attempt
    * @param {Bacon.retry1~isRetryable} [options.isRetryable] function returning `true` to continue retrying, `false` to stop. Defaults to `true`.
    * @param {Bacon.retry1~delay} [options.delay] - function that returns the time in milliseconds to wait before retrying. Defaults to `0`.
    * @returns {EventStream<E, A>}
    */
  def apply[E, A](options: Anon_Context[E, A]): EventStream[E, A] = js.native
  /**
    * @callback Bacon.retry1~source
    * @description Function that produces an [Property]{@link Bacon.Property}.
    * @returns {Property<E, A>}
    */
  /**
    * @callback Bacon.retry1~isRetryable
    * @description Function returning `true` to continue retrying, `false` to stop. Defaults to `true`. The [Error]{@link Bacon.Error} that occurred is given as a parameter. For example, there is usually no reason to retry a 404 HTTP error, whereas a 500 or a timeout might work on the next attempt.
    * @param {E} error
    * @returns {boolean}
    */
  /**
    * @callback Bacon.retry1~delay
    * @description Function that returns the time in milliseconds to wait before retrying. Defaults to `0`. The function is given a `context` object with the keys `error` (the [Error]{@link Bacon.Error} that occurred) and `retriesDone` (the number of retries already performed) to help determine the appropriate delay, e.g. for an incremental backoff.
    * @param {Object} context
    * @param {E} context.error [Error]{@link Bacon.Error} that occurred
    * @param {number} context.retriesDone number of retries already performed
    * @returns {number}
    */
  /**
    * @function Bacon.retry1
    * @description Is used to retry the call when there is an [Error]{@link Bacon.Error} event in the [Property]{@link Bacon.Property} produced by the `source` function.
    * @param {Object} options
    * @param {Bacon.retry1~source} options.source function that produces an [Property]{@link Bacon.Property}
    * @param {number} options.retries number of times to retry the `source` function in addition to the initial attempt
    * @param {Bacon.retry1~isRetryable} [options.isRetryable] function returning `true` to continue retrying, `false` to stop. Defaults to `true`.
    * @param {Bacon.retry1~delay} [options.delay] - function that returns the time in milliseconds to wait before retrying. Defaults to `0`.
    * @returns {Property<E, A>}
    */
  def apply[E, A](options: Anon_ContextDelay[E, A]): Property[E, A] = js.native
}

