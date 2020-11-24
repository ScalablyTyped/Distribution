package typings.babylonjs.legacyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs/Legacy/legacy", "PrePassRenderer")
@js.native
class PrePassRenderer protected ()
  extends typings.babylonjs.indexMod.PrePassRenderer {
  /**
    * Instanciates a prepass renderer
    * @param scene The scene
    */
  def this(scene: typings.babylonjs.sceneMod.Scene) = this()
}
/* static members */
@JSImport("babylonjs/Legacy/legacy", "PrePassRenderer")
@js.native
object PrePassRenderer extends js.Object {
  
  /** @hidden */
  def _SceneComponentInitialization(scene: typings.babylonjs.sceneMod.Scene): Unit = js.native
}
