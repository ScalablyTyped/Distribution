package typings.babylonjs.global.BABYLON

import typings.babylonjs.BABYLON.Nullable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("BABYLON.AxisDragGizmo")
@js.native
open class AxisDragGizmo protected ()
  extends StObject
     with typings.babylonjs.BABYLON.AxisDragGizmo {
  /**
    * Creates an AxisDragGizmo
    * @param dragAxis The axis which the gizmo will be able to drag on
    * @param color The color of the gizmo
    * @param gizmoLayer The utility layer the gizmo will be added to
    * @param parent
    * @param thickness display gizmo axis thickness
    */
  def this(dragAxis: typings.babylonjs.BABYLON.Vector3) = this()
  def this(dragAxis: typings.babylonjs.BABYLON.Vector3, color: typings.babylonjs.BABYLON.Color3) = this()
  def this(
    dragAxis: typings.babylonjs.BABYLON.Vector3,
    color: Unit,
    gizmoLayer: typings.babylonjs.BABYLON.UtilityLayerRenderer
  ) = this()
  def this(
    dragAxis: typings.babylonjs.BABYLON.Vector3,
    color: typings.babylonjs.BABYLON.Color3,
    gizmoLayer: typings.babylonjs.BABYLON.UtilityLayerRenderer
  ) = this()
  def this(
    dragAxis: typings.babylonjs.BABYLON.Vector3,
    color: Unit,
    gizmoLayer: Unit,
    parent: Nullable[typings.babylonjs.BABYLON.PositionGizmo]
  ) = this()
  def this(
    dragAxis: typings.babylonjs.BABYLON.Vector3,
    color: Unit,
    gizmoLayer: typings.babylonjs.BABYLON.UtilityLayerRenderer,
    parent: Nullable[typings.babylonjs.BABYLON.PositionGizmo]
  ) = this()
  def this(
    dragAxis: typings.babylonjs.BABYLON.Vector3,
    color: typings.babylonjs.BABYLON.Color3,
    gizmoLayer: Unit,
    parent: Nullable[typings.babylonjs.BABYLON.PositionGizmo]
  ) = this()
  def this(
    dragAxis: typings.babylonjs.BABYLON.Vector3,
    color: typings.babylonjs.BABYLON.Color3,
    gizmoLayer: typings.babylonjs.BABYLON.UtilityLayerRenderer,
    parent: Nullable[typings.babylonjs.BABYLON.PositionGizmo]
  ) = this()
  def this(
    dragAxis: typings.babylonjs.BABYLON.Vector3,
    color: Unit,
    gizmoLayer: Unit,
    parent: Unit,
    thickness: Double
  ) = this()
  def this(
    dragAxis: typings.babylonjs.BABYLON.Vector3,
    color: Unit,
    gizmoLayer: Unit,
    parent: Nullable[typings.babylonjs.BABYLON.PositionGizmo],
    thickness: Double
  ) = this()
  def this(
    dragAxis: typings.babylonjs.BABYLON.Vector3,
    color: Unit,
    gizmoLayer: typings.babylonjs.BABYLON.UtilityLayerRenderer,
    parent: Unit,
    thickness: Double
  ) = this()
  def this(
    dragAxis: typings.babylonjs.BABYLON.Vector3,
    color: Unit,
    gizmoLayer: typings.babylonjs.BABYLON.UtilityLayerRenderer,
    parent: Nullable[typings.babylonjs.BABYLON.PositionGizmo],
    thickness: Double
  ) = this()
  def this(
    dragAxis: typings.babylonjs.BABYLON.Vector3,
    color: typings.babylonjs.BABYLON.Color3,
    gizmoLayer: Unit,
    parent: Unit,
    thickness: Double
  ) = this()
  def this(
    dragAxis: typings.babylonjs.BABYLON.Vector3,
    color: typings.babylonjs.BABYLON.Color3,
    gizmoLayer: Unit,
    parent: Nullable[typings.babylonjs.BABYLON.PositionGizmo],
    thickness: Double
  ) = this()
  def this(
    dragAxis: typings.babylonjs.BABYLON.Vector3,
    color: typings.babylonjs.BABYLON.Color3,
    gizmoLayer: typings.babylonjs.BABYLON.UtilityLayerRenderer,
    parent: Unit,
    thickness: Double
  ) = this()
  def this(
    dragAxis: typings.babylonjs.BABYLON.Vector3,
    color: typings.babylonjs.BABYLON.Color3,
    gizmoLayer: typings.babylonjs.BABYLON.UtilityLayerRenderer,
    parent: Nullable[typings.babylonjs.BABYLON.PositionGizmo],
    thickness: Double
  ) = this()
  
  /** The root mesh of the gizmo */
  /* CompleteClass */
  var _rootMesh: typings.babylonjs.BABYLON.Mesh = js.native
  
  /**
    * Mesh that the gizmo will be attached to. (eg. on a drag gizmo the mesh that will be dragged)
    * * When set, interactions will be enabled
    */
  /* CompleteClass */
  var attachedMesh: Nullable[typings.babylonjs.BABYLON.AbstractMesh] = js.native
  
  /**
    * Node that the gizmo will be attached to. (eg. on a drag gizmo the mesh, bone or NodeTransform that will be dragged)
    * * When set, interactions will be enabled
    */
  /* CompleteClass */
  var attachedNode: Nullable[typings.babylonjs.BABYLON.Node] = js.native
  
  /**
    * posture that the gizmo will be display
    * When set null, default value will be used (Quaternion(0, 0, 0, 1))
    */
  /* CompleteClass */
  var customRotationQuaternion: Nullable[typings.babylonjs.BABYLON.Quaternion] = js.native
  
  /**
    * Releases all held resources
    */
  /* CompleteClass */
  override def dispose(): Unit = js.native
  
  /** The utility layer the gizmo will be added to */
  /* CompleteClass */
  var gizmoLayer: typings.babylonjs.BABYLON.UtilityLayerRenderer = js.native
  
  /** True when the mouse pointer is hovered a gizmo mesh */
  /* CompleteClass */
  override val isHovered: Boolean = js.native
  
  /** Ratio for the scale of the gizmo */
  /* CompleteClass */
  var scaleRatio: Double = js.native
  
  /** Disposes and replaces the current meshes in the gizmo with the specified mesh */
  /* CompleteClass */
  override def setCustomMesh(mesh: typings.babylonjs.BABYLON.Mesh): Unit = js.native
  
  /**
    * If set the gizmo's position will be updated to match the attached mesh each frame (Default: true)
    */
  /* CompleteClass */
  var updateGizmoPositionToMatchAttachedMesh: Boolean = js.native
  
  /**
    * If set the gizmo's rotation will be updated to match the attached mesh each frame (Default: true)
    */
  /* CompleteClass */
  var updateGizmoRotationToMatchAttachedMesh: Boolean = js.native
  
  /**
    * When set, the gizmo will always appear the same size no matter where the camera is (default: true)
    */
  /* CompleteClass */
  var updateScale: Boolean = js.native
}
/* static members */
object AxisDragGizmo {
  
  @JSGlobal("BABYLON.AxisDragGizmo")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * @param scene
    * @param material
    * @param thickness
    * @param isCollider
    * @hidden
    */
  inline def _CreateArrow(scene: typings.babylonjs.BABYLON.Scene, material: typings.babylonjs.BABYLON.StandardMaterial): typings.babylonjs.BABYLON.TransformNode = (^.asInstanceOf[js.Dynamic].applyDynamic("_CreateArrow")(scene.asInstanceOf[js.Any], material.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.BABYLON.TransformNode]
  inline def _CreateArrow(
    scene: typings.babylonjs.BABYLON.Scene,
    material: typings.babylonjs.BABYLON.StandardMaterial,
    thickness: Double
  ): typings.babylonjs.BABYLON.TransformNode = (^.asInstanceOf[js.Dynamic].applyDynamic("_CreateArrow")(scene.asInstanceOf[js.Any], material.asInstanceOf[js.Any], thickness.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.BABYLON.TransformNode]
  inline def _CreateArrow(
    scene: typings.babylonjs.BABYLON.Scene,
    material: typings.babylonjs.BABYLON.StandardMaterial,
    thickness: Double,
    isCollider: Boolean
  ): typings.babylonjs.BABYLON.TransformNode = (^.asInstanceOf[js.Dynamic].applyDynamic("_CreateArrow")(scene.asInstanceOf[js.Any], material.asInstanceOf[js.Any], thickness.asInstanceOf[js.Any], isCollider.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.BABYLON.TransformNode]
  inline def _CreateArrow(
    scene: typings.babylonjs.BABYLON.Scene,
    material: typings.babylonjs.BABYLON.StandardMaterial,
    thickness: Unit,
    isCollider: Boolean
  ): typings.babylonjs.BABYLON.TransformNode = (^.asInstanceOf[js.Dynamic].applyDynamic("_CreateArrow")(scene.asInstanceOf[js.Any], material.asInstanceOf[js.Any], thickness.asInstanceOf[js.Any], isCollider.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.BABYLON.TransformNode]
  
  /**
    * @param scene
    * @param arrow
    * @hidden
    */
  inline def _CreateArrowInstance(scene: typings.babylonjs.BABYLON.Scene, arrow: typings.babylonjs.BABYLON.TransformNode): typings.babylonjs.BABYLON.TransformNode = (^.asInstanceOf[js.Dynamic].applyDynamic("_CreateArrowInstance")(scene.asInstanceOf[js.Any], arrow.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.BABYLON.TransformNode]
}
