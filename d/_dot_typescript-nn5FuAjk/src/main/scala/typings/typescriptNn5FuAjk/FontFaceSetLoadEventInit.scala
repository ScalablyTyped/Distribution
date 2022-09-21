package typings.typescriptNn5FuAjk

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FontFaceSetLoadEventInit
  extends StObject
     with EventInit {
  
  var fontfaces: js.UndefOr[Array[FontFace]] = js.undefined
}
object FontFaceSetLoadEventInit {
  
  inline def apply(): FontFaceSetLoadEventInit = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FontFaceSetLoadEventInit]
  }
  
  extension [Self <: FontFaceSetLoadEventInit](x: Self) {
    
    inline def setFontfaces(value: Array[FontFace]): Self = StObject.set(x, "fontfaces", value.asInstanceOf[js.Any])
    
    inline def setFontfacesUndefined: Self = StObject.set(x, "fontfaces", js.undefined)
  }
}
