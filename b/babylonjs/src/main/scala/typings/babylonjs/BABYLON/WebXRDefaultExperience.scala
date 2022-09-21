package typings.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WebXRDefaultExperience extends StObject {
  
  /**
    * Base experience
    */
  var baseExperience: WebXRExperienceHelper
  
  /**
    * Disposes of the experience helper
    */
  def dispose(): Unit
  
  /**
    * Enables ui for entering/exiting xr
    */
  var enterExitUI: WebXREnterExitUI
  
  /**
    * Input experience extension
    */
  var input: WebXRInput
  
  /**
    * Enables near interaction for hands/controllers
    */
  var nearInteraction: WebXRNearInteraction
  
  /**
    * Enables laser pointer and selection
    */
  var pointerSelection: WebXRControllerPointerSelection
  
  /**
    * Default target xr should render to
    */
  var renderTarget: WebXRRenderTarget
  
  /**
    * Enables teleportation
    */
  var teleportation: WebXRMotionControllerTeleportation
}
object WebXRDefaultExperience {
  
  inline def apply(
    baseExperience: WebXRExperienceHelper,
    dispose: () => Unit,
    enterExitUI: WebXREnterExitUI,
    input: WebXRInput,
    nearInteraction: WebXRNearInteraction,
    pointerSelection: WebXRControllerPointerSelection,
    renderTarget: WebXRRenderTarget,
    teleportation: WebXRMotionControllerTeleportation
  ): WebXRDefaultExperience = {
    val __obj = js.Dynamic.literal(baseExperience = baseExperience.asInstanceOf[js.Any], dispose = js.Any.fromFunction0(dispose), enterExitUI = enterExitUI.asInstanceOf[js.Any], input = input.asInstanceOf[js.Any], nearInteraction = nearInteraction.asInstanceOf[js.Any], pointerSelection = pointerSelection.asInstanceOf[js.Any], renderTarget = renderTarget.asInstanceOf[js.Any], teleportation = teleportation.asInstanceOf[js.Any])
    __obj.asInstanceOf[WebXRDefaultExperience]
  }
  
  extension [Self <: WebXRDefaultExperience](x: Self) {
    
    inline def setBaseExperience(value: WebXRExperienceHelper): Self = StObject.set(x, "baseExperience", value.asInstanceOf[js.Any])
    
    inline def setDispose(value: () => Unit): Self = StObject.set(x, "dispose", js.Any.fromFunction0(value))
    
    inline def setEnterExitUI(value: WebXREnterExitUI): Self = StObject.set(x, "enterExitUI", value.asInstanceOf[js.Any])
    
    inline def setInput(value: WebXRInput): Self = StObject.set(x, "input", value.asInstanceOf[js.Any])
    
    inline def setNearInteraction(value: WebXRNearInteraction): Self = StObject.set(x, "nearInteraction", value.asInstanceOf[js.Any])
    
    inline def setPointerSelection(value: WebXRControllerPointerSelection): Self = StObject.set(x, "pointerSelection", value.asInstanceOf[js.Any])
    
    inline def setRenderTarget(value: WebXRRenderTarget): Self = StObject.set(x, "renderTarget", value.asInstanceOf[js.Any])
    
    inline def setTeleportation(value: WebXRMotionControllerTeleportation): Self = StObject.set(x, "teleportation", value.asInstanceOf[js.Any])
  }
}
