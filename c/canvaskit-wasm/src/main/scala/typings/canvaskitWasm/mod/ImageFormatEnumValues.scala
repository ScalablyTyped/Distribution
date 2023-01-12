package typings.canvaskitWasm.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ImageFormatEnumValues
  extends StObject
     with EmbindEnum {
  
  var JPEG: EncodedImageFormat
  
  // TODO(kjlubick) When these are compiled in depending on the availability of the codecs,
  //   be sure to make these nullable.
  var PNG: EncodedImageFormat
  
  var WEBP: EncodedImageFormat
}
object ImageFormatEnumValues {
  
  inline def apply(
    JPEG: EncodedImageFormat,
    PNG: EncodedImageFormat,
    WEBP: EncodedImageFormat,
    values: js.Array[Double]
  ): ImageFormatEnumValues = {
    val __obj = js.Dynamic.literal(JPEG = JPEG.asInstanceOf[js.Any], PNG = PNG.asInstanceOf[js.Any], WEBP = WEBP.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImageFormatEnumValues]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ImageFormatEnumValues] (val x: Self) extends AnyVal {
    
    inline def setJPEG(value: EncodedImageFormat): Self = StObject.set(x, "JPEG", value.asInstanceOf[js.Any])
    
    inline def setPNG(value: EncodedImageFormat): Self = StObject.set(x, "PNG", value.asInstanceOf[js.Any])
    
    inline def setWEBP(value: EncodedImageFormat): Self = StObject.set(x, "WEBP", value.asInstanceOf[js.Any])
  }
}
