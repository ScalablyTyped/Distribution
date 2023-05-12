package typings.babylonjs.materialsTexturesKtx2decoderTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IDecodedData extends StObject {
  
  /**
    * The errors (if any) encountered during the decoding process
    */
  var errors: js.UndefOr[String] = js.undefined
  
  /**
    * Whether the texture has an alpha channel or not
    */
  var hasAlpha: Boolean
  
  /**
    * Height of the texture
    */
  var height: Double
  
  /**
    * Whether the texture data is in gamma space or not
    */
  var isInGammaSpace: Boolean
  
  /**
    * List of mipmap levels.
    * The first element is the base level, the last element is the smallest mipmap level (if more than one mipmap level is present)
    */
  var mipmaps: js.Array[IMipmap]
  
  /**
    * The format to use when creating the texture at the engine level
    * This corresponds to the engineFormat property of the leaf node of the decision tree
    */
  var transcodedFormat: Double
  
  /**
    * The name of the transcoder used to transcode the texture
    */
  var transcoderName: String
  
  /**
    * Width of the texture
    */
  var width: Double
}
object IDecodedData {
  
  inline def apply(
    hasAlpha: Boolean,
    height: Double,
    isInGammaSpace: Boolean,
    mipmaps: js.Array[IMipmap],
    transcodedFormat: Double,
    transcoderName: String,
    width: Double
  ): IDecodedData = {
    val __obj = js.Dynamic.literal(hasAlpha = hasAlpha.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], isInGammaSpace = isInGammaSpace.asInstanceOf[js.Any], mipmaps = mipmaps.asInstanceOf[js.Any], transcodedFormat = transcodedFormat.asInstanceOf[js.Any], transcoderName = transcoderName.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[IDecodedData]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IDecodedData] (val x: Self) extends AnyVal {
    
    inline def setErrors(value: String): Self = StObject.set(x, "errors", value.asInstanceOf[js.Any])
    
    inline def setErrorsUndefined: Self = StObject.set(x, "errors", js.undefined)
    
    inline def setHasAlpha(value: Boolean): Self = StObject.set(x, "hasAlpha", value.asInstanceOf[js.Any])
    
    inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setIsInGammaSpace(value: Boolean): Self = StObject.set(x, "isInGammaSpace", value.asInstanceOf[js.Any])
    
    inline def setMipmaps(value: js.Array[IMipmap]): Self = StObject.set(x, "mipmaps", value.asInstanceOf[js.Any])
    
    inline def setMipmapsVarargs(value: IMipmap*): Self = StObject.set(x, "mipmaps", js.Array(value*))
    
    inline def setTranscodedFormat(value: Double): Self = StObject.set(x, "transcodedFormat", value.asInstanceOf[js.Any])
    
    inline def setTranscoderName(value: String): Self = StObject.set(x, "transcoderName", value.asInstanceOf[js.Any])
    
    inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
  }
}
