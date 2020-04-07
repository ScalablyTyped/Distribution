package typings.babylonjs.mod

import typings.babylonjs.XRInputSource
import typings.babylonjs.webXRInputSourceMod.IWebXRControllerOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("babylonjs", "WebXRInputSource")
@js.native
class WebXRInputSource protected ()
  extends typings.babylonjs.legacyMod.WebXRInputSource {
  /**
    * Creates the controller
    * @see https://doc.babylonjs.com/how_to/webxr
    * @param _scene the scene which the controller should be associated to
    * @param inputSource the underlying input source for the controller
    * @param _options options for this controller creation
    */
  def this(
    _scene: typings.babylonjs.sceneMod.Scene,
    /** The underlying input source for the controller  */
  inputSource: XRInputSource
  ) = this()
  def this(
    _scene: typings.babylonjs.sceneMod.Scene,
    /** The underlying input source for the controller  */
  inputSource: XRInputSource,
    _options: IWebXRControllerOptions
  ) = this()
}

