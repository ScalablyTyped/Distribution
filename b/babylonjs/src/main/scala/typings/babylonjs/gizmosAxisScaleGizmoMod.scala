package typings.babylonjs

import typings.babylonjs.anon.ArrowMesh
import typings.babylonjs.anon.SnapDistance
import typings.babylonjs.behaviorsMeshesPointerDragBehaviorMod.PointerDragBehavior
import typings.babylonjs.eventsPointerEventsMod.PointerInfo
import typings.babylonjs.gizmosGizmoMod.Gizmo
import typings.babylonjs.gizmosGizmoMod.IGizmo
import typings.babylonjs.gizmosScaleGizmoMod.ScaleGizmo
import typings.babylonjs.materialsStandardMaterialMod.StandardMaterial
import typings.babylonjs.mathsMathDotcolorMod.Color3
import typings.babylonjs.mathsMathDotvectorMod.Matrix
import typings.babylonjs.mathsMathDotvectorMod.Vector3
import typings.babylonjs.meshesAbstractMeshMod.AbstractMesh
import typings.babylonjs.meshesMeshMod.Mesh
import typings.babylonjs.miscObservableMod.Observable
import typings.babylonjs.miscObservableMod.Observer
import typings.babylonjs.renderingUtilityLayerRendererMod.UtilityLayerRenderer
import typings.babylonjs.typesMod.Nullable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object gizmosAxisScaleGizmoMod {
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typings.babylonjs.sceneMod.IDisposable because Already inherited
  - typings.babylonjs.gizmosGizmoMod.IGizmo because Already inherited
  - typings.babylonjs.gizmosAxisScaleGizmoMod.IAxisScaleGizmo because var conflicts: _rootMesh, attachedMesh, attachedNode, customRotationQuaternion, gizmoLayer, isHovered, scaleRatio, updateGizmoPositionToMatchAttachedMesh, updateGizmoRotationToMatchAttachedMesh, updateScale. Inlined dragBehavior, snapDistance, onSnapObservable, uniformScaling, sensitivity, dragScale, isEnabled */ @JSImport("babylonjs/Gizmos/axisScaleGizmo", "AxisScaleGizmo")
  @js.native
  open class AxisScaleGizmo protected () extends Gizmo {
    /**
      * Creates an AxisScaleGizmo
      * @param dragAxis The axis which the gizmo will be able to scale on
      * @param color The color of the gizmo
      * @param gizmoLayer The utility layer the gizmo will be added to
      * @param parent
      * @param thickness display gizmo axis thickness
      */
    def this(dragAxis: Vector3) = this()
    def this(dragAxis: Vector3, color: Color3) = this()
    def this(dragAxis: Vector3, color: Unit, gizmoLayer: UtilityLayerRenderer) = this()
    def this(dragAxis: Vector3, color: Color3, gizmoLayer: UtilityLayerRenderer) = this()
    def this(dragAxis: Vector3, color: Unit, gizmoLayer: Unit, parent: Nullable[ScaleGizmo]) = this()
    def this(dragAxis: Vector3, color: Unit, gizmoLayer: UtilityLayerRenderer, parent: Nullable[ScaleGizmo]) = this()
    def this(dragAxis: Vector3, color: Color3, gizmoLayer: Unit, parent: Nullable[ScaleGizmo]) = this()
    def this(dragAxis: Vector3, color: Color3, gizmoLayer: UtilityLayerRenderer, parent: Nullable[ScaleGizmo]) = this()
    def this(dragAxis: Vector3, color: Unit, gizmoLayer: Unit, parent: Unit, thickness: Double) = this()
    def this(dragAxis: Vector3, color: Unit, gizmoLayer: Unit, parent: Nullable[ScaleGizmo], thickness: Double) = this()
    def this(dragAxis: Vector3, color: Unit, gizmoLayer: UtilityLayerRenderer, parent: Unit, thickness: Double) = this()
    def this(
      dragAxis: Vector3,
      color: Unit,
      gizmoLayer: UtilityLayerRenderer,
      parent: Nullable[ScaleGizmo],
      thickness: Double
    ) = this()
    def this(dragAxis: Vector3, color: Color3, gizmoLayer: Unit, parent: Unit, thickness: Double) = this()
    def this(
      dragAxis: Vector3,
      color: Color3,
      gizmoLayer: Unit,
      parent: Nullable[ScaleGizmo],
      thickness: Double
    ) = this()
    def this(
      dragAxis: Vector3,
      color: Color3,
      gizmoLayer: UtilityLayerRenderer,
      parent: Unit,
      thickness: Double
    ) = this()
    def this(
      dragAxis: Vector3,
      color: Color3,
      gizmoLayer: UtilityLayerRenderer,
      parent: Nullable[ScaleGizmo],
      thickness: Double
    ) = this()
    
    /* protected */ var _coloredMaterial: StandardMaterial = js.native
    
    /**
      * Create Geometry for Gizmo
      * @param parentMesh
      * @param thickness
      * @param isCollider
      */
    /* protected */ def _createGizmoMesh(parentMesh: AbstractMesh, thickness: Double): ArrowMesh = js.native
    /* protected */ def _createGizmoMesh(parentMesh: AbstractMesh, thickness: Double, isCollider: Boolean): ArrowMesh = js.native
    
    /* protected */ var _disableMaterial: StandardMaterial = js.native
    
    /* protected */ var _dragging: Boolean = js.native
    
    /* protected */ var _gizmoMesh: Mesh = js.native
    
    /* protected */ var _hoverMaterial: StandardMaterial = js.native
    
    /* protected */ var _isEnabled: Boolean = js.native
    
    /* protected */ var _parent: Nullable[ScaleGizmo] = js.native
    
    /* protected */ var _pointerObserver: Nullable[Observer[PointerInfo]] = js.native
    
    /* protected */ var _tmpMatrix: Matrix = js.native
    
    /* protected */ var _tmpMatrix2: Matrix = js.native
    
    /* protected */ var _tmpVector: Vector3 = js.native
    
    /**
      * Drag behavior responsible for the gizmos dragging interactions
      */
    var dragBehavior: PointerDragBehavior = js.native
    
    /**
      * The magnitude of the drag strength (scaling factor)
      */
    var dragScale: Double = js.native
    
    def isEnabled: Boolean = js.native
    /**
      * If the gizmo is enabled
      */
    def isEnabled_=(value: Boolean): Unit = js.native
    /** If the gizmo is enabled */
    @JSName("isEnabled")
    var isEnabled_FAxisScaleGizmo: Boolean = js.native
    
    /**
      * Event that fires each time the gizmo snaps to a new location.
      * * snapDistance is the the change in distance
      */
    var onSnapObservable: Observable[SnapDistance] = js.native
    
    /**
      * Custom sensitivity value for the drag strength
      */
    var sensitivity: Double = js.native
    
    def setCustomMesh(mesh: Mesh, useGizmoMaterial: Boolean): Unit = js.native
    
    /**
      * Scale distance in babylon units that the gizmo will snap to when dragged (Default: 0)
      */
    var snapDistance: Double = js.native
    
    /**
      * If the scaling operation should be done on all axis (default: false)
      */
    var uniformScaling: Boolean = js.native
  }
  
  trait IAxisScaleGizmo
    extends StObject
       with IGizmo {
    
    /** Drag behavior responsible for the gizmos dragging interactions */
    var dragBehavior: PointerDragBehavior
    
    /** The magnitude of the drag strength (scaling factor) */
    var dragScale: Double
    
    /** If the gizmo is enabled */
    var isEnabled: Boolean
    
    /**
      * Event that fires each time the gizmo snaps to a new location.
      * * snapDistance is the the change in distance
      */
    var onSnapObservable: Observable[SnapDistance]
    
    /** Custom sensitivity value for the drag strength */
    var sensitivity: Double
    
    /** Drag distance in babylon units that the gizmo will snap to when dragged */
    var snapDistance: Double
    
    /** If the scaling operation should be done on all axis */
    var uniformScaling: Boolean
  }
  object IAxisScaleGizmo {
    
    inline def apply(
      _rootMesh: Mesh,
      dispose: () => Unit,
      dragBehavior: PointerDragBehavior,
      dragScale: Double,
      gizmoLayer: UtilityLayerRenderer,
      isEnabled: Boolean,
      isHovered: Boolean,
      onSnapObservable: Observable[SnapDistance],
      scaleRatio: Double,
      sensitivity: Double,
      setCustomMesh: Mesh => Unit,
      snapDistance: Double,
      uniformScaling: Boolean,
      updateGizmoPositionToMatchAttachedMesh: Boolean,
      updateGizmoRotationToMatchAttachedMesh: Boolean,
      updateScale: Boolean
    ): IAxisScaleGizmo = {
      val __obj = js.Dynamic.literal(_rootMesh = _rootMesh.asInstanceOf[js.Any], dispose = js.Any.fromFunction0(dispose), dragBehavior = dragBehavior.asInstanceOf[js.Any], dragScale = dragScale.asInstanceOf[js.Any], gizmoLayer = gizmoLayer.asInstanceOf[js.Any], isEnabled = isEnabled.asInstanceOf[js.Any], isHovered = isHovered.asInstanceOf[js.Any], onSnapObservable = onSnapObservable.asInstanceOf[js.Any], scaleRatio = scaleRatio.asInstanceOf[js.Any], sensitivity = sensitivity.asInstanceOf[js.Any], setCustomMesh = js.Any.fromFunction1(setCustomMesh), snapDistance = snapDistance.asInstanceOf[js.Any], uniformScaling = uniformScaling.asInstanceOf[js.Any], updateGizmoPositionToMatchAttachedMesh = updateGizmoPositionToMatchAttachedMesh.asInstanceOf[js.Any], updateGizmoRotationToMatchAttachedMesh = updateGizmoRotationToMatchAttachedMesh.asInstanceOf[js.Any], updateScale = updateScale.asInstanceOf[js.Any], attachedMesh = null, attachedNode = null, customRotationQuaternion = null)
      __obj.asInstanceOf[IAxisScaleGizmo]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IAxisScaleGizmo] (val x: Self) extends AnyVal {
      
      inline def setDragBehavior(value: PointerDragBehavior): Self = StObject.set(x, "dragBehavior", value.asInstanceOf[js.Any])
      
      inline def setDragScale(value: Double): Self = StObject.set(x, "dragScale", value.asInstanceOf[js.Any])
      
      inline def setIsEnabled(value: Boolean): Self = StObject.set(x, "isEnabled", value.asInstanceOf[js.Any])
      
      inline def setOnSnapObservable(value: Observable[SnapDistance]): Self = StObject.set(x, "onSnapObservable", value.asInstanceOf[js.Any])
      
      inline def setSensitivity(value: Double): Self = StObject.set(x, "sensitivity", value.asInstanceOf[js.Any])
      
      inline def setSnapDistance(value: Double): Self = StObject.set(x, "snapDistance", value.asInstanceOf[js.Any])
      
      inline def setUniformScaling(value: Boolean): Self = StObject.set(x, "uniformScaling", value.asInstanceOf[js.Any])
    }
  }
}
