package typings.babylonjs.global.BABYLON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("BABYLON.OutlineRenderer")
@js.native
class OutlineRenderer protected ()
  extends typings.babylonjs.BABYLON.OutlineRenderer {
  /**
    * Instantiates a new outline renderer. (There could be only one per scene).
    * @param scene Defines the scene it belongs to
    */
  def this(scene: typings.babylonjs.BABYLON.Scene) = this()
}
/* static members */
@JSGlobal("BABYLON.OutlineRenderer")
@js.native
object OutlineRenderer extends js.Object {
  
  /**
    * Stencil value used to avoid outline being seen within the mesh when the mesh is transparent
    */
  var _StencilReference: js.Any = js.native
}
