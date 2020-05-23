package typings.babylonjs.BABYLON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VRCameraMetrics extends js.Object {
  /**
    * Define the chromatic aberration correction factors for the VR post process.
    */
  var chromaAbCorrection: js.Array[Double]
  /**
    * Define if the current vr camera should compensate the distortion of the lense or not.
    */
  var compensateDistortion: Boolean
  /**
    * Define the distortion factor of the VR postprocess.
    * Please, touch with care.
    */
  var distortionK: js.Array[Double]
  /**
    * Define the distance of the eyes to the screen.
    */
  var eyeToScreenDistance: Double
  /**
    * Define the horizontal resolution off the screen.
    */
  var hResolution: Double
  /**
    * Define the horizontal screen size.
    */
  var hScreenSize: Double
  /**
    * Define the distance between both viewer's eyes.
    */
  var interpupillaryDistance: Double
  /**
    * Define an offset for the lens center.
    */
  var lensCenterOffset: Double
  /**
    * Define the distance between both lenses
    */
  var lensSeparationDistance: Double
  /**
    * Defines if multiview should be enabled when rendering (Default: false)
    */
  var multiviewEnabled: Boolean
  /**
    * Define the scale factor of the post process.
    * The smaller the better but the slower.
    */
  var postProcessScaleFactor: Double
  /**
    * Define the vertical resolution off the screen.
    */
  var vResolution: Double
  /**
    * Define the vertical screen center position.
    */
  var vScreenCenter: Double
  /**
    * Define the vertical screen size.
    */
  var vScreenSize: Double
  /**
    * Gets the rendering aspect ratio based on the provided resolutions.
    */
  def aspectRatio: Double
  /**
    * Gets the aspect ratio based on the FOV, scale factors, and real screen sizes.
    */
  def aspectRatioFov: Double
  /**
    * @hidden
    */
  def leftHMatrix: Matrix
  /**
    * @hidden
    */
  def leftPreViewMatrix: Matrix
  /**
    * @hidden
    */
  def rightHMatrix: Matrix
  /**
    * @hidden
    */
  def rightPreViewMatrix: Matrix
}

object VRCameraMetrics {
  @scala.inline
  def apply(
    aspectRatio: () => Double,
    aspectRatioFov: () => Double,
    chromaAbCorrection: js.Array[Double],
    compensateDistortion: Boolean,
    distortionK: js.Array[Double],
    eyeToScreenDistance: Double,
    hResolution: Double,
    hScreenSize: Double,
    interpupillaryDistance: Double,
    leftHMatrix: () => Matrix,
    leftPreViewMatrix: () => Matrix,
    lensCenterOffset: Double,
    lensSeparationDistance: Double,
    multiviewEnabled: Boolean,
    postProcessScaleFactor: Double,
    rightHMatrix: () => Matrix,
    rightPreViewMatrix: () => Matrix,
    vResolution: Double,
    vScreenCenter: Double,
    vScreenSize: Double
  ): VRCameraMetrics = {
    val __obj = js.Dynamic.literal(aspectRatio = js.Any.fromFunction0(aspectRatio), aspectRatioFov = js.Any.fromFunction0(aspectRatioFov), chromaAbCorrection = chromaAbCorrection.asInstanceOf[js.Any], compensateDistortion = compensateDistortion.asInstanceOf[js.Any], distortionK = distortionK.asInstanceOf[js.Any], eyeToScreenDistance = eyeToScreenDistance.asInstanceOf[js.Any], hResolution = hResolution.asInstanceOf[js.Any], hScreenSize = hScreenSize.asInstanceOf[js.Any], interpupillaryDistance = interpupillaryDistance.asInstanceOf[js.Any], leftHMatrix = js.Any.fromFunction0(leftHMatrix), leftPreViewMatrix = js.Any.fromFunction0(leftPreViewMatrix), lensCenterOffset = lensCenterOffset.asInstanceOf[js.Any], lensSeparationDistance = lensSeparationDistance.asInstanceOf[js.Any], multiviewEnabled = multiviewEnabled.asInstanceOf[js.Any], postProcessScaleFactor = postProcessScaleFactor.asInstanceOf[js.Any], rightHMatrix = js.Any.fromFunction0(rightHMatrix), rightPreViewMatrix = js.Any.fromFunction0(rightPreViewMatrix), vResolution = vResolution.asInstanceOf[js.Any], vScreenCenter = vScreenCenter.asInstanceOf[js.Any], vScreenSize = vScreenSize.asInstanceOf[js.Any])
    __obj.asInstanceOf[VRCameraMetrics]
  }
}

