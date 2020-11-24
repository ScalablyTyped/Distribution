package typings.babylonjs.renderingIndexMod

import typings.babylonjs.sceneMod.Scene
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs/Rendering/index", "PrePassRenderer")
@js.native
class PrePassRenderer protected ()
  extends typings.babylonjs.prePassRendererMod.PrePassRenderer {
  /**
    * Instanciates a prepass renderer
    * @param scene The scene
    */
  def this(scene: Scene) = this()
}
/* static members */
@JSImport("babylonjs/Rendering/index", "PrePassRenderer")
@js.native
object PrePassRenderer extends js.Object {
  
  /** @hidden */
  def _SceneComponentInitialization(scene: Scene): Unit = js.native
}
