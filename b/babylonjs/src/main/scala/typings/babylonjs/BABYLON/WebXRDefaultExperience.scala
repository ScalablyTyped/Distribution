package typings.babylonjs.BABYLON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("BABYLON.WebXRDefaultExperience")
@js.native
class WebXRDefaultExperience protected () extends js.Object {
  /**
    * Base experience
    */
  var baseExperience: WebXRExperienceHelper = js.native
  /**
    * Enables ui for entering/exiting xr
    */
  var enterExitUI: WebXREnterExitUI = js.native
  /**
    * Input experience extension
    */
  var input: WebXRInput = js.native
  /**
    * Enables laser pointer and selection
    */
  var pointerSelection: WebXRControllerPointerSelection = js.native
  /**
    * Default target xr should render to
    */
  var renderTarget: WebXRRenderTarget = js.native
  /**
    * Enables teleportation
    */
  var teleportation: WebXRMotionControllerTeleportation = js.native
  /**
    * DIsposes of the experience helper
    */
  def dispose(): Unit = js.native
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
  def CreateAsync(scene: Scene): js.Promise[WebXRDefaultExperience] = js.native
  def CreateAsync(scene: Scene, options: WebXRDefaultExperienceOptions): js.Promise[WebXRDefaultExperience] = js.native
}

