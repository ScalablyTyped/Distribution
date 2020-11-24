package typings.babylonjs.mod

import typings.babylonjs.anon.DragAxis
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs", "PointerDragBehavior")
@js.native
/**
  * Creates a pointer drag behavior that can be attached to a mesh
  * @param options The drag axis or normal of the plane that will be dragged across. If no options are specified the drag plane will always face the ray's origin (eg. camera)
  */
class PointerDragBehavior ()
  extends typings.babylonjs.legacyMod.PointerDragBehavior {
  def this(options: DragAxis) = this()
}
/* static members */
@JSImport("babylonjs", "PointerDragBehavior")
@js.native
object PointerDragBehavior extends js.Object {
  
  var _AnyMouseID: js.Any = js.native
  
  var _planeScene: js.Any = js.native
}
