package typings.babylonjs.toolsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs/Misc/tools", "AsyncLoop")
@js.native
class AsyncLoop protected () extends js.Object {
  /**
    * Constructor.
    * @param iterations the number of iterations.
    * @param func the function to run each iteration
    * @param successCallback the callback that will be called upon succesful execution
    * @param offset starting offset.
    */
  def this(
    /**
    * Defines the number of iterations for the loop
    */
  iterations: Double,
    func: js.Function1[/* asyncLoop */ AsyncLoop, Unit],
    successCallback: js.Function0[Unit]
  ) = this()
  def this(
    /**
    * Defines the number of iterations for the loop
    */
  iterations: Double,
    func: js.Function1[/* asyncLoop */ AsyncLoop, Unit],
    successCallback: js.Function0[Unit],
    offset: Double
  ) = this()
  
  var _done: js.Any = js.native
  
  var _fn: js.Any = js.native
  
  var _successCallback: js.Any = js.native
  
  /**
    * Break the loop and run the success callback.
    */
  def breakLoop(): Unit = js.native
  
  /**
    * Execute the next iteration. Must be called after the last iteration was finished.
    */
  def executeNext(): Unit = js.native
  
  /**
    * Defines the current index of the loop.
    */
  var index: Double = js.native
  
  /**
    * Defines the number of iterations for the loop
    */
  var iterations: Double = js.native
}
/* static members */
@JSImport("babylonjs/Misc/tools", "AsyncLoop")
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
    iterations: Double,
    fn: js.Function1[/* asyncLoop */ this.type, Unit],
    successCallback: js.Function0[Unit]
  ): AsyncLoop = js.native
  def Run(
    iterations: Double,
    fn: js.Function1[/* asyncLoop */ this.type, Unit],
    successCallback: js.Function0[Unit],
    offset: Double
  ): AsyncLoop = js.native
  
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
    iterations: Double,
    syncedIterations: Double,
    fn: js.Function1[/* iteration */ Double, Unit],
    callback: js.Function0[Unit]
  ): AsyncLoop = js.native
  def SyncAsyncForLoop(
    iterations: Double,
    syncedIterations: Double,
    fn: js.Function1[/* iteration */ Double, Unit],
    callback: js.Function0[Unit],
    breakFunction: js.UndefOr[scala.Nothing],
    timeout: Double
  ): AsyncLoop = js.native
  def SyncAsyncForLoop(
    iterations: Double,
    syncedIterations: Double,
    fn: js.Function1[/* iteration */ Double, Unit],
    callback: js.Function0[Unit],
    breakFunction: js.Function0[Boolean]
  ): AsyncLoop = js.native
  def SyncAsyncForLoop(
    iterations: Double,
    syncedIterations: Double,
    fn: js.Function1[/* iteration */ Double, Unit],
    callback: js.Function0[Unit],
    breakFunction: js.Function0[Boolean],
    timeout: Double
  ): AsyncLoop = js.native
}
