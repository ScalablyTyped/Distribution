package typings.babylonjs.legacyMod

import typings.babylonjs.typesMod.Nullable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("babylonjs/Legacy/legacy", "PlaneRotationGizmo")
@js.native
class PlaneRotationGizmo protected ()
  extends typings.babylonjs.indexMod.PlaneRotationGizmo {
  /**
    * Creates a PlaneRotationGizmo
    * @param gizmoLayer The utility layer the gizmo will be added to
    * @param planeNormal The normal of the plane which the gizmo will be able to rotate on
    * @param color The color of the gizmo
    * @param tessellation Amount of tessellation to be used when creating rotation circles
    * @param useEulerRotation Use and update Euler angle instead of quaternion
    */
  def this(planeNormal: typings.babylonjs.mathVectorMod.Vector3) = this()
  def this(planeNormal: typings.babylonjs.mathVectorMod.Vector3, color: typings.babylonjs.mathColorMod.Color3) = this()
  def this(
    planeNormal: typings.babylonjs.mathVectorMod.Vector3,
    color: typings.babylonjs.mathColorMod.Color3,
    gizmoLayer: typings.babylonjs.utilityLayerRendererMod.UtilityLayerRenderer
  ) = this()
  def this(
    planeNormal: typings.babylonjs.mathVectorMod.Vector3,
    color: typings.babylonjs.mathColorMod.Color3,
    gizmoLayer: typings.babylonjs.utilityLayerRendererMod.UtilityLayerRenderer,
    tessellation: Double
  ) = this()
  def this(
    planeNormal: typings.babylonjs.mathVectorMod.Vector3,
    color: typings.babylonjs.mathColorMod.Color3,
    gizmoLayer: typings.babylonjs.utilityLayerRendererMod.UtilityLayerRenderer,
    tessellation: Double,
    parent: Nullable[typings.babylonjs.rotationGizmoMod.RotationGizmo]
  ) = this()
  def this(
    planeNormal: typings.babylonjs.mathVectorMod.Vector3,
    color: typings.babylonjs.mathColorMod.Color3,
    gizmoLayer: typings.babylonjs.utilityLayerRendererMod.UtilityLayerRenderer,
    tessellation: Double,
    parent: Nullable[typings.babylonjs.rotationGizmoMod.RotationGizmo],
    useEulerRotation: Boolean
  ) = this()
}

