package typings.babylonjs

import typings.babylonjs.camerasCameraMod.Camera
import typings.babylonjs.eventsPointerEventsMod.PointerInfo
import typings.babylonjs.gizmosGizmoMod.Gizmo
import typings.babylonjs.gizmosGizmoMod.IGizmo
import typings.babylonjs.materialsStandardMaterialMod.StandardMaterial
import typings.babylonjs.meshesMeshMod.Mesh
import typings.babylonjs.miscObservableMod.Observable
import typings.babylonjs.miscObservableMod.Observer
import typings.babylonjs.renderingUtilityLayerRendererMod.UtilityLayerRenderer
import typings.babylonjs.typesMod.Nullable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object gizmosCameraGizmoMod {
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typings.babylonjs.sceneMod.IDisposable because Already inherited
  - typings.babylonjs.gizmosGizmoMod.IGizmo because Already inherited
  - typings.babylonjs.gizmosCameraGizmoMod.ICameraGizmo because var conflicts: _rootMesh, attachedMesh, attachedNode, customRotationQuaternion, gizmoLayer, isHovered, scaleRatio, updateGizmoPositionToMatchAttachedMesh, updateGizmoRotationToMatchAttachedMesh, updateScale. Inlined onClickedObservable, displayFrustum, camera, material */ @JSImport("babylonjs/Gizmos/cameraGizmo", "CameraGizmo")
  @js.native
  /**
    * Creates a CameraGizmo
    * @param gizmoLayer The utility layer the gizmo will be added to
    */
  open class CameraGizmo () extends Gizmo {
    def this(gizmoLayer: UtilityLayerRenderer) = this()
    
    /* protected */ var _camera: Nullable[Camera] = js.native
    
    /* protected */ var _cameraLinesMesh: Mesh = js.native
    
    /* protected */ var _cameraMesh: Mesh = js.native
    
    /* private */ var _invProjection: Any = js.native
    
    /* protected */ var _material: StandardMaterial = js.native
    
    /* protected */ var _pointerObserver: Nullable[Observer[PointerInfo]] = js.native
    
    def camera: Nullable[Camera] = js.native
    /**
      * The camera that the gizmo is attached to
      */
    def camera_=(camera: Nullable[Camera]): Unit = js.native
    /** The camera that the gizmo is attached to */
    @JSName("camera")
    var camera_FCameraGizmo: Nullable[Camera] = js.native
    
    /** Gets or sets a boolean indicating if frustum lines must be rendered (true by default)) */
    def displayFrustum: Boolean = js.native
    def displayFrustum_=(value: Boolean): Unit = js.native
    /** A boolean indicating if frustum lines must be rendered */
    @JSName("displayFrustum")
    var displayFrustum_FCameraGizmo: Boolean = js.native
    
    /**
      * Gets the material used to render the camera gizmo
      */
    def material: StandardMaterial = js.native
    /** The material used to render the camera gizmo */
    @JSName("material")
    val material_FCameraGizmo: StandardMaterial = js.native
    
    /**
      * Event that fires each time the gizmo is clicked
      */
    var onClickedObservable: Observable[Camera] = js.native
  }
  /* static members */
  object CameraGizmo {
    
    @JSImport("babylonjs/Gizmos/cameraGizmo", "CameraGizmo")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("babylonjs/Gizmos/cameraGizmo", "CameraGizmo._CreateCameraFrustum")
    @js.native
    def _CreateCameraFrustum: Any = js.native
    inline def _CreateCameraFrustum_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_CreateCameraFrustum")(x.asInstanceOf[js.Any])
    
    @JSImport("babylonjs/Gizmos/cameraGizmo", "CameraGizmo._CreateCameraMesh")
    @js.native
    def _CreateCameraMesh: Any = js.native
    inline def _CreateCameraMesh_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_CreateCameraMesh")(x.asInstanceOf[js.Any])
    
    @JSImport("babylonjs/Gizmos/cameraGizmo", "CameraGizmo._Scale")
    @js.native
    def _Scale: Any = js.native
    inline def _Scale_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_Scale")(x.asInstanceOf[js.Any])
  }
  
  trait ICameraGizmo
    extends StObject
       with IGizmo {
    
    /** The camera that the gizmo is attached to */
    var camera: Nullable[Camera]
    
    /** A boolean indicating if frustum lines must be rendered */
    var displayFrustum: Boolean
    
    /** The material used to render the camera gizmo */
    val material: StandardMaterial
    
    /** Event that fires each time the gizmo is clicked */
    var onClickedObservable: Observable[Camera]
  }
  object ICameraGizmo {
    
    inline def apply(
      _rootMesh: Mesh,
      displayFrustum: Boolean,
      dispose: () => Unit,
      gizmoLayer: UtilityLayerRenderer,
      isHovered: Boolean,
      material: StandardMaterial,
      onClickedObservable: Observable[Camera],
      scaleRatio: Double,
      setCustomMesh: Mesh => Unit,
      updateGizmoPositionToMatchAttachedMesh: Boolean,
      updateGizmoRotationToMatchAttachedMesh: Boolean,
      updateScale: Boolean
    ): ICameraGizmo = {
      val __obj = js.Dynamic.literal(_rootMesh = _rootMesh.asInstanceOf[js.Any], displayFrustum = displayFrustum.asInstanceOf[js.Any], dispose = js.Any.fromFunction0(dispose), gizmoLayer = gizmoLayer.asInstanceOf[js.Any], isHovered = isHovered.asInstanceOf[js.Any], material = material.asInstanceOf[js.Any], onClickedObservable = onClickedObservable.asInstanceOf[js.Any], scaleRatio = scaleRatio.asInstanceOf[js.Any], setCustomMesh = js.Any.fromFunction1(setCustomMesh), updateGizmoPositionToMatchAttachedMesh = updateGizmoPositionToMatchAttachedMesh.asInstanceOf[js.Any], updateGizmoRotationToMatchAttachedMesh = updateGizmoRotationToMatchAttachedMesh.asInstanceOf[js.Any], updateScale = updateScale.asInstanceOf[js.Any], attachedMesh = null, attachedNode = null, camera = null, customRotationQuaternion = null)
      __obj.asInstanceOf[ICameraGizmo]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ICameraGizmo] (val x: Self) extends AnyVal {
      
      inline def setCamera(value: Nullable[Camera]): Self = StObject.set(x, "camera", value.asInstanceOf[js.Any])
      
      inline def setCameraNull: Self = StObject.set(x, "camera", null)
      
      inline def setDisplayFrustum(value: Boolean): Self = StObject.set(x, "displayFrustum", value.asInstanceOf[js.Any])
      
      inline def setMaterial(value: StandardMaterial): Self = StObject.set(x, "material", value.asInstanceOf[js.Any])
      
      inline def setOnClickedObservable(value: Observable[Camera]): Self = StObject.set(x, "onClickedObservable", value.asInstanceOf[js.Any])
    }
  }
}
