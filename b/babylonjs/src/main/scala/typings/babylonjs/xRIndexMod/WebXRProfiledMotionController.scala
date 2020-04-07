package typings.babylonjs.xRIndexMod

import typings.babylonjs.XRInputSource
import typings.babylonjs.sceneMod.Scene
import typings.babylonjs.webXRAbstractMotionControllerMod.IMotionControllerProfile
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("babylonjs/XR/index", "WebXRProfiledMotionController")
@js.native
class WebXRProfiledMotionController protected ()
  extends typings.babylonjs.motionControllerIndexMod.WebXRProfiledMotionController {
  def this(scene: Scene, xrInput: XRInputSource, _profile: IMotionControllerProfile, _repositoryUrl: String) = this()
}

