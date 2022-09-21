package typings.babylonjs.BABYLON

import typings.std.Blob
import typings.std.HTMLImageElement
import typings.std.ImageBitmap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ITextureCreationOptions extends StObject {
  
  /** Defines the buffer to load the texture from in case the texture is loaded from a buffer representation (default: null) */
  var buffer: js.UndefOr[
    Nullable[
      String | js.typedarray.ArrayBuffer | js.typedarray.ArrayBufferView | HTMLImageElement | Blob | ImageBitmap
    ]
  ] = js.undefined
  
  /** Specific flags to use when creating the texture (Constants.TEXTURE_CREATIONFLAG_STORAGE for storage textures, for eg) (default: undefined) */
  var creationFlags: js.UndefOr[Double] = js.undefined
  
  /** Defines if the buffer we are loading the texture from should be deleted after load (default: false) */
  var deleteBuffer: js.UndefOr[Boolean] = js.undefined
  
  /** Defines the format of the texture we are trying to load (Engine.TEXTUREFORMAT_RGBA...) (default: ) */
  var format: js.UndefOr[Double] = js.undefined
  
  /** Defines the underlying texture from an already existing one */
  var internalTexture: js.UndefOr[InternalTexture] = js.undefined
  
  /** Defines if the texture needs to be inverted on the y axis during loading (default: true) */
  var invertY: js.UndefOr[Boolean] = js.undefined
  
  /** Options to be passed to the loader (default: undefined) */
  var loaderOptions: js.UndefOr[Any] = js.undefined
  
  /** Defines an optional mime type information (default: undefined) */
  var mimeType: js.UndefOr[String] = js.undefined
  
  /** Defines if the texture will require mip maps or not (default: false) */
  var noMipmap: js.UndefOr[Boolean] = js.undefined
  
  /** Defines a callback triggered when an error occurred during the loading session (default: null) */
  var onError: js.UndefOr[
    Nullable[
      js.Function2[/* message */ js.UndefOr[String], /* exception */ js.UndefOr[Any], Unit]
    ]
  ] = js.undefined
  
  /** Defines a callback triggered when the texture has been loaded (default: null) */
  var onLoad: js.UndefOr[Nullable[js.Function0[Unit]]] = js.undefined
  
  /** Defines the sampling mode we want for the texture while fetching from it (Texture.NEAREST_SAMPLINGMODE...) (default: Texture.TRILINEAR_SAMPLINGMODE) */
  var samplingMode: js.UndefOr[Double] = js.undefined
  
  /** Defines if the texture must be loaded in a sRGB GPU buffer (if supported by the GPU) (default: false) */
  var useSRGBBuffer: js.UndefOr[Boolean] = js.undefined
}
object ITextureCreationOptions {
  
  inline def apply(): ITextureCreationOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ITextureCreationOptions]
  }
  
  extension [Self <: ITextureCreationOptions](x: Self) {
    
    inline def setBuffer(
      value: Nullable[
          String | js.typedarray.ArrayBuffer | js.typedarray.ArrayBufferView | HTMLImageElement | Blob | ImageBitmap
        ]
    ): Self = StObject.set(x, "buffer", value.asInstanceOf[js.Any])
    
    inline def setBufferNull: Self = StObject.set(x, "buffer", null)
    
    inline def setBufferUndefined: Self = StObject.set(x, "buffer", js.undefined)
    
    inline def setCreationFlags(value: Double): Self = StObject.set(x, "creationFlags", value.asInstanceOf[js.Any])
    
    inline def setCreationFlagsUndefined: Self = StObject.set(x, "creationFlags", js.undefined)
    
    inline def setDeleteBuffer(value: Boolean): Self = StObject.set(x, "deleteBuffer", value.asInstanceOf[js.Any])
    
    inline def setDeleteBufferUndefined: Self = StObject.set(x, "deleteBuffer", js.undefined)
    
    inline def setFormat(value: Double): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    
    inline def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
    
    inline def setInternalTexture(value: InternalTexture): Self = StObject.set(x, "internalTexture", value.asInstanceOf[js.Any])
    
    inline def setInternalTextureUndefined: Self = StObject.set(x, "internalTexture", js.undefined)
    
    inline def setInvertY(value: Boolean): Self = StObject.set(x, "invertY", value.asInstanceOf[js.Any])
    
    inline def setInvertYUndefined: Self = StObject.set(x, "invertY", js.undefined)
    
    inline def setLoaderOptions(value: Any): Self = StObject.set(x, "loaderOptions", value.asInstanceOf[js.Any])
    
    inline def setLoaderOptionsUndefined: Self = StObject.set(x, "loaderOptions", js.undefined)
    
    inline def setMimeType(value: String): Self = StObject.set(x, "mimeType", value.asInstanceOf[js.Any])
    
    inline def setMimeTypeUndefined: Self = StObject.set(x, "mimeType", js.undefined)
    
    inline def setNoMipmap(value: Boolean): Self = StObject.set(x, "noMipmap", value.asInstanceOf[js.Any])
    
    inline def setNoMipmapUndefined: Self = StObject.set(x, "noMipmap", js.undefined)
    
    inline def setOnError(value: (/* message */ js.UndefOr[String], /* exception */ js.UndefOr[Any]) => Unit): Self = StObject.set(x, "onError", js.Any.fromFunction2(value))
    
    inline def setOnErrorNull: Self = StObject.set(x, "onError", null)
    
    inline def setOnErrorUndefined: Self = StObject.set(x, "onError", js.undefined)
    
    inline def setOnLoad(value: () => Unit): Self = StObject.set(x, "onLoad", js.Any.fromFunction0(value))
    
    inline def setOnLoadNull: Self = StObject.set(x, "onLoad", null)
    
    inline def setOnLoadUndefined: Self = StObject.set(x, "onLoad", js.undefined)
    
    inline def setSamplingMode(value: Double): Self = StObject.set(x, "samplingMode", value.asInstanceOf[js.Any])
    
    inline def setSamplingModeUndefined: Self = StObject.set(x, "samplingMode", js.undefined)
    
    inline def setUseSRGBBuffer(value: Boolean): Self = StObject.set(x, "useSRGBBuffer", value.asInstanceOf[js.Any])
    
    inline def setUseSRGBBufferUndefined: Self = StObject.set(x, "useSRGBBuffer", js.undefined)
  }
}
