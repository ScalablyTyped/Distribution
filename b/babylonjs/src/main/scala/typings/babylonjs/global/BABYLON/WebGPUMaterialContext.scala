package typings.babylonjs.global.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("BABYLON.WebGPUMaterialContext")
@js.native
open class WebGPUMaterialContext ()
  extends StObject
     with typings.babylonjs.BABYLON.WebGPUMaterialContext {
  
  /* CompleteClass */
  override def reset(): Unit = js.native
  
  /* CompleteClass */
  var uniqueId: Double = js.native
}
/* static members */
object WebGPUMaterialContext {
  
  @JSGlobal("BABYLON.WebGPUMaterialContext")
  @js.native
  val ^ : js.Any = js.native
  
  @JSGlobal("BABYLON.WebGPUMaterialContext._Counter")
  @js.native
  def _Counter: Any = js.native
  inline def _Counter_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_Counter")(x.asInstanceOf[js.Any])
}
