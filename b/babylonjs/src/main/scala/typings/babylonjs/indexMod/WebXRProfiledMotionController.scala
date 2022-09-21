package typings.babylonjs.indexMod

import typings.babylonjs.XRInputSource
import typings.babylonjs.anon.Filename
import typings.babylonjs.webXRAbstractMotionControllerMod.IMotionControllerProfile
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs/index", "WebXRProfiledMotionController")
@js.native
open class WebXRProfiledMotionController protected ()
  extends typings.babylonjs.xRIndexMod.WebXRProfiledMotionController {
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
