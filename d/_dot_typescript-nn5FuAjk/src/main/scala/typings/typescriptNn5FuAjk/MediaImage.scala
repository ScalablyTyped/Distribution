package typings.typescriptNn5FuAjk

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MediaImage extends StObject {
  
  var sizes: js.UndefOr[java.lang.String] = js.undefined
  
  var src: java.lang.String
  
  var `type`: js.UndefOr[java.lang.String] = js.undefined
}
object MediaImage {
  
  inline def apply(src: java.lang.String): MediaImage = {
    val __obj = js.Dynamic.literal(src = src.asInstanceOf[js.Any])
    __obj.asInstanceOf[MediaImage]
  }
  
  extension [Self <: MediaImage](x: Self) {
    
    inline def setSizes(value: java.lang.String): Self = StObject.set(x, "sizes", value.asInstanceOf[js.Any])
    
    inline def setSizesUndefined: Self = StObject.set(x, "sizes", js.undefined)
    
    inline def setSrc(value: java.lang.String): Self = StObject.set(x, "src", value.asInstanceOf[js.Any])
    
    inline def setType(value: java.lang.String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
