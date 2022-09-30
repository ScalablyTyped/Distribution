package typings.babylonjs.anon

import typings.babylonjs.BABYLON.Scene
import typings.babylonjs.BABYLON.WebXRControllerPointerSelection
import typings.babylonjs.BABYLON.WebXRInput
import typings.babylonjs.BABYLON.WebXRNearControllerMode
import typings.babylonjs.XRHandedness
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<babylonjs.BABYLON.IWebXRNearInteractionOptions> */
trait PartialIWebXRNearInteractCustomUtilityLayerScene extends StObject {
  
  var customUtilityLayerScene: js.UndefOr[Scene] = js.undefined
  
  var disableSwitchOnClick: js.UndefOr[Boolean] = js.undefined
  
  var enableNearInteractionOnAllControllers: js.UndefOr[Boolean] = js.undefined
  
  var farInteractionFeature: js.UndefOr[WebXRControllerPointerSelection] = js.undefined
  
  var motionControllerOrbMaterial: js.UndefOr[typings.babylonjs.BABYLON.Material] = js.undefined
  
  var nearInteractionControllerMode: js.UndefOr[WebXRNearControllerMode] = js.undefined
  
  var preferredHandedness: js.UndefOr[XRHandedness] = js.undefined
  
  var useUtilityLayer: js.UndefOr[Boolean] = js.undefined
  
  var xrInput: js.UndefOr[WebXRInput] = js.undefined
}
object PartialIWebXRNearInteractCustomUtilityLayerScene {
  
  inline def apply(): PartialIWebXRNearInteractCustomUtilityLayerScene = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialIWebXRNearInteractCustomUtilityLayerScene]
  }
  
  extension [Self <: PartialIWebXRNearInteractCustomUtilityLayerScene](x: Self) {
    
    inline def setCustomUtilityLayerScene(value: Scene): Self = StObject.set(x, "customUtilityLayerScene", value.asInstanceOf[js.Any])
    
    inline def setCustomUtilityLayerSceneUndefined: Self = StObject.set(x, "customUtilityLayerScene", js.undefined)
    
    inline def setDisableSwitchOnClick(value: Boolean): Self = StObject.set(x, "disableSwitchOnClick", value.asInstanceOf[js.Any])
    
    inline def setDisableSwitchOnClickUndefined: Self = StObject.set(x, "disableSwitchOnClick", js.undefined)
    
    inline def setEnableNearInteractionOnAllControllers(value: Boolean): Self = StObject.set(x, "enableNearInteractionOnAllControllers", value.asInstanceOf[js.Any])
    
    inline def setEnableNearInteractionOnAllControllersUndefined: Self = StObject.set(x, "enableNearInteractionOnAllControllers", js.undefined)
    
    inline def setFarInteractionFeature(value: WebXRControllerPointerSelection): Self = StObject.set(x, "farInteractionFeature", value.asInstanceOf[js.Any])
    
    inline def setFarInteractionFeatureUndefined: Self = StObject.set(x, "farInteractionFeature", js.undefined)
    
    inline def setMotionControllerOrbMaterial(value: typings.babylonjs.BABYLON.Material): Self = StObject.set(x, "motionControllerOrbMaterial", value.asInstanceOf[js.Any])
    
    inline def setMotionControllerOrbMaterialUndefined: Self = StObject.set(x, "motionControllerOrbMaterial", js.undefined)
    
    inline def setNearInteractionControllerMode(value: WebXRNearControllerMode): Self = StObject.set(x, "nearInteractionControllerMode", value.asInstanceOf[js.Any])
    
    inline def setNearInteractionControllerModeUndefined: Self = StObject.set(x, "nearInteractionControllerMode", js.undefined)
    
    inline def setPreferredHandedness(value: XRHandedness): Self = StObject.set(x, "preferredHandedness", value.asInstanceOf[js.Any])
    
    inline def setPreferredHandednessUndefined: Self = StObject.set(x, "preferredHandedness", js.undefined)
    
    inline def setUseUtilityLayer(value: Boolean): Self = StObject.set(x, "useUtilityLayer", value.asInstanceOf[js.Any])
    
    inline def setUseUtilityLayerUndefined: Self = StObject.set(x, "useUtilityLayer", js.undefined)
    
    inline def setXrInput(value: WebXRInput): Self = StObject.set(x, "xrInput", value.asInstanceOf[js.Any])
    
    inline def setXrInputUndefined: Self = StObject.set(x, "xrInput", js.undefined)
  }
}
