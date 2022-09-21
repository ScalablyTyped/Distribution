package typings.babylonjs.global.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("BABYLON.WebGPUDrawContext")
@js.native
open class WebGPUDrawContext protected ()
  extends StObject
     with typings.babylonjs.BABYLON.WebGPUDrawContext {
  def this(bufferManager: typings.babylonjs.BABYLON.WebGPUBufferManager) = this()
  
  /* CompleteClass */
  override def dispose(): Unit = js.native
  
  /* CompleteClass */
  override def reset(): Unit = js.native
  
  /* CompleteClass */
  var uniqueId: Double = js.native
  
  /* CompleteClass */
  var useInstancing: Boolean = js.native
}
/* static members */
object WebGPUDrawContext {
  
  @JSGlobal("BABYLON.WebGPUDrawContext")
  @js.native
  val ^ : js.Any = js.native
  
  @JSGlobal("BABYLON.WebGPUDrawContext._Counter")
  @js.native
  def _Counter: Any = js.native
  inline def _Counter_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_Counter")(x.asInstanceOf[js.Any])
}
