package typings.babylonjs.BABYLON

import typings.babylonjs.XRHitResult
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.babylonjs.BABYLON.IDisposable because Already inherited
- typings.babylonjs.BABYLON.IWebXRFeature because Already inherited
- typings.babylonjs.BABYLON.IWebXRHitTestFeature because var conflicts: attached, dependsOn, disableAutoAttach, getXRSessionInitExtension, isDisposed, xrNativeFeatureName. Inlined onHitTestResultObservable */ @js.native
trait WebXRHitTestLegacy
  extends StObject
     with WebXRAbstractFeature {
  
  /* private */ var _direction: Any = js.native
  
  /* private */ var _mat: Any = js.native
  
  /* private */ var _onHitTestResults: Any = js.native
  
  /* private */ var _onSelect: Any = js.native
  
  /* private */ var _onSelectEnabled: Any = js.native
  
  /* private */ var _origin: Any = js.native
  
  /**
    * Populated with the last native XR Hit Results
    */
  var lastNativeXRHitResults: js.Array[XRHitResult] = js.native
  
  /**
    * Triggered when new babylon (transformed) hit test results are available
    */
  var onHitTestResultObservable: Observable[js.Array[IWebXRLegacyHitResult]] = js.native
  
  /**
    * options to use when constructing this feature
    */
  val options: IWebXRLegacyHitTestOptions = js.native
}
