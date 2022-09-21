package typings.babylonjs.indexMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs/index", "TargetCamera")
@js.native
open class TargetCamera protected ()
  extends typings.babylonjs.babylonjsMod.TargetCamera {
  /**
    * Instantiates a target camera that takes a mesh or position as a target and continues to look at it while it moves.
    * This is the base of the follow, arc rotate cameras and Free camera
    * @see https://doc.babylonjs.com/features/cameras
    * @param name Defines the name of the camera in the scene
    * @param position Defines the start position of the camera in the scene
    * @param scene Defines the scene the camera belongs to
    * @param setActiveOnSceneIfNoneActive Defines whether the camera should be marked as active if not other active cameras have been defined
    */
  def this(name: String, position: typings.babylonjs.mathVectorMod.Vector3) = this()
  def this(
    name: String,
    position: typings.babylonjs.mathVectorMod.Vector3,
    scene: typings.babylonjs.sceneMod.Scene
  ) = this()
  def this(
    name: String,
    position: typings.babylonjs.mathVectorMod.Vector3,
    scene: Unit,
    setActiveOnSceneIfNoneActive: Boolean
  ) = this()
  def this(
    name: String,
    position: typings.babylonjs.mathVectorMod.Vector3,
    scene: typings.babylonjs.sceneMod.Scene,
    setActiveOnSceneIfNoneActive: Boolean
  ) = this()
}
/* static members */
object TargetCamera {
  
  @JSImport("babylonjs/index", "TargetCamera")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("babylonjs/index", "TargetCamera._RigCamTransformMatrix")
  @js.native
  def _RigCamTransformMatrix: Any = js.native
  inline def _RigCamTransformMatrix_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_RigCamTransformMatrix")(x.asInstanceOf[js.Any])
  
  @JSImport("babylonjs/index", "TargetCamera._TargetFocalPoint")
  @js.native
  def _TargetFocalPoint: Any = js.native
  inline def _TargetFocalPoint_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_TargetFocalPoint")(x.asInstanceOf[js.Any])
  
  @JSImport("babylonjs/index", "TargetCamera._TargetTransformMatrix")
  @js.native
  def _TargetTransformMatrix: Any = js.native
  inline def _TargetTransformMatrix_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_TargetTransformMatrix")(x.asInstanceOf[js.Any])
}
