package typings.babylonjs.BABYLON

import typings.std.HTMLButtonElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WebVROptions extends StObject {
  
  /**
    * Should the native controller meshes be initialized. (default: true)
    */
  var controllerMeshes: js.UndefOr[Boolean] = js.undefined
  
  /**
    * If you'd like to provide your own button to the VRHelper. (default: standard babylon vr button)
    */
  var customVRButton: js.UndefOr[HTMLButtonElement] = js.undefined
  
  /**
    * To change the default offset from the ground to account for user's height in meters. Will be scaled by positionScale. (default: 1.7)
    */
  var defaultHeight: js.UndefOr[Double] = js.undefined
  
  /**
    * Creating a default HemiLight only on controllers. (default: true)
    */
  var defaultLightingOnControllers: js.UndefOr[Boolean] = js.undefined
  
  /**
    * If there are more than one VRDisplays, this will choose the display matching this name. (default: pick first vrDisplay)
    */
  var displayName: js.UndefOr[String] = js.undefined
  
  /**
    * Sets the scale of the vrDevice in babylon space. (default: 1)
    */
  var positionScale: js.UndefOr[Double] = js.undefined
  
  /**
    * To change the length of the ray for gaze/controllers. Will be scaled by positionScale. (default: 100)
    */
  var rayLength: js.UndefOr[Double] = js.undefined
  
  /**
    * Sets if the webVR camera should be tracked to the vrDevice. (default: true)
    */
  var trackPosition: js.UndefOr[Boolean] = js.undefined
  
  /**
    * If you don't want to use the default VR button of the helper. (default: false)
    */
  var useCustomVRButton: js.UndefOr[Boolean] = js.undefined
  
  /**
    * If multiview should be used if available (default: false)
    */
  var useMultiview: js.UndefOr[Boolean] = js.undefined
}
object WebVROptions {
  
  inline def apply(): WebVROptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WebVROptions]
  }
  
  extension [Self <: WebVROptions](x: Self) {
    
    inline def setControllerMeshes(value: Boolean): Self = StObject.set(x, "controllerMeshes", value.asInstanceOf[js.Any])
    
    inline def setControllerMeshesUndefined: Self = StObject.set(x, "controllerMeshes", js.undefined)
    
    inline def setCustomVRButton(value: HTMLButtonElement): Self = StObject.set(x, "customVRButton", value.asInstanceOf[js.Any])
    
    inline def setCustomVRButtonUndefined: Self = StObject.set(x, "customVRButton", js.undefined)
    
    inline def setDefaultHeight(value: Double): Self = StObject.set(x, "defaultHeight", value.asInstanceOf[js.Any])
    
    inline def setDefaultHeightUndefined: Self = StObject.set(x, "defaultHeight", js.undefined)
    
    inline def setDefaultLightingOnControllers(value: Boolean): Self = StObject.set(x, "defaultLightingOnControllers", value.asInstanceOf[js.Any])
    
    inline def setDefaultLightingOnControllersUndefined: Self = StObject.set(x, "defaultLightingOnControllers", js.undefined)
    
    inline def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    inline def setPositionScale(value: Double): Self = StObject.set(x, "positionScale", value.asInstanceOf[js.Any])
    
    inline def setPositionScaleUndefined: Self = StObject.set(x, "positionScale", js.undefined)
    
    inline def setRayLength(value: Double): Self = StObject.set(x, "rayLength", value.asInstanceOf[js.Any])
    
    inline def setRayLengthUndefined: Self = StObject.set(x, "rayLength", js.undefined)
    
    inline def setTrackPosition(value: Boolean): Self = StObject.set(x, "trackPosition", value.asInstanceOf[js.Any])
    
    inline def setTrackPositionUndefined: Self = StObject.set(x, "trackPosition", js.undefined)
    
    inline def setUseCustomVRButton(value: Boolean): Self = StObject.set(x, "useCustomVRButton", value.asInstanceOf[js.Any])
    
    inline def setUseCustomVRButtonUndefined: Self = StObject.set(x, "useCustomVRButton", js.undefined)
    
    inline def setUseMultiview(value: Boolean): Self = StObject.set(x, "useMultiview", value.asInstanceOf[js.Any])
    
    inline def setUseMultiviewUndefined: Self = StObject.set(x, "useMultiview", js.undefined)
  }
}
