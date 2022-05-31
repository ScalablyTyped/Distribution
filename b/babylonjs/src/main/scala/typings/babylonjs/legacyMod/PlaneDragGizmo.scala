package typings.babylonjs.legacyMod

import typings.babylonjs.typesMod.Nullable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs/Legacy/legacy", "PlaneDragGizmo")
@js.native
class PlaneDragGizmo protected ()
  extends typings.babylonjs.indexMod.PlaneDragGizmo {
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
    color: Unit,
    gizmoLayer: typings.babylonjs.utilityLayerRendererMod.UtilityLayerRenderer
  ) = this()
  def this(
    dragPlaneNormal: typings.babylonjs.mathVectorMod.Vector3,
    color: typings.babylonjs.mathColorMod.Color3,
    gizmoLayer: typings.babylonjs.utilityLayerRendererMod.UtilityLayerRenderer
  ) = this()
  def this(
    dragPlaneNormal: typings.babylonjs.mathVectorMod.Vector3,
    color: Unit,
    gizmoLayer: Unit,
    parent: Nullable[typings.babylonjs.positionGizmoMod.PositionGizmo]
  ) = this()
  def this(
    dragPlaneNormal: typings.babylonjs.mathVectorMod.Vector3,
    color: Unit,
    gizmoLayer: typings.babylonjs.utilityLayerRendererMod.UtilityLayerRenderer,
    parent: Nullable[typings.babylonjs.positionGizmoMod.PositionGizmo]
  ) = this()
  def this(
    dragPlaneNormal: typings.babylonjs.mathVectorMod.Vector3,
    color: typings.babylonjs.mathColorMod.Color3,
    gizmoLayer: Unit,
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
  
  @JSImport("babylonjs/Legacy/legacy", "PlaneDragGizmo")
  @js.native
  val ^ : js.Any = js.native
  
  /** @hidden */
  inline def _CreatePlane(
    scene: typings.babylonjs.sceneMod.Scene,
    material: typings.babylonjs.standardMaterialMod.StandardMaterial
  ): typings.babylonjs.transformNodeMod.TransformNode = (^.asInstanceOf[js.Dynamic].applyDynamic("_CreatePlane")(scene.asInstanceOf[js.Any], material.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.transformNodeMod.TransformNode]
}
