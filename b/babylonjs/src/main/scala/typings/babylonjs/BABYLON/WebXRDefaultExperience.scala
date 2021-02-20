package typings.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WebXRDefaultExperience extends StObject {
  
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
  implicit class WebXRDefaultExperienceMutableBuilder[Self <: WebXRDefaultExperience] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBaseExperience(value: WebXRExperienceHelper): Self = StObject.set(x, "baseExperience", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDispose(value: () => Unit): Self = StObject.set(x, "dispose", js.Any.fromFunction0(value))
    
    @scala.inline
    def setEnterExitUI(value: WebXREnterExitUI): Self = StObject.set(x, "enterExitUI", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInput(value: WebXRInput): Self = StObject.set(x, "input", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPointerSelection(value: WebXRControllerPointerSelection): Self = StObject.set(x, "pointerSelection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRenderTarget(value: WebXRRenderTarget): Self = StObject.set(x, "renderTarget", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTeleportation(value: WebXRMotionControllerTeleportation): Self = StObject.set(x, "teleportation", value.asInstanceOf[js.Any])
  }
}
