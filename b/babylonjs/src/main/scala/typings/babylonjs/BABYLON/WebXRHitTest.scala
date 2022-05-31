package typings.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.babylonjs.BABYLON.IDisposable because Already inherited
- typings.babylonjs.BABYLON.IWebXRFeature because Already inherited
- typings.babylonjs.BABYLON.IWebXRHitTestFeature because var conflicts: attached, dependsOn, disableAutoAttach, isDisposed, xrNativeFeatureName. Inlined onHitTestResultObservable */ @js.native
trait WebXRHitTest
  extends StObject
     with WebXRAbstractFeature {
  
  /* private */ var _processWebXRHitTestResult: js.Any = js.native
  
  /* private */ var _tmpMat: js.Any = js.native
  
  /* private */ var _tmpPos: js.Any = js.native
  
  /* private */ var _tmpQuat: js.Any = js.native
  
  /* private */ var _transientXrHitTestSource: js.Any = js.native
  
  /* private */ var _xrHitTestSource: js.Any = js.native
  
  /**
    * When set to true, each hit test will have its own position/rotation objects
    * When set to false, position and rotation objects will be reused for each hit test. It is expected that
    * the developers will clone them or copy them as they see fit.
    */
  var autoCloneTransformation: Boolean = js.native
  
  /* private */ var initHitTestSource: js.Any = js.native
  
  /**
    * Triggered when new babylon (transformed) hit test results are available
    * Note - this will be called when results come back from the device. It can be an empty array!!
    */
  var onHitTestResultObservable: Observable[js.Array[IWebXRHitResult]] = js.native
  
  /**
    * options to use when constructing this feature
    */
  val options: IWebXRHitTestOptions = js.native
  
  /**
    * Use this to temporarily pause hit test checks.
    */
  var paused: Boolean = js.native
}
