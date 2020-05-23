package typings.babylonjs.global.BABYLON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("BABYLON.VRCameraMetrics")
@js.native
class VRCameraMetrics ()
  extends typings.babylonjs.BABYLON.VRCameraMetrics {
  /**
    * Define the chromatic aberration correction factors for the VR post process.
    */
  /* CompleteClass */
  override var chromaAbCorrection: js.Array[Double] = js.native
  /**
    * Define if the current vr camera should compensate the distortion of the lense or not.
    */
  /* CompleteClass */
  override var compensateDistortion: Boolean = js.native
  /**
    * Define the distortion factor of the VR postprocess.
    * Please, touch with care.
    */
  /* CompleteClass */
  override var distortionK: js.Array[Double] = js.native
  /**
    * Define the distance of the eyes to the screen.
    */
  /* CompleteClass */
  override var eyeToScreenDistance: Double = js.native
  /**
    * Define the horizontal resolution off the screen.
    */
  /* CompleteClass */
  override var hResolution: Double = js.native
  /**
    * Define the horizontal screen size.
    */
  /* CompleteClass */
  override var hScreenSize: Double = js.native
  /**
    * Define the distance between both viewer's eyes.
    */
  /* CompleteClass */
  override var interpupillaryDistance: Double = js.native
  /**
    * Define an offset for the lens center.
    */
  /* CompleteClass */
  override var lensCenterOffset: Double = js.native
  /**
    * Define the distance between both lenses
    */
  /* CompleteClass */
  override var lensSeparationDistance: Double = js.native
  /**
    * Defines if multiview should be enabled when rendering (Default: false)
    */
  /* CompleteClass */
  override var multiviewEnabled: Boolean = js.native
  /**
    * Define the scale factor of the post process.
    * The smaller the better but the slower.
    */
  /* CompleteClass */
  override var postProcessScaleFactor: Double = js.native
  /**
    * Define the vertical resolution off the screen.
    */
  /* CompleteClass */
  override var vResolution: Double = js.native
  /**
    * Define the vertical screen center position.
    */
  /* CompleteClass */
  override var vScreenCenter: Double = js.native
  /**
    * Define the vertical screen size.
    */
  /* CompleteClass */
  override var vScreenSize: Double = js.native
  /**
    * Gets the rendering aspect ratio based on the provided resolutions.
    */
  /* CompleteClass */
  override def aspectRatio: Double = js.native
  /**
    * Gets the aspect ratio based on the FOV, scale factors, and real screen sizes.
    */
  /* CompleteClass */
  override def aspectRatioFov: Double = js.native
  /**
    * @hidden
    */
  /* CompleteClass */
  override def leftHMatrix: typings.babylonjs.BABYLON.Matrix = js.native
  /**
    * @hidden
    */
  /* CompleteClass */
  override def leftPreViewMatrix: typings.babylonjs.BABYLON.Matrix = js.native
  /**
    * @hidden
    */
  /* CompleteClass */
  override def rightHMatrix: typings.babylonjs.BABYLON.Matrix = js.native
  /**
    * @hidden
    */
  /* CompleteClass */
  override def rightPreViewMatrix: typings.babylonjs.BABYLON.Matrix = js.native
}

/* static members */
@JSGlobal("BABYLON.VRCameraMetrics")
@js.native
object VRCameraMetrics extends js.Object {
  /**
    * Get the default VRMetrics based on the most generic setup.
    * @returns the default vr metrics
    */
  def GetDefault(): typings.babylonjs.BABYLON.VRCameraMetrics = js.native
}

