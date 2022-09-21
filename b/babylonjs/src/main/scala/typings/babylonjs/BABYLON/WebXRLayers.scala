package typings.babylonjs.BABYLON

import typings.babylonjs.XRProjectionLayerInit
import typings.babylonjs.XRWebGLLayerInit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WebXRLayers
  extends StObject
     with WebXRAbstractFeature {
  
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
