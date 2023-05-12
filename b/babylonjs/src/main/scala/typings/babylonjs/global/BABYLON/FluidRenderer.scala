package typings.babylonjs.global.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("BABYLON.FluidRenderer")
@js.native
open class FluidRenderer protected ()
  extends StObject
     with typings.babylonjs.BABYLON.FluidRenderer {
  /**
    * Initializes the class
    * @param scene Scene in which the objects are part of
    */
  def this(scene: typings.babylonjs.BABYLON.Scene) = this()
}
/* static members */
object FluidRenderer {
  
  @JSGlobal("BABYLON.FluidRenderer")
  @js.native
  val ^ : js.Any = js.native
  
  /** @internal */
  inline def _SceneComponentInitialization(scene: typings.babylonjs.BABYLON.Scene): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("_SceneComponentInitialization")(scene.asInstanceOf[js.Any]).asInstanceOf[Unit]
}
