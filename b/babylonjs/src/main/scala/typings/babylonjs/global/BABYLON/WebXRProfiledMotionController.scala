package typings.babylonjs.global.BABYLON

import typings.babylonjs.BABYLON.IMotionControllerProfile
import typings.babylonjs.XRInputSource
import typings.babylonjs.anon.Meshes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("BABYLON.WebXRProfiledMotionController")
@js.native
open class WebXRProfiledMotionController protected ()
  extends StObject
     with typings.babylonjs.BABYLON.WebXRProfiledMotionController {
  def this(
    scene: typings.babylonjs.BABYLON.Scene,
    xrInput: XRInputSource,
    _profile: IMotionControllerProfile,
    _repositoryUrl: String
  ) = this()
  def this(
    scene: typings.babylonjs.BABYLON.Scene,
    xrInput: XRInputSource,
    _profile: IMotionControllerProfile,
    _repositoryUrl: String,
    controllerCache: js.Array[Meshes]
  ) = this()
  
  /**
    * Releases all held resources
    */
  /* CompleteClass */
  override def dispose(): Unit = js.native
}
