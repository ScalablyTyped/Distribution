package typings
package babylonjsLib.BABYLONNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * for description see https://www.khronos.org/opengles/sdk/tools/KTX/
  * for file layout see https://www.khronos.org/opengles/sdk/tools/KTX/file_format_spec/
  */
@JSGlobal("BABYLON.KhronosTextureContainer")
@js.native
class KhronosTextureContainer protected () extends js.Object {
  /**
    * Creates a new KhronosTextureContainer
    * @param arrayBuffer contents of the KTX container file
    * @param facesExpected should be either 1 or 6, based whether a cube texture or or
    * @param threeDExpected provision for indicating that data should be a 3D texture, not implemented
    * @param textureArrayExpected provision for indicating that data should be a texture array, not implemented
    */
  def this(/** contents of the KTX container file */
  arrayBuffer: js.Any, facesExpected: scala.Double) = this()
  def this(/** contents of the KTX container file */
  arrayBuffer: js.Any, facesExpected: scala.Double, threeDExpected: scala.Boolean) = this()
  def this(/** contents of the KTX container file */
  arrayBuffer: js.Any, facesExpected: scala.Double, threeDExpected: scala.Boolean, textureArrayExpected: scala.Boolean) = this()
  var _upload2DCompressedLevels: js.Any = js.native
  /** contents of the KTX container file */
  var arrayBuffer: js.Any = js.native
  /**
    * Gets the bytes of key value data
    */
  var bytesOfKeyValueData: scala.Double = js.native
  /**
    * Gets the base internal format
    */
  var glBaseInternalFormat: scala.Double = js.native
  /**
    * Gets the openGL format
    */
  var glFormat: scala.Double = js.native
  /**
    * Gets the openGL internal format
    */
  var glInternalFormat: scala.Double = js.native
  /**
    * Gets the openGL type
    */
  var glType: scala.Double = js.native
  /**
    * Gets the openGL type size
    */
  var glTypeSize: scala.Double = js.native
  /**
    * Gets the load type
    */
  var loadType: scala.Double = js.native
  /**
    * Gets the number of array elements
    */
  var numberOfArrayElements: scala.Double = js.native
  /**
    * Gets the number of faces
    */
  var numberOfFaces: scala.Double = js.native
  /**
    * Gets the number of mipmap levels
    */
  var numberOfMipmapLevels: scala.Double = js.native
  /**
    * Gets image depth in pixels
    */
  var pixelDepth: scala.Double = js.native
  /**
    * Gets image height in pixel
    */
  var pixelHeight: scala.Double = js.native
  /**
    * Gets image width in pixel
    */
  var pixelWidth: scala.Double = js.native
  /**
    * Revert the endianness of a value.
    * Not as fast hardware based, but will probably never need to use
    * @param val defines the value to convert
    * @returns the new value
    */
  def switchEndianness(`val`: scala.Double): scala.Double = js.native
  /**
    * Uploads KTX content to a Babylon Texture.
    * It is assumed that the texture has already been created & is currently bound
    * @hidden
    */
  def uploadLevels(texture: InternalTexture, loadMipmaps: scala.Boolean): scala.Unit = js.native
}

/* static members */
@JSGlobal("BABYLON.KhronosTextureContainer")
@js.native
object KhronosTextureContainer extends js.Object {
  var COMPRESSED_2D: js.Any = js.native
  var COMPRESSED_3D: js.Any = js.native
  var HEADER_LEN: js.Any = js.native
  var TEX_2D: js.Any = js.native
  var TEX_3D: js.Any = js.native
}

