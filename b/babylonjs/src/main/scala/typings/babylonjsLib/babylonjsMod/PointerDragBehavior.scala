package typings
package babylonjsLib.babylonjsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A behavior that when attached to a mesh will allow the mesh to be dragged around the screen based on pointer events
  */
@JSImport("babylonjs", "PointerDragBehavior")
@js.native
/**
  * Creates a pointer drag behavior that can be attached to a mesh
  * @param options The drag axis or normal of the plane that will be dragged across. If no options are specified the drag plane will always face the ray's origin (eg. camera)
  */
class PointerDragBehavior ()
  extends babylonjsLib.BABYLONNs.PointerDragBehavior {
  def this(options: babylonjsLib.Anon_DragAxis) = this()
}

/**
  * A behavior that when attached to a mesh will allow the mesh to be dragged around the screen based on pointer events
  */
@JSImport("babylonjs", "PointerDragBehavior")
@js.native
object PointerDragBehavior extends js.Object {
  var _AnyMouseID: js.Any = js.native
  var _planeScene: js.Any = js.native
}

