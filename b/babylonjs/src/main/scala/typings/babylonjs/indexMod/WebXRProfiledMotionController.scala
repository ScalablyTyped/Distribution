package typings.babylonjs.indexMod

import typings.babylonjs.XRInputSource
import typings.babylonjs.webXRAbstractMotionControllerMod.IMotionControllerProfile
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("babylonjs/index", "WebXRProfiledMotionController")
@js.native
class WebXRProfiledMotionController protected ()
  extends typings.babylonjs.xRIndexMod.WebXRProfiledMotionController {
  def this(
    scene: typings.babylonjs.sceneMod.Scene,
    xrInput: XRInputSource,
    _profile: IMotionControllerProfile,
    _repositoryUrl: String
  ) = this()
}

