package typings.babylonjs.legacyMod

import typings.babylonjs.anon.DragAxis
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
object PointerDragBehavior {
  
  @JSImport("babylonjs/Legacy/legacy", "PointerDragBehavior")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("babylonjs/Legacy/legacy", "PointerDragBehavior._AnyMouseID")
  @js.native
  def _AnyMouseID: js.Any = js.native
  inline def _AnyMouseID_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_AnyMouseID")(x.asInstanceOf[js.Any])
  
  @JSImport("babylonjs/Legacy/legacy", "PointerDragBehavior._planeScene")
  @js.native
  def _planeScene: js.Any = js.native
  inline def _planeScene_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_planeScene")(x.asInstanceOf[js.Any])
}
