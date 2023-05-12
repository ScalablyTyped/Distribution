package typings.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InternalTextureCreationOptions extends StObject {
  
  /**
    * Specifies if mipmaps must be created. If undefined, the value from generateMipMaps is taken instead
    */
  var createMipMaps: js.UndefOr[Boolean] = js.undefined
  
  /** Texture creation flags */
  var creationFlags: js.UndefOr[Double] = js.undefined
  
  /** Defines format (RGBA by default) */
  var format: js.UndefOr[Double] = js.undefined
  
  /**
    * Specifies if mipmaps must be generated
    */
  var generateMipMaps: js.UndefOr[Boolean] = js.undefined
  
  /** Label of the texture (used for debugging only) */
  var label: js.UndefOr[String] = js.undefined
  
  /** Defines sample count (1 by default) */
  var samples: js.UndefOr[Double] = js.undefined
  
  /** Defines sampling mode (trilinear by default) */
  var samplingMode: js.UndefOr[Double] = js.undefined
  
  /** Defines texture type (int by default) */
  var `type`: js.UndefOr[Double] = js.undefined
  
  /** Creates the RTT in sRGB space */
  var useSRGBBuffer: js.UndefOr[Boolean] = js.undefined
}
object InternalTextureCreationOptions {
  
  inline def apply(): InternalTextureCreationOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InternalTextureCreationOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: InternalTextureCreationOptions] (val x: Self) extends AnyVal {
    
    inline def setCreateMipMaps(value: Boolean): Self = StObject.set(x, "createMipMaps", value.asInstanceOf[js.Any])
    
    inline def setCreateMipMapsUndefined: Self = StObject.set(x, "createMipMaps", js.undefined)
    
    inline def setCreationFlags(value: Double): Self = StObject.set(x, "creationFlags", value.asInstanceOf[js.Any])
    
    inline def setCreationFlagsUndefined: Self = StObject.set(x, "creationFlags", js.undefined)
    
    inline def setFormat(value: Double): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    
    inline def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
    
    inline def setGenerateMipMaps(value: Boolean): Self = StObject.set(x, "generateMipMaps", value.asInstanceOf[js.Any])
    
    inline def setGenerateMipMapsUndefined: Self = StObject.set(x, "generateMipMaps", js.undefined)
    
    inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
    
    inline def setSamples(value: Double): Self = StObject.set(x, "samples", value.asInstanceOf[js.Any])
    
    inline def setSamplesUndefined: Self = StObject.set(x, "samples", js.undefined)
    
    inline def setSamplingMode(value: Double): Self = StObject.set(x, "samplingMode", value.asInstanceOf[js.Any])
    
    inline def setSamplingModeUndefined: Self = StObject.set(x, "samplingMode", js.undefined)
    
    inline def setType(value: Double): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    inline def setUseSRGBBuffer(value: Boolean): Self = StObject.set(x, "useSRGBBuffer", value.asInstanceOf[js.Any])
    
    inline def setUseSRGBBufferUndefined: Self = StObject.set(x, "useSRGBBuffer", js.undefined)
  }
}
