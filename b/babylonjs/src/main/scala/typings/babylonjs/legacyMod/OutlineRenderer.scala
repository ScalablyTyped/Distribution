package typings.babylonjs.legacyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs/Legacy/legacy", "OutlineRenderer")
@js.native
class OutlineRenderer protected ()
  extends typings.babylonjs.indexMod.OutlineRenderer {
  /**
    * Instantiates a new outline renderer. (There could be only one per scene).
    * @param scene Defines the scene it belongs to
    */
  def this(scene: typings.babylonjs.sceneMod.Scene) = this()
}
/* static members */
@JSImport("babylonjs/Legacy/legacy", "OutlineRenderer")
@js.native
object OutlineRenderer extends js.Object {
  
  /**
    * Stencil value used to avoid outline being seen within the mesh when the mesh is transparent
    */
  var _StencilReference: js.Any = js.native
}
