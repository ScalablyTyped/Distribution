package typings.babylonjs.BABYLON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CircleOfConfusionPostProcess extends PostProcess {
  var _depthTexture: js.Any = js.native
  /**
    * F-Stop of the effect's camera. The diamater of the resulting aperture can be computed by lensSize/fStop. (default: 1.4)
    */
  var fStop: Double = js.native
  /**
    * Focal length of the effect's camera in scene units/1000 (eg. millimeter). (default: 50)
    */
  var focalLength: Double = js.native
  /**
    * Distance away from the camera to focus on in scene units/1000 (eg. millimeter). (default: 2000)
    */
  var focusDistance: Double = js.native
  /**
    * Max lens size in scene units/1000 (eg. millimeter). Standard cameras are 50mm. (default: 50) The diamater of the resulting aperture can be computed by lensSize/fStop.
    */
  var lensSize: Double = js.native
  /**
    * Depth texture to be used to compute the circle of confusion. This must be set here or in the constructor in order for the post process to function.
    */
  def depthTexture(value: RenderTargetTexture): js.Any = js.native
}

