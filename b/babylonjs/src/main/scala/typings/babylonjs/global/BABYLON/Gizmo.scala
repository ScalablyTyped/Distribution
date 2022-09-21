package typings.babylonjs.global.BABYLON

import typings.babylonjs.BABYLON.GizmoAxisCache
import typings.babylonjs.BABYLON.Nullable
import typings.std.Map
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("BABYLON.Gizmo")
@js.native
/**
  * Creates a gizmo
  * @param gizmoLayer The utility layer the gizmo will be added to
  */
open class Gizmo ()
  extends StObject
     with typings.babylonjs.BABYLON.Gizmo {
  def this(/** The utility layer the gizmo will be added to */
  gizmoLayer: typings.babylonjs.BABYLON.UtilityLayerRenderer) = this()
  
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
object Gizmo {
  
  @JSGlobal("BABYLON.Gizmo")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Subscribes to pointer up, down, and hover events. Used for responsive gizmos.
    * @param gizmoLayer The utility layer the gizmo will be added to
    * @param gizmoAxisCache Gizmo axis definition used for reactive gizmo UI
    * @returns {Observer<PointerInfo>} pointerObserver
    */
  inline def GizmoAxisPointerObserver(
    gizmoLayer: typings.babylonjs.BABYLON.UtilityLayerRenderer,
    gizmoAxisCache: Map[typings.babylonjs.BABYLON.Mesh, GizmoAxisCache]
  ): typings.babylonjs.BABYLON.Observer[typings.babylonjs.BABYLON.PointerInfo] = (^.asInstanceOf[js.Dynamic].applyDynamic("GizmoAxisPointerObserver")(gizmoLayer.asInstanceOf[js.Any], gizmoAxisCache.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.BABYLON.Observer[typings.babylonjs.BABYLON.PointerInfo]]
  
  /**
    * When enabled, any gizmo operation will perserve scaling sign. Default is off.
    * Only valid for TransformNode derived classes (Mesh, AbstractMesh, ...)
    */
  @JSGlobal("BABYLON.Gizmo.PreserveScaling")
  @js.native
  def PreserveScaling: Boolean = js.native
  inline def PreserveScaling_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("PreserveScaling")(x.asInstanceOf[js.Any])
}
