package typings.babylonjs.xRIndexMod

import typings.babylonjs.XRInputSource
import typings.babylonjs.sceneMod.Scene
import typings.babylonjs.webXRInputSourceMod.IWebXRControllerOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs/XR/index", "WebXRInputSource")
@js.native
class WebXRInputSource protected ()
  extends typings.babylonjs.webXRInputSourceMod.WebXRInputSource {
  /**
    * Creates the input source object
    * @see https://doc.babylonjs.com/how_to/webxr_controllers_support
    * @param _scene the scene which the controller should be associated to
    * @param inputSource the underlying input source for the controller
    * @param _options options for this controller creation
    */
  def this(_scene: Scene, /** The underlying input source for the controller  */
  inputSource: XRInputSource) = this()
  def this(
    _scene: Scene,
    /** The underlying input source for the controller  */
  inputSource: XRInputSource,
    _options: IWebXRControllerOptions
  ) = this()
}
