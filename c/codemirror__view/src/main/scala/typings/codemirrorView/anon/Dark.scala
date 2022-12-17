package typings.codemirrorView.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Dark extends StObject {
  
  var dark: js.UndefOr[Boolean] = js.undefined
}
object Dark {
  
  inline def apply(): Dark = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Dark]
  }
  
  extension [Self <: Dark](x: Self) {
    
    inline def setDark(value: Boolean): Self = StObject.set(x, "dark", value.asInstanceOf[js.Any])
    
    inline def setDarkUndefined: Self = StObject.set(x, "dark", js.undefined)
  }
}
