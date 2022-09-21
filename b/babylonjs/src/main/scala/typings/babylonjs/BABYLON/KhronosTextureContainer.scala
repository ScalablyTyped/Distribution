package typings.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait KhronosTextureContainer extends StObject {
  
  /* private */ var _upload2DCompressedLevels: Any
  
  /**
    * Gets the bytes of key value data
    */
  var bytesOfKeyValueData: Double
  
  /** contents of the KTX container file */
  var data: js.typedarray.ArrayBufferView
  
  /**
    * Gets the base internal format
    */
  var glBaseInternalFormat: Double
  
  /**
    * Gets the openGL format
    */
  var glFormat: Double
  
  /**
    * Gets the openGL internal format
    */
  var glInternalFormat: Double
  
  /**
    * Gets the openGL type
    */
  var glType: Double
  
  /**
    * Gets the openGL type size
    */
  var glTypeSize: Double
  
  /**
    * If the container has been made invalid (eg. constructor failed to correctly load array buffer)
    */
  var isInvalid: Boolean
  
  /**
    * Gets the load type
    */
  var loadType: Double
  
  /**
    * Gets the number of array elements
    */
  var numberOfArrayElements: Double
  
  /**
    * Gets the number of faces
    */
  var numberOfFaces: Double
  
  /**
    * Gets the number of mipmap levels
    */
  var numberOfMipmapLevels: Double
  
  /**
    * Gets image depth in pixels
    */
  var pixelDepth: Double
  
  /**
    * Gets image height in pixel
    */
  var pixelHeight: Double
  
  /**
    * Gets image width in pixel
    */
  var pixelWidth: Double
  
  /**
    * Uploads KTX content to a Babylon Texture.
    * It is assumed that the texture has already been created & is currently bound
    * @param texture
    * @param loadMipmaps
    * @hidden
    */
  def uploadLevels(texture: InternalTexture, loadMipmaps: Boolean): Unit
}
object KhronosTextureContainer {
  
  inline def apply(
    _upload2DCompressedLevels: Any,
    bytesOfKeyValueData: Double,
    data: js.typedarray.ArrayBufferView,
    glBaseInternalFormat: Double,
    glFormat: Double,
    glInternalFormat: Double,
    glType: Double,
    glTypeSize: Double,
    isInvalid: Boolean,
    loadType: Double,
    numberOfArrayElements: Double,
    numberOfFaces: Double,
    numberOfMipmapLevels: Double,
    pixelDepth: Double,
    pixelHeight: Double,
    pixelWidth: Double,
    uploadLevels: (InternalTexture, Boolean) => Unit
  ): KhronosTextureContainer = {
    val __obj = js.Dynamic.literal(_upload2DCompressedLevels = _upload2DCompressedLevels.asInstanceOf[js.Any], bytesOfKeyValueData = bytesOfKeyValueData.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], glBaseInternalFormat = glBaseInternalFormat.asInstanceOf[js.Any], glFormat = glFormat.asInstanceOf[js.Any], glInternalFormat = glInternalFormat.asInstanceOf[js.Any], glType = glType.asInstanceOf[js.Any], glTypeSize = glTypeSize.asInstanceOf[js.Any], isInvalid = isInvalid.asInstanceOf[js.Any], loadType = loadType.asInstanceOf[js.Any], numberOfArrayElements = numberOfArrayElements.asInstanceOf[js.Any], numberOfFaces = numberOfFaces.asInstanceOf[js.Any], numberOfMipmapLevels = numberOfMipmapLevels.asInstanceOf[js.Any], pixelDepth = pixelDepth.asInstanceOf[js.Any], pixelHeight = pixelHeight.asInstanceOf[js.Any], pixelWidth = pixelWidth.asInstanceOf[js.Any], uploadLevels = js.Any.fromFunction2(uploadLevels))
    __obj.asInstanceOf[KhronosTextureContainer]
  }
  
  extension [Self <: KhronosTextureContainer](x: Self) {
    
    inline def setBytesOfKeyValueData(value: Double): Self = StObject.set(x, "bytesOfKeyValueData", value.asInstanceOf[js.Any])
    
    inline def setData(value: js.typedarray.ArrayBufferView): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setGlBaseInternalFormat(value: Double): Self = StObject.set(x, "glBaseInternalFormat", value.asInstanceOf[js.Any])
    
    inline def setGlFormat(value: Double): Self = StObject.set(x, "glFormat", value.asInstanceOf[js.Any])
    
    inline def setGlInternalFormat(value: Double): Self = StObject.set(x, "glInternalFormat", value.asInstanceOf[js.Any])
    
    inline def setGlType(value: Double): Self = StObject.set(x, "glType", value.asInstanceOf[js.Any])
    
    inline def setGlTypeSize(value: Double): Self = StObject.set(x, "glTypeSize", value.asInstanceOf[js.Any])
    
    inline def setIsInvalid(value: Boolean): Self = StObject.set(x, "isInvalid", value.asInstanceOf[js.Any])
    
    inline def setLoadType(value: Double): Self = StObject.set(x, "loadType", value.asInstanceOf[js.Any])
    
    inline def setNumberOfArrayElements(value: Double): Self = StObject.set(x, "numberOfArrayElements", value.asInstanceOf[js.Any])
    
    inline def setNumberOfFaces(value: Double): Self = StObject.set(x, "numberOfFaces", value.asInstanceOf[js.Any])
    
    inline def setNumberOfMipmapLevels(value: Double): Self = StObject.set(x, "numberOfMipmapLevels", value.asInstanceOf[js.Any])
    
    inline def setPixelDepth(value: Double): Self = StObject.set(x, "pixelDepth", value.asInstanceOf[js.Any])
    
    inline def setPixelHeight(value: Double): Self = StObject.set(x, "pixelHeight", value.asInstanceOf[js.Any])
    
    inline def setPixelWidth(value: Double): Self = StObject.set(x, "pixelWidth", value.asInstanceOf[js.Any])
    
    inline def setUploadLevels(value: (InternalTexture, Boolean) => Unit): Self = StObject.set(x, "uploadLevels", js.Any.fromFunction2(value))
    
    inline def set_upload2DCompressedLevels(value: Any): Self = StObject.set(x, "_upload2DCompressedLevels", value.asInstanceOf[js.Any])
  }
}
