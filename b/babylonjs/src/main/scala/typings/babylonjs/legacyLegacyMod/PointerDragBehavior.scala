package typings.babylonjs.legacyLegacyMod

import typings.babylonjs.anon.DragAxis
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs/Legacy/legacy", "PointerDragBehavior")
@js.native
/**
  * Creates a pointer drag behavior that can be attached to a mesh
  * @param options The drag axis or normal of the plane that will be dragged across. If no options are specified the drag plane will always face the ray's origin (eg. camera)
  * @param options.dragAxis
  * @param options.dragPlaneNormal
  */
open class PointerDragBehavior ()
  extends typings.babylonjs.indexMod.PointerDragBehavior {
  def this(options: DragAxis) = this()
}
/* static members */
object PointerDragBehavior {
  
  @JSImport("babylonjs/Legacy/legacy", "PointerDragBehavior")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("babylonjs/Legacy/legacy", "PointerDragBehavior._AnyMouseId")
  @js.native
  def _AnyMouseId: Any = js.native
  inline def _AnyMouseId_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_AnyMouseId")(x.asInstanceOf[js.Any])
  
  @JSImport("babylonjs/Legacy/legacy", "PointerDragBehavior._PlaneScene")
  @js.native
  def _PlaneScene: Any = js.native
  inline def _PlaneScene_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_PlaneScene")(x.asInstanceOf[js.Any])
}
