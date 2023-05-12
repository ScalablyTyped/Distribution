package typings.babylonjs

import typings.babylonjs.anon.PartialXRSessionInit
import typings.babylonjs.materialsTexturesInternalTextureMod.InternalTexture
import typings.babylonjs.materialsTexturesRawTextureMod.RawTexture
import typings.babylonjs.miscObservableMod.Observable
import typings.babylonjs.typesMod.Nullable
import typings.babylonjs.xRFeaturesWebXRAbstractFeatureMod.WebXRAbstractFeature
import typings.babylonjs.xRWebXRSessionManagerMod.WebXRSessionManager
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object xRFeaturesWebXRDepthSensingMod {
  
  @JSImport("babylonjs/XR/features/WebXRDepthSensing", "WebXRDepthSensing")
  @js.native
  open class WebXRDepthSensing protected () extends WebXRAbstractFeature {
    /**
      * Creates a new instance of the depth sensing feature
      * @param _xrSessionManager the WebXRSessionManager
      * @param options options for WebXR Depth Sensing Feature
      */
    def this(_xrSessionManager: WebXRSessionManager, options: IWebXRDepthSensingOptions) = this()
    
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
  /* static members */
  object WebXRDepthSensing {
    
    /**
      * The module's name
      */
    @JSImport("babylonjs/XR/features/WebXRDepthSensing", "WebXRDepthSensing.Name")
    @js.native
    val Name: String = js.native
    
    /**
      * The (Babylon) version of this module.
      * This is an integer representing the implementation version.
      * This number does not correspond to the WebXR specs version
      */
    @JSImport("babylonjs/XR/features/WebXRDepthSensing", "WebXRDepthSensing.Version")
    @js.native
    val Version: Double = js.native
  }
  
  type GetDepthInMetersType = js.Function2[/* x */ Double, /* y */ Double, Double]
  
  trait IWebXRDepthSensingOptions extends StObject {
    
    /**
      * The desired depth sensing data format for the session
      */
    var dataFormatPreference: js.Array[WebXRDepthDataFormat]
    
    /**
      *  The desired depth sensing usage for the session
      */
    var usagePreference: js.Array[WebXRDepthUsage]
  }
  object IWebXRDepthSensingOptions {
    
    inline def apply(dataFormatPreference: js.Array[WebXRDepthDataFormat], usagePreference: js.Array[WebXRDepthUsage]): IWebXRDepthSensingOptions = {
      val __obj = js.Dynamic.literal(dataFormatPreference = dataFormatPreference.asInstanceOf[js.Any], usagePreference = usagePreference.asInstanceOf[js.Any])
      __obj.asInstanceOf[IWebXRDepthSensingOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IWebXRDepthSensingOptions] (val x: Self) extends AnyVal {
      
      inline def setDataFormatPreference(value: js.Array[WebXRDepthDataFormat]): Self = StObject.set(x, "dataFormatPreference", value.asInstanceOf[js.Any])
      
      inline def setDataFormatPreferenceVarargs(value: WebXRDepthDataFormat*): Self = StObject.set(x, "dataFormatPreference", js.Array(value*))
      
      inline def setUsagePreference(value: js.Array[WebXRDepthUsage]): Self = StObject.set(x, "usagePreference", value.asInstanceOf[js.Any])
      
      inline def setUsagePreferenceVarargs(value: WebXRDepthUsage*): Self = StObject.set(x, "usagePreference", js.Array(value*))
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.babylonjs.babylonjsStrings.ushort
    - typings.babylonjs.babylonjsStrings.float
  */
  trait WebXRDepthDataFormat extends StObject
  object WebXRDepthDataFormat {
    
    inline def float: typings.babylonjs.babylonjsStrings.float = "float".asInstanceOf[typings.babylonjs.babylonjsStrings.float]
    
    inline def ushort: typings.babylonjs.babylonjsStrings.ushort = "ushort".asInstanceOf[typings.babylonjs.babylonjsStrings.ushort]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.babylonjs.babylonjsStrings.cpu
    - typings.babylonjs.babylonjsStrings.gpu
  */
  trait WebXRDepthUsage extends StObject
  object WebXRDepthUsage {
    
    inline def cpu: typings.babylonjs.babylonjsStrings.cpu = "cpu".asInstanceOf[typings.babylonjs.babylonjsStrings.cpu]
    
    inline def gpu: typings.babylonjs.babylonjsStrings.gpu = "gpu".asInstanceOf[typings.babylonjs.babylonjsStrings.gpu]
  }
}
