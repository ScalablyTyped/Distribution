package typings.babylonjs.legacyMod

import typings.babylonjs.anon.DragAxis
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("babylonjs/Legacy/legacy", "PointerDragBehavior")
@js.native
/**
  * Creates a pointer drag behavior that can be attached to a mesh
  * @param options The drag axis or normal of the plane that will be dragged across. If no options are specified the drag plane will always face the ray's origin (eg. camera)
  */
class PointerDragBehavior ()
  extends typings.babylonjs.indexMod.PointerDragBehavior {
  def this(options: DragAxis) = this()
}

/* static members */
@JSImport("babylonjs/Legacy/legacy", "PointerDragBehavior")
@js.native
object PointerDragBehavior extends js.Object {
  var _AnyMouseID: js.Any = js.native
  var _planeScene: js.Any = js.native
}

