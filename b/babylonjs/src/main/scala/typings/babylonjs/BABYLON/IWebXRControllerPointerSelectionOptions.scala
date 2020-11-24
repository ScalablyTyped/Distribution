package typings.babylonjs.BABYLON

import typings.babylonjs.XRHandedness
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IWebXRControllerPointerSelectionOptions extends js.Object {
  
  /**
    * if provided, this scene will be used to render meshes.
    */
  var customUtilityLayerScene: js.UndefOr[Scene] = js.native
  
  /**
    * Disable the pointer up event when the xr controller in screen and gaze mode is disposed (meaning - when the user removed the finger from the screen)
    * If not disabled, the last picked point will be used to execute a pointer up event
    * If disabled, pointer up event will be triggered right after the pointer down event.
    * Used in screen and gaze target ray mode only
    */
  var disablePointerUpOnTouchOut: Boolean = js.native
  
  /**
    * Should the scene pointerX and pointerY update be disabled
    * This is required for fullscreen AR GUI, but might slow down other experiences.
    * Disable in VR, if not needed.
    * The first rig camera (left eye) will be used to calculate the projection
    */
  var disableScenePointerVectorUpdate: Boolean = js.native
  
  /**
    * Disable switching the pointer selection from one controller to the other.
    * If the preferred hand is set it will be fixed on this hand, and if not it will be fixed on the first controller added to the scene
    */
  var disableSwitchOnClick: js.UndefOr[Boolean] = js.native
  
  /**
    * Enable pointer selection on all controllers instead of switching between them
    */
  var enablePointerSelectionOnAllControllers: js.UndefOr[Boolean] = js.native
  
  /**
    * For gaze mode for tracked-pointer / controllers (time to select instead of button press)
    */
  var forceGazeMode: Boolean = js.native
  
  /**
    * Optional WebXR camera to be used for gaze selection
    */
  var gazeCamera: js.UndefOr[WebXRCamera] = js.native
  
  /**
    * Factor to be applied to the pointer-moved function in the gaze mode. How sensitive should the gaze mode be when checking if the pointer moved
    * to start a new countdown to the pointer down event.
    * Defaults to 1.
    */
  var gazeModePointerMovedFactor: js.UndefOr[Double] = js.native
  
  /**
    * The maximum distance of the pointer selection feature. Defaults to 100.
    */
  var maxPointerDistance: js.UndefOr[Double] = js.native
  
  /**
    * Different button type to use instead of the main component
    */
  var overrideButtonId: js.UndefOr[String] = js.native
  
  /**
    * The preferred hand to give the pointer selection to. This will be prioritized when the controller initialize.
    * If switch is enabled, it will still allow the user to switch between the different controllers
    */
  var preferredHandedness: js.UndefOr[XRHandedness] = js.native
  
  /**
    *  use this rendering group id for the meshes (optional)
    */
  var renderingGroupId: js.UndefOr[Double] = js.native
  
  /**
    * The amount of time in milliseconds it takes between pick found something to a pointer down event.
    * Used in gaze modes. Tracked pointer uses the trigger, screen uses touch events
    * 3000 means 3 seconds between pointing at something and selecting it
    */
  var timeToSelect: js.UndefOr[Double] = js.native
  
  /**
    * Should meshes created here be added to a utility layer or the main scene
    */
  var useUtilityLayer: js.UndefOr[Boolean] = js.native
  
  /**
    * the xr input to use with this pointer selection
    */
  var xrInput: WebXRInput = js.native
}
object IWebXRControllerPointerSelectionOptions {
  
  @scala.inline
  def apply(
    disablePointerUpOnTouchOut: Boolean,
    disableScenePointerVectorUpdate: Boolean,
    forceGazeMode: Boolean,
    xrInput: WebXRInput
  ): IWebXRControllerPointerSelectionOptions = {
    val __obj = js.Dynamic.literal(disablePointerUpOnTouchOut = disablePointerUpOnTouchOut.asInstanceOf[js.Any], disableScenePointerVectorUpdate = disableScenePointerVectorUpdate.asInstanceOf[js.Any], forceGazeMode = forceGazeMode.asInstanceOf[js.Any], xrInput = xrInput.asInstanceOf[js.Any])
    __obj.asInstanceOf[IWebXRControllerPointerSelectionOptions]
  }
  
  @scala.inline
  implicit class IWebXRControllerPointerSelectionOptionsOps[Self <: IWebXRControllerPointerSelectionOptions] (val x: Self) extends AnyVal {
    
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
    def setDisablePointerUpOnTouchOut(value: Boolean): Self = this.set("disablePointerUpOnTouchOut", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisableScenePointerVectorUpdate(value: Boolean): Self = this.set("disableScenePointerVectorUpdate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setForceGazeMode(value: Boolean): Self = this.set("forceGazeMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setXrInput(value: WebXRInput): Self = this.set("xrInput", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCustomUtilityLayerScene(value: Scene): Self = this.set("customUtilityLayerScene", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCustomUtilityLayerScene: Self = this.set("customUtilityLayerScene", js.undefined)
    
    @scala.inline
    def setDisableSwitchOnClick(value: Boolean): Self = this.set("disableSwitchOnClick", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisableSwitchOnClick: Self = this.set("disableSwitchOnClick", js.undefined)
    
    @scala.inline
    def setEnablePointerSelectionOnAllControllers(value: Boolean): Self = this.set("enablePointerSelectionOnAllControllers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnablePointerSelectionOnAllControllers: Self = this.set("enablePointerSelectionOnAllControllers", js.undefined)
    
    @scala.inline
    def setGazeCamera(value: WebXRCamera): Self = this.set("gazeCamera", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGazeCamera: Self = this.set("gazeCamera", js.undefined)
    
    @scala.inline
    def setGazeModePointerMovedFactor(value: Double): Self = this.set("gazeModePointerMovedFactor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGazeModePointerMovedFactor: Self = this.set("gazeModePointerMovedFactor", js.undefined)
    
    @scala.inline
    def setMaxPointerDistance(value: Double): Self = this.set("maxPointerDistance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxPointerDistance: Self = this.set("maxPointerDistance", js.undefined)
    
    @scala.inline
    def setOverrideButtonId(value: String): Self = this.set("overrideButtonId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOverrideButtonId: Self = this.set("overrideButtonId", js.undefined)
    
    @scala.inline
    def setPreferredHandedness(value: XRHandedness): Self = this.set("preferredHandedness", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePreferredHandedness: Self = this.set("preferredHandedness", js.undefined)
    
    @scala.inline
    def setRenderingGroupId(value: Double): Self = this.set("renderingGroupId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRenderingGroupId: Self = this.set("renderingGroupId", js.undefined)
    
    @scala.inline
    def setTimeToSelect(value: Double): Self = this.set("timeToSelect", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTimeToSelect: Self = this.set("timeToSelect", js.undefined)
    
    @scala.inline
    def setUseUtilityLayer(value: Boolean): Self = this.set("useUtilityLayer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUseUtilityLayer: Self = this.set("useUtilityLayer", js.undefined)
  }
}
