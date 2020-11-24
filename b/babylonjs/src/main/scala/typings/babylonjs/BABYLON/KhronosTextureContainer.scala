package typings.babylonjs.BABYLON

import typings.std.ArrayBufferView
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait KhronosTextureContainer extends js.Object {
  
  var _upload2DCompressedLevels: js.Any = js.native
  
  /**
    * Gets the bytes of key value data
    */
  var bytesOfKeyValueData: Double = js.native
  
  /** contents of the KTX container file */
  var data: ArrayBufferView = js.native
  
  /**
    * Gets the base internal format
    */
  var glBaseInternalFormat: Double = js.native
  
  /**
    * Gets the openGL format
    */
  var glFormat: Double = js.native
  
  /**
    * Gets the openGL internal format
    */
  var glInternalFormat: Double = js.native
  
  /**
    * Gets the openGL type
    */
  var glType: Double = js.native
  
  /**
    * Gets the openGL type size
    */
  var glTypeSize: Double = js.native
  
  /**
    * If the container has been made invalid (eg. constructor failed to correctly load array buffer)
    */
  var isInvalid: Boolean = js.native
  
  /**
    * Gets the load type
    */
  var loadType: Double = js.native
  
  /**
    * Gets the number of array elements
    */
  var numberOfArrayElements: Double = js.native
  
  /**
    * Gets the number of faces
    */
  var numberOfFaces: Double = js.native
  
  /**
    * Gets the number of mipmap levels
    */
  var numberOfMipmapLevels: Double = js.native
  
  /**
    * Gets image depth in pixels
    */
  var pixelDepth: Double = js.native
  
  /**
    * Gets image height in pixel
    */
  var pixelHeight: Double = js.native
  
  /**
    * Gets image width in pixel
    */
  var pixelWidth: Double = js.native
  
  /**
    * Uploads KTX content to a Babylon Texture.
    * It is assumed that the texture has already been created & is currently bound
    * @hidden
    */
  def uploadLevels(texture: InternalTexture, loadMipmaps: Boolean): Unit = js.native
}
object KhronosTextureContainer {
  
  @scala.inline
  def apply(
    _upload2DCompressedLevels: js.Any,
    bytesOfKeyValueData: Double,
    data: ArrayBufferView,
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
  
  @scala.inline
  implicit class KhronosTextureContainerOps[Self <: KhronosTextureContainer] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def set_upload2DCompressedLevels(value: js.Any): Self = this.set("_upload2DCompressedLevels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBytesOfKeyValueData(value: Double): Self = this.set("bytesOfKeyValueData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setData(value: ArrayBufferView): Self = this.set("data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGlBaseInternalFormat(value: Double): Self = this.set("glBaseInternalFormat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGlFormat(value: Double): Self = this.set("glFormat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGlInternalFormat(value: Double): Self = this.set("glInternalFormat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGlType(value: Double): Self = this.set("glType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGlTypeSize(value: Double): Self = this.set("glTypeSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsInvalid(value: Boolean): Self = this.set("isInvalid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLoadType(value: Double): Self = this.set("loadType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNumberOfArrayElements(value: Double): Self = this.set("numberOfArrayElements", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNumberOfFaces(value: Double): Self = this.set("numberOfFaces", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNumberOfMipmapLevels(value: Double): Self = this.set("numberOfMipmapLevels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPixelDepth(value: Double): Self = this.set("pixelDepth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPixelHeight(value: Double): Self = this.set("pixelHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPixelWidth(value: Double): Self = this.set("pixelWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUploadLevels(value: (InternalTexture, Boolean) => Unit): Self = this.set("uploadLevels", js.Any.fromFunction2(value))
  }
}
