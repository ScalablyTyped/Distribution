package typings.babylonjs.BABYLON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AsyncLoop extends js.Object {
  var _done: js.Any
  var _fn: js.Any
  var _successCallback: js.Any
  /**
    * Defines the current index of the loop.
    */
  var index: Double
  /**
    * Defines the number of iterations for the loop
    */
  var iterations: Double
  /**
    * Break the loop and run the success callback.
    */
  def breakLoop(): Unit
  /**
    * Execute the next iteration. Must be called after the last iteration was finished.
    */
  def executeNext(): Unit
}

object AsyncLoop {
  @scala.inline
  def apply(
    _done: js.Any,
    _fn: js.Any,
    _successCallback: js.Any,
    breakLoop: () => Unit,
    executeNext: () => Unit,
    index: Double,
    iterations: Double
  ): AsyncLoop = {
    val __obj = js.Dynamic.literal(_done = _done.asInstanceOf[js.Any], _fn = _fn.asInstanceOf[js.Any], _successCallback = _successCallback.asInstanceOf[js.Any], breakLoop = js.Any.fromFunction0(breakLoop), executeNext = js.Any.fromFunction0(executeNext), index = index.asInstanceOf[js.Any], iterations = iterations.asInstanceOf[js.Any])
    __obj.asInstanceOf[AsyncLoop]
  }
}

