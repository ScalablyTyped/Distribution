package typings.babylonjs

import typings.babylonjs.mathVectorMod.Vector3
import typings.babylonjs.sceneMod.Scene
import typings.babylonjs.vrExperienceHelperMod.VRExperienceHelperOptions
import typings.babylonjs.webVRCameraMod.WebVROptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object vRIndexMod {
  
  @JSImport("babylonjs/Cameras/VR/index", "OnAfterEnteringVRObservableEvent")
  @js.native
  open class OnAfterEnteringVRObservableEvent ()
    extends typings.babylonjs.vrExperienceHelperMod.OnAfterEnteringVRObservableEvent
  
  @JSImport("babylonjs/Cameras/VR/index", "VRCameraMetrics")
  @js.native
  open class VRCameraMetrics ()
    extends typings.babylonjs.vrCameraMetricsMod.VRCameraMetrics
  /* static members */
  object VRCameraMetrics {
    
    @JSImport("babylonjs/Cameras/VR/index", "VRCameraMetrics")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Get the default VRMetrics based on the most generic setup.
      * @returns the default vr metrics
      */
    inline def GetDefault(): typings.babylonjs.vrCameraMetricsMod.VRCameraMetrics = ^.asInstanceOf[js.Dynamic].applyDynamic("GetDefault")().asInstanceOf[typings.babylonjs.vrCameraMetricsMod.VRCameraMetrics]
  }
  
  @JSImport("babylonjs/Cameras/VR/index", "VRDeviceOrientationArcRotateCamera")
  @js.native
  open class VRDeviceOrientationArcRotateCamera protected ()
    extends typings.babylonjs.vrDeviceOrientationArcRotateCameraMod.VRDeviceOrientationArcRotateCamera {
    /**
      * Creates a new VRDeviceOrientationArcRotateCamera
      * @param name defines camera name
      * @param alpha defines the camera rotation along the longitudinal axis
      * @param beta defines the camera rotation along the latitudinal axis
      * @param radius defines the camera distance from its target
      * @param target defines the camera target
      * @param scene defines the scene the camera belongs to
      * @param compensateDistortion defines if the camera needs to compensate the lens distortion
      * @param vrCameraMetrics defines the vr metrics associated to the camera
      */
    def this(name: String, alpha: Double, beta: Double, radius: Double, target: Vector3) = this()
    def this(name: String, alpha: Double, beta: Double, radius: Double, target: Vector3, scene: Scene) = this()
    def this(
      name: String,
      alpha: Double,
      beta: Double,
      radius: Double,
      target: Vector3,
      scene: Unit,
      compensateDistortion: Boolean
    ) = this()
    def this(
      name: String,
      alpha: Double,
      beta: Double,
      radius: Double,
      target: Vector3,
      scene: Scene,
      compensateDistortion: Boolean
    ) = this()
    def this(
      name: String,
      alpha: Double,
      beta: Double,
      radius: Double,
      target: Vector3,
      scene: Unit,
      compensateDistortion: Boolean,
      vrCameraMetrics: typings.babylonjs.vrCameraMetricsMod.VRCameraMetrics
    ) = this()
    def this(
      name: String,
      alpha: Double,
      beta: Double,
      radius: Double,
      target: Vector3,
      scene: Unit,
      compensateDistortion: Unit,
      vrCameraMetrics: typings.babylonjs.vrCameraMetricsMod.VRCameraMetrics
    ) = this()
    def this(
      name: String,
      alpha: Double,
      beta: Double,
      radius: Double,
      target: Vector3,
      scene: Scene,
      compensateDistortion: Boolean,
      vrCameraMetrics: typings.babylonjs.vrCameraMetricsMod.VRCameraMetrics
    ) = this()
    def this(
      name: String,
      alpha: Double,
      beta: Double,
      radius: Double,
      target: Vector3,
      scene: Scene,
      compensateDistortion: Unit,
      vrCameraMetrics: typings.babylonjs.vrCameraMetricsMod.VRCameraMetrics
    ) = this()
  }
  
  @JSImport("babylonjs/Cameras/VR/index", "VRDeviceOrientationFreeCamera")
  @js.native
  open class VRDeviceOrientationFreeCamera protected ()
    extends typings.babylonjs.vrDeviceOrientationFreeCameraMod.VRDeviceOrientationFreeCamera {
    /**
      * Creates a new VRDeviceOrientationFreeCamera
      * @param name defines camera name
      * @param position defines the start position of the camera
      * @param scene defines the scene the camera belongs to
      * @param compensateDistortion defines if the camera needs to compensate the lens distortion
      * @param vrCameraMetrics defines the vr metrics associated to the camera
      */
    def this(name: String, position: Vector3) = this()
    def this(name: String, position: Vector3, scene: Scene) = this()
    def this(name: String, position: Vector3, scene: Unit, compensateDistortion: Boolean) = this()
    def this(name: String, position: Vector3, scene: Scene, compensateDistortion: Boolean) = this()
    def this(
      name: String,
      position: Vector3,
      scene: Unit,
      compensateDistortion: Boolean,
      vrCameraMetrics: typings.babylonjs.vrCameraMetricsMod.VRCameraMetrics
    ) = this()
    def this(
      name: String,
      position: Vector3,
      scene: Unit,
      compensateDistortion: Unit,
      vrCameraMetrics: typings.babylonjs.vrCameraMetricsMod.VRCameraMetrics
    ) = this()
    def this(
      name: String,
      position: Vector3,
      scene: Scene,
      compensateDistortion: Boolean,
      vrCameraMetrics: typings.babylonjs.vrCameraMetricsMod.VRCameraMetrics
    ) = this()
    def this(
      name: String,
      position: Vector3,
      scene: Scene,
      compensateDistortion: Unit,
      vrCameraMetrics: typings.babylonjs.vrCameraMetricsMod.VRCameraMetrics
    ) = this()
  }
  
  @JSImport("babylonjs/Cameras/VR/index", "VRDeviceOrientationGamepadCamera")
  @js.native
  open class VRDeviceOrientationGamepadCamera protected ()
    extends typings.babylonjs.vrDeviceOrientationGamepadCameraMod.VRDeviceOrientationGamepadCamera {
    /**
      * Creates a new VRDeviceOrientationGamepadCamera
      * @param name defines camera name
      * @param position defines the start position of the camera
      * @param scene defines the scene the camera belongs to
      * @param compensateDistortion defines if the camera needs to compensate the lens distortion
      * @param vrCameraMetrics defines the vr metrics associated to the camera
      */
    def this(name: String, position: Vector3) = this()
    def this(name: String, position: Vector3, scene: Scene) = this()
    def this(name: String, position: Vector3, scene: Unit, compensateDistortion: Boolean) = this()
    def this(name: String, position: Vector3, scene: Scene, compensateDistortion: Boolean) = this()
    def this(
      name: String,
      position: Vector3,
      scene: Unit,
      compensateDistortion: Boolean,
      vrCameraMetrics: typings.babylonjs.vrCameraMetricsMod.VRCameraMetrics
    ) = this()
    def this(
      name: String,
      position: Vector3,
      scene: Unit,
      compensateDistortion: Unit,
      vrCameraMetrics: typings.babylonjs.vrCameraMetricsMod.VRCameraMetrics
    ) = this()
    def this(
      name: String,
      position: Vector3,
      scene: Scene,
      compensateDistortion: Boolean,
      vrCameraMetrics: typings.babylonjs.vrCameraMetricsMod.VRCameraMetrics
    ) = this()
    def this(
      name: String,
      position: Vector3,
      scene: Scene,
      compensateDistortion: Unit,
      vrCameraMetrics: typings.babylonjs.vrCameraMetricsMod.VRCameraMetrics
    ) = this()
  }
  
  @JSImport("babylonjs/Cameras/VR/index", "VRExperienceHelper")
  @js.native
  open class VRExperienceHelper protected ()
    extends typings.babylonjs.vrExperienceHelperMod.VRExperienceHelper {
    /**
      * Instantiates a VRExperienceHelper.
      * Helps to quickly add VR support to an existing scene.
      * @param scene The scene the VRExperienceHelper belongs to.
      * @param webVROptions Options to modify the vr experience helper's behavior.
      */
    def this(scene: Scene) = this()
    def this(
      scene: Scene,
      /** Options to modify the vr experience helper's behavior. */
    webVROptions: VRExperienceHelperOptions
    ) = this()
  }
  /* static members */
  object VRExperienceHelper {
    
    /**
      * Speed Constant Teleportation Mode
      */
    @JSImport("babylonjs/Cameras/VR/index", "VRExperienceHelper.TELEPORTATIONMODE_CONSTANTSPEED")
    @js.native
    val TELEPORTATIONMODE_CONSTANTSPEED: Double = js.native
    
    /**
      * Time Constant Teleportation Mode
      */
    @JSImport("babylonjs/Cameras/VR/index", "VRExperienceHelper.TELEPORTATIONMODE_CONSTANTTIME")
    @js.native
    val TELEPORTATIONMODE_CONSTANTTIME: Double = js.native
  }
  
  @JSImport("babylonjs/Cameras/VR/index", "WebVRFreeCamera")
  @js.native
  open class WebVRFreeCamera protected ()
    extends typings.babylonjs.webVRCameraMod.WebVRFreeCamera {
    /**
      * Instantiates a WebVRFreeCamera.
      * @param name The name of the WebVRFreeCamera
      * @param position The starting anchor position for the camera
      * @param scene The scene the camera belongs to
      * @param _webVROptions a set of customizable options for the webVRCamera
      */
    def this(name: String, position: Vector3) = this()
    def this(name: String, position: Vector3, scene: Scene) = this()
    def this(name: String, position: Vector3, scene: Unit, _webVROptions: WebVROptions) = this()
    def this(name: String, position: Vector3, scene: Scene, _webVROptions: WebVROptions) = this()
  }
}
