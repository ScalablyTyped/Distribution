package typings.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait VRCameraMetrics extends StObject {
  
  /**
    * Gets the rendering aspect ratio based on the provided resolutions.
    */
  def aspectRatio: Double = js.native
  
  /**
    * Gets the aspect ratio based on the FOV, scale factors, and real screen sizes.
    */
  def aspectRatioFov: Double = js.native
  
  /**
    * Define the chromatic aberration correction factors for the VR post process.
    */
  var chromaAbCorrection: js.Array[Double] = js.native
  
  /**
    * Define if the current vr camera should compensate the distortion of the lens or not.
    */
  var compensateDistortion: Boolean = js.native
  
  /**
    * Define the distortion factor of the VR postprocess.
    * Please, touch with care.
    */
  var distortionK: js.Array[Double] = js.native
  
  /**
    * Define the distance of the eyes to the screen.
    */
  var eyeToScreenDistance: Double = js.native
  
  /**
    * Define the horizontal resolution off the screen.
    */
  var hResolution: Double = js.native
  
  /**
    * Define the horizontal screen size.
    */
  var hScreenSize: Double = js.native
  
  /**
    * Define the distance between both viewer's eyes.
    */
  var interpupillaryDistance: Double = js.native
  
  /**
    * @internal
    */
  def leftHMatrix: Matrix = js.native
  
  /**
    * @internal
    */
  def leftPreViewMatrix: Matrix = js.native
  
  /**
    * Define an offset for the lens center.
    */
  var lensCenterOffset: Double = js.native
  
  /**
    * Define the distance between both lenses
    */
  var lensSeparationDistance: Double = js.native
  
  /**
    * Defines if multiview should be enabled when rendering (Default: false)
    */
  var multiviewEnabled: Boolean = js.native
  
  /**
    * Define the scale factor of the post process.
    * The smaller the better but the slower.
    */
  var postProcessScaleFactor: Double = js.native
  
  /**
    * @internal
    */
  def rightHMatrix: Matrix = js.native
  
  /**
    * @internal
    */
  def rightPreViewMatrix: Matrix = js.native
  
  /**
    * Define the vertical resolution off the screen.
    */
  var vResolution: Double = js.native
  
  /**
    * Define the vertical screen center position.
    */
  var vScreenCenter: Double = js.native
  
  /**
    * Define the vertical screen size.
    */
  var vScreenSize: Double = js.native
}
