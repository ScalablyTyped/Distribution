package typings.babylonjs.mod

import typings.babylonjs.typesMod.Nullable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs", "AxisDragGizmo")
@js.native
class AxisDragGizmo protected ()
  extends typings.babylonjs.legacyMod.AxisDragGizmo {
  /**
    * Creates an AxisDragGizmo
    * @param gizmoLayer The utility layer the gizmo will be added to
    * @param dragAxis The axis which the gizmo will be able to drag on
    * @param color The color of the gizmo
    * @param thickness display gizmo axis thickness
    */
  def this(dragAxis: typings.babylonjs.mathVectorMod.Vector3) = this()
  def this(dragAxis: typings.babylonjs.mathVectorMod.Vector3, color: typings.babylonjs.mathColorMod.Color3) = this()
  def this(
    dragAxis: typings.babylonjs.mathVectorMod.Vector3,
    color: Unit,
    gizmoLayer: typings.babylonjs.utilityLayerRendererMod.UtilityLayerRenderer
  ) = this()
  def this(
    dragAxis: typings.babylonjs.mathVectorMod.Vector3,
    color: typings.babylonjs.mathColorMod.Color3,
    gizmoLayer: typings.babylonjs.utilityLayerRendererMod.UtilityLayerRenderer
  ) = this()
  def this(
    dragAxis: typings.babylonjs.mathVectorMod.Vector3,
    color: Unit,
    gizmoLayer: Unit,
    parent: Nullable[typings.babylonjs.positionGizmoMod.PositionGizmo]
  ) = this()
  def this(
    dragAxis: typings.babylonjs.mathVectorMod.Vector3,
    color: Unit,
    gizmoLayer: typings.babylonjs.utilityLayerRendererMod.UtilityLayerRenderer,
    parent: Nullable[typings.babylonjs.positionGizmoMod.PositionGizmo]
  ) = this()
  def this(
    dragAxis: typings.babylonjs.mathVectorMod.Vector3,
    color: typings.babylonjs.mathColorMod.Color3,
    gizmoLayer: Unit,
    parent: Nullable[typings.babylonjs.positionGizmoMod.PositionGizmo]
  ) = this()
  def this(
    dragAxis: typings.babylonjs.mathVectorMod.Vector3,
    color: typings.babylonjs.mathColorMod.Color3,
    gizmoLayer: typings.babylonjs.utilityLayerRendererMod.UtilityLayerRenderer,
    parent: Nullable[typings.babylonjs.positionGizmoMod.PositionGizmo]
  ) = this()
  def this(
    dragAxis: typings.babylonjs.mathVectorMod.Vector3,
    color: Unit,
    gizmoLayer: Unit,
    parent: Unit,
    thickness: Double
  ) = this()
  def this(
    dragAxis: typings.babylonjs.mathVectorMod.Vector3,
    color: Unit,
    gizmoLayer: Unit,
    parent: Nullable[typings.babylonjs.positionGizmoMod.PositionGizmo],
    thickness: Double
  ) = this()
  def this(
    dragAxis: typings.babylonjs.mathVectorMod.Vector3,
    color: Unit,
    gizmoLayer: typings.babylonjs.utilityLayerRendererMod.UtilityLayerRenderer,
    parent: Unit,
    thickness: Double
  ) = this()
  def this(
    dragAxis: typings.babylonjs.mathVectorMod.Vector3,
    color: Unit,
    gizmoLayer: typings.babylonjs.utilityLayerRendererMod.UtilityLayerRenderer,
    parent: Nullable[typings.babylonjs.positionGizmoMod.PositionGizmo],
    thickness: Double
  ) = this()
  def this(
    dragAxis: typings.babylonjs.mathVectorMod.Vector3,
    color: typings.babylonjs.mathColorMod.Color3,
    gizmoLayer: Unit,
    parent: Unit,
    thickness: Double
  ) = this()
  def this(
    dragAxis: typings.babylonjs.mathVectorMod.Vector3,
    color: typings.babylonjs.mathColorMod.Color3,
    gizmoLayer: Unit,
    parent: Nullable[typings.babylonjs.positionGizmoMod.PositionGizmo],
    thickness: Double
  ) = this()
  def this(
    dragAxis: typings.babylonjs.mathVectorMod.Vector3,
    color: typings.babylonjs.mathColorMod.Color3,
    gizmoLayer: typings.babylonjs.utilityLayerRendererMod.UtilityLayerRenderer,
    parent: Unit,
    thickness: Double
  ) = this()
  def this(
    dragAxis: typings.babylonjs.mathVectorMod.Vector3,
    color: typings.babylonjs.mathColorMod.Color3,
    gizmoLayer: typings.babylonjs.utilityLayerRendererMod.UtilityLayerRenderer,
    parent: Nullable[typings.babylonjs.positionGizmoMod.PositionGizmo],
    thickness: Double
  ) = this()
}
/* static members */
object AxisDragGizmo {
  
  @JSImport("babylonjs", "AxisDragGizmo")
  @js.native
  val ^ : js.Any = js.native
  
  /** @hidden */
  inline def _CreateArrow(
    scene: typings.babylonjs.sceneMod.Scene,
    material: typings.babylonjs.standardMaterialMod.StandardMaterial
  ): typings.babylonjs.transformNodeMod.TransformNode = (^.asInstanceOf[js.Dynamic].applyDynamic("_CreateArrow")(scene.asInstanceOf[js.Any], material.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.transformNodeMod.TransformNode]
  inline def _CreateArrow(
    scene: typings.babylonjs.sceneMod.Scene,
    material: typings.babylonjs.standardMaterialMod.StandardMaterial,
    thickness: Double
  ): typings.babylonjs.transformNodeMod.TransformNode = (^.asInstanceOf[js.Dynamic].applyDynamic("_CreateArrow")(scene.asInstanceOf[js.Any], material.asInstanceOf[js.Any], thickness.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.transformNodeMod.TransformNode]
  inline def _CreateArrow(
    scene: typings.babylonjs.sceneMod.Scene,
    material: typings.babylonjs.standardMaterialMod.StandardMaterial,
    thickness: Double,
    isCollider: Boolean
  ): typings.babylonjs.transformNodeMod.TransformNode = (^.asInstanceOf[js.Dynamic].applyDynamic("_CreateArrow")(scene.asInstanceOf[js.Any], material.asInstanceOf[js.Any], thickness.asInstanceOf[js.Any], isCollider.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.transformNodeMod.TransformNode]
  inline def _CreateArrow(
    scene: typings.babylonjs.sceneMod.Scene,
    material: typings.babylonjs.standardMaterialMod.StandardMaterial,
    thickness: Unit,
    isCollider: Boolean
  ): typings.babylonjs.transformNodeMod.TransformNode = (^.asInstanceOf[js.Dynamic].applyDynamic("_CreateArrow")(scene.asInstanceOf[js.Any], material.asInstanceOf[js.Any], thickness.asInstanceOf[js.Any], isCollider.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.transformNodeMod.TransformNode]
  
  /** @hidden */
  inline def _CreateArrowInstance(scene: typings.babylonjs.sceneMod.Scene, arrow: typings.babylonjs.transformNodeMod.TransformNode): typings.babylonjs.transformNodeMod.TransformNode = (^.asInstanceOf[js.Dynamic].applyDynamic("_CreateArrowInstance")(scene.asInstanceOf[js.Any], arrow.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.transformNodeMod.TransformNode]
}
