package typings
package babylonjsLib.babylonjsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
     * An implementation of a loop for asynchronous functions.
     */
@JSImport("babylonjs", "AsyncLoop")
@js.native
class AsyncLoop protected ()
  extends babylonjsLib.BABYLONNs.AsyncLoop {
  /**
           * Constructor.
           * @param iterations the number of iterations.
           * @param func the function to run each iteration
           * @param successCallback the callback that will be called upon succesful execution
           * @param offset starting offset.
           */
  def this(/**
           * Defines the number of iterations for the loop
           */
  iterations: scala.Double, func: js.Function1[/* asyncLoop */ babylonjsLib.BABYLONNs.AsyncLoop, scala.Unit], successCallback: js.Function0[scala.Unit]) = this()
  /**
           * Constructor.
           * @param iterations the number of iterations.
           * @param func the function to run each iteration
           * @param successCallback the callback that will be called upon succesful execution
           * @param offset starting offset.
           */
  def this(/**
           * Defines the number of iterations for the loop
           */
  iterations: scala.Double, func: js.Function1[/* asyncLoop */ babylonjsLib.BABYLONNs.AsyncLoop, scala.Unit], successCallback: js.Function0[scala.Unit], offset: scala.Double) = this()
}

/**
     * An implementation of a loop for asynchronous functions.
     */
@JSImport("babylonjs", "AsyncLoop")
@js.native
object AsyncLoop extends js.Object {
  /**
           * Create and run an async loop.
           * @param iterations the number of iterations.
           * @param fn the function to run each iteration
           * @param successCallback the callback that will be called upon succesful execution
           * @param offset starting offset.
           * @returns the created async loop object
           */
  def Run(
    iterations: scala.Double,
    fn: js.Function1[/* asyncLoop */ this.type, scala.Unit],
    successCallback: js.Function0[scala.Unit]
  ): babylonjsLib.BABYLONNs.AsyncLoop = js.native
  /**
           * Create and run an async loop.
           * @param iterations the number of iterations.
           * @param fn the function to run each iteration
           * @param successCallback the callback that will be called upon succesful execution
           * @param offset starting offset.
           * @returns the created async loop object
           */
  def Run(
    iterations: scala.Double,
    fn: js.Function1[/* asyncLoop */ this.type, scala.Unit],
    successCallback: js.Function0[scala.Unit],
    offset: scala.Double
  ): babylonjsLib.BABYLONNs.AsyncLoop = js.native
  /**
           * A for-loop that will run a given number of iterations synchronous and the rest async.
           * @param iterations total number of iterations
           * @param syncedIterations number of synchronous iterations in each async iteration.
           * @param fn the function to call each iteration.
           * @param callback a success call back that will be called when iterating stops.
           * @param breakFunction a break condition (optional)
           * @param timeout timeout settings for the setTimeout function. default - 0.
           * @returns the created async loop object
           */
  def SyncAsyncForLoop(
    iterations: scala.Double,
    syncedIterations: scala.Double,
    fn: js.Function1[/* iteration */ scala.Double, scala.Unit],
    callback: js.Function0[scala.Unit]
  ): babylonjsLib.BABYLONNs.AsyncLoop = js.native
  /**
           * A for-loop that will run a given number of iterations synchronous and the rest async.
           * @param iterations total number of iterations
           * @param syncedIterations number of synchronous iterations in each async iteration.
           * @param fn the function to call each iteration.
           * @param callback a success call back that will be called when iterating stops.
           * @param breakFunction a break condition (optional)
           * @param timeout timeout settings for the setTimeout function. default - 0.
           * @returns the created async loop object
           */
  def SyncAsyncForLoop(
    iterations: scala.Double,
    syncedIterations: scala.Double,
    fn: js.Function1[/* iteration */ scala.Double, scala.Unit],
    callback: js.Function0[scala.Unit],
    breakFunction: js.Function0[scala.Boolean]
  ): babylonjsLib.BABYLONNs.AsyncLoop = js.native
  /**
           * A for-loop that will run a given number of iterations synchronous and the rest async.
           * @param iterations total number of iterations
           * @param syncedIterations number of synchronous iterations in each async iteration.
           * @param fn the function to call each iteration.
           * @param callback a success call back that will be called when iterating stops.
           * @param breakFunction a break condition (optional)
           * @param timeout timeout settings for the setTimeout function. default - 0.
           * @returns the created async loop object
           */
  def SyncAsyncForLoop(
    iterations: scala.Double,
    syncedIterations: scala.Double,
    fn: js.Function1[/* iteration */ scala.Double, scala.Unit],
    callback: js.Function0[scala.Unit],
    breakFunction: js.Function0[scala.Boolean],
    timeout: scala.Double
  ): babylonjsLib.BABYLONNs.AsyncLoop = js.native
}

