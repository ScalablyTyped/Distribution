package typings.babylonjs.global.BABYLON

import typings.babylonjs.GPUCommandEncoder
import typings.babylonjs.GPUDevice
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("BABYLON.WebGPUDurationMeasure")
@js.native
open class WebGPUDurationMeasure protected ()
  extends StObject
     with typings.babylonjs.BABYLON.WebGPUDurationMeasure {
  def this(device: GPUDevice, bufferManager: typings.babylonjs.BABYLON.WebGPUBufferManager) = this()
  
  /* private */ /* CompleteClass */
  var _querySet: Any = js.native
  
  /* CompleteClass */
  override def dispose(): Unit = js.native
  
  /* CompleteClass */
  override def start(encoder: GPUCommandEncoder): Unit = js.native
  
  /* CompleteClass */
  override def stop(encoder: GPUCommandEncoder): js.Promise[Double | Null] = js.native
}
