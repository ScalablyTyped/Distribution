package typings.babylonjs.mod

import typings.babylonjs.typesMod.Nullable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs", "PlaneRotationGizmo")
@js.native
open class PlaneRotationGizmo protected ()
  extends typings.babylonjs.legacyLegacyMod.PlaneRotationGizmo {
  /**
    * Creates a PlaneRotationGizmo
    * @param planeNormal The normal of the plane which the gizmo will be able to rotate on
    * @param color The color of the gizmo
    * @param gizmoLayer The utility layer the gizmo will be added to
    * @param tessellation Amount of tessellation to be used when creating rotation circles
    * @param parent
    * @param useEulerRotation Use and update Euler angle instead of quaternion
    * @param thickness display gizmo axis thickness
    */
  def this(
    planeNormal: typings.babylonjs.mathsMathDotvectorMod.Vector3,
    color: js.UndefOr[typings.babylonjs.mathsMathDotcolorMod.Color3],
    gizmoLayer: js.UndefOr[typings.babylonjs.renderingUtilityLayerRendererMod.UtilityLayerRenderer],
    tessellation: js.UndefOr[Double],
    parent: js.UndefOr[Nullable[typings.babylonjs.gizmosRotationGizmoMod.RotationGizmo]],
    useEulerRotation: js.UndefOr[Boolean],
    thickness: js.UndefOr[Double]
  ) = this()
}
/* static members */
object PlaneRotationGizmo {
  
  @JSImport("babylonjs", "PlaneRotationGizmo")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * The maximum angle between the camera and the rotation allowed for interaction
    * If a rotation plane appears 'flat', a lower value allows interaction.
    */
  @JSImport("babylonjs", "PlaneRotationGizmo.MaxDragAngle")
  @js.native
  def MaxDragAngle: Double = js.native
  inline def MaxDragAngle_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MaxDragAngle")(x.asInstanceOf[js.Any])
  
  @JSImport("babylonjs", "PlaneRotationGizmo._RotationGizmoFragmentShader")
  @js.native
  def _RotationGizmoFragmentShader: String = js.native
  inline def _RotationGizmoFragmentShader_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_RotationGizmoFragmentShader")(x.asInstanceOf[js.Any])
  
  @JSImport("babylonjs", "PlaneRotationGizmo._RotationGizmoVertexShader")
  @js.native
  def _RotationGizmoVertexShader: String = js.native
  inline def _RotationGizmoVertexShader_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_RotationGizmoVertexShader")(x.asInstanceOf[js.Any])
}
