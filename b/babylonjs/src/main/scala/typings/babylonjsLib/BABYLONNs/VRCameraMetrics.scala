package typings
package babylonjsLib.BABYLONNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This represents all the required metrics to create a VR camera.
  * @see http://doc.babylonjs.com/babylon101/cameras#device-orientation-camera
  */
@JSGlobal("BABYLON.VRCameraMetrics")
@js.native
class VRCameraMetrics () extends js.Object {
  /**
    * Gets the rendering aspect ratio based on the provided resolutions.
    */
  val aspectRatio: scala.Double = js.native
  /**
    * Gets the aspect ratio based on the FOV, scale factors, and real screen sizes.
    */
  val aspectRatioFov: scala.Double = js.native
  /**
    * Define the chromatic aberration correction factors for the VR post process.
    */
  var chromaAbCorrection: js.Array[scala.Double] = js.native
  /**
    * Define if the current vr camera should compensate the distortion of the lense or not.
    */
  var compensateDistortion: scala.Boolean = js.native
  /**
    * Define the distortion factor of the VR postprocess.
    * Please, touch with care.
    */
  var distortionK: js.Array[scala.Double] = js.native
  /**
    * Define the distance of the eyes to the screen.
    */
  var eyeToScreenDistance: scala.Double = js.native
  /**
    * Define the horizontal resolution off the screen.
    */
  var hResolution: scala.Double = js.native
  /**
    * Define the horizontal screen size.
    */
  var hScreenSize: scala.Double = js.native
  /**
    * Define the distance between both viewer's eyes.
    */
  var interpupillaryDistance: scala.Double = js.native
  /**
    * @hidden
    */
  val leftHMatrix: Matrix = js.native
  /**
    * @hidden
    */
  val leftPreViewMatrix: Matrix = js.native
  /**
    * Define an offset for the lens center.
    */
  var lensCenterOffset: scala.Double = js.native
  /**
    * Define the distance between both lenses
    */
  var lensSeparationDistance: scala.Double = js.native
  /**
    * Define the scale factor of the post process.
    * The smaller the better but the slower.
    */
  var postProcessScaleFactor: scala.Double = js.native
  /**
    * @hidden
    */
  val rightHMatrix: Matrix = js.native
  /**
    * @hidden
    */
  val rightPreViewMatrix: Matrix = js.native
  /**
    * Define the vertical resolution off the screen.
    */
  var vResolution: scala.Double = js.native
  /**
    * Define the vertical screen center position.
    */
  var vScreenCenter: scala.Double = js.native
  /**
    * Define the vertical screen size.
    */
  var vScreenSize: scala.Double = js.native
}

/* static members */
@JSGlobal("BABYLON.VRCameraMetrics")
@js.native
object VRCameraMetrics extends js.Object {
  /**
    * Get the default VRMetrics based on the most generic setup.
    * @returns the default vr metrics
    */
  def GetDefault(): babylonjsLib.BABYLONNs.VRCameraMetrics = js.native
}

