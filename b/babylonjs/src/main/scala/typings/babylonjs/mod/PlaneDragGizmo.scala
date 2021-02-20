package typings.babylonjs.mod

import typings.babylonjs.typesMod.Nullable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs", "PlaneDragGizmo")
@js.native
class PlaneDragGizmo protected ()
  extends typings.babylonjs.legacyMod.PlaneDragGizmo {
  /**
    * Creates a PlaneDragGizmo
    * @param gizmoLayer The utility layer the gizmo will be added to
    * @param dragPlaneNormal The axis normal to which the gizmo will be able to drag on
    * @param color The color of the gizmo
    */
  def this(dragPlaneNormal: typings.babylonjs.mathVectorMod.Vector3) = this()
  def this(
    dragPlaneNormal: typings.babylonjs.mathVectorMod.Vector3,
    color: typings.babylonjs.mathColorMod.Color3
  ) = this()
  def this(
    dragPlaneNormal: typings.babylonjs.mathVectorMod.Vector3,
    color: js.UndefOr[scala.Nothing],
    gizmoLayer: typings.babylonjs.utilityLayerRendererMod.UtilityLayerRenderer
  ) = this()
  def this(
    dragPlaneNormal: typings.babylonjs.mathVectorMod.Vector3,
    color: typings.babylonjs.mathColorMod.Color3,
    gizmoLayer: typings.babylonjs.utilityLayerRendererMod.UtilityLayerRenderer
  ) = this()
  def this(
    dragPlaneNormal: typings.babylonjs.mathVectorMod.Vector3,
    color: js.UndefOr[scala.Nothing],
    gizmoLayer: js.UndefOr[scala.Nothing],
    parent: Nullable[typings.babylonjs.positionGizmoMod.PositionGizmo]
  ) = this()
  def this(
    dragPlaneNormal: typings.babylonjs.mathVectorMod.Vector3,
    color: js.UndefOr[scala.Nothing],
    gizmoLayer: typings.babylonjs.utilityLayerRendererMod.UtilityLayerRenderer,
    parent: Nullable[typings.babylonjs.positionGizmoMod.PositionGizmo]
  ) = this()
  def this(
    dragPlaneNormal: typings.babylonjs.mathVectorMod.Vector3,
    color: typings.babylonjs.mathColorMod.Color3,
    gizmoLayer: js.UndefOr[scala.Nothing],
    parent: Nullable[typings.babylonjs.positionGizmoMod.PositionGizmo]
  ) = this()
  def this(
    dragPlaneNormal: typings.babylonjs.mathVectorMod.Vector3,
    color: typings.babylonjs.mathColorMod.Color3,
    gizmoLayer: typings.babylonjs.utilityLayerRendererMod.UtilityLayerRenderer,
    parent: Nullable[typings.babylonjs.positionGizmoMod.PositionGizmo]
  ) = this()
}
/* static members */
object PlaneDragGizmo {
  
  /** @hidden */
  @JSImport("babylonjs", "PlaneDragGizmo._CreatePlane")
  @js.native
  def _CreatePlane(
    scene: typings.babylonjs.sceneMod.Scene,
    material: typings.babylonjs.standardMaterialMod.StandardMaterial
  ): typings.babylonjs.transformNodeMod.TransformNode = js.native
}
