package typings.babylonjs.global.BABYLON

import typings.babylonjs.anon.DragAxisDragPlaneNormal
import org.scalablytyped.runtime.StObject
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
object PointerDragBehavior {
  
  @JSGlobal("BABYLON.PointerDragBehavior")
  @js.native
  val ^ : js.Any = js.native
  
  @JSGlobal("BABYLON.PointerDragBehavior._AnyMouseID")
  @js.native
  def _AnyMouseID: js.Any = js.native
  @scala.inline
  def _AnyMouseID_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_AnyMouseID")(x.asInstanceOf[js.Any])
  
  @JSGlobal("BABYLON.PointerDragBehavior._planeScene")
  @js.native
  def _planeScene: js.Any = js.native
  @scala.inline
  def _planeScene_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_planeScene")(x.asInstanceOf[js.Any])
}
