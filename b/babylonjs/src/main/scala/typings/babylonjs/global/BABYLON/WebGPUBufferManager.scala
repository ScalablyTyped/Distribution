package typings.babylonjs.global.BABYLON

import typings.babylonjs.GPUDevice
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("BABYLON.WebGPUBufferManager")
@js.native
open class WebGPUBufferManager protected ()
  extends StObject
     with typings.babylonjs.BABYLON.WebGPUBufferManager {
  def this(device: GPUDevice) = this()
}
/* static members */
object WebGPUBufferManager {
  
  @JSGlobal("BABYLON.WebGPUBufferManager")
  @js.native
  val ^ : js.Any = js.native
  
  @JSGlobal("BABYLON.WebGPUBufferManager._IsGPUBuffer")
  @js.native
  def _IsGPUBuffer: Any = js.native
  inline def _IsGPUBuffer_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_IsGPUBuffer")(x.asInstanceOf[js.Any])
}
