package typings.babylonjs.BABYLON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WebXRDefaultExperience extends js.Object {
  
  /**
    * Base experience
    */
  var baseExperience: WebXRExperienceHelper = js.native
  
  /**
    * DIsposes of the experience helper
    */
  def dispose(): Unit = js.native
  
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
}
object WebXRDefaultExperience {
  
  @scala.inline
  def apply(
    baseExperience: WebXRExperienceHelper,
    dispose: () => Unit,
    enterExitUI: WebXREnterExitUI,
    input: WebXRInput,
    pointerSelection: WebXRControllerPointerSelection,
    renderTarget: WebXRRenderTarget,
    teleportation: WebXRMotionControllerTeleportation
  ): WebXRDefaultExperience = {
    val __obj = js.Dynamic.literal(baseExperience = baseExperience.asInstanceOf[js.Any], dispose = js.Any.fromFunction0(dispose), enterExitUI = enterExitUI.asInstanceOf[js.Any], input = input.asInstanceOf[js.Any], pointerSelection = pointerSelection.asInstanceOf[js.Any], renderTarget = renderTarget.asInstanceOf[js.Any], teleportation = teleportation.asInstanceOf[js.Any])
    __obj.asInstanceOf[WebXRDefaultExperience]
  }
  
  @scala.inline
  implicit class WebXRDefaultExperienceOps[Self <: WebXRDefaultExperience] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setBaseExperience(value: WebXRExperienceHelper): Self = this.set("baseExperience", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDispose(value: () => Unit): Self = this.set("dispose", js.Any.fromFunction0(value))
    
    @scala.inline
    def setEnterExitUI(value: WebXREnterExitUI): Self = this.set("enterExitUI", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInput(value: WebXRInput): Self = this.set("input", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPointerSelection(value: WebXRControllerPointerSelection): Self = this.set("pointerSelection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRenderTarget(value: WebXRRenderTarget): Self = this.set("renderTarget", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTeleportation(value: WebXRMotionControllerTeleportation): Self = this.set("teleportation", value.asInstanceOf[js.Any])
  }
}
