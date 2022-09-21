package typings.babylonjs

import typings.babylonjs.abstractMeshMod.AbstractMesh
import typings.babylonjs.axisDragGizmoMod.IAxisDragGizmo
import typings.babylonjs.gizmoManagerMod.GizmoManager
import typings.babylonjs.gizmoMod.Gizmo
import typings.babylonjs.gizmoMod.GizmoAxisCache
import typings.babylonjs.gizmoMod.IGizmo
import typings.babylonjs.meshMod.Mesh
import typings.babylonjs.nodeMod.Node
import typings.babylonjs.observableMod.Observable
import typings.babylonjs.observableMod.Observer
import typings.babylonjs.planeDragGizmoMod.IPlaneDragGizmo
import typings.babylonjs.pointerEventsMod.PointerInfo
import typings.babylonjs.typesMod.Nullable
import typings.babylonjs.utilityLayerRendererMod.UtilityLayerRenderer
import typings.std.Map
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object positionGizmoMod {
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typings.babylonjs.sceneMod.IDisposable because Already inherited
  - typings.babylonjs.gizmoMod.IGizmo because Already inherited
  - typings.babylonjs.positionGizmoMod.IPositionGizmo because var conflicts: _rootMesh, attachedMesh, attachedNode, customRotationQuaternion, gizmoLayer, isHovered, scaleRatio, updateGizmoPositionToMatchAttachedMesh, updateGizmoRotationToMatchAttachedMesh, updateScale. Inlined xGizmo, yGizmo, zGizmo, xPlaneGizmo, yPlaneGizmo, zPlaneGizmo, onDragStartObservable, onDragEndObservable, planarGizmoEnabled, snapDistance, addToAxisCache */ @JSImport("babylonjs/Gizmos/positionGizmo", "PositionGizmo")
  @js.native
  /**
    * Creates a PositionGizmo
    * @param gizmoLayer The utility layer the gizmo will be added to
    @param thickness display gizmo axis thickness
    * @param gizmoManager
    */
  open class PositionGizmo () extends Gizmo {
    def this(gizmoLayer: UtilityLayerRenderer) = this()
    def this(gizmoLayer: Unit, thickness: Double) = this()
    def this(gizmoLayer: UtilityLayerRenderer, thickness: Double) = this()
    def this(gizmoLayer: Unit, thickness: Double, gizmoManager: GizmoManager) = this()
    def this(gizmoLayer: Unit, thickness: Unit, gizmoManager: GizmoManager) = this()
    def this(gizmoLayer: UtilityLayerRenderer, thickness: Double, gizmoManager: GizmoManager) = this()
    def this(gizmoLayer: UtilityLayerRenderer, thickness: Unit, gizmoManager: GizmoManager) = this()
    
    /** Node Caching for quick lookup */
    /* protected */ var _gizmoAxisCache: Map[Mesh, GizmoAxisCache] = js.native
    
    /**
      * protected variables
      */
    /* protected */ var _meshAttached: Nullable[AbstractMesh] = js.native
    
    /* protected */ var _nodeAttached: Nullable[Node] = js.native
    
    /* protected */ var _observables: js.Array[Observer[PointerInfo]] = js.native
    
    /**
      * If set to true, planar drag is enabled
      */
    /* protected */ var _planarGizmoEnabled: Boolean = js.native
    
    /* protected */ var _snapDistance: Double = js.native
    
    /**
      * Builds Gizmo Axis Cache to enable features such as hover state preservation and graying out other axis during manipulation
      * @param mesh Axis gizmo mesh
      * @param cache Gizmo axis definition used for reactive gizmo UI
      */
    def addToAxisCache(mesh: Mesh, cache: GizmoAxisCache): Unit = js.native
    
    @JSName("attachedMesh")
    def attachedMesh_MPositionGizmo: Nullable[AbstractMesh] = js.native
    
    @JSName("attachedNode")
    def attachedNode_MPositionGizmo: Nullable[Node] = js.native
    
    /**
      * True when the mouse pointer is hovering a gizmo mesh
      */
    @JSName("isHovered")
    def isHovered_MPositionGizmo: Boolean = js.native
    
    /** Fires an event when any of it's sub gizmos are released from dragging */
    var onDragEndObservable: Observable[Any] = js.native
    
    /** Fires an event when any of it's sub gizmos are dragged */
    var onDragStartObservable: Observable[Any] = js.native
    
    def planarGizmoEnabled: Boolean = js.native
    /**
      * If the planar drag gizmo is enabled
      * setting this will enable/disable XY, XZ and YZ planes regardless of individual gizmo settings.
      */
    def planarGizmoEnabled_=(value: Boolean): Unit = js.native
    /**
      * If the planar drag gizmo is enabled
      * setting this will enable/disable XY, XZ and YZ planes regardless of individual gizmo settings.
      */
    @JSName("planarGizmoEnabled")
    var planarGizmoEnabled_FPositionGizmo: Boolean = js.native
    
    @JSName("scaleRatio")
    def scaleRatio_MPositionGizmo: Double = js.native
    
    /**
      * CustomMeshes are not supported by this gizmo
      */
    def setCustomMesh(): Unit = js.native
    
    def snapDistance: Double = js.native
    /**
      * Drag distance in babylon units that the gizmo will snap to when dragged (Default: 0)
      */
    def snapDistance_=(value: Double): Unit = js.native
    /** Drag distance in babylon units that the gizmo will snap to when dragged */
    @JSName("snapDistance")
    var snapDistance_FPositionGizmo: Double = js.native
    
    @JSName("updateGizmoRotationToMatchAttachedMesh")
    def updateGizmoRotationToMatchAttachedMesh_MPositionGizmo: Boolean = js.native
    
    /**
      * Internal gizmo used for interactions on the x axis
      */
    var xGizmo: IAxisDragGizmo = js.native
    
    /**
      * Internal gizmo used for interactions on the yz plane
      */
    var xPlaneGizmo: IPlaneDragGizmo = js.native
    
    /**
      * Internal gizmo used for interactions on the y axis
      */
    var yGizmo: IAxisDragGizmo = js.native
    
    /**
      * Internal gizmo used for interactions on the xz plane
      */
    var yPlaneGizmo: IPlaneDragGizmo = js.native
    
    /**
      * Internal gizmo used for interactions on the z axis
      */
    var zGizmo: IAxisDragGizmo = js.native
    
    /**
      * Internal gizmo used for interactions on the xy plane
      */
    var zPlaneGizmo: IPlaneDragGizmo = js.native
  }
  
  trait IPositionGizmo
    extends StObject
       with IGizmo {
    
    /**
      * Builds Gizmo Axis Cache to enable features such as hover state preservation and graying out other axis during manipulation
      * @param mesh Axis gizmo mesh
      * @param cache Gizmo axis definition used for reactive gizmo UI
      */
    def addToAxisCache(mesh: Mesh, cache: GizmoAxisCache): Unit
    
    /** Fires an event when any of it's sub gizmos are released from dragging */
    var onDragEndObservable: Observable[Any]
    
    /** Fires an event when any of it's sub gizmos are dragged */
    var onDragStartObservable: Observable[Any]
    
    /**
      * If the planar drag gizmo is enabled
      * setting this will enable/disable XY, XZ and YZ planes regardless of individual gizmo settings.
      */
    var planarGizmoEnabled: Boolean
    
    /** Drag distance in babylon units that the gizmo will snap to when dragged */
    var snapDistance: Double
    
    /** Internal gizmo used for interactions on the x axis */
    var xGizmo: IAxisDragGizmo
    
    /** Internal gizmo used for interactions on the yz plane */
    var xPlaneGizmo: IPlaneDragGizmo
    
    /** Internal gizmo used for interactions on the y axis */
    var yGizmo: IAxisDragGizmo
    
    /** Internal gizmo used for interactions on the xz plane */
    var yPlaneGizmo: IPlaneDragGizmo
    
    /** Internal gizmo used for interactions on the z axis */
    var zGizmo: IAxisDragGizmo
    
    /** Internal gizmo used for interactions on the xy plane */
    var zPlaneGizmo: IPlaneDragGizmo
  }
  object IPositionGizmo {
    
    inline def apply(
      _rootMesh: Mesh,
      addToAxisCache: (Mesh, GizmoAxisCache) => Unit,
      dispose: () => Unit,
      gizmoLayer: UtilityLayerRenderer,
      isHovered: Boolean,
      onDragEndObservable: Observable[Any],
      onDragStartObservable: Observable[Any],
      planarGizmoEnabled: Boolean,
      scaleRatio: Double,
      setCustomMesh: Mesh => Unit,
      snapDistance: Double,
      updateGizmoPositionToMatchAttachedMesh: Boolean,
      updateGizmoRotationToMatchAttachedMesh: Boolean,
      updateScale: Boolean,
      xGizmo: IAxisDragGizmo,
      xPlaneGizmo: IPlaneDragGizmo,
      yGizmo: IAxisDragGizmo,
      yPlaneGizmo: IPlaneDragGizmo,
      zGizmo: IAxisDragGizmo,
      zPlaneGizmo: IPlaneDragGizmo
    ): IPositionGizmo = {
      val __obj = js.Dynamic.literal(_rootMesh = _rootMesh.asInstanceOf[js.Any], addToAxisCache = js.Any.fromFunction2(addToAxisCache), dispose = js.Any.fromFunction0(dispose), gizmoLayer = gizmoLayer.asInstanceOf[js.Any], isHovered = isHovered.asInstanceOf[js.Any], onDragEndObservable = onDragEndObservable.asInstanceOf[js.Any], onDragStartObservable = onDragStartObservable.asInstanceOf[js.Any], planarGizmoEnabled = planarGizmoEnabled.asInstanceOf[js.Any], scaleRatio = scaleRatio.asInstanceOf[js.Any], setCustomMesh = js.Any.fromFunction1(setCustomMesh), snapDistance = snapDistance.asInstanceOf[js.Any], updateGizmoPositionToMatchAttachedMesh = updateGizmoPositionToMatchAttachedMesh.asInstanceOf[js.Any], updateGizmoRotationToMatchAttachedMesh = updateGizmoRotationToMatchAttachedMesh.asInstanceOf[js.Any], updateScale = updateScale.asInstanceOf[js.Any], xGizmo = xGizmo.asInstanceOf[js.Any], xPlaneGizmo = xPlaneGizmo.asInstanceOf[js.Any], yGizmo = yGizmo.asInstanceOf[js.Any], yPlaneGizmo = yPlaneGizmo.asInstanceOf[js.Any], zGizmo = zGizmo.asInstanceOf[js.Any], zPlaneGizmo = zPlaneGizmo.asInstanceOf[js.Any], attachedMesh = null, attachedNode = null, customRotationQuaternion = null)
      __obj.asInstanceOf[IPositionGizmo]
    }
    
    extension [Self <: IPositionGizmo](x: Self) {
      
      inline def setAddToAxisCache(value: (Mesh, GizmoAxisCache) => Unit): Self = StObject.set(x, "addToAxisCache", js.Any.fromFunction2(value))
      
      inline def setOnDragEndObservable(value: Observable[Any]): Self = StObject.set(x, "onDragEndObservable", value.asInstanceOf[js.Any])
      
      inline def setOnDragStartObservable(value: Observable[Any]): Self = StObject.set(x, "onDragStartObservable", value.asInstanceOf[js.Any])
      
      inline def setPlanarGizmoEnabled(value: Boolean): Self = StObject.set(x, "planarGizmoEnabled", value.asInstanceOf[js.Any])
      
      inline def setSnapDistance(value: Double): Self = StObject.set(x, "snapDistance", value.asInstanceOf[js.Any])
      
      inline def setXGizmo(value: IAxisDragGizmo): Self = StObject.set(x, "xGizmo", value.asInstanceOf[js.Any])
      
      inline def setXPlaneGizmo(value: IPlaneDragGizmo): Self = StObject.set(x, "xPlaneGizmo", value.asInstanceOf[js.Any])
      
      inline def setYGizmo(value: IAxisDragGizmo): Self = StObject.set(x, "yGizmo", value.asInstanceOf[js.Any])
      
      inline def setYPlaneGizmo(value: IPlaneDragGizmo): Self = StObject.set(x, "yPlaneGizmo", value.asInstanceOf[js.Any])
      
      inline def setZGizmo(value: IAxisDragGizmo): Self = StObject.set(x, "zGizmo", value.asInstanceOf[js.Any])
      
      inline def setZPlaneGizmo(value: IPlaneDragGizmo): Self = StObject.set(x, "zPlaneGizmo", value.asInstanceOf[js.Any])
    }
  }
}
