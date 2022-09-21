package typings.babylonjs

import typings.babylonjs.dataBufferMod.DataBuffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object webgpuDataBufferMod {
  
  @JSImport("babylonjs/Meshes/WebGPU/webgpuDataBuffer", "WebGPUDataBuffer")
  @js.native
  open class WebGPUDataBuffer protected () extends DataBuffer {
    def this(resource: GPUBuffer) = this()
    
    /* private */ var _buffer: Any = js.native
  }
}
