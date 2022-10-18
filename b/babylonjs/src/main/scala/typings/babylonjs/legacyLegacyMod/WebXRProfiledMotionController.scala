package typings.babylonjs.legacyLegacyMod

import typings.babylonjs.XRInputSource
import typings.babylonjs.anon.Filename
import typings.babylonjs.xRMotionControllerWebXRAbstractMotionControllerMod.IMotionControllerProfile
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs/Legacy/legacy", "WebXRProfiledMotionController")
@js.native
open class WebXRProfiledMotionController protected ()
  extends typings.babylonjs.indexMod.WebXRProfiledMotionController {
  def this(
    scene: typings.babylonjs.sceneMod.Scene,
    xrInput: XRInputSource,
    _profile: IMotionControllerProfile,
    _repositoryUrl: String
  ) = this()
  def this(
    scene: typings.babylonjs.sceneMod.Scene,
    xrInput: XRInputSource,
    _profile: IMotionControllerProfile,
    _repositoryUrl: String,
    controllerCache: js.Array[Filename]
  ) = this()
}
