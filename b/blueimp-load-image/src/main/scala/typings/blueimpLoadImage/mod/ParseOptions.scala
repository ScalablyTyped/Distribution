package typings.blueimpLoadImage.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParseOptions extends StObject {
  
  // Disables creating the imageHead property.
  var disableImageHead: js.UndefOr[Boolean] = js.undefined
  
  // Defines the maximum number of bytes to parse.
  var maxMetaDataSize: js.UndefOr[Double] = js.undefined
}
object ParseOptions {
  
  inline def apply(): ParseOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParseOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParseOptions] (val x: Self) extends AnyVal {
    
    inline def setDisableImageHead(value: Boolean): Self = StObject.set(x, "disableImageHead", value.asInstanceOf[js.Any])
    
    inline def setDisableImageHeadUndefined: Self = StObject.set(x, "disableImageHead", js.undefined)
    
    inline def setMaxMetaDataSize(value: Double): Self = StObject.set(x, "maxMetaDataSize", value.asInstanceOf[js.Any])
    
    inline def setMaxMetaDataSizeUndefined: Self = StObject.set(x, "maxMetaDataSize", js.undefined)
  }
}
