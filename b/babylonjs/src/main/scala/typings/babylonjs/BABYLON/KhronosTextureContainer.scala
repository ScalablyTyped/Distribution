package typings.babylonjs.BABYLON

import typings.std.ArrayBufferView
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait KhronosTextureContainer extends js.Object {
  var _upload2DCompressedLevels: js.Any
  /**
    * Gets the bytes of key value data
    */
  var bytesOfKeyValueData: Double
  /** contents of the KTX container file */
  var data: ArrayBufferView
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
    * @hidden
    */
  def uploadLevels(texture: InternalTexture, loadMipmaps: Boolean): Unit
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
}

