package typings.babylonjs.mod

import typings.babylonjs.typesMod.Nullable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs", "AxisDragGizmo")
@js.native
open class AxisDragGizmo protected ()
  extends typings.babylonjs.legacyLegacyMod.AxisDragGizmo {
  /**
    * Creates an AxisDragGizmo
    * @param dragAxis The axis which the gizmo will be able to drag on
    * @param color The color of the gizmo
    * @param gizmoLayer The utility layer the gizmo will be added to
    * @param parent
    * @param thickness display gizmo axis thickness
    */
  def this(dragAxis: typings.babylonjs.mathsMathDotvectorMod.Vector3) = this()
  def this(
    dragAxis: typings.babylonjs.mathsMathDotvectorMod.Vector3,
    color: typings.babylonjs.mathsMathDotcolorMod.Color3
  ) = this()
  def this(
    dragAxis: typings.babylonjs.mathsMathDotvectorMod.Vector3,
    color: Unit,
    gizmoLayer: typings.babylonjs.renderingUtilityLayerRendererMod.UtilityLayerRenderer
  ) = this()
  def this(
    dragAxis: typings.babylonjs.mathsMathDotvectorMod.Vector3,
    color: typings.babylonjs.mathsMathDotcolorMod.Color3,
    gizmoLayer: typings.babylonjs.renderingUtilityLayerRendererMod.UtilityLayerRenderer
  ) = this()
  def this(
    dragAxis: typings.babylonjs.mathsMathDotvectorMod.Vector3,
    color: Unit,
    gizmoLayer: Unit,
    parent: Nullable[typings.babylonjs.gizmosPositionGizmoMod.PositionGizmo]
  ) = this()
  def this(
    dragAxis: typings.babylonjs.mathsMathDotvectorMod.Vector3,
    color: Unit,
    gizmoLayer: typings.babylonjs.renderingUtilityLayerRendererMod.UtilityLayerRenderer,
    parent: Nullable[typings.babylonjs.gizmosPositionGizmoMod.PositionGizmo]
  ) = this()
  def this(
    dragAxis: typings.babylonjs.mathsMathDotvectorMod.Vector3,
    color: typings.babylonjs.mathsMathDotcolorMod.Color3,
    gizmoLayer: Unit,
    parent: Nullable[typings.babylonjs.gizmosPositionGizmoMod.PositionGizmo]
  ) = this()
  def this(
    dragAxis: typings.babylonjs.mathsMathDotvectorMod.Vector3,
    color: typings.babylonjs.mathsMathDotcolorMod.Color3,
    gizmoLayer: typings.babylonjs.renderingUtilityLayerRendererMod.UtilityLayerRenderer,
    parent: Nullable[typings.babylonjs.gizmosPositionGizmoMod.PositionGizmo]
  ) = this()
  def this(
    dragAxis: typings.babylonjs.mathsMathDotvectorMod.Vector3,
    color: Unit,
    gizmoLayer: Unit,
    parent: Unit,
    thickness: Double
  ) = this()
  def this(
    dragAxis: typings.babylonjs.mathsMathDotvectorMod.Vector3,
    color: Unit,
    gizmoLayer: Unit,
    parent: Nullable[typings.babylonjs.gizmosPositionGizmoMod.PositionGizmo],
    thickness: Double
  ) = this()
  def this(
    dragAxis: typings.babylonjs.mathsMathDotvectorMod.Vector3,
    color: Unit,
    gizmoLayer: typings.babylonjs.renderingUtilityLayerRendererMod.UtilityLayerRenderer,
    parent: Unit,
    thickness: Double
  ) = this()
  def this(
    dragAxis: typings.babylonjs.mathsMathDotvectorMod.Vector3,
    color: Unit,
    gizmoLayer: typings.babylonjs.renderingUtilityLayerRendererMod.UtilityLayerRenderer,
    parent: Nullable[typings.babylonjs.gizmosPositionGizmoMod.PositionGizmo],
    thickness: Double
  ) = this()
  def this(
    dragAxis: typings.babylonjs.mathsMathDotvectorMod.Vector3,
    color: typings.babylonjs.mathsMathDotcolorMod.Color3,
    gizmoLayer: Unit,
    parent: Unit,
    thickness: Double
  ) = this()
  def this(
    dragAxis: typings.babylonjs.mathsMathDotvectorMod.Vector3,
    color: typings.babylonjs.mathsMathDotcolorMod.Color3,
    gizmoLayer: Unit,
    parent: Nullable[typings.babylonjs.gizmosPositionGizmoMod.PositionGizmo],
    thickness: Double
  ) = this()
  def this(
    dragAxis: typings.babylonjs.mathsMathDotvectorMod.Vector3,
    color: typings.babylonjs.mathsMathDotcolorMod.Color3,
    gizmoLayer: typings.babylonjs.renderingUtilityLayerRendererMod.UtilityLayerRenderer,
    parent: Unit,
    thickness: Double
  ) = this()
  def this(
    dragAxis: typings.babylonjs.mathsMathDotvectorMod.Vector3,
    color: typings.babylonjs.mathsMathDotcolorMod.Color3,
    gizmoLayer: typings.babylonjs.renderingUtilityLayerRendererMod.UtilityLayerRenderer,
    parent: Nullable[typings.babylonjs.gizmosPositionGizmoMod.PositionGizmo],
    thickness: Double
  ) = this()
}
/* static members */
object AxisDragGizmo {
  
  @JSImport("babylonjs", "AxisDragGizmo")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * @internal
    */
  inline def _CreateArrow(
    scene: typings.babylonjs.sceneMod.Scene,
    material: typings.babylonjs.materialsStandardMaterialMod.StandardMaterial
  ): typings.babylonjs.meshesTransformNodeMod.TransformNode = (^.asInstanceOf[js.Dynamic].applyDynamic("_CreateArrow")(scene.asInstanceOf[js.Any], material.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.meshesTransformNodeMod.TransformNode]
  inline def _CreateArrow(
    scene: typings.babylonjs.sceneMod.Scene,
    material: typings.babylonjs.materialsStandardMaterialMod.StandardMaterial,
    thickness: Double
  ): typings.babylonjs.meshesTransformNodeMod.TransformNode = (^.asInstanceOf[js.Dynamic].applyDynamic("_CreateArrow")(scene.asInstanceOf[js.Any], material.asInstanceOf[js.Any], thickness.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.meshesTransformNodeMod.TransformNode]
  inline def _CreateArrow(
    scene: typings.babylonjs.sceneMod.Scene,
    material: typings.babylonjs.materialsStandardMaterialMod.StandardMaterial,
    thickness: Double,
    isCollider: Boolean
  ): typings.babylonjs.meshesTransformNodeMod.TransformNode = (^.asInstanceOf[js.Dynamic].applyDynamic("_CreateArrow")(scene.asInstanceOf[js.Any], material.asInstanceOf[js.Any], thickness.asInstanceOf[js.Any], isCollider.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.meshesTransformNodeMod.TransformNode]
  inline def _CreateArrow(
    scene: typings.babylonjs.sceneMod.Scene,
    material: typings.babylonjs.materialsStandardMaterialMod.StandardMaterial,
    thickness: Unit,
    isCollider: Boolean
  ): typings.babylonjs.meshesTransformNodeMod.TransformNode = (^.asInstanceOf[js.Dynamic].applyDynamic("_CreateArrow")(scene.asInstanceOf[js.Any], material.asInstanceOf[js.Any], thickness.asInstanceOf[js.Any], isCollider.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.meshesTransformNodeMod.TransformNode]
  
  /**
    * @internal
    */
  inline def _CreateArrowInstance(
    scene: typings.babylonjs.sceneMod.Scene,
    arrow: typings.babylonjs.meshesTransformNodeMod.TransformNode
  ): typings.babylonjs.meshesTransformNodeMod.TransformNode = (^.asInstanceOf[js.Dynamic].applyDynamic("_CreateArrowInstance")(scene.asInstanceOf[js.Any], arrow.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.meshesTransformNodeMod.TransformNode]
}
