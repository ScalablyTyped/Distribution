package typings.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DDSInfo extends StObject {
  
  /**
    * The dxgiFormat of the texture
    * @see https://docs.microsoft.com/en-us/windows/desktop/api/dxgiformat/ne-dxgiformat-dxgi_format
    */
  var dxgiFormat: Double
  
  /**
    * Width of the texture
    */
  var height: Double
  
  /**
    * If the texture is a compressed format eg. FOURCC_DXT1
    */
  var isCompressed: Boolean
  
  /**
    * If this is a cube texture
    * @see https://docs.microsoft.com/en-us/windows/desktop/direct3ddds/dds-file-layout-for-cubic-environment-maps
    */
  var isCube: Boolean
  
  /**
    * If the textures format is a known fourCC format
    * @see https://www.fourcc.org/
    */
  var isFourCC: Boolean
  
  /**
    * If the texture is a lumincance format
    */
  var isLuminance: Boolean
  
  /**
    * If the texture is an RGB format eg. DXGI_FORMAT_B8G8R8X8_UNORM format
    */
  var isRGB: Boolean
  
  /**
    * Number of Mipmaps for the texture
    * @see https://en.wikipedia.org/wiki/Mipmap
    */
  var mipmapCount: Double
  
  /**
    * Sphericle polynomial created for the dds texture
    */
  var sphericalPolynomial: js.UndefOr[SphericalPolynomial] = js.undefined
  
  /**
    * Texture type eg. Engine.TEXTURETYPE_UNSIGNED_INT, Engine.TEXTURETYPE_FLOAT
    */
  var textureType: Double
  
  /**
    * Width of the texture
    */
  var width: Double
}
object DDSInfo {
  
  inline def apply(
    dxgiFormat: Double,
    height: Double,
    isCompressed: Boolean,
    isCube: Boolean,
    isFourCC: Boolean,
    isLuminance: Boolean,
    isRGB: Boolean,
    mipmapCount: Double,
    textureType: Double,
    width: Double
  ): DDSInfo = {
    val __obj = js.Dynamic.literal(dxgiFormat = dxgiFormat.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], isCompressed = isCompressed.asInstanceOf[js.Any], isCube = isCube.asInstanceOf[js.Any], isFourCC = isFourCC.asInstanceOf[js.Any], isLuminance = isLuminance.asInstanceOf[js.Any], isRGB = isRGB.asInstanceOf[js.Any], mipmapCount = mipmapCount.asInstanceOf[js.Any], textureType = textureType.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[DDSInfo]
  }
  
  extension [Self <: DDSInfo](x: Self) {
    
    inline def setDxgiFormat(value: Double): Self = StObject.set(x, "dxgiFormat", value.asInstanceOf[js.Any])
    
    inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setIsCompressed(value: Boolean): Self = StObject.set(x, "isCompressed", value.asInstanceOf[js.Any])
    
    inline def setIsCube(value: Boolean): Self = StObject.set(x, "isCube", value.asInstanceOf[js.Any])
    
    inline def setIsFourCC(value: Boolean): Self = StObject.set(x, "isFourCC", value.asInstanceOf[js.Any])
    
    inline def setIsLuminance(value: Boolean): Self = StObject.set(x, "isLuminance", value.asInstanceOf[js.Any])
    
    inline def setIsRGB(value: Boolean): Self = StObject.set(x, "isRGB", value.asInstanceOf[js.Any])
    
    inline def setMipmapCount(value: Double): Self = StObject.set(x, "mipmapCount", value.asInstanceOf[js.Any])
    
    inline def setSphericalPolynomial(value: SphericalPolynomial): Self = StObject.set(x, "sphericalPolynomial", value.asInstanceOf[js.Any])
    
    inline def setSphericalPolynomialUndefined: Self = StObject.set(x, "sphericalPolynomial", js.undefined)
    
    inline def setTextureType(value: Double): Self = StObject.set(x, "textureType", value.asInstanceOf[js.Any])
    
    inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
  }
}
