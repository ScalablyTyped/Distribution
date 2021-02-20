package typings.babylonjs.global.BABYLON

import typings.babylonjs.BABYLON.Nullable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("BABYLON.PlaneRotationGizmo")
@js.native
class PlaneRotationGizmo protected ()
  extends typings.babylonjs.BABYLON.PlaneRotationGizmo {
  /**
    * Creates a PlaneRotationGizmo
    * @param gizmoLayer The utility layer the gizmo will be added to
    * @param planeNormal The normal of the plane which the gizmo will be able to rotate on
    * @param color The color of the gizmo
    * @param tessellation Amount of tessellation to be used when creating rotation circles
    * @param useEulerRotation Use and update Euler angle instead of quaternion
    * @param thickness display gizmo axis thickness
    */
  def this(
    planeNormal: typings.babylonjs.BABYLON.Vector3,
    color: js.UndefOr[typings.babylonjs.BABYLON.Color3],
    gizmoLayer: js.UndefOr[typings.babylonjs.BABYLON.UtilityLayerRenderer],
    tessellation: js.UndefOr[Double],
    parent: js.UndefOr[Nullable[typings.babylonjs.BABYLON.RotationGizmo]],
    useEulerRotation: js.UndefOr[Boolean],
    thickness: js.UndefOr[Double]
  ) = this()
}
/* static members */
object PlaneRotationGizmo {
  
  @JSGlobal("BABYLON.PlaneRotationGizmo")
  @js.native
  val ^ : js.Any = js.native
  
  @JSGlobal("BABYLON.PlaneRotationGizmo._CircleConstants")
  @js.native
  def _CircleConstants: js.Any = js.native
  @scala.inline
  def _CircleConstants_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_CircleConstants")(x.asInstanceOf[js.Any])
}
