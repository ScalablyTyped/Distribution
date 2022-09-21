package typings.ckeditorCkeditor5Engine.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IsPhantom extends StObject {
  
  var isPhantom: js.UndefOr[Boolean] = js.undefined
}
object IsPhantom {
  
  inline def apply(): IsPhantom = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IsPhantom]
  }
  
  extension [Self <: IsPhantom](x: Self) {
    
    inline def setIsPhantom(value: Boolean): Self = StObject.set(x, "isPhantom", value.asInstanceOf[js.Any])
    
    inline def setIsPhantomUndefined: Self = StObject.set(x, "isPhantom", js.undefined)
  }
}
