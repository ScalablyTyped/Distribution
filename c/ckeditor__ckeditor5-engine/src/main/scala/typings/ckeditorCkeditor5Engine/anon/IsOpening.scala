package typings.ckeditorCkeditor5Engine.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IsOpening extends StObject {
  
  var isOpening: Boolean
}
object IsOpening {
  
  inline def apply(isOpening: Boolean): IsOpening = {
    val __obj = js.Dynamic.literal(isOpening = isOpening.asInstanceOf[js.Any])
    __obj.asInstanceOf[IsOpening]
  }
  
  extension [Self <: IsOpening](x: Self) {
    
    inline def setIsOpening(value: Boolean): Self = StObject.set(x, "isOpening", value.asInstanceOf[js.Any])
  }
}
