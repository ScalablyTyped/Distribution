package typings.babylonjs

import typings.babylonjs.perfCounterMod.PerfCounter
import typings.babylonjs.webgpuBufferManagerMod.WebGPUBufferManager
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object webgpuTimestampQueryMod {
  
  @JSImport("babylonjs/Engines/WebGPU/webgpuTimestampQuery", "WebGPUDurationMeasure")
  @js.native
  open class WebGPUDurationMeasure protected () extends StObject {
    def this(device: GPUDevice, bufferManager: WebGPUBufferManager) = this()
    
    /* private */ var _querySet: Any = js.native
    
    def dispose(): Unit = js.native
    
    def start(encoder: GPUCommandEncoder): Unit = js.native
    
    def stop(encoder: GPUCommandEncoder): js.Promise[Double | Null] = js.native
  }
  
  @JSImport("babylonjs/Engines/WebGPU/webgpuTimestampQuery", "WebGPUTimestampQuery")
  @js.native
  open class WebGPUTimestampQuery protected () extends StObject {
    def this(device: GPUDevice, bufferManager: WebGPUBufferManager) = this()
    
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
}
