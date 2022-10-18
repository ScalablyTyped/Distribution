package typings.babylonjs.xRIndexMod

import typings.babylonjs.XRInputSource
import typings.babylonjs.anon.Filename
import typings.babylonjs.sceneMod.Scene
import typings.babylonjs.xRMotionControllerWebXRAbstractMotionControllerMod.IMotionControllerProfile
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs/XR/index", "WebXRProfiledMotionController")
@js.native
open class WebXRProfiledMotionController protected ()
  extends typings.babylonjs.xRMotionControllerIndexMod.WebXRProfiledMotionController {
  def this(scene: Scene, xrInput: XRInputSource, _profile: IMotionControllerProfile, _repositoryUrl: String) = this()
  def this(
    scene: Scene,
    xrInput: XRInputSource,
    _profile: IMotionControllerProfile,
    _repositoryUrl: String,
    controllerCache: js.Array[Filename]
  ) = this()
}
