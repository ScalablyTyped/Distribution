package typings.babylonjs.global.BABYLON

import typings.babylonjs.BABYLON.IWebXRControllerOptions
import typings.babylonjs.XRInputSource
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("BABYLON.WebXRInputSource")
@js.native
class WebXRInputSource protected ()
  extends typings.babylonjs.BABYLON.WebXRInputSource {
  /**
    * Creates the controller
    * @see https://doc.babylonjs.com/how_to/webxr
    * @param _scene the scene which the controller should be associated to
    * @param inputSource the underlying input source for the controller
    * @param _options options for this controller creation
    */
  def this(
    _scene: typings.babylonjs.BABYLON.Scene,
    /** The underlying input source for the controller  */
  inputSource: XRInputSource
  ) = this()
  def this(
    _scene: typings.babylonjs.BABYLON.Scene,
    /** The underlying input source for the controller  */
  inputSource: XRInputSource,
    _options: IWebXRControllerOptions
  ) = this()
}

