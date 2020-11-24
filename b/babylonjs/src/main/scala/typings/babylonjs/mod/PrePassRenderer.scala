package typings.babylonjs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs", "PrePassRenderer")
@js.native
class PrePassRenderer protected ()
  extends typings.babylonjs.legacyMod.PrePassRenderer {
  /**
    * Instanciates a prepass renderer
    * @param scene The scene
    */
  def this(scene: typings.babylonjs.sceneMod.Scene) = this()
}
/* static members */
@JSImport("babylonjs", "PrePassRenderer")
@js.native
object PrePassRenderer extends js.Object {
  
  /** @hidden */
  def _SceneComponentInitialization(scene: typings.babylonjs.sceneMod.Scene): Unit = js.native
}
