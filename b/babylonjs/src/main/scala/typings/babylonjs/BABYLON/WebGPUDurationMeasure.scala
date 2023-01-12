package typings.babylonjs.BABYLON

import typings.babylonjs.GPUCommandEncoder
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WebGPUDurationMeasure extends StObject {
  
  /* private */ var _querySet: Any
  
  def dispose(): Unit
  
  def start(encoder: GPUCommandEncoder): Unit
  
  def stop(encoder: GPUCommandEncoder): js.Promise[Double | Null]
}
object WebGPUDurationMeasure {
  
  inline def apply(
    _querySet: Any,
    dispose: () => Unit,
    start: GPUCommandEncoder => Unit,
    stop: GPUCommandEncoder => js.Promise[Double | Null]
  ): WebGPUDurationMeasure = {
    val __obj = js.Dynamic.literal(_querySet = _querySet.asInstanceOf[js.Any], dispose = js.Any.fromFunction0(dispose), start = js.Any.fromFunction1(start), stop = js.Any.fromFunction1(stop))
    __obj.asInstanceOf[WebGPUDurationMeasure]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: WebGPUDurationMeasure] (val x: Self) extends AnyVal {
    
    inline def setDispose(value: () => Unit): Self = StObject.set(x, "dispose", js.Any.fromFunction0(value))
    
    inline def setStart(value: GPUCommandEncoder => Unit): Self = StObject.set(x, "start", js.Any.fromFunction1(value))
    
    inline def setStop(value: GPUCommandEncoder => js.Promise[Double | Null]): Self = StObject.set(x, "stop", js.Any.fromFunction1(value))
    
    inline def set_querySet(value: Any): Self = StObject.set(x, "_querySet", value.asInstanceOf[js.Any])
  }
}
