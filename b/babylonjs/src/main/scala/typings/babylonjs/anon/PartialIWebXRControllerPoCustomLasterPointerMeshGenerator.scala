package typings.babylonjs.anon

import typings.babylonjs.BABYLON.AbstractMesh
import typings.babylonjs.BABYLON.Scene
import typings.babylonjs.BABYLON.WebXRCamera
import typings.babylonjs.BABYLON.WebXRInput
import typings.babylonjs.XRHandedness
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<babylonjs.BABYLON.IWebXRControllerPointerSelectionOptions> */
trait PartialIWebXRControllerPoCustomLasterPointerMeshGenerator extends StObject {
  
  var customLasterPointerMeshGenerator: js.UndefOr[js.Function0[AbstractMesh]] = js.undefined
  
  var customSelectionMeshGenerator: js.UndefOr[js.Function0[typings.babylonjs.BABYLON.Mesh]] = js.undefined
  
  var customUtilityLayerScene: js.UndefOr[Scene] = js.undefined
  
  var disablePointerUpOnTouchOut: js.UndefOr[Boolean] = js.undefined
  
  var disableScenePointerVectorUpdate: js.UndefOr[Boolean] = js.undefined
  
  var disableSwitchOnClick: js.UndefOr[Boolean] = js.undefined
  
  var enablePointerSelectionOnAllControllers: js.UndefOr[Boolean] = js.undefined
  
  var forceGazeMode: js.UndefOr[Boolean] = js.undefined
  
  var gazeCamera: js.UndefOr[WebXRCamera] = js.undefined
  
  var gazeModePointerMovedFactor: js.UndefOr[Double] = js.undefined
  
  var maxPointerDistance: js.UndefOr[Double] = js.undefined
  
  var overrideButtonId: js.UndefOr[String] = js.undefined
  
  var preferredHandedness: js.UndefOr[XRHandedness] = js.undefined
  
  var renderingGroupId: js.UndefOr[Double] = js.undefined
  
  var timeToSelect: js.UndefOr[Double] = js.undefined
  
  var useUtilityLayer: js.UndefOr[Boolean] = js.undefined
  
  var xrInput: js.UndefOr[WebXRInput] = js.undefined
}
object PartialIWebXRControllerPoCustomLasterPointerMeshGenerator {
  
  inline def apply(): PartialIWebXRControllerPoCustomLasterPointerMeshGenerator = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialIWebXRControllerPoCustomLasterPointerMeshGenerator]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PartialIWebXRControllerPoCustomLasterPointerMeshGenerator] (val x: Self) extends AnyVal {
    
    inline def setCustomLasterPointerMeshGenerator(value: () => AbstractMesh): Self = StObject.set(x, "customLasterPointerMeshGenerator", js.Any.fromFunction0(value))
    
    inline def setCustomLasterPointerMeshGeneratorUndefined: Self = StObject.set(x, "customLasterPointerMeshGenerator", js.undefined)
    
    inline def setCustomSelectionMeshGenerator(value: () => typings.babylonjs.BABYLON.Mesh): Self = StObject.set(x, "customSelectionMeshGenerator", js.Any.fromFunction0(value))
    
    inline def setCustomSelectionMeshGeneratorUndefined: Self = StObject.set(x, "customSelectionMeshGenerator", js.undefined)
    
    inline def setCustomUtilityLayerScene(value: Scene): Self = StObject.set(x, "customUtilityLayerScene", value.asInstanceOf[js.Any])
    
    inline def setCustomUtilityLayerSceneUndefined: Self = StObject.set(x, "customUtilityLayerScene", js.undefined)
    
    inline def setDisablePointerUpOnTouchOut(value: Boolean): Self = StObject.set(x, "disablePointerUpOnTouchOut", value.asInstanceOf[js.Any])
    
    inline def setDisablePointerUpOnTouchOutUndefined: Self = StObject.set(x, "disablePointerUpOnTouchOut", js.undefined)
    
    inline def setDisableScenePointerVectorUpdate(value: Boolean): Self = StObject.set(x, "disableScenePointerVectorUpdate", value.asInstanceOf[js.Any])
    
    inline def setDisableScenePointerVectorUpdateUndefined: Self = StObject.set(x, "disableScenePointerVectorUpdate", js.undefined)
    
    inline def setDisableSwitchOnClick(value: Boolean): Self = StObject.set(x, "disableSwitchOnClick", value.asInstanceOf[js.Any])
    
    inline def setDisableSwitchOnClickUndefined: Self = StObject.set(x, "disableSwitchOnClick", js.undefined)
    
    inline def setEnablePointerSelectionOnAllControllers(value: Boolean): Self = StObject.set(x, "enablePointerSelectionOnAllControllers", value.asInstanceOf[js.Any])
    
    inline def setEnablePointerSelectionOnAllControllersUndefined: Self = StObject.set(x, "enablePointerSelectionOnAllControllers", js.undefined)
    
    inline def setForceGazeMode(value: Boolean): Self = StObject.set(x, "forceGazeMode", value.asInstanceOf[js.Any])
    
    inline def setForceGazeModeUndefined: Self = StObject.set(x, "forceGazeMode", js.undefined)
    
    inline def setGazeCamera(value: WebXRCamera): Self = StObject.set(x, "gazeCamera", value.asInstanceOf[js.Any])
    
    inline def setGazeCameraUndefined: Self = StObject.set(x, "gazeCamera", js.undefined)
    
    inline def setGazeModePointerMovedFactor(value: Double): Self = StObject.set(x, "gazeModePointerMovedFactor", value.asInstanceOf[js.Any])
    
    inline def setGazeModePointerMovedFactorUndefined: Self = StObject.set(x, "gazeModePointerMovedFactor", js.undefined)
    
    inline def setMaxPointerDistance(value: Double): Self = StObject.set(x, "maxPointerDistance", value.asInstanceOf[js.Any])
    
    inline def setMaxPointerDistanceUndefined: Self = StObject.set(x, "maxPointerDistance", js.undefined)
    
    inline def setOverrideButtonId(value: String): Self = StObject.set(x, "overrideButtonId", value.asInstanceOf[js.Any])
    
    inline def setOverrideButtonIdUndefined: Self = StObject.set(x, "overrideButtonId", js.undefined)
    
    inline def setPreferredHandedness(value: XRHandedness): Self = StObject.set(x, "preferredHandedness", value.asInstanceOf[js.Any])
    
    inline def setPreferredHandednessUndefined: Self = StObject.set(x, "preferredHandedness", js.undefined)
    
    inline def setRenderingGroupId(value: Double): Self = StObject.set(x, "renderingGroupId", value.asInstanceOf[js.Any])
    
    inline def setRenderingGroupIdUndefined: Self = StObject.set(x, "renderingGroupId", js.undefined)
    
    inline def setTimeToSelect(value: Double): Self = StObject.set(x, "timeToSelect", value.asInstanceOf[js.Any])
    
    inline def setTimeToSelectUndefined: Self = StObject.set(x, "timeToSelect", js.undefined)
    
    inline def setUseUtilityLayer(value: Boolean): Self = StObject.set(x, "useUtilityLayer", value.asInstanceOf[js.Any])
    
    inline def setUseUtilityLayerUndefined: Self = StObject.set(x, "useUtilityLayer", js.undefined)
    
    inline def setXrInput(value: WebXRInput): Self = StObject.set(x, "xrInput", value.asInstanceOf[js.Any])
    
    inline def setXrInputUndefined: Self = StObject.set(x, "xrInput", js.undefined)
  }
}
