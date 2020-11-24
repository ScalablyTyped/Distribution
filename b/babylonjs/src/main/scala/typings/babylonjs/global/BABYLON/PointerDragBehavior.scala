package typings.babylonjs.global.BABYLON

import typings.babylonjs.anon.DragAxisDragPlaneNormal
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("BABYLON.PointerDragBehavior")
@js.native
/**
  * Creates a pointer drag behavior that can be attached to a mesh
  * @param options The drag axis or normal of the plane that will be dragged across. If no options are specified the drag plane will always face the ray's origin (eg. camera)
  */
class PointerDragBehavior ()
  extends typings.babylonjs.BABYLON.PointerDragBehavior {
  def this(options: DragAxisDragPlaneNormal) = this()
}
/* static members */
@JSGlobal("BABYLON.PointerDragBehavior")
@js.native
object PointerDragBehavior extends js.Object {
  
  var _AnyMouseID: js.Any = js.native
  
  var _planeScene: js.Any = js.native
}
