package typings.babylonjs

import typings.babylonjs.dataBufferMod.DataBuffer
import typings.std.WebGLBuffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object webGLDataBufferMod {
  
  @JSImport("babylonjs/Meshes/WebGL/webGLDataBuffer", "WebGLDataBuffer")
  @js.native
  open class WebGLDataBuffer protected () extends DataBuffer {
    def this(resource: WebGLBuffer) = this()
    
    /* private */ var _buffer: Any = js.native
  }
}
