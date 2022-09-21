package typings.babylonjs.enginesIndexMod

import typings.babylonjs.webgpuBufferManagerMod.WebGPUBufferManager
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs/Engines/index", "WebGPUDrawContext")
@js.native
open class WebGPUDrawContext protected ()
  extends typings.babylonjs.webgpuDrawContextMod.WebGPUDrawContext {
  def this(bufferManager: WebGPUBufferManager) = this()
}
/* static members */
object WebGPUDrawContext {
  
  @JSImport("babylonjs/Engines/index", "WebGPUDrawContext")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("babylonjs/Engines/index", "WebGPUDrawContext._Counter")
  @js.native
  def _Counter: Any = js.native
  inline def _Counter_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_Counter")(x.asInstanceOf[js.Any])
}
