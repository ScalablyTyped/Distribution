package typings.babylonjs

import typings.babylonjs.webXRAbstractFeatureMod.WebXRAbstractFeature
import typings.babylonjs.webXRLayerWrapperMod.WebXRLayerType
import typings.babylonjs.webXRLayerWrapperMod.WebXRLayerWrapper
import typings.babylonjs.webXRRenderTargetTextureProviderMod.WebXRLayerRenderTargetTextureProvider
import typings.babylonjs.webXRSessionManagerMod.WebXRSessionManager
import typings.babylonjs.webXRWebGLLayerMod.WebXRWebGLLayerWrapper
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object webXRLayersMod {
  
  @JSImport("babylonjs/XR/features/WebXRLayers", "WebXRCompositionLayerWrapper")
  @js.native
  open class WebXRCompositionLayerWrapper protected () extends WebXRLayerWrapper {
    def this(
      getWidth: js.Function0[Double],
      getHeight: js.Function0[Double],
      layer: XRCompositionLayer,
      layerType: WebXRLayerType,
      isMultiview: Boolean,
      createRTTProvider: js.Function1[/* xrSessionManager */ WebXRSessionManager, WebXRLayerRenderTargetTextureProvider]
    ) = this()
    
    def createRTTProvider(xrSessionManager: WebXRSessionManager): WebXRLayerRenderTargetTextureProvider = js.native
    
    val isMultiview: Boolean = js.native
    
    @JSName("layer")
    val layer_WebXRCompositionLayerWrapper: XRCompositionLayer = js.native
  }
  
  @JSImport("babylonjs/XR/features/WebXRLayers", "WebXRLayers")
  @js.native
  open class WebXRLayers protected () extends WebXRAbstractFeature {
    def this(_xrSessionManager: WebXRSessionManager) = this()
    def this(_xrSessionManager: WebXRSessionManager, _options: IWebXRLayersOptions) = this()
    
    /**
      * Already-created layers
      */
    /* private */ var _existingLayers: Any = js.native
    
    /* private */ var _glContext: Any = js.native
    
    /* private */ val _options: Any = js.native
    
    /* private */ var _xrWebGLBinding: Any = js.native
    
    /**
      * Add a new layer to the already-existing list of layers
      * @param wrappedLayer the new layer to add to the existing ones
      */
    def addXRSessionLayer(wrappedLayer: WebXRLayerWrapper): Unit = js.native
    
    /**
      * Creates a new XRProjectionLayer.
      * @param params an object providing configuration options for the new XRProjectionLayer.
      * @param multiview whether the projection layer should render with multiview.
      * @returns the projection layer
      */
    def createProjectionLayer(): WebXRProjectionLayerWrapper = js.native
    def createProjectionLayer(params: Unit, multiview: Boolean): WebXRProjectionLayerWrapper = js.native
    def createProjectionLayer(params: XRProjectionLayerInit): WebXRProjectionLayerWrapper = js.native
    def createProjectionLayer(params: XRProjectionLayerInit, multiview: Boolean): WebXRProjectionLayerWrapper = js.native
    
    /**
      * Creates a new XRWebGLLayer.
      * @param params an object providing configuration options for the new XRWebGLLayer
      * @returns the XRWebGLLayer
      */
    def createXRWebGLLayer(): WebXRWebGLLayerWrapper = js.native
    def createXRWebGLLayer(params: XRWebGLLayerInit): WebXRWebGLLayerWrapper = js.native
    
    /**
      * Sets the layers to be used by the XR session.
      * Note that you must call this function with any layers you wish to render to
      * since it adds them to the XR session's render state
      * (replacing any layers that were added in a previous call to setXRSessionLayers or updateRenderState).
      * This method also sets up the session manager's render target texture provider
      * as the first layer in the array, which feeds the WebXR camera(s) attached to the session.
      * @param wrappedLayers An array of WebXRLayerWrapper, usually returned from the WebXRLayers createLayer functions.
      */
    def setXRSessionLayers(wrappedLayers: js.Array[WebXRLayerWrapper]): Unit = js.native
  }
  /* static members */
  object WebXRLayers {
    
    /**
      * The module's name
      */
    @JSImport("babylonjs/XR/features/WebXRLayers", "WebXRLayers.Name")
    @js.native
    val Name: String = js.native
    
    /**
      * The (Babylon) version of this module.
      * This is an integer representing the implementation version.
      * This number does not correspond to the WebXR specs version
      */
    @JSImport("babylonjs/XR/features/WebXRLayers", "WebXRLayers.Version")
    @js.native
    val Version: Double = js.native
  }
  
  @JSImport("babylonjs/XR/features/WebXRLayers", "WebXRProjectionLayerWrapper")
  @js.native
  open class WebXRProjectionLayerWrapper protected () extends WebXRCompositionLayerWrapper {
    def this(layer: XRProjectionLayer, isMultiview: Boolean, xrGLBinding: XRWebGLBinding) = this()
    
    @JSName("layer")
    val layer_WebXRProjectionLayerWrapper: XRProjectionLayer = js.native
  }
  
  trait IWebXRLayersOptions extends StObject {
    
    /**
      * Whether to try initializing the base projection layer as a multiview render target, if multiview is supported.
      * Defaults to false.
      */
    var preferMultiviewOnInit: js.UndefOr[Boolean] = js.undefined
  }
  object IWebXRLayersOptions {
    
    inline def apply(): IWebXRLayersOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IWebXRLayersOptions]
    }
    
    extension [Self <: IWebXRLayersOptions](x: Self) {
      
      inline def setPreferMultiviewOnInit(value: Boolean): Self = StObject.set(x, "preferMultiviewOnInit", value.asInstanceOf[js.Any])
      
      inline def setPreferMultiviewOnInitUndefined: Self = StObject.set(x, "preferMultiviewOnInit", js.undefined)
    }
  }
}
