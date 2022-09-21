package typings.babylonjs.BABYLON

import typings.babylonjs.GPUCommandEncoder
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WebGPUTimestampQuery extends StObject {
  
  /* private */ var _bufferManager: Any = js.native
  
  /* private */ var _device: Any = js.native
  
  /* private */ var _enabled: Any = js.native
  
  /* private */ var _gpuFrameTimeCounter: Any = js.native
  
  /* private */ var _measureDuration: Any = js.native
  
  /* private */ var _measureDurationState: Any = js.native
  
  def enable: Boolean = js.native
  def enable_=(value: Boolean): Unit = js.native
  
  def endFrame(commandEncoder: GPUCommandEncoder): Unit = js.native
  
  def gpuFrameTimeCounter: PerfCounter = js.native
  
  def startFrame(commandEncoder: GPUCommandEncoder): Unit = js.native
}
