package typings.babylonjs.BABYLON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AsyncLoop extends js.Object {
  
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
  
  @scala.inline
  implicit class AsyncLoopOps[Self <: AsyncLoop] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def set_done(value: js.Any): Self = this.set("_done", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_fn(value: js.Any): Self = this.set("_fn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_successCallback(value: js.Any): Self = this.set("_successCallback", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBreakLoop(value: () => Unit): Self = this.set("breakLoop", js.Any.fromFunction0(value))
    
    @scala.inline
    def setExecuteNext(value: () => Unit): Self = this.set("executeNext", js.Any.fromFunction0(value))
    
    @scala.inline
    def setIndex(value: Double): Self = this.set("index", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIterations(value: Double): Self = this.set("iterations", value.asInstanceOf[js.Any])
  }
}
