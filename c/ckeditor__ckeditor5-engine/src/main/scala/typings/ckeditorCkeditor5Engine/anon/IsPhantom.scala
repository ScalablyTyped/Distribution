package typings.ckeditorCkeditor5Engine.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IsPhantom extends StObject {
  
  var isPhantom: Boolean
}
object IsPhantom {
  
  inline def apply(isPhantom: Boolean): IsPhantom = {
    val __obj = js.Dynamic.literal(isPhantom = isPhantom.asInstanceOf[js.Any])
    __obj.asInstanceOf[IsPhantom]
  }
  
  extension [Self <: IsPhantom](x: Self) {
    
    inline def setIsPhantom(value: Boolean): Self = StObject.set(x, "isPhantom", value.asInstanceOf[js.Any])
  }
}
