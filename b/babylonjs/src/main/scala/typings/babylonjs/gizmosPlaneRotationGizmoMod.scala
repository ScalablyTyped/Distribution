package typings.babylonjs

import typings.babylonjs.anon.Collider
import typings.babylonjs.anon.SnapDistance
import typings.babylonjs.behaviorsMeshesPointerDragBehaviorMod.PointerDragBehavior
import typings.babylonjs.eventsPointerEventsMod.PointerInfo
import typings.babylonjs.gizmosGizmoMod.Gizmo
import typings.babylonjs.gizmosGizmoMod.IGizmo
import typings.babylonjs.gizmosRotationGizmoMod.RotationGizmo
import typings.babylonjs.materialsShaderMaterialMod.ShaderMaterial
import typings.babylonjs.materialsStandardMaterialMod.StandardMaterial
import typings.babylonjs.mathsMathDotcolorMod.Color3
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

object gizmosPlaneRotationGizmoMod {
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typings.babylonjs.sceneMod.IDisposable because Already inherited
  - typings.babylonjs.gizmosGizmoMod.IGizmo because Already inherited
  - typings.babylonjs.gizmosPlaneRotationGizmoMod.IPlaneRotationGizmo because var conflicts: _rootMesh, attachedMesh, attachedNode, customRotationQuaternion, gizmoLayer, isHovered, scaleRatio, updateGizmoPositionToMatchAttachedMesh, updateGizmoRotationToMatchAttachedMesh, updateScale. Inlined dragBehavior, snapDistance, onSnapObservable, angle, isEnabled, coloredMaterial, hoverMaterial, disableMaterial */ @JSImport("babylonjs/Gizmos/planeRotationGizmo", "PlaneRotationGizmo")
  @js.native
  open class PlaneRotationGizmo protected () extends Gizmo {
    /**
      * Creates a PlaneRotationGizmo
      * @param planeNormal The normal of the plane which the gizmo will be able to rotate on
      * @param color The color of the gizmo
      * @param gizmoLayer The utility layer the gizmo will be added to
      * @param tessellation Amount of tessellation to be used when creating rotation circles
      * @param parent
      * @param useEulerRotation Use and update Euler angle instead of quaternion
      * @param thickness display gizmo axis thickness
      */
    def this(
      planeNormal: Vector3,
      color: js.UndefOr[Color3],
      gizmoLayer: js.UndefOr[UtilityLayerRenderer],
      tessellation: js.UndefOr[Double],
      parent: js.UndefOr[Nullable[RotationGizmo]],
      useEulerRotation: js.UndefOr[Boolean],
      thickness: js.UndefOr[Double]
    ) = this()
    
    /* protected */ var _angles: Vector3 = js.native
    
    /* protected */ var _coloredMaterial: StandardMaterial = js.native
    
    /**
      * Create Geometry for Gizmo
      * @param parentMesh
      * @param thickness
      * @param tessellation
      */
    /* protected */ def _createGizmoMesh(parentMesh: AbstractMesh, thickness: Double, tessellation: Double): Collider = js.native
    
    /* protected */ var _disableMaterial: StandardMaterial = js.native
    
    /* protected */ var _dragging: Boolean = js.native
    
    /* protected */ var _gizmoMesh: Mesh = js.native
    
    /* protected */ var _hoverMaterial: StandardMaterial = js.native
    
    /* protected */ var _isEnabled: Boolean = js.native
    
    /* protected */ var _parent: Nullable[RotationGizmo] = js.native
    
    /* protected */ var _pointerObserver: Nullable[Observer[PointerInfo]] = js.native
    
    /* protected */ var _rotationDisplayPlane: Mesh = js.native
    
    /* protected */ var _rotationShaderMaterial: ShaderMaterial = js.native
    
    /**
      * Accumulated relative angle value for rotation on the axis. Reset to 0 when a dragStart occurs
      */
    var angle: Double = js.native
    
    /** Default material used to render when gizmo is not disabled or hovered */
    def coloredMaterial: StandardMaterial = js.native
    /** Default material used to render when gizmo is not disabled or hovered */
    @JSName("coloredMaterial")
    var coloredMaterial_FPlaneRotationGizmo: StandardMaterial = js.native
    
    /** Material used to render when gizmo is disabled. typically grey.*/
    def disableMaterial: StandardMaterial = js.native
    /** Material used to render when gizmo is disabled. typically grey.*/
    @JSName("disableMaterial")
    var disableMaterial_FPlaneRotationGizmo: StandardMaterial = js.native
    
    /**
      * Drag behavior responsible for the gizmos dragging interactions
      */
    var dragBehavior: PointerDragBehavior = js.native
    
    /** Material used to render when gizmo is hovered with mouse*/
    def hoverMaterial: StandardMaterial = js.native
    /** Material used to render when gizmo is hovered with mouse*/
    @JSName("hoverMaterial")
    var hoverMaterial_FPlaneRotationGizmo: StandardMaterial = js.native
    
    def isEnabled: Boolean = js.native
    /**
      * If the gizmo is enabled
      */
    def isEnabled_=(value: Boolean): Unit = js.native
    /** If the gizmo is enabled */
    @JSName("isEnabled")
    var isEnabled_FPlaneRotationGizmo: Boolean = js.native
    
    /**
      * Event that fires each time the gizmo snaps to a new location.
      * * snapDistance is the the change in distance
      */
    var onSnapObservable: Observable[SnapDistance] = js.native
    
    /**
      * Rotation distance in radians that the gizmo will snap to (Default: 0)
      */
    var snapDistance: Double = js.native
  }
  /* static members */
  object PlaneRotationGizmo {
    
    @JSImport("babylonjs/Gizmos/planeRotationGizmo", "PlaneRotationGizmo")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * The maximum angle between the camera and the rotation allowed for interaction
      * If a rotation plane appears 'flat', a lower value allows interaction.
      */
    @JSImport("babylonjs/Gizmos/planeRotationGizmo", "PlaneRotationGizmo.MaxDragAngle")
    @js.native
    def MaxDragAngle: Double = js.native
    inline def MaxDragAngle_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MaxDragAngle")(x.asInstanceOf[js.Any])
    
    @JSImport("babylonjs/Gizmos/planeRotationGizmo", "PlaneRotationGizmo._RotationGizmoFragmentShader")
    @js.native
    def _RotationGizmoFragmentShader: String = js.native
    inline def _RotationGizmoFragmentShader_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_RotationGizmoFragmentShader")(x.asInstanceOf[js.Any])
    
    @JSImport("babylonjs/Gizmos/planeRotationGizmo", "PlaneRotationGizmo._RotationGizmoVertexShader")
    @js.native
    def _RotationGizmoVertexShader: String = js.native
    inline def _RotationGizmoVertexShader_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_RotationGizmoVertexShader")(x.asInstanceOf[js.Any])
  }
  
  trait IPlaneRotationGizmo
    extends StObject
       with IGizmo {
    
    /** Accumulated relative angle value for rotation on the axis. */
    var angle: Double
    
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
  object IPlaneRotationGizmo {
    
    inline def apply(
      _rootMesh: Mesh,
      angle: Double,
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
    ): IPlaneRotationGizmo = {
      val __obj = js.Dynamic.literal(_rootMesh = _rootMesh.asInstanceOf[js.Any], angle = angle.asInstanceOf[js.Any], coloredMaterial = coloredMaterial.asInstanceOf[js.Any], disableMaterial = disableMaterial.asInstanceOf[js.Any], dispose = js.Any.fromFunction0(dispose), dragBehavior = dragBehavior.asInstanceOf[js.Any], gizmoLayer = gizmoLayer.asInstanceOf[js.Any], hoverMaterial = hoverMaterial.asInstanceOf[js.Any], isEnabled = isEnabled.asInstanceOf[js.Any], isHovered = isHovered.asInstanceOf[js.Any], onSnapObservable = onSnapObservable.asInstanceOf[js.Any], scaleRatio = scaleRatio.asInstanceOf[js.Any], setCustomMesh = js.Any.fromFunction1(setCustomMesh), snapDistance = snapDistance.asInstanceOf[js.Any], updateGizmoPositionToMatchAttachedMesh = updateGizmoPositionToMatchAttachedMesh.asInstanceOf[js.Any], updateGizmoRotationToMatchAttachedMesh = updateGizmoRotationToMatchAttachedMesh.asInstanceOf[js.Any], updateScale = updateScale.asInstanceOf[js.Any], attachedMesh = null, attachedNode = null, customRotationQuaternion = null)
      __obj.asInstanceOf[IPlaneRotationGizmo]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IPlaneRotationGizmo] (val x: Self) extends AnyVal {
      
      inline def setAngle(value: Double): Self = StObject.set(x, "angle", value.asInstanceOf[js.Any])
      
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
