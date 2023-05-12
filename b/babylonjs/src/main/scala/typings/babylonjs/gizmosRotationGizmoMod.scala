package typings.babylonjs

import typings.babylonjs.eventsPointerEventsMod.PointerInfo
import typings.babylonjs.gizmosGizmoManagerMod.GizmoManager
import typings.babylonjs.gizmosGizmoMod.Gizmo
import typings.babylonjs.gizmosGizmoMod.GizmoAxisCache
import typings.babylonjs.gizmosGizmoMod.IGizmo
import typings.babylonjs.gizmosPlaneRotationGizmoMod.IPlaneRotationGizmo
import typings.babylonjs.mathsMathDotcolorMod.Color3
import typings.babylonjs.meshesAbstractMeshMod.AbstractMesh
import typings.babylonjs.meshesMeshMod.Mesh
import typings.babylonjs.miscObservableMod.Observable
import typings.babylonjs.miscObservableMod.Observer
import typings.babylonjs.nodeMod.Node
import typings.babylonjs.renderingUtilityLayerRendererMod.UtilityLayerRenderer
import typings.babylonjs.typesMod.Nullable
import typings.std.Map
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object gizmosRotationGizmoMod {
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typings.babylonjs.sceneMod.IDisposable because Already inherited
  - typings.babylonjs.gizmosGizmoMod.IGizmo because Already inherited
  - typings.babylonjs.gizmosRotationGizmoMod.IRotationGizmo because var conflicts: _rootMesh, attachedMesh, attachedNode, customRotationQuaternion, gizmoLayer, isHovered, scaleRatio, updateGizmoPositionToMatchAttachedMesh, updateGizmoRotationToMatchAttachedMesh, updateScale. Inlined xGizmo, yGizmo, zGizmo, onDragStartObservable, onDragEndObservable, snapDistance, addToAxisCache */ @JSImport("babylonjs/Gizmos/rotationGizmo", "RotationGizmo")
  @js.native
  open class RotationGizmo protected () extends Gizmo {
    /**
      * Creates a RotationGizmo
      * @param gizmoLayer The utility layer the gizmo will be added to
      * @param tessellation Amount of tessellation to be used when creating rotation circles
      * @param useEulerRotation Use and update Euler angle instead of quaternion
      * @param thickness display gizmo axis thickness
      * @param gizmoManager Gizmo manager
      * @param options More options
      */
    def this(
      gizmoLayer: js.UndefOr[UtilityLayerRenderer],
      tessellation: js.UndefOr[Double],
      useEulerRotation: js.UndefOr[Boolean],
      thickness: js.UndefOr[Double],
      gizmoManager: js.UndefOr[GizmoManager],
      options: js.UndefOr[RotationGizmoOptions]
    ) = this()
    
    /* protected */ def _checkBillboardTransform(): Unit = js.native
    
    /** Node Caching for quick lookup */
    /* protected */ var _gizmoAxisCache: Map[Mesh, GizmoAxisCache] = js.native
    
    /* protected */ var _meshAttached: Nullable[AbstractMesh] = js.native
    
    /* protected */ var _nodeAttached: Nullable[Node] = js.native
    
    /* protected */ var _observables: js.Array[Observer[PointerInfo]] = js.native
    
    /**
      * Builds Gizmo Axis Cache to enable features such as hover state preservation and graying out other axis during manipulation
      * @param mesh Axis gizmo mesh
      * @param cache Gizmo axis definition used for reactive gizmo UI
      */
    def addToAxisCache(mesh: Mesh, cache: GizmoAxisCache): Unit = js.native
    
    @JSName("attachedMesh")
    def attachedMesh_MRotationGizmo: Nullable[AbstractMesh] = js.native
    
    @JSName("attachedNode")
    def attachedNode_MRotationGizmo: Nullable[Node] = js.native
    
    /**
      * True when the mouse pointer is hovering a gizmo mesh
      */
    @JSName("isHovered")
    def isHovered_MRotationGizmo: Boolean = js.native
    
    /** Fires an event when any of it's sub gizmos are released from dragging */
    var onDragEndObservable: Observable[Any] = js.native
    
    /** Fires an event when any of it's sub gizmos are dragged */
    var onDragStartObservable: Observable[Any] = js.native
    
    @JSName("scaleRatio")
    def scaleRatio_MRotationGizmo: Double = js.native
    
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
    var snapDistance_FRotationGizmo: Double = js.native
    
    @JSName("updateGizmoPositionToMatchAttachedMesh")
    def updateGizmoPositionToMatchAttachedMesh_MRotationGizmo: Boolean = js.native
    
    @JSName("updateGizmoRotationToMatchAttachedMesh")
    def updateGizmoRotationToMatchAttachedMesh_MRotationGizmo: Boolean = js.native
    
    @JSName("updateScale")
    def updateScale_MRotationGizmo: Boolean = js.native
    
    /**
      * Internal gizmo used for interactions on the x axis
      */
    var xGizmo: IPlaneRotationGizmo = js.native
    
    /**
      * Internal gizmo used for interactions on the y axis
      */
    var yGizmo: IPlaneRotationGizmo = js.native
    
    /**
      * Internal gizmo used for interactions on the z axis
      */
    var zGizmo: IPlaneRotationGizmo = js.native
  }
  
  trait IRotationGizmo
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
    
    /** Drag distance in babylon units that the gizmo will snap to when dragged */
    var snapDistance: Double
    
    /** Internal gizmo used for interactions on the x axis */
    var xGizmo: IPlaneRotationGizmo
    
    /** Internal gizmo used for interactions on the y axis */
    var yGizmo: IPlaneRotationGizmo
    
    /** Internal gizmo used for interactions on the z axis */
    var zGizmo: IPlaneRotationGizmo
  }
  object IRotationGizmo {
    
    inline def apply(
      _rootMesh: Mesh,
      addToAxisCache: (Mesh, GizmoAxisCache) => Unit,
      dispose: () => Unit,
      gizmoLayer: UtilityLayerRenderer,
      isHovered: Boolean,
      onDragEndObservable: Observable[Any],
      onDragStartObservable: Observable[Any],
      scaleRatio: Double,
      setCustomMesh: Mesh => Unit,
      snapDistance: Double,
      updateGizmoPositionToMatchAttachedMesh: Boolean,
      updateGizmoRotationToMatchAttachedMesh: Boolean,
      updateScale: Boolean,
      xGizmo: IPlaneRotationGizmo,
      yGizmo: IPlaneRotationGizmo,
      zGizmo: IPlaneRotationGizmo
    ): IRotationGizmo = {
      val __obj = js.Dynamic.literal(_rootMesh = _rootMesh.asInstanceOf[js.Any], addToAxisCache = js.Any.fromFunction2(addToAxisCache), dispose = js.Any.fromFunction0(dispose), gizmoLayer = gizmoLayer.asInstanceOf[js.Any], isHovered = isHovered.asInstanceOf[js.Any], onDragEndObservable = onDragEndObservable.asInstanceOf[js.Any], onDragStartObservable = onDragStartObservable.asInstanceOf[js.Any], scaleRatio = scaleRatio.asInstanceOf[js.Any], setCustomMesh = js.Any.fromFunction1(setCustomMesh), snapDistance = snapDistance.asInstanceOf[js.Any], updateGizmoPositionToMatchAttachedMesh = updateGizmoPositionToMatchAttachedMesh.asInstanceOf[js.Any], updateGizmoRotationToMatchAttachedMesh = updateGizmoRotationToMatchAttachedMesh.asInstanceOf[js.Any], updateScale = updateScale.asInstanceOf[js.Any], xGizmo = xGizmo.asInstanceOf[js.Any], yGizmo = yGizmo.asInstanceOf[js.Any], zGizmo = zGizmo.asInstanceOf[js.Any], attachedMesh = null, attachedNode = null, customRotationQuaternion = null)
      __obj.asInstanceOf[IRotationGizmo]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IRotationGizmo] (val x: Self) extends AnyVal {
      
      inline def setAddToAxisCache(value: (Mesh, GizmoAxisCache) => Unit): Self = StObject.set(x, "addToAxisCache", js.Any.fromFunction2(value))
      
      inline def setOnDragEndObservable(value: Observable[Any]): Self = StObject.set(x, "onDragEndObservable", value.asInstanceOf[js.Any])
      
      inline def setOnDragStartObservable(value: Observable[Any]): Self = StObject.set(x, "onDragStartObservable", value.asInstanceOf[js.Any])
      
      inline def setSnapDistance(value: Double): Self = StObject.set(x, "snapDistance", value.asInstanceOf[js.Any])
      
      inline def setXGizmo(value: IPlaneRotationGizmo): Self = StObject.set(x, "xGizmo", value.asInstanceOf[js.Any])
      
      inline def setYGizmo(value: IPlaneRotationGizmo): Self = StObject.set(x, "yGizmo", value.asInstanceOf[js.Any])
      
      inline def setZGizmo(value: IPlaneRotationGizmo): Self = StObject.set(x, "zGizmo", value.asInstanceOf[js.Any])
    }
  }
  
  trait PlaneRotationGizmoOptions extends StObject {
    
    /**
      * Color to use for the plane rotation gizmo
      */
    var color: js.UndefOr[Color3] = js.undefined
  }
  object PlaneRotationGizmoOptions {
    
    inline def apply(): PlaneRotationGizmoOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PlaneRotationGizmoOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PlaneRotationGizmoOptions] (val x: Self) extends AnyVal {
      
      inline def setColor(value: Color3): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    }
  }
  
  trait RotationGizmoOptions extends StObject {
    
    /**
      * When set, the gizmo will always appear the same size no matter where the camera is (default: true)
      */
    var updateScale: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Specific options for xGizmo
      */
    var xOptions: js.UndefOr[PlaneRotationGizmoOptions] = js.undefined
    
    /**
      * Specific options for yGizmo
      */
    var yOptions: js.UndefOr[PlaneRotationGizmoOptions] = js.undefined
    
    /**
      * Specific options for zGizmo
      */
    var zOptions: js.UndefOr[PlaneRotationGizmoOptions] = js.undefined
  }
  object RotationGizmoOptions {
    
    inline def apply(): RotationGizmoOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RotationGizmoOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: RotationGizmoOptions] (val x: Self) extends AnyVal {
      
      inline def setUpdateScale(value: Boolean): Self = StObject.set(x, "updateScale", value.asInstanceOf[js.Any])
      
      inline def setUpdateScaleUndefined: Self = StObject.set(x, "updateScale", js.undefined)
      
      inline def setXOptions(value: PlaneRotationGizmoOptions): Self = StObject.set(x, "xOptions", value.asInstanceOf[js.Any])
      
      inline def setXOptionsUndefined: Self = StObject.set(x, "xOptions", js.undefined)
      
      inline def setYOptions(value: PlaneRotationGizmoOptions): Self = StObject.set(x, "yOptions", value.asInstanceOf[js.Any])
      
      inline def setYOptionsUndefined: Self = StObject.set(x, "yOptions", js.undefined)
      
      inline def setZOptions(value: PlaneRotationGizmoOptions): Self = StObject.set(x, "zOptions", value.asInstanceOf[js.Any])
      
      inline def setZOptionsUndefined: Self = StObject.set(x, "zOptions", js.undefined)
    }
  }
}
