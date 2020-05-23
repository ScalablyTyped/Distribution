package typings.babylonjs.global.BABYLON

import typings.babylonjs.BABYLON.WebXRRenderTarget
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("BABYLON.WebXRDefaultExperience")
@js.native
class WebXRDefaultExperience protected ()
  extends typings.babylonjs.BABYLON.WebXRDefaultExperience {
  /**
    * Base experience
    */
  /* CompleteClass */
  override var baseExperience: typings.babylonjs.BABYLON.WebXRExperienceHelper = js.native
  /**
    * Enables ui for entering/exiting xr
    */
  /* CompleteClass */
  override var enterExitUI: typings.babylonjs.BABYLON.WebXREnterExitUI = js.native
  /**
    * Input experience extension
    */
  /* CompleteClass */
  override var input: typings.babylonjs.BABYLON.WebXRInput = js.native
  /**
    * Enables laser pointer and selection
    */
  /* CompleteClass */
  override var pointerSelection: typings.babylonjs.BABYLON.WebXRControllerPointerSelection = js.native
  /**
    * Default target xr should render to
    */
  /* CompleteClass */
  override var renderTarget: WebXRRenderTarget = js.native
  /**
    * Enables teleportation
    */
  /* CompleteClass */
  override var teleportation: typings.babylonjs.BABYLON.WebXRMotionControllerTeleportation = js.native
  /**
    * DIsposes of the experience helper
    */
  /* CompleteClass */
  override def dispose(): Unit = js.native
}

/* static members */
@JSGlobal("BABYLON.WebXRDefaultExperience")
@js.native
object WebXRDefaultExperience extends js.Object {
  /**
    * Creates the default xr experience
    * @param scene scene
    * @param options options for basic configuration
    * @returns resulting WebXRDefaultExperience
    */
  def CreateAsync(scene: typings.babylonjs.BABYLON.Scene): js.Promise[typings.babylonjs.BABYLON.WebXRDefaultExperience] = js.native
  def CreateAsync(
    scene: typings.babylonjs.BABYLON.Scene,
    options: typings.babylonjs.BABYLON.WebXRDefaultExperienceOptions
  ): js.Promise[typings.babylonjs.BABYLON.WebXRDefaultExperience] = js.native
}

