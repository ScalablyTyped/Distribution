package typings.casperjs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ImgOptions extends StObject {
  
  // format to set the image format manually, avoiding relying on the filename
  var format: js.UndefOr[String] = js.undefined
  
  // quality to set the image quality, from 1 to 100
  var quality: js.UndefOr[Double] = js.undefined
}
object ImgOptions {
  
  inline def apply(): ImgOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ImgOptions]
  }
  
  extension [Self <: ImgOptions](x: Self) {
    
    inline def setFormat(value: String): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    
    inline def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
    
    inline def setQuality(value: Double): Self = StObject.set(x, "quality", value.asInstanceOf[js.Any])
    
    inline def setQualityUndefined: Self = StObject.set(x, "quality", js.undefined)
  }
}
