package typings
package babylonjsLib.BABYLONNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Direct draw surface info
  * @see https://docs.microsoft.com/en-us/windows/desktop/direct3ddds/dx-graphics-dds-pguide
  */
trait DDSInfo extends js.Object {
  /**
    * The dxgiFormat of the texture
    * @see https://docs.microsoft.com/en-us/windows/desktop/api/dxgiformat/ne-dxgiformat-dxgi_format
    */
  var dxgiFormat: scala.Double
  /**
    * Width of the texture
    */
  var height: scala.Double
  /**
    * If the texture is a compressed format eg. FOURCC_DXT1
    */
  var isCompressed: scala.Boolean
  /**
    * If this is a cube texture
    * @see https://docs.microsoft.com/en-us/windows/desktop/direct3ddds/dds-file-layout-for-cubic-environment-maps
    */
  var isCube: scala.Boolean
  /**
    * If the textures format is a known fourCC format
    * @see https://www.fourcc.org/
    */
  var isFourCC: scala.Boolean
  /**
    * If the texture is a lumincance format
    */
  var isLuminance: scala.Boolean
  /**
    * If the texture is an RGB format eg. DXGI_FORMAT_B8G8R8X8_UNORM format
    */
  var isRGB: scala.Boolean
  /**
    * Number of Mipmaps for the texture
    * @see https://en.wikipedia.org/wiki/Mipmap
    */
  var mipmapCount: scala.Double
  /**
    * Sphericle polynomial created for the dds texture
    */
  var sphericalPolynomial: js.UndefOr[SphericalPolynomial] = js.undefined
  /**
    * Texture type eg. Engine.TEXTURETYPE_UNSIGNED_INT, Engine.TEXTURETYPE_FLOAT
    */
  var textureType: scala.Double
  /**
    * Width of the texture
    */
  var width: scala.Double
}

object DDSInfo {
  @scala.inline
  def apply(
    dxgiFormat: scala.Double,
    height: scala.Double,
    isCompressed: scala.Boolean,
    isCube: scala.Boolean,
    isFourCC: scala.Boolean,
    isLuminance: scala.Boolean,
    isRGB: scala.Boolean,
    mipmapCount: scala.Double,
    textureType: scala.Double,
    width: scala.Double,
    sphericalPolynomial: SphericalPolynomial = null
  ): DDSInfo = {
    val __obj = js.Dynamic.literal(dxgiFormat = dxgiFormat, height = height, isCompressed = isCompressed, isCube = isCube, isFourCC = isFourCC, isLuminance = isLuminance, isRGB = isRGB, mipmapCount = mipmapCount, textureType = textureType, width = width)
    if (sphericalPolynomial != null) __obj.updateDynamic("sphericalPolynomial")(sphericalPolynomial)
    __obj.asInstanceOf[DDSInfo]
  }
}

