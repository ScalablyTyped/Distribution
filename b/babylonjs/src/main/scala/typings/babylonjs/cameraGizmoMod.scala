package typings.babylonjs

import typings.babylonjs.cameraMod.Camera
import typings.babylonjs.gizmoMod.Gizmo
import typings.babylonjs.observableMod.Observable
import typings.babylonjs.standardMaterialMod.StandardMaterial
import typings.babylonjs.typesMod.Nullable
import typings.babylonjs.utilityLayerRendererMod.UtilityLayerRenderer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs/Gizmos/cameraGizmo", JSImport.Namespace)
@js.native
object cameraGizmoMod extends js.Object {
  
  @js.native
  /**
    * Creates a CameraGizmo
    * @param gizmoLayer The utility layer the gizmo will be added to
    */
  class CameraGizmo () extends Gizmo {
    def this(gizmoLayer: UtilityLayerRenderer) = this()
    
    var _camera: js.Any = js.native
    
    var _cameraLinesMesh: js.Any = js.native
    
    var _cameraMesh: js.Any = js.native
    
    var _invProjection: js.Any = js.native
    
    var _material: js.Any = js.native
    
    var _pointerObserver: js.Any = js.native
    
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
  @js.native
  object CameraGizmo extends js.Object {
    
    var _CreateCameraFrustum: js.Any = js.native
    
    var _CreateCameraMesh: js.Any = js.native
    
    var _Scale: js.Any = js.native
  }
}
