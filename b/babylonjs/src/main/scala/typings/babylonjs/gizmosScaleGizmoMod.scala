package typings.babylonjs

import typings.babylonjs.eventsPointerEventsMod.PointerInfo
import typings.babylonjs.gizmosAxisScaleGizmoMod.AxisScaleGizmo
import typings.babylonjs.gizmosAxisScaleGizmoMod.IAxisScaleGizmo
import typings.babylonjs.gizmosGizmoManagerMod.GizmoManager
import typings.babylonjs.gizmosGizmoMod.Gizmo
import typings.babylonjs.gizmosGizmoMod.GizmoAxisCache
import typings.babylonjs.gizmosGizmoMod.IGizmo
import typings.babylonjs.materialsStandardMaterialMod.StandardMaterial
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

object gizmosScaleGizmoMod {
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typings.babylonjs.sceneMod.IDisposable because Already inherited
  - typings.babylonjs.gizmosGizmoMod.IGizmo because Already inherited
  - typings.babylonjs.gizmosScaleGizmoMod.IScaleGizmo because var conflicts: _rootMesh, attachedMesh, attachedNode, customRotationQuaternion, gizmoLayer, isHovered, scaleRatio, updateGizmoPositionToMatchAttachedMesh, updateGizmoRotationToMatchAttachedMesh, updateScale. Inlined xGizmo, yGizmo, zGizmo, uniformScaleGizmo, onDragStartObservable, onDragEndObservable, snapDistance, sensitivity, addToAxisCache, coloredMaterial, hoverMaterial, disableMaterial */ @JSImport("babylonjs/Gizmos/scaleGizmo", "ScaleGizmo")
  @js.native
  /**
    * Creates a ScaleGizmo
    * @param gizmoLayer The utility layer the gizmo will be added to
    * @param thickness display gizmo axis thickness
    * @param gizmoManager
    */
  open class ScaleGizmo () extends Gizmo {
    def this(gizmoLayer: UtilityLayerRenderer) = this()
    def this(gizmoLayer: Unit, thickness: Double) = this()
    def this(gizmoLayer: UtilityLayerRenderer, thickness: Double) = this()
    def this(gizmoLayer: Unit, thickness: Double, gizmoManager: GizmoManager) = this()
    def this(gizmoLayer: Unit, thickness: Unit, gizmoManager: GizmoManager) = this()
    def this(gizmoLayer: UtilityLayerRenderer, thickness: Double, gizmoManager: GizmoManager) = this()
    def this(gizmoLayer: UtilityLayerRenderer, thickness: Unit, gizmoManager: GizmoManager) = this()
    
    /* protected */ var _coloredMaterial: StandardMaterial = js.native
    
    /** Create Geometry for Gizmo */
    /* protected */ def _createUniformScaleMesh(): AxisScaleGizmo = js.native
    
    /* protected */ var _disableMaterial: StandardMaterial = js.native
    
    /** Node Caching for quick lookup */
    /* protected */ var _gizmoAxisCache: Map[Mesh, GizmoAxisCache] = js.native
    
    /* protected */ var _hoverMaterial: StandardMaterial = js.native
    
    /* protected */ var _meshAttached: Nullable[AbstractMesh] = js.native
    
    /* protected */ var _nodeAttached: Nullable[Node] = js.native
    
    /* protected */ var _observables: js.Array[Observer[PointerInfo]] = js.native
    
    /* protected */ var _octahedron: Mesh = js.native
    
    /* protected */ var _sensitivity: Double = js.native
    
    /* protected */ var _snapDistance: Double = js.native
    
    /* protected */ var _uniformScalingMesh: Mesh = js.native
    
    /**
      * Builds Gizmo Axis Cache to enable features such as hover state preservation and graying out other axis during manipulation
      * @param mesh Axis gizmo mesh
      * @param cache Gizmo axis definition used for reactive gizmo UI
      */
    def addToAxisCache(mesh: Mesh, cache: GizmoAxisCache): Unit = js.native
    
    @JSName("attachedMesh")
    def attachedMesh_MScaleGizmo: Nullable[AbstractMesh] = js.native
    
    @JSName("attachedNode")
    def attachedNode_MScaleGizmo: Nullable[Node] = js.native
    
    /** Default material used to render when gizmo is not disabled or hovered */
    def coloredMaterial: StandardMaterial = js.native
    /** Default material used to render when gizmo is not disabled or hovered */
    @JSName("coloredMaterial")
    var coloredMaterial_FScaleGizmo: StandardMaterial = js.native
    
    /** Material used to render when gizmo is disabled. typically grey.*/
    def disableMaterial: StandardMaterial = js.native
    /** Material used to render when gizmo is disabled. typically grey.*/
    @JSName("disableMaterial")
    var disableMaterial_FScaleGizmo: StandardMaterial = js.native
    
    /** Material used to render when gizmo is hovered with mouse*/
    def hoverMaterial: StandardMaterial = js.native
    /** Material used to render when gizmo is hovered with mouse*/
    @JSName("hoverMaterial")
    var hoverMaterial_FScaleGizmo: StandardMaterial = js.native
    
    /**
      * True when the mouse pointer is hovering a gizmo mesh
      */
    @JSName("isHovered")
    def isHovered_MScaleGizmo: Boolean = js.native
    
    /** Fires an event when any of it's sub gizmos are released from dragging */
    var onDragEndObservable: Observable[Any] = js.native
    
    /** Fires an event when any of it's sub gizmos are dragged */
    var onDragStartObservable: Observable[Any] = js.native
    
    @JSName("scaleRatio")
    def scaleRatio_MScaleGizmo: Double = js.native
    
    def sensitivity: Double = js.native
    /**
      * Sensitivity factor for dragging (Default: 1)
      */
    def sensitivity_=(value: Double): Unit = js.native
    /** Sensitivity factor for dragging */
    @JSName("sensitivity")
    var sensitivity_FScaleGizmo: Double = js.native
    
    def snapDistance: Double = js.native
    /**
      * Drag distance in babylon units that the gizmo will snap to when dragged (Default: 0)
      */
    def snapDistance_=(value: Double): Unit = js.native
    /** Drag distance in babylon units that the gizmo will snap to when dragged */
    @JSName("snapDistance")
    var snapDistance_FScaleGizmo: Double = js.native
    
    /**
      * Internal gizmo used to scale all axis equally
      */
    var uniformScaleGizmo: IAxisScaleGizmo = js.native
    
    @JSName("updateGizmoRotationToMatchAttachedMesh")
    def updateGizmoRotationToMatchAttachedMesh_MScaleGizmo: Boolean = js.native
    
    @JSName("updateScale")
    def updateScale_MScaleGizmo: Boolean = js.native
    
    /**
      * Internal gizmo used for interactions on the x axis
      */
    var xGizmo: IAxisScaleGizmo = js.native
    
    /**
      * Internal gizmo used for interactions on the y axis
      */
    var yGizmo: IAxisScaleGizmo = js.native
    
    /**
      * Internal gizmo used for interactions on the z axis
      */
    var zGizmo: IAxisScaleGizmo = js.native
  }
  
  trait IScaleGizmo
    extends StObject
       with IGizmo {
    
    /**
      * Builds Gizmo Axis Cache to enable features such as hover state preservation and graying out other axis during manipulation
      * @param mesh Axis gizmo mesh
      * @param cache Gizmo axis definition used for reactive gizmo UI
      */
    def addToAxisCache(mesh: Mesh, cache: GizmoAxisCache): Unit
    
    /** Default material used to render when gizmo is not disabled or hovered */
    var coloredMaterial: StandardMaterial
    
    /** Material used to render when gizmo is disabled. typically grey.*/
    var disableMaterial: StandardMaterial
    
    /** Material used to render when gizmo is hovered with mouse*/
    var hoverMaterial: StandardMaterial
    
    /** Fires an event when any of it's sub gizmos are released from dragging */
    var onDragEndObservable: Observable[Any]
    
    /** Fires an event when any of it's sub gizmos are dragged */
    var onDragStartObservable: Observable[Any]
    
    /** Sensitivity factor for dragging */
    var sensitivity: Double
    
    /** Drag distance in babylon units that the gizmo will snap to when dragged */
    var snapDistance: Double
    
    /** Internal gizmo used to scale all axis equally*/
    var uniformScaleGizmo: IAxisScaleGizmo
    
    /** Internal gizmo used for interactions on the x axis */
    var xGizmo: IAxisScaleGizmo
    
    /** Internal gizmo used for interactions on the y axis */
    var yGizmo: IAxisScaleGizmo
    
    /** Internal gizmo used for interactions on the z axis */
    var zGizmo: IAxisScaleGizmo
  }
  object IScaleGizmo {
    
    inline def apply(
      _rootMesh: Mesh,
      addToAxisCache: (Mesh, GizmoAxisCache) => Unit,
      coloredMaterial: StandardMaterial,
      disableMaterial: StandardMaterial,
      dispose: () => Unit,
      gizmoLayer: UtilityLayerRenderer,
      hoverMaterial: StandardMaterial,
      isHovered: Boolean,
      onDragEndObservable: Observable[Any],
      onDragStartObservable: Observable[Any],
      scaleRatio: Double,
      sensitivity: Double,
      setCustomMesh: Mesh => Unit,
      snapDistance: Double,
      uniformScaleGizmo: IAxisScaleGizmo,
      updateGizmoPositionToMatchAttachedMesh: Boolean,
      updateGizmoRotationToMatchAttachedMesh: Boolean,
      updateScale: Boolean,
      xGizmo: IAxisScaleGizmo,
      yGizmo: IAxisScaleGizmo,
      zGizmo: IAxisScaleGizmo
    ): IScaleGizmo = {
      val __obj = js.Dynamic.literal(_rootMesh = _rootMesh.asInstanceOf[js.Any], addToAxisCache = js.Any.fromFunction2(addToAxisCache), coloredMaterial = coloredMaterial.asInstanceOf[js.Any], disableMaterial = disableMaterial.asInstanceOf[js.Any], dispose = js.Any.fromFunction0(dispose), gizmoLayer = gizmoLayer.asInstanceOf[js.Any], hoverMaterial = hoverMaterial.asInstanceOf[js.Any], isHovered = isHovered.asInstanceOf[js.Any], onDragEndObservable = onDragEndObservable.asInstanceOf[js.Any], onDragStartObservable = onDragStartObservable.asInstanceOf[js.Any], scaleRatio = scaleRatio.asInstanceOf[js.Any], sensitivity = sensitivity.asInstanceOf[js.Any], setCustomMesh = js.Any.fromFunction1(setCustomMesh), snapDistance = snapDistance.asInstanceOf[js.Any], uniformScaleGizmo = uniformScaleGizmo.asInstanceOf[js.Any], updateGizmoPositionToMatchAttachedMesh = updateGizmoPositionToMatchAttachedMesh.asInstanceOf[js.Any], updateGizmoRotationToMatchAttachedMesh = updateGizmoRotationToMatchAttachedMesh.asInstanceOf[js.Any], updateScale = updateScale.asInstanceOf[js.Any], xGizmo = xGizmo.asInstanceOf[js.Any], yGizmo = yGizmo.asInstanceOf[js.Any], zGizmo = zGizmo.asInstanceOf[js.Any], attachedMesh = null, attachedNode = null, customRotationQuaternion = null)
      __obj.asInstanceOf[IScaleGizmo]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IScaleGizmo] (val x: Self) extends AnyVal {
      
      inline def setAddToAxisCache(value: (Mesh, GizmoAxisCache) => Unit): Self = StObject.set(x, "addToAxisCache", js.Any.fromFunction2(value))
      
      inline def setColoredMaterial(value: StandardMaterial): Self = StObject.set(x, "coloredMaterial", value.asInstanceOf[js.Any])
      
      inline def setDisableMaterial(value: StandardMaterial): Self = StObject.set(x, "disableMaterial", value.asInstanceOf[js.Any])
      
      inline def setHoverMaterial(value: StandardMaterial): Self = StObject.set(x, "hoverMaterial", value.asInstanceOf[js.Any])
      
      inline def setOnDragEndObservable(value: Observable[Any]): Self = StObject.set(x, "onDragEndObservable", value.asInstanceOf[js.Any])
      
      inline def setOnDragStartObservable(value: Observable[Any]): Self = StObject.set(x, "onDragStartObservable", value.asInstanceOf[js.Any])
      
      inline def setSensitivity(value: Double): Self = StObject.set(x, "sensitivity", value.asInstanceOf[js.Any])
      
      inline def setSnapDistance(value: Double): Self = StObject.set(x, "snapDistance", value.asInstanceOf[js.Any])
      
      inline def setUniformScaleGizmo(value: IAxisScaleGizmo): Self = StObject.set(x, "uniformScaleGizmo", value.asInstanceOf[js.Any])
      
      inline def setXGizmo(value: IAxisScaleGizmo): Self = StObject.set(x, "xGizmo", value.asInstanceOf[js.Any])
      
      inline def setYGizmo(value: IAxisScaleGizmo): Self = StObject.set(x, "yGizmo", value.asInstanceOf[js.Any])
      
      inline def setZGizmo(value: IAxisScaleGizmo): Self = StObject.set(x, "zGizmo", value.asInstanceOf[js.Any])
    }
  }
}
