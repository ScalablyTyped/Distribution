package typings.babylonjs

import typings.babylonjs.mathsMathDotvectorMod.Matrix
import typings.babylonjs.meshesTransformNodeMod.TransformNode
import typings.babylonjs.miscObservableMod.Observable
import typings.babylonjs.xRFeaturesWebXRAbstractFeatureMod.WebXRAbstractFeature
import typings.babylonjs.xRWebXRFeaturesManagerMod.IWebXRFeature
import typings.babylonjs.xRWebXRSessionManagerMod.WebXRSessionManager
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object xRFeaturesWebXRHitTestLegacyMod {
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typings.babylonjs.sceneMod.IDisposable because Already inherited
  - typings.babylonjs.xRWebXRFeaturesManagerMod.IWebXRFeature because Already inherited
  - typings.babylonjs.xRFeaturesWebXRHitTestLegacyMod.IWebXRHitTestFeature because var conflicts: attached, dependsOn, disableAutoAttach, getXRSessionInitExtension, isDisposed, xrNativeFeatureName. Inlined onHitTestResultObservable */ @JSImport("babylonjs/XR/features/WebXRHitTestLegacy", "WebXRHitTestLegacy")
  @js.native
  open class WebXRHitTestLegacy protected () extends WebXRAbstractFeature {
    /**
      * Creates a new instance of the (legacy version) hit test feature
      * @param _xrSessionManager an instance of WebXRSessionManager
      * @param options options to use when constructing this feature
      */
    def this(_xrSessionManager: WebXRSessionManager) = this()
    def this(
      _xrSessionManager: WebXRSessionManager,
      /**
      * options to use when constructing this feature
      */
    options: IWebXRLegacyHitTestOptions
    ) = this()
    
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
  /* static members */
  object WebXRHitTestLegacy {
    
    @JSImport("babylonjs/XR/features/WebXRHitTestLegacy", "WebXRHitTestLegacy")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * The module's name
      */
    @JSImport("babylonjs/XR/features/WebXRHitTestLegacy", "WebXRHitTestLegacy.Name")
    @js.native
    val Name: String = js.native
    
    /**
      * The (Babylon) version of this module.
      * This is an integer representing the implementation version.
      * This number does not correspond to the WebXR specs version
      */
    @JSImport("babylonjs/XR/features/WebXRHitTestLegacy", "WebXRHitTestLegacy.Version")
    @js.native
    val Version: Double = js.native
    
    /**
      * execute a hit test with an XR Ray
      *
      * @param xrSession a native xrSession that will execute this hit test
      * @param xrRay the ray (position and direction) to use for ray-casting
      * @param referenceSpace native XR reference space to use for the hit-test
      * @param filter filter function that will filter the results
      * @returns a promise that resolves with an array of native XR hit result in xr coordinates system
      */
    inline def XRHitTestWithRay(xrSession: XRSession, xrRay: XRRay, referenceSpace: XRReferenceSpace): js.Promise[js.Array[XRHitResult]] = (^.asInstanceOf[js.Dynamic].applyDynamic("XRHitTestWithRay")(xrSession.asInstanceOf[js.Any], xrRay.asInstanceOf[js.Any], referenceSpace.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[XRHitResult]]]
    inline def XRHitTestWithRay(
      xrSession: XRSession,
      xrRay: XRRay,
      referenceSpace: XRReferenceSpace,
      filter: js.Function1[/* result */ XRHitResult, Boolean]
    ): js.Promise[js.Array[XRHitResult]] = (^.asInstanceOf[js.Dynamic].applyDynamic("XRHitTestWithRay")(xrSession.asInstanceOf[js.Any], xrRay.asInstanceOf[js.Any], referenceSpace.asInstanceOf[js.Any], filter.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[XRHitResult]]]
    
    /**
      * Execute a hit test on the current running session using a select event returned from a transient input (such as touch)
      * @param event the (select) event to use to select with
      * @param referenceSpace the reference space to use for this hit test
      * @returns a promise that resolves with an array of native XR hit result in xr coordinates system
      */
    inline def XRHitTestWithSelectEvent(event: XRInputSourceEvent, referenceSpace: XRReferenceSpace): js.Promise[js.Array[XRHitResult]] = (^.asInstanceOf[js.Dynamic].applyDynamic("XRHitTestWithSelectEvent")(event.asInstanceOf[js.Any], referenceSpace.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[XRHitResult]]]
  }
  
  @js.native
  trait IWebXRHitTestFeature[T /* <: IWebXRLegacyHitResult */]
    extends StObject
       with IWebXRFeature {
    
    /**
      * Triggered when new babylon (transformed) hit test results are available
      */
    var onHitTestResultObservable: Observable[js.Array[T]] = js.native
  }
  
  trait IWebXRLegacyHitResult extends StObject {
    
    /**
      * Transformation matrix that can be applied to a node that will put it in the hit point location
      */
    var transformationMatrix: Matrix
    
    /**
      * The native hit test result
      */
    var xrHitResult: XRHitResult | XRHitTestResult
  }
  object IWebXRLegacyHitResult {
    
    inline def apply(transformationMatrix: Matrix, xrHitResult: XRHitResult | XRHitTestResult): IWebXRLegacyHitResult = {
      val __obj = js.Dynamic.literal(transformationMatrix = transformationMatrix.asInstanceOf[js.Any], xrHitResult = xrHitResult.asInstanceOf[js.Any])
      __obj.asInstanceOf[IWebXRLegacyHitResult]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IWebXRLegacyHitResult] (val x: Self) extends AnyVal {
      
      inline def setTransformationMatrix(value: Matrix): Self = StObject.set(x, "transformationMatrix", value.asInstanceOf[js.Any])
      
      inline def setXrHitResult(value: XRHitResult | XRHitTestResult): Self = StObject.set(x, "xrHitResult", value.asInstanceOf[js.Any])
    }
  }
  
  trait IWebXRLegacyHitTestOptions extends StObject {
    
    /**
      * Only test when user interacted with the scene. Default - hit test every frame
      */
    var testOnPointerDownOnly: js.UndefOr[Boolean] = js.undefined
    
    /**
      * The node to use to transform the local results to world coordinates
      */
    var worldParentNode: js.UndefOr[TransformNode] = js.undefined
  }
  object IWebXRLegacyHitTestOptions {
    
    inline def apply(): IWebXRLegacyHitTestOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IWebXRLegacyHitTestOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IWebXRLegacyHitTestOptions] (val x: Self) extends AnyVal {
      
      inline def setTestOnPointerDownOnly(value: Boolean): Self = StObject.set(x, "testOnPointerDownOnly", value.asInstanceOf[js.Any])
      
      inline def setTestOnPointerDownOnlyUndefined: Self = StObject.set(x, "testOnPointerDownOnly", js.undefined)
      
      inline def setWorldParentNode(value: TransformNode): Self = StObject.set(x, "worldParentNode", value.asInstanceOf[js.Any])
      
      inline def setWorldParentNodeUndefined: Self = StObject.set(x, "worldParentNode", js.undefined)
    }
  }
}
