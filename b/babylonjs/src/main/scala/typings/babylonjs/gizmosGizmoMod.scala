package typings.babylonjs

import typings.babylonjs.behaviorsMeshesPointerDragBehaviorMod.PointerDragBehavior
import typings.babylonjs.eventsPointerEventsMod.PointerInfo
import typings.babylonjs.materialsStandardMaterialMod.StandardMaterial
import typings.babylonjs.mathsMathDotvectorMod.Quaternion
import typings.babylonjs.meshesAbstractMeshMod.AbstractMesh
import typings.babylonjs.meshesMeshMod.Mesh
import typings.babylonjs.miscObservableMod.Observer
import typings.babylonjs.nodeMod.Node
import typings.babylonjs.renderingUtilityLayerRendererMod.UtilityLayerRenderer
import typings.babylonjs.sceneMod.IDisposable
import typings.babylonjs.sceneMod.Scene
import typings.babylonjs.typesMod.Nullable
import typings.std.Map
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object gizmosGizmoMod {
  
  @JSImport("babylonjs/Gizmos/gizmo", "Gizmo")
  @js.native
  /**
    * Creates a gizmo
    * @param gizmoLayer The utility layer the gizmo will be added to
    */
  open class Gizmo ()
    extends StObject
       with IGizmo {
    def this(/** The utility layer the gizmo will be added to */
    gizmoLayer: UtilityLayerRenderer) = this()
    
    /* protected */ var _attachedMesh: Nullable[AbstractMesh] = js.native
    
    /* protected */ var _attachedNode: Nullable[Node] = js.native
    
    /* protected */ def _attachedNodeChanged(value: Nullable[Node]): Unit = js.native
    
    /* protected */ var _beforeRenderObserver: Nullable[Observer[Scene]] = js.native
    
    /**
      * If a custom mesh has been set (Default: false)
      */
    /* protected */ var _customMeshSet: Boolean = js.native
    
    /* protected */ var _customRotationQuaternion: Nullable[Quaternion] = js.native
    
    /**
      * Handle position/translation when using an attached node using pivot
      */
    /* protected */ def _handlePivot(): Unit = js.native
    
    /* protected */ var _interactionsEnabled: Boolean = js.native
    
    /**
      * boolean updated by pointermove when a gizmo mesh is hovered
      */
    /* protected */ var _isHovered: Boolean = js.native
    
    /**
      * computes the rotation/scaling/position of the transform once the Node world matrix has changed.
      */
    /* protected */ def _matrixChanged(): Unit = js.native
    
    /* private */ var _rightHandtoLeftHandMatrix: Any = js.native
    
    /** The root mesh of the gizmo */
    /* CompleteClass */
    var _rootMesh: Mesh = js.native
    
    /**
      * Ratio for the scale of the gizmo (Default: 1)
      */
    /* protected */ var _scaleRatio: Double = js.native
    
    /**
      * refresh gizmo mesh material
      * @param gizmoMeshes
      * @param material material to apply
      */
    /* protected */ def _setGizmoMeshMaterial(gizmoMeshes: js.Array[Mesh], material: StandardMaterial): Unit = js.native
    
    /**
      * Updates the gizmo to match the attached mesh's position/rotation
      */
    /* protected */ def _update(): Unit = js.native
    
    /* protected */ var _updateGizmoPositionToMatchAttachedMesh: Boolean = js.native
    
    /* protected */ var _updateGizmoRotationToMatchAttachedMesh: Boolean = js.native
    
    /* protected */ var _updateScale: Boolean = js.native
    
    /**
      * Mesh that the gizmo will be attached to. (eg. on a drag gizmo the mesh that will be dragged)
      * * When set, interactions will be enabled
      */
    /* CompleteClass */
    var attachedMesh: Nullable[AbstractMesh] = js.native
    /**
      * Mesh that the gizmo will be attached to. (eg. on a drag gizmo the mesh that will be dragged)
      * * When set, interactions will be enabled
      */
    @JSName("attachedMesh")
    def attachedMesh_MGizmo: Nullable[AbstractMesh] = js.native
    
    /**
      * Node that the gizmo will be attached to. (eg. on a drag gizmo the mesh, bone or NodeTransform that will be dragged)
      * * When set, interactions will be enabled
      */
    /* CompleteClass */
    var attachedNode: Nullable[Node] = js.native
    /**
      * Node that the gizmo will be attached to. (eg. on a drag gizmo the mesh, bone or NodeTransform that will be dragged)
      * * When set, interactions will be enabled
      */
    @JSName("attachedNode")
    def attachedNode_MGizmo: Nullable[Node] = js.native
    
    /**
      * posture that the gizmo will be display
      * When set null, default value will be used (Quaternion(0, 0, 0, 1))
      */
    /* CompleteClass */
    var customRotationQuaternion: Nullable[Quaternion] = js.native
    /**
      * posture that the gizmo will be display
      * When set null, default value will be used (Quaternion(0, 0, 0, 1))
      */
    @JSName("customRotationQuaternion")
    def customRotationQuaternion_MGizmo: Nullable[Quaternion] = js.native
    
    /**
      * Releases all held resources
      */
    /* CompleteClass */
    override def dispose(): Unit = js.native
    
    /** The utility layer the gizmo will be added to */
    /* CompleteClass */
    var gizmoLayer: UtilityLayerRenderer = js.native
    
    /** True when the mouse pointer is hovered a gizmo mesh */
    /* CompleteClass */
    override val isHovered: Boolean = js.native
    /**
      * True when the mouse pointer is hovered a gizmo mesh
      */
    @JSName("isHovered")
    def isHovered_MGizmo: Boolean = js.native
    
    /** Ratio for the scale of the gizmo */
    /* CompleteClass */
    var scaleRatio: Double = js.native
    @JSName("scaleRatio")
    def scaleRatio_MGizmo: Double = js.native
    
    /** Disposes and replaces the current meshes in the gizmo with the specified mesh */
    /* CompleteClass */
    override def setCustomMesh(mesh: Mesh): Unit = js.native
    
    /**
      * If set the gizmo's position will be updated to match the attached mesh each frame (Default: true)
      */
    /* CompleteClass */
    var updateGizmoPositionToMatchAttachedMesh: Boolean = js.native
    @JSName("updateGizmoPositionToMatchAttachedMesh")
    def updateGizmoPositionToMatchAttachedMesh_MGizmo: Boolean = js.native
    
    /**
      * If set the gizmo's rotation will be updated to match the attached mesh each frame (Default: true)
      */
    /* CompleteClass */
    var updateGizmoRotationToMatchAttachedMesh: Boolean = js.native
    @JSName("updateGizmoRotationToMatchAttachedMesh")
    def updateGizmoRotationToMatchAttachedMesh_MGizmo: Boolean = js.native
    
    /**
      * When set, the gizmo will always appear the same size no matter where the camera is (default: true)
      */
    /* CompleteClass */
    var updateScale: Boolean = js.native
    @JSName("updateScale")
    def updateScale_MGizmo: Boolean = js.native
  }
  /* static members */
  object Gizmo {
    
    @JSImport("babylonjs/Gizmos/gizmo", "Gizmo")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Subscribes to pointer up, down, and hover events. Used for responsive gizmos.
      * @param gizmoLayer The utility layer the gizmo will be added to
      * @param gizmoAxisCache Gizmo axis definition used for reactive gizmo UI
      * @returns {Observer<PointerInfo>} pointerObserver
      */
    inline def GizmoAxisPointerObserver(gizmoLayer: UtilityLayerRenderer, gizmoAxisCache: Map[Mesh, GizmoAxisCache]): Observer[PointerInfo] = (^.asInstanceOf[js.Dynamic].applyDynamic("GizmoAxisPointerObserver")(gizmoLayer.asInstanceOf[js.Any], gizmoAxisCache.asInstanceOf[js.Any])).asInstanceOf[Observer[PointerInfo]]
    
    /**
      * When enabled, any gizmo operation will perserve scaling sign. Default is off.
      * Only valid for TransformNode derived classes (Mesh, AbstractMesh, ...)
      */
    @JSImport("babylonjs/Gizmos/gizmo", "Gizmo.PreserveScaling")
    @js.native
    def PreserveScaling: Boolean = js.native
    inline def PreserveScaling_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("PreserveScaling")(x.asInstanceOf[js.Any])
  }
  
  trait GizmoAxisCache extends StObject {
    
    /** Used to indicate Active state of the Gizmo */
    var active: Boolean
    
    /** Mesh used to detect user interaction with Gizmo */
    var colliderMeshes: js.Array[Mesh]
    
    /** Material used to indicate disabled state of the Gizmo */
    var disableMaterial: StandardMaterial
    
    /** DragBehavior */
    var dragBehavior: PointerDragBehavior
    
    /** Mesh used to render the Gizmo */
    var gizmoMeshes: js.Array[Mesh]
    
    /** Material used to indicate hover state of the Gizmo */
    var hoverMaterial: StandardMaterial
    
    /** Material used to indicate color of gizmo mesh */
    var material: StandardMaterial
  }
  object GizmoAxisCache {
    
    inline def apply(
      active: Boolean,
      colliderMeshes: js.Array[Mesh],
      disableMaterial: StandardMaterial,
      dragBehavior: PointerDragBehavior,
      gizmoMeshes: js.Array[Mesh],
      hoverMaterial: StandardMaterial,
      material: StandardMaterial
    ): GizmoAxisCache = {
      val __obj = js.Dynamic.literal(active = active.asInstanceOf[js.Any], colliderMeshes = colliderMeshes.asInstanceOf[js.Any], disableMaterial = disableMaterial.asInstanceOf[js.Any], dragBehavior = dragBehavior.asInstanceOf[js.Any], gizmoMeshes = gizmoMeshes.asInstanceOf[js.Any], hoverMaterial = hoverMaterial.asInstanceOf[js.Any], material = material.asInstanceOf[js.Any])
      __obj.asInstanceOf[GizmoAxisCache]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: GizmoAxisCache] (val x: Self) extends AnyVal {
      
      inline def setActive(value: Boolean): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
      
      inline def setColliderMeshes(value: js.Array[Mesh]): Self = StObject.set(x, "colliderMeshes", value.asInstanceOf[js.Any])
      
      inline def setColliderMeshesVarargs(value: Mesh*): Self = StObject.set(x, "colliderMeshes", js.Array(value*))
      
      inline def setDisableMaterial(value: StandardMaterial): Self = StObject.set(x, "disableMaterial", value.asInstanceOf[js.Any])
      
      inline def setDragBehavior(value: PointerDragBehavior): Self = StObject.set(x, "dragBehavior", value.asInstanceOf[js.Any])
      
      inline def setGizmoMeshes(value: js.Array[Mesh]): Self = StObject.set(x, "gizmoMeshes", value.asInstanceOf[js.Any])
      
      inline def setGizmoMeshesVarargs(value: Mesh*): Self = StObject.set(x, "gizmoMeshes", js.Array(value*))
      
      inline def setHoverMaterial(value: StandardMaterial): Self = StObject.set(x, "hoverMaterial", value.asInstanceOf[js.Any])
      
      inline def setMaterial(value: StandardMaterial): Self = StObject.set(x, "material", value.asInstanceOf[js.Any])
    }
  }
  
  trait IGizmo
    extends StObject
       with IDisposable {
    
    /** The root mesh of the gizmo */
    var _rootMesh: Mesh
    
    /**
      * Mesh that the gizmo will be attached to. (eg. on a drag gizmo the mesh that will be dragged)
      * * When set, interactions will be enabled
      */
    var attachedMesh: Nullable[AbstractMesh]
    
    /**
      * Node that the gizmo will be attached to. (eg. on a drag gizmo the mesh, bone or NodeTransform that will be dragged)
      * * When set, interactions will be enabled
      */
    var attachedNode: Nullable[Node]
    
    /**
      * posture that the gizmo will be display
      * When set null, default value will be used (Quaternion(0, 0, 0, 1))
      */
    var customRotationQuaternion: Nullable[Quaternion]
    
    /** The utility layer the gizmo will be added to */
    var gizmoLayer: UtilityLayerRenderer
    
    /** True when the mouse pointer is hovered a gizmo mesh */
    val isHovered: Boolean
    
    /** Ratio for the scale of the gizmo */
    var scaleRatio: Double
    
    /** Disposes and replaces the current meshes in the gizmo with the specified mesh */
    def setCustomMesh(mesh: Mesh): Unit
    
    /**
      * If set the gizmo's position will be updated to match the attached mesh each frame (Default: true)
      */
    var updateGizmoPositionToMatchAttachedMesh: Boolean
    
    /**
      * If set the gizmo's rotation will be updated to match the attached mesh each frame (Default: true)
      */
    var updateGizmoRotationToMatchAttachedMesh: Boolean
    
    /**
      * When set, the gizmo will always appear the same size no matter where the camera is (default: true)
      */
    var updateScale: Boolean
  }
  object IGizmo {
    
    inline def apply(
      _rootMesh: Mesh,
      dispose: () => Unit,
      gizmoLayer: UtilityLayerRenderer,
      isHovered: Boolean,
      scaleRatio: Double,
      setCustomMesh: Mesh => Unit,
      updateGizmoPositionToMatchAttachedMesh: Boolean,
      updateGizmoRotationToMatchAttachedMesh: Boolean,
      updateScale: Boolean
    ): IGizmo = {
      val __obj = js.Dynamic.literal(_rootMesh = _rootMesh.asInstanceOf[js.Any], dispose = js.Any.fromFunction0(dispose), gizmoLayer = gizmoLayer.asInstanceOf[js.Any], isHovered = isHovered.asInstanceOf[js.Any], scaleRatio = scaleRatio.asInstanceOf[js.Any], setCustomMesh = js.Any.fromFunction1(setCustomMesh), updateGizmoPositionToMatchAttachedMesh = updateGizmoPositionToMatchAttachedMesh.asInstanceOf[js.Any], updateGizmoRotationToMatchAttachedMesh = updateGizmoRotationToMatchAttachedMesh.asInstanceOf[js.Any], updateScale = updateScale.asInstanceOf[js.Any], attachedMesh = null, attachedNode = null, customRotationQuaternion = null)
      __obj.asInstanceOf[IGizmo]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IGizmo] (val x: Self) extends AnyVal {
      
      inline def setAttachedMesh(value: Nullable[AbstractMesh]): Self = StObject.set(x, "attachedMesh", value.asInstanceOf[js.Any])
      
      inline def setAttachedMeshNull: Self = StObject.set(x, "attachedMesh", null)
      
      inline def setAttachedNode(value: Nullable[Node]): Self = StObject.set(x, "attachedNode", value.asInstanceOf[js.Any])
      
      inline def setAttachedNodeNull: Self = StObject.set(x, "attachedNode", null)
      
      inline def setCustomRotationQuaternion(value: Nullable[Quaternion]): Self = StObject.set(x, "customRotationQuaternion", value.asInstanceOf[js.Any])
      
      inline def setCustomRotationQuaternionNull: Self = StObject.set(x, "customRotationQuaternion", null)
      
      inline def setGizmoLayer(value: UtilityLayerRenderer): Self = StObject.set(x, "gizmoLayer", value.asInstanceOf[js.Any])
      
      inline def setIsHovered(value: Boolean): Self = StObject.set(x, "isHovered", value.asInstanceOf[js.Any])
      
      inline def setScaleRatio(value: Double): Self = StObject.set(x, "scaleRatio", value.asInstanceOf[js.Any])
      
      inline def setSetCustomMesh(value: Mesh => Unit): Self = StObject.set(x, "setCustomMesh", js.Any.fromFunction1(value))
      
      inline def setUpdateGizmoPositionToMatchAttachedMesh(value: Boolean): Self = StObject.set(x, "updateGizmoPositionToMatchAttachedMesh", value.asInstanceOf[js.Any])
      
      inline def setUpdateGizmoRotationToMatchAttachedMesh(value: Boolean): Self = StObject.set(x, "updateGizmoRotationToMatchAttachedMesh", value.asInstanceOf[js.Any])
      
      inline def setUpdateScale(value: Boolean): Self = StObject.set(x, "updateScale", value.asInstanceOf[js.Any])
      
      inline def set_rootMesh(value: Mesh): Self = StObject.set(x, "_rootMesh", value.asInstanceOf[js.Any])
    }
  }
}
