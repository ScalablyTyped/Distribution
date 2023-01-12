package typings.babylonjs.BABYLON

import typings.babylonjs.XRHandedness
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IWebXRNearInteractionOptions extends StObject {
  
  /**
    * If provided, this scene will be used to render meshes.
    */
  var customUtilityLayerScene: js.UndefOr[Scene] = js.undefined
  
  /**
    * Disable switching the near interaction from one controller to the other.
    * If the preferred hand is set it will be fixed on this hand, and if not it will be fixed on the first controller added to the scene
    */
  var disableSwitchOnClick: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Enable near interaction on all controllers instead of switching between them
    */
  var enableNearInteractionOnAllControllers: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Far interaction feature to toggle when near interaction takes precedence
    */
  var farInteractionFeature: js.UndefOr[WebXRControllerPointerSelection] = js.undefined
  
  /**
    * Optional material for the motion controller orb, if enabled
    */
  var motionControllerOrbMaterial: js.UndefOr[Material] = js.undefined
  
  /**
    * Near interaction mode for motion controllers
    */
  var nearInteractionControllerMode: js.UndefOr[WebXRNearControllerMode] = js.undefined
  
  /**
    * The preferred hand to give the near interaction to. This will be prioritized when the controller initialize.
    * If switch is enabled, it will still allow the user to switch between the different controllers
    */
  var preferredHandedness: js.UndefOr[XRHandedness] = js.undefined
  
  /**
    * Should meshes created here be added to a utility layer or the main scene
    */
  var useUtilityLayer: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The xr input to use with this near interaction
    */
  var xrInput: WebXRInput
}
object IWebXRNearInteractionOptions {
  
  inline def apply(xrInput: WebXRInput): IWebXRNearInteractionOptions = {
    val __obj = js.Dynamic.literal(xrInput = xrInput.asInstanceOf[js.Any])
    __obj.asInstanceOf[IWebXRNearInteractionOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IWebXRNearInteractionOptions] (val x: Self) extends AnyVal {
    
    inline def setCustomUtilityLayerScene(value: Scene): Self = StObject.set(x, "customUtilityLayerScene", value.asInstanceOf[js.Any])
    
    inline def setCustomUtilityLayerSceneUndefined: Self = StObject.set(x, "customUtilityLayerScene", js.undefined)
    
    inline def setDisableSwitchOnClick(value: Boolean): Self = StObject.set(x, "disableSwitchOnClick", value.asInstanceOf[js.Any])
    
    inline def setDisableSwitchOnClickUndefined: Self = StObject.set(x, "disableSwitchOnClick", js.undefined)
    
    inline def setEnableNearInteractionOnAllControllers(value: Boolean): Self = StObject.set(x, "enableNearInteractionOnAllControllers", value.asInstanceOf[js.Any])
    
    inline def setEnableNearInteractionOnAllControllersUndefined: Self = StObject.set(x, "enableNearInteractionOnAllControllers", js.undefined)
    
    inline def setFarInteractionFeature(value: WebXRControllerPointerSelection): Self = StObject.set(x, "farInteractionFeature", value.asInstanceOf[js.Any])
    
    inline def setFarInteractionFeatureUndefined: Self = StObject.set(x, "farInteractionFeature", js.undefined)
    
    inline def setMotionControllerOrbMaterial(value: Material): Self = StObject.set(x, "motionControllerOrbMaterial", value.asInstanceOf[js.Any])
    
    inline def setMotionControllerOrbMaterialUndefined: Self = StObject.set(x, "motionControllerOrbMaterial", js.undefined)
    
    inline def setNearInteractionControllerMode(value: WebXRNearControllerMode): Self = StObject.set(x, "nearInteractionControllerMode", value.asInstanceOf[js.Any])
    
    inline def setNearInteractionControllerModeUndefined: Self = StObject.set(x, "nearInteractionControllerMode", js.undefined)
    
    inline def setPreferredHandedness(value: XRHandedness): Self = StObject.set(x, "preferredHandedness", value.asInstanceOf[js.Any])
    
    inline def setPreferredHandednessUndefined: Self = StObject.set(x, "preferredHandedness", js.undefined)
    
    inline def setUseUtilityLayer(value: Boolean): Self = StObject.set(x, "useUtilityLayer", value.asInstanceOf[js.Any])
    
    inline def setUseUtilityLayerUndefined: Self = StObject.set(x, "useUtilityLayer", js.undefined)
    
    inline def setXrInput(value: WebXRInput): Self = StObject.set(x, "xrInput", value.asInstanceOf[js.Any])
  }
}
