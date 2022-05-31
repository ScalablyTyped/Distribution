package typings.babylonjs

import typings.babylonjs.cameraMod.Camera
import typings.babylonjs.gizmoMod.Gizmo
import typings.babylonjs.observableMod.Observable
import typings.babylonjs.standardMaterialMod.StandardMaterial
import typings.babylonjs.typesMod.Nullable
import typings.babylonjs.utilityLayerRendererMod.UtilityLayerRenderer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object cameraGizmoMod {
  
  @JSImport("babylonjs/Gizmos/cameraGizmo", "CameraGizmo")
  @js.native
  /**
    * Creates a CameraGizmo
    * @param gizmoLayer The utility layer the gizmo will be added to
    */
  class CameraGizmo () extends Gizmo {
    def this(gizmoLayer: UtilityLayerRenderer) = this()
    
    /* private */ var _camera: js.Any = js.native
    
    /* private */ var _cameraLinesMesh: js.Any = js.native
    
    /* private */ var _cameraMesh: js.Any = js.native
    
    /* private */ var _invProjection: js.Any = js.native
    
    /* private */ var _material: js.Any = js.native
    
    /* private */ var _pointerObserver: js.Any = js.native
    
    def camera: Nullable[Camera] = js.native
    /**
      * The camera that the gizmo is attached to
      */
    def camera_=(camera: Nullable[Camera]): Unit = js.native
    
    /** Gets or sets a boolean indicating if frustum lines must be rendered (true by default)) */
    def displayFrustum: Boolean = js.native
    def displayFrustum_=(value: Boolean): Unit = js.native
    
    /**
      * Gets the material used to render the camera gizmo
      */
    def material: StandardMaterial = js.native
    
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
    def _CreateCameraFrustum: js.Any = js.native
    inline def _CreateCameraFrustum_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_CreateCameraFrustum")(x.asInstanceOf[js.Any])
    
    @JSImport("babylonjs/Gizmos/cameraGizmo", "CameraGizmo._CreateCameraMesh")
    @js.native
    def _CreateCameraMesh: js.Any = js.native
    inline def _CreateCameraMesh_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_CreateCameraMesh")(x.asInstanceOf[js.Any])
    
    @JSImport("babylonjs/Gizmos/cameraGizmo", "CameraGizmo._Scale")
    @js.native
    def _Scale: js.Any = js.native
    inline def _Scale_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_Scale")(x.asInstanceOf[js.Any])
  }
}
