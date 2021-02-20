package typings.babylonjs.global.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("BABYLON.TargetCamera")
@js.native
class TargetCamera protected ()
  extends typings.babylonjs.BABYLON.TargetCamera {
  /**
    * Instantiates a target camera that takes a mesh or position as a target and continues to look at it while it moves.
    * This is the base of the follow, arc rotate cameras and Free camera
    * @see https://doc.babylonjs.com/features/cameras
    * @param name Defines the name of the camera in the scene
    * @param position Defines the start position of the camera in the scene
    * @param scene Defines the scene the camera belongs to
    * @param setActiveOnSceneIfNoneActive Defines wheter the camera should be marked as active if not other active cameras have been defined
    */
  def this(name: String, position: typings.babylonjs.BABYLON.Vector3, scene: typings.babylonjs.BABYLON.Scene) = this()
  def this(
    name: String,
    position: typings.babylonjs.BABYLON.Vector3,
    scene: typings.babylonjs.BABYLON.Scene,
    setActiveOnSceneIfNoneActive: Boolean
  ) = this()
}
/* static members */
object TargetCamera {
  
  @JSGlobal("BABYLON.TargetCamera")
  @js.native
  val ^ : js.Any = js.native
  
  @JSGlobal("BABYLON.TargetCamera._RigCamTransformMatrix")
  @js.native
  def _RigCamTransformMatrix: js.Any = js.native
  @scala.inline
  def _RigCamTransformMatrix_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_RigCamTransformMatrix")(x.asInstanceOf[js.Any])
  
  @JSGlobal("BABYLON.TargetCamera._TargetFocalPoint")
  @js.native
  def _TargetFocalPoint: js.Any = js.native
  @scala.inline
  def _TargetFocalPoint_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_TargetFocalPoint")(x.asInstanceOf[js.Any])
  
  @JSGlobal("BABYLON.TargetCamera._TargetTransformMatrix")
  @js.native
  def _TargetTransformMatrix: js.Any = js.native
  @scala.inline
  def _TargetTransformMatrix_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_TargetTransformMatrix")(x.asInstanceOf[js.Any])
}
