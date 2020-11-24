package typings.babylonjs.legacyMod

import typings.babylonjs.XRInputSource
import typings.babylonjs.webXRAbstractMotionControllerMod.IMotionControllerProfile
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs/Legacy/legacy", "WebXRProfiledMotionController")
@js.native
class WebXRProfiledMotionController protected ()
  extends typings.babylonjs.indexMod.WebXRProfiledMotionController {
  def this(
    scene: typings.babylonjs.sceneMod.Scene,
    xrInput: XRInputSource,
    _profile: IMotionControllerProfile,
    _repositoryUrl: String
  ) = this()
}
