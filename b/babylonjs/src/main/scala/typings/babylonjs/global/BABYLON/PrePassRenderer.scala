package typings.babylonjs.global.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("BABYLON.PrePassRenderer")
@js.native
class PrePassRenderer protected ()
  extends StObject
     with typings.babylonjs.BABYLON.PrePassRenderer {
  /**
    * Instanciates a prepass renderer
    * @param scene The scene
    */
  def this(scene: typings.babylonjs.BABYLON.Scene) = this()
}
/* static members */
object PrePassRenderer {
  
  @JSGlobal("BABYLON.PrePassRenderer")
  @js.native
  val ^ : js.Any = js.native
  
  /** @hidden */
  inline def _SceneComponentInitialization(scene: typings.babylonjs.BABYLON.Scene): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("_SceneComponentInitialization")(scene.asInstanceOf[js.Any]).asInstanceOf[Unit]
}
