package typings.babylonjs.legacyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs/Legacy/legacy", "AsyncLoop")
@js.native
class AsyncLoop protected ()
  extends typings.babylonjs.indexMod.AsyncLoop {
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
    func: js.Function1[/* asyncLoop */ typings.babylonjs.toolsMod.AsyncLoop, Unit],
    successCallback: js.Function0[Unit]
  ) = this()
  def this(
    /**
    * Defines the number of iterations for the loop
    */
  iterations: Double,
    func: js.Function1[/* asyncLoop */ typings.babylonjs.toolsMod.AsyncLoop, Unit],
    successCallback: js.Function0[Unit],
    offset: Double
  ) = this()
}
/* static members */
object AsyncLoop {
  
  @JSImport("babylonjs/Legacy/legacy", "AsyncLoop")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Create and run an async loop.
    * @param iterations the number of iterations.
    * @param fn the function to run each iteration
    * @param successCallback the callback that will be called upon succesful execution
    * @param offset starting offset.
    * @returns the created async loop object
    */
  inline def Run(
    iterations: Double,
    fn: js.Function1[/* asyncLoop */ this.type, Unit],
    successCallback: js.Function0[Unit]
  ): typings.babylonjs.toolsMod.AsyncLoop = (^.asInstanceOf[js.Dynamic].applyDynamic("Run")(iterations.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], successCallback.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.toolsMod.AsyncLoop]
  inline def Run(
    iterations: Double,
    fn: js.Function1[/* asyncLoop */ this.type, Unit],
    successCallback: js.Function0[Unit],
    offset: Double
  ): typings.babylonjs.toolsMod.AsyncLoop = (^.asInstanceOf[js.Dynamic].applyDynamic("Run")(iterations.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], successCallback.asInstanceOf[js.Any], offset.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.toolsMod.AsyncLoop]
  
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
  inline def SyncAsyncForLoop(
    iterations: Double,
    syncedIterations: Double,
    fn: js.Function1[/* iteration */ Double, Unit],
    callback: js.Function0[Unit]
  ): typings.babylonjs.toolsMod.AsyncLoop = (^.asInstanceOf[js.Dynamic].applyDynamic("SyncAsyncForLoop")(iterations.asInstanceOf[js.Any], syncedIterations.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.toolsMod.AsyncLoop]
  inline def SyncAsyncForLoop(
    iterations: Double,
    syncedIterations: Double,
    fn: js.Function1[/* iteration */ Double, Unit],
    callback: js.Function0[Unit],
    breakFunction: js.Function0[Boolean]
  ): typings.babylonjs.toolsMod.AsyncLoop = (^.asInstanceOf[js.Dynamic].applyDynamic("SyncAsyncForLoop")(iterations.asInstanceOf[js.Any], syncedIterations.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], breakFunction.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.toolsMod.AsyncLoop]
  inline def SyncAsyncForLoop(
    iterations: Double,
    syncedIterations: Double,
    fn: js.Function1[/* iteration */ Double, Unit],
    callback: js.Function0[Unit],
    breakFunction: js.Function0[Boolean],
    timeout: Double
  ): typings.babylonjs.toolsMod.AsyncLoop = (^.asInstanceOf[js.Dynamic].applyDynamic("SyncAsyncForLoop")(iterations.asInstanceOf[js.Any], syncedIterations.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], breakFunction.asInstanceOf[js.Any], timeout.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.toolsMod.AsyncLoop]
  inline def SyncAsyncForLoop(
    iterations: Double,
    syncedIterations: Double,
    fn: js.Function1[/* iteration */ Double, Unit],
    callback: js.Function0[Unit],
    breakFunction: Unit,
    timeout: Double
  ): typings.babylonjs.toolsMod.AsyncLoop = (^.asInstanceOf[js.Dynamic].applyDynamic("SyncAsyncForLoop")(iterations.asInstanceOf[js.Any], syncedIterations.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], breakFunction.asInstanceOf[js.Any], timeout.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.toolsMod.AsyncLoop]
}
