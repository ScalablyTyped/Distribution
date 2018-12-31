package typings
package d3DashQueueLib.d3DashQueueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Queue extends js.Object {
  /**
    * Aborts any active tasks, invoking each active task’s task.abort function, if any.
    * Also prevents any new tasks from starting, and immediately invokes the queue.await or
    * queue.awaitAll callback with an error indicating that the queue was aborted.
    */
  def abort(): this.type
  /**
    * Sets the callback to be invoked when all deferred tasks have finished (individual result arguments).
    *
    * @param callback Callback function to be executed, when error occurred or all deferred tasks have completed.
    * The first argument to the callback is the first error that occurred, or null if no error occurred.
    * If an error occurred, there are no additional arguments to the callback.
    * Otherwise, the callback is passed each result as an additional argument.
    * @throws If called several times or after `awaitAll`, will throw an `Error`.
    */
  def await(callback: js.Function2[/* error */ js.Any | scala.Null, /* repeated */ js.Any, scala.Unit]): this.type
  /**
    * Sets the callback to be invoked when all deferred tasks have finished (results array).
    *
    * @param callback Callback function to be executed, when error occurred or all deferred tasks have completed.
    * The first argument to the callback is the first error that occurred, or null if no error occurred.
    * If an error occurred, there are no additional arguments to the callback.
    * Otherwise, the callback is also passed an array of results as the second argument.
    * @throws If called several times or after `await`, will throw an `Error`.
    */
  def awaitAll(
    callback: js.Function2[/* error */ js.Any | scala.Null, /* results */ js.UndefOr[js.Array[_]], scala.Unit]
  ): this.type
  /**
    * Adds the specified asynchronous task callback to the queue, with any optional arguments.
    *
    * @param task Task to be executed.The task is a function that will be called when the task should start.
    * It is passed the specified optional arguments and an additional callback as the last argument;
    * the callback must be invoked by the task when it finishes.
    * The task must invoke the callback with two arguments: the error, if any, and the result of the task.
    * To return multiple results from a single callback, wrap the results in an object or array.
    * @param args Additional, optional arguments to be passed into deferred task on invocation.
    * @throws If called after an `await`, will throw an `Error`.
    */
  def defer(task: js.Function1[/* repeated */ js.Any, scala.Unit], args: js.Any*): this.type
}

