package typings.babylonjs.BABYLON

import typings.babylonjs.XRRigidTransform
import typings.babylonjs.anon.PartialXRSessionInit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WebXRDepthSensing
  extends StObject
     with WebXRAbstractFeature {
  
  /* private */ var _cachedDepthBuffer: Any = js.native
  
  /* private */ var _cachedDepthImageTexture: Any = js.native
  
  /* private */ var _cachedWebGLTexture: Any = js.native
  
  /**
    * XRWebGLBinding which is used for acquiring WebGLDepthInformation
    */
  /* private */ var _glBinding: Any = js.native
  
  /* private */ var _height: Any = js.native
  
  /* private */ var _normDepthBufferFromNormView: Any = js.native
  
  /* private */ var _rawValueToMeters: Any = js.native
  
  /* private */ var _updateDepthInformationAndTextureCPUDepthUsage: Any = js.native
  
  /* private */ var _updateDepthInformationAndTextureWebGLDepthUsage: Any = js.native
  
  /* private */ var _width: Any = js.native
  
  /**
    * Describes which depth sensing data format ("ushort" or "float") is used.
    */
  def depthDataFormat: WebXRDepthDataFormat = js.native
  
  /**
    * Describes which depth-sensing usage ("cpu" or "gpu") is used.
    */
  def depthUsage: WebXRDepthUsage = js.native
  
  /**
    * Extends the session init object if needed
    * @returns augmentation object for the xr session init object.
    */
  @JSName("getXRSessionInitExtension")
  def getXRSessionInitExtension_MWebXRDepthSensing(): js.Promise[PartialXRSessionInit] = js.native
  
  /**
    * Height of depth data. If depth data is not exist, returns null.
    */
  def height: Nullable[Double] = js.native
  
  /**
    * cached depth buffer
    */
  def latestDepthBuffer: Nullable[js.typedarray.ArrayBufferView] = js.native
  
  /**
    * Latest cached Texture of depth image which is made from the depth buffer data.
    */
  def latestDepthImageTexture: Nullable[RawTexture] = js.native
  
  /**
    * Latest cached InternalTexture which containing depth buffer information.
    * This can be used when the depth usage is "gpu".
    */
  def latestInternalTexture: Nullable[InternalTexture] = js.native
  
  /**
    * An XRRigidTransform that needs to be applied when indexing into the depth buffer.
    */
  def normDepthBufferFromNormView: Nullable[XRRigidTransform] = js.native
  
  /**
    * Event that notify when `DepthInformation.getDepthInMeters` is available.
    * `getDepthInMeters` method needs active XRFrame (not available for cached XRFrame)
    */
  var onGetDepthInMetersAvailable: Observable[GetDepthInMetersType] = js.native
  
  val options: IWebXRDepthSensingOptions = js.native
  
  /**
    * Scale factor by which the raw depth values must be multiplied in order to get the depths in meters.
    */
  def rawValueToMeters: Nullable[Double] = js.native
  
  /**
    * Width of depth data. If depth data is not exist, returns null.
    */
  def width: Nullable[Double] = js.native
}
