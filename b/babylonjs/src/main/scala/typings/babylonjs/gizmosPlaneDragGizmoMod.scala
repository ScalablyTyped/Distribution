package typings.babylonjs

import typings.babylonjs.anon.SnapDistance
import typings.babylonjs.behaviorsMeshesPointerDragBehaviorMod.PointerDragBehavior
import typings.babylonjs.eventsPointerEventsMod.PointerInfo
import typings.babylonjs.gizmosGizmoMod.Gizmo
import typings.babylonjs.gizmosGizmoMod.IGizmo
import typings.babylonjs.gizmosPositionGizmoMod.PositionGizmo
import typings.babylonjs.materialsStandardMaterialMod.StandardMaterial
import typings.babylonjs.mathsMathDotcolorMod.Color3
import typings.babylonjs.mathsMathDotvectorMod.Vector3
import typings.babylonjs.meshesMeshMod.Mesh
import typings.babylonjs.meshesTransformNodeMod.TransformNode
import typings.babylonjs.miscObservableMod.Observable
import typings.babylonjs.miscObservableMod.Observer
import typings.babylonjs.renderingUtilityLayerRendererMod.UtilityLayerRenderer
import typings.babylonjs.sceneMod.Scene
import typings.babylonjs.typesMod.Nullable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object gizmosPlaneDragGizmoMod {
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typings.babylonjs.sceneMod.IDisposable because Already inherited
  - typings.babylonjs.gizmosGizmoMod.IGizmo because Already inherited
  - typings.babylonjs.gizmosPlaneDragGizmoMod.IPlaneDragGizmo because var conflicts: _rootMesh, attachedMesh, attachedNode, customRotationQuaternion, gizmoLayer, isHovered, scaleRatio, updateGizmoPositionToMatchAttachedMesh, updateGizmoRotationToMatchAttachedMesh, updateScale. Inlined dragBehavior, snapDistance, onSnapObservable, isEnabled, coloredMaterial, hoverMaterial, disableMaterial */ @JSImport("babylonjs/Gizmos/planeDragGizmo", "PlaneDragGizmo")
  @js.native
  open class PlaneDragGizmo protected () extends Gizmo {
    /**
      * Creates a PlaneDragGizmo
      * @param dragPlaneNormal The axis normal to which the gizmo will be able to drag on
      * @param color The color of the gizmo
      * @param gizmoLayer The utility layer the gizmo will be added to
      * @param parent
      */
    def this(dragPlaneNormal: Vector3) = this()
    def this(dragPlaneNormal: Vector3, color: Color3) = this()
    def this(dragPlaneNormal: Vector3, color: Unit, gizmoLayer: UtilityLayerRenderer) = this()
    def this(dragPlaneNormal: Vector3, color: Color3, gizmoLayer: UtilityLayerRenderer) = this()
    def this(dragPlaneNormal: Vector3, color: Unit, gizmoLayer: Unit, parent: Nullable[PositionGizmo]) = this()
    def this(
      dragPlaneNormal: Vector3,
      color: Unit,
      gizmoLayer: UtilityLayerRenderer,
      parent: Nullable[PositionGizmo]
    ) = this()
    def this(dragPlaneNormal: Vector3, color: Color3, gizmoLayer: Unit, parent: Nullable[PositionGizmo]) = this()
    def this(
      dragPlaneNormal: Vector3,
      color: Color3,
      gizmoLayer: UtilityLayerRenderer,
      parent: Nullable[PositionGizmo]
    ) = this()
    
    /* protected */ var _coloredMaterial: StandardMaterial = js.native
    
    /* protected */ var _disableMaterial: StandardMaterial = js.native
    
    /* protected */ var _dragging: Boolean = js.native
    
    /* protected */ var _gizmoMesh: TransformNode = js.native
    
    /* protected */ var _hoverMaterial: StandardMaterial = js.native
    
    /* protected */ var _isEnabled: Boolean = js.native
    
    /* protected */ var _parent: Nullable[PositionGizmo] = js.native
    
    /* protected */ var _pointerObserver: Nullable[Observer[PointerInfo]] = js.native
    
    /** Default material used to render when gizmo is not disabled or hovered */
    def coloredMaterial: StandardMaterial = js.native
    /** Default material used to render when gizmo is not disabled or hovered */
    @JSName("coloredMaterial")
    var coloredMaterial_FPlaneDragGizmo: StandardMaterial = js.native
    
    /** Material used to render when gizmo is disabled. typically grey.*/
    def disableMaterial: StandardMaterial = js.native
    /** Material used to render when gizmo is disabled. typically grey.*/
    @JSName("disableMaterial")
    var disableMaterial_FPlaneDragGizmo: StandardMaterial = js.native
    
    /**
      * Drag behavior responsible for the gizmos dragging interactions
      */
    var dragBehavior: PointerDragBehavior = js.native
    
    /** Material used to render when gizmo is hovered with mouse*/
    def hoverMaterial: StandardMaterial = js.native
    /** Material used to render when gizmo is hovered with mouse*/
    @JSName("hoverMaterial")
    var hoverMaterial_FPlaneDragGizmo: StandardMaterial = js.native
    
    def isEnabled: Boolean = js.native
    /**
      * If the gizmo is enabled
      */
    def isEnabled_=(value: Boolean): Unit = js.native
    /** If the gizmo is enabled */
    @JSName("isEnabled")
    var isEnabled_FPlaneDragGizmo: Boolean = js.native
    
    /**
      * Event that fires each time the gizmo snaps to a new location.
      * * snapDistance is the the change in distance
      */
    var onSnapObservable: Observable[SnapDistance] = js.native
    
    /**
      * Drag distance in babylon units that the gizmo will snap to when dragged (Default: 0)
      */
    var snapDistance: Double = js.native
  }
  /* static members */
  object PlaneDragGizmo {
    
    @JSImport("babylonjs/Gizmos/planeDragGizmo", "PlaneDragGizmo")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * @internal
      */
    inline def _CreatePlane(scene: Scene, material: StandardMaterial): TransformNode = (^.asInstanceOf[js.Dynamic].applyDynamic("_CreatePlane")(scene.asInstanceOf[js.Any], material.asInstanceOf[js.Any])).asInstanceOf[TransformNode]
  }
  
  trait IPlaneDragGizmo
    extends StObject
       with IGizmo {
    
    /** Default material used to render when gizmo is not disabled or hovered */
    var coloredMaterial: StandardMaterial
    
    /** Material used to render when gizmo is disabled. typically grey.*/
    var disableMaterial: StandardMaterial
    
    /** Drag behavior responsible for the gizmos dragging interactions */
    var dragBehavior: PointerDragBehavior
    
    /** Material used to render when gizmo is hovered with mouse*/
    var hoverMaterial: StandardMaterial
    
    /** If the gizmo is enabled */
    var isEnabled: Boolean
    
    /**
      * Event that fires each time the gizmo snaps to a new location.
      * * snapDistance is the the change in distance
      */
    var onSnapObservable: Observable[SnapDistance]
    
    /** Drag distance in babylon units that the gizmo will snap to when dragged */
    var snapDistance: Double
  }
  object IPlaneDragGizmo {
    
    inline def apply(
      _rootMesh: Mesh,
      coloredMaterial: StandardMaterial,
      disableMaterial: StandardMaterial,
      dispose: () => Unit,
      dragBehavior: PointerDragBehavior,
      gizmoLayer: UtilityLayerRenderer,
      hoverMaterial: StandardMaterial,
      isEnabled: Boolean,
      isHovered: Boolean,
      onSnapObservable: Observable[SnapDistance],
      scaleRatio: Double,
      setCustomMesh: Mesh => Unit,
      snapDistance: Double,
      updateGizmoPositionToMatchAttachedMesh: Boolean,
      updateGizmoRotationToMatchAttachedMesh: Boolean,
      updateScale: Boolean
    ): IPlaneDragGizmo = {
      val __obj = js.Dynamic.literal(_rootMesh = _rootMesh.asInstanceOf[js.Any], coloredMaterial = coloredMaterial.asInstanceOf[js.Any], disableMaterial = disableMaterial.asInstanceOf[js.Any], dispose = js.Any.fromFunction0(dispose), dragBehavior = dragBehavior.asInstanceOf[js.Any], gizmoLayer = gizmoLayer.asInstanceOf[js.Any], hoverMaterial = hoverMaterial.asInstanceOf[js.Any], isEnabled = isEnabled.asInstanceOf[js.Any], isHovered = isHovered.asInstanceOf[js.Any], onSnapObservable = onSnapObservable.asInstanceOf[js.Any], scaleRatio = scaleRatio.asInstanceOf[js.Any], setCustomMesh = js.Any.fromFunction1(setCustomMesh), snapDistance = snapDistance.asInstanceOf[js.Any], updateGizmoPositionToMatchAttachedMesh = updateGizmoPositionToMatchAttachedMesh.asInstanceOf[js.Any], updateGizmoRotationToMatchAttachedMesh = updateGizmoRotationToMatchAttachedMesh.asInstanceOf[js.Any], updateScale = updateScale.asInstanceOf[js.Any], attachedMesh = null, attachedNode = null, customRotationQuaternion = null)
      __obj.asInstanceOf[IPlaneDragGizmo]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IPlaneDragGizmo] (val x: Self) extends AnyVal {
      
      inline def setColoredMaterial(value: StandardMaterial): Self = StObject.set(x, "coloredMaterial", value.asInstanceOf[js.Any])
      
      inline def setDisableMaterial(value: StandardMaterial): Self = StObject.set(x, "disableMaterial", value.asInstanceOf[js.Any])
      
      inline def setDragBehavior(value: PointerDragBehavior): Self = StObject.set(x, "dragBehavior", value.asInstanceOf[js.Any])
      
      inline def setHoverMaterial(value: StandardMaterial): Self = StObject.set(x, "hoverMaterial", value.asInstanceOf[js.Any])
      
      inline def setIsEnabled(value: Boolean): Self = StObject.set(x, "isEnabled", value.asInstanceOf[js.Any])
      
      inline def setOnSnapObservable(value: Observable[SnapDistance]): Self = StObject.set(x, "onSnapObservable", value.asInstanceOf[js.Any])
      
      inline def setSnapDistance(value: Double): Self = StObject.set(x, "snapDistance", value.asInstanceOf[js.Any])
    }
  }
}
