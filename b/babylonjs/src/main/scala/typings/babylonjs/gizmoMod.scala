package typings.babylonjs

import typings.babylonjs.abstractMeshMod.AbstractMesh
import typings.babylonjs.meshMod.Mesh
import typings.babylonjs.nodeMod.Node
import typings.babylonjs.observableMod.Observer
import typings.babylonjs.pointerEventsMod.PointerInfo
import typings.babylonjs.sceneMod.IDisposable
import typings.babylonjs.standardMaterialMod.StandardMaterial
import typings.babylonjs.typesMod.Nullable
import typings.babylonjs.utilityLayerRendererMod.UtilityLayerRenderer
import typings.std.Map
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object gizmoMod {
  
  @JSImport("babylonjs/Gizmos/gizmo", "Gizmo")
  @js.native
  /**
    * Creates a gizmo
    * @param gizmoLayer The utility layer the gizmo will be added to
    */
  class Gizmo () extends IDisposable {
    def this(/** The utility layer the gizmo will be added to */
    gizmoLayer: UtilityLayerRenderer) = this()
    
    var _attachedMesh: js.Any = js.native
    
    var _attachedNode: js.Any = js.native
    
    /* protected */ def _attachedNodeChanged(value: Nullable[Node]): Unit = js.native
    
    var _beforeRenderObserver: js.Any = js.native
    
    /**
      * If a custom mesh has been set (Default: false)
      */
    var _customMeshSet: Boolean = js.native
    
    var _interactionsEnabled: Boolean = js.native
    
    /**
      * boolean updated by pointermove when a gizmo mesh is hovered
      */
    var _isHovered: Boolean = js.native
    
    /**
      * computes the rotation/scaling/position of the transform once the Node world matrix has changed.
      * @param value Node, TransformNode or mesh
      */
    /* protected */ def _matrixChanged(): Unit = js.native
    
    var _rightHandtoLeftHandMatrix: js.Any = js.native
    
    /**
      * The root mesh of the gizmo
      */
    var _rootMesh: Mesh = js.native
    
    /**
      * Ratio for the scale of the gizmo (Default: 1)
      */
    var _scaleRatio: Double = js.native
    
    var _tempMatrix1: js.Any = js.native
    
    var _tempMatrix2: js.Any = js.native
    
    var _tempQuaternion: js.Any = js.native
    
    var _tempVector: js.Any = js.native
    
    var _tempVector2: js.Any = js.native
    
    /**
      * Updates the gizmo to match the attached mesh's position/rotation
      */
    /* protected */ def _update(): Unit = js.native
    
    var _updateGizmoRotationToMatchAttachedMesh: Boolean = js.native
    
    /**
      * Mesh that the gizmo will be attached to. (eg. on a drag gizmo the mesh that will be dragged)
      * * When set, interactions will be enabled
      */
    def attachedMesh: Nullable[AbstractMesh] = js.native
    def attachedMesh_=(value: Nullable[AbstractMesh]): Unit = js.native
    
    /**
      * Node that the gizmo will be attached to. (eg. on a drag gizmo the mesh, bone or NodeTransform that will be dragged)
      * * When set, interactions will be enabled
      */
    def attachedNode: Nullable[Node] = js.native
    def attachedNode_=(value: Nullable[Node]): Unit = js.native
    
    /** The utility layer the gizmo will be added to */
    var gizmoLayer: UtilityLayerRenderer = js.native
    
    /**
      * True when the mouse pointer is hovered a gizmo mesh
      */
    def isHovered: Boolean = js.native
    
    def scaleRatio: Double = js.native
    /**
      * Ratio for the scale of the gizmo (Default: 1)
      */
    def scaleRatio_=(value: Double): Unit = js.native
    
    /**
      * Disposes and replaces the current meshes in the gizmo with the specified mesh
      * @param mesh The mesh to replace the default mesh of the gizmo
      */
    def setCustomMesh(mesh: Mesh): Unit = js.native
    
    /**
      * If set the gizmo's position will be updated to match the attached mesh each frame (Default: true)
      */
    var updateGizmoPositionToMatchAttachedMesh: Boolean = js.native
    
    def updateGizmoRotationToMatchAttachedMesh: Boolean = js.native
    /**
      * If set the gizmo's rotation will be updated to match the attached mesh each frame (Default: true)
      */
    def updateGizmoRotationToMatchAttachedMesh_=(value: Boolean): Unit = js.native
    
    /**
      * When set, the gizmo will always appear the same size no matter where the camera is (default: true)
      */
    var updateScale: Boolean = js.native
  }
  /* static members */
  object Gizmo {
    
    /**
      * Subscribes to pointer up, down, and hover events. Used for responsive gizmos.
      * @param gizmoLayer The utility layer the gizmo will be added to
      * @param gizmoAxisCache Gizmo axis definition used for reactive gizmo UI
      * @returns {Observer<PointerInfo>} pointerObserver
      */
    @JSImport("babylonjs/Gizmos/gizmo", "Gizmo.GizmoAxisPointerObserver")
    @js.native
    def GizmoAxisPointerObserver(gizmoLayer: UtilityLayerRenderer, gizmoAxisCache: Map[Mesh, GizmoAxisCache]): Observer[PointerInfo] = js.native
  }
  
  @js.native
  trait GizmoAxisCache extends StObject {
    
    /** Used to indicate Active state of the Gizmo */
    var active: Boolean = js.native
    
    /** Mesh used to detect user interaction with Gizmo */
    var colliderMeshes: js.Array[Mesh] = js.native
    
    /** Material used to inicate disabled state of the Gizmo */
    var disableMaterial: StandardMaterial = js.native
    
    /** Mesh used to runder the Gizmo */
    var gizmoMeshes: js.Array[Mesh] = js.native
    
    /** Material used to inicate hover state of the Gizmo */
    var hoverMaterial: StandardMaterial = js.native
    
    /** Material used to inicate color of gizmo mesh */
    var material: StandardMaterial = js.native
  }
  object GizmoAxisCache {
    
    @scala.inline
    def apply(
      active: Boolean,
      colliderMeshes: js.Array[Mesh],
      disableMaterial: StandardMaterial,
      gizmoMeshes: js.Array[Mesh],
      hoverMaterial: StandardMaterial,
      material: StandardMaterial
    ): GizmoAxisCache = {
      val __obj = js.Dynamic.literal(active = active.asInstanceOf[js.Any], colliderMeshes = colliderMeshes.asInstanceOf[js.Any], disableMaterial = disableMaterial.asInstanceOf[js.Any], gizmoMeshes = gizmoMeshes.asInstanceOf[js.Any], hoverMaterial = hoverMaterial.asInstanceOf[js.Any], material = material.asInstanceOf[js.Any])
      __obj.asInstanceOf[GizmoAxisCache]
    }
    
    @scala.inline
    implicit class GizmoAxisCacheMutableBuilder[Self <: GizmoAxisCache] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setActive(value: Boolean): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColliderMeshes(value: js.Array[Mesh]): Self = StObject.set(x, "colliderMeshes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColliderMeshesVarargs(value: Mesh*): Self = StObject.set(x, "colliderMeshes", js.Array(value :_*))
      
      @scala.inline
      def setDisableMaterial(value: StandardMaterial): Self = StObject.set(x, "disableMaterial", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGizmoMeshes(value: js.Array[Mesh]): Self = StObject.set(x, "gizmoMeshes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGizmoMeshesVarargs(value: Mesh*): Self = StObject.set(x, "gizmoMeshes", js.Array(value :_*))
      
      @scala.inline
      def setHoverMaterial(value: StandardMaterial): Self = StObject.set(x, "hoverMaterial", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaterial(value: StandardMaterial): Self = StObject.set(x, "material", value.asInstanceOf[js.Any])
    }
  }
}
