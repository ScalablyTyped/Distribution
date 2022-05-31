package typings.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AsyncLoop extends StObject {
  
  /* private */ var _done: js.Any
  
  /* private */ var _fn: js.Any
  
  /* private */ var _successCallback: js.Any
  
  /**
    * Break the loop and run the success callback.
    */
  def breakLoop(): Unit
  
  /**
    * Execute the next iteration. Must be called after the last iteration was finished.
    */
  def executeNext(): Unit
  
  /**
    * Defines the current index of the loop.
    */
  var index: Double
  
  /**
    * Defines the number of iterations for the loop
    */
  var iterations: Double
}
object AsyncLoop {
  
  inline def apply(
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
  
  extension [Self <: AsyncLoop](x: Self) {
    
    inline def setBreakLoop(value: () => Unit): Self = StObject.set(x, "breakLoop", js.Any.fromFunction0(value))
    
    inline def setExecuteNext(value: () => Unit): Self = StObject.set(x, "executeNext", js.Any.fromFunction0(value))
    
    inline def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    inline def setIterations(value: Double): Self = StObject.set(x, "iterations", value.asInstanceOf[js.Any])
    
    inline def set_done(value: js.Any): Self = StObject.set(x, "_done", value.asInstanceOf[js.Any])
    
    inline def set_fn(value: js.Any): Self = StObject.set(x, "_fn", value.asInstanceOf[js.Any])
    
    inline def set_successCallback(value: js.Any): Self = StObject.set(x, "_successCallback", value.asInstanceOf[js.Any])
  }
}
