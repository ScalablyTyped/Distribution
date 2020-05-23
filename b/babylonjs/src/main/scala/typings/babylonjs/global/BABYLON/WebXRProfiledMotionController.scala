package typings.babylonjs.global.BABYLON

import typings.babylonjs.BABYLON.IMotionControllerProfile
import typings.babylonjs.XRInputSource
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("BABYLON.WebXRProfiledMotionController")
@js.native
class WebXRProfiledMotionController protected ()
  extends typings.babylonjs.BABYLON.WebXRProfiledMotionController {
  def this(
    scene: typings.babylonjs.BABYLON.Scene,
    xrInput: XRInputSource,
    _profile: IMotionControllerProfile,
    _repositoryUrl: String
  ) = this()
  /**
    * Releases all held resources
    */
  /* CompleteClass */
  override def dispose(): Unit = js.native
}

