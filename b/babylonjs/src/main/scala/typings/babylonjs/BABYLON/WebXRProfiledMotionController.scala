package typings.babylonjs.BABYLON

import typings.babylonjs.XRInputSource
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("BABYLON.WebXRProfiledMotionController")
@js.native
class WebXRProfiledMotionController protected () extends WebXRAbstractMotionController {
  def this(scene: Scene, xrInput: XRInputSource, _profile: IMotionControllerProfile, _repositoryUrl: String) = this()
  var _buttonMeshMapping: js.Any = js.native
  var _repositoryUrl: js.Any = js.native
  var _touchDots: js.Any = js.native
}

