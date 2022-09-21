package typings.ckeditor4

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Window extends StObject {
  
  var CKEDITOR_BASEPATH: js.UndefOr[String] = js.undefined
}
object Window {
  
  inline def apply(): Window = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Window]
  }
  
  extension [Self <: Window](x: Self) {
    
    inline def setCKEDITOR_BASEPATH(value: String): Self = StObject.set(x, "CKEDITOR_BASEPATH", value.asInstanceOf[js.Any])
    
    inline def setCKEDITOR_BASEPATHUndefined: Self = StObject.set(x, "CKEDITOR_BASEPATH", js.undefined)
  }
}
