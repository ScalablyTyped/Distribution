package typings.baseui.anon

import typings.baseui.baseuiStrings.horizontal
import typings.baseui.baseuiStrings.vertical
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Desktop extends StObject {
  
  var desktop: js.UndefOr[horizontal | vertical] = js.undefined
  
  var mobile: js.UndefOr[horizontal | vertical] = js.undefined
}
object Desktop {
  
  inline def apply(): Desktop = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Desktop]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Desktop] (val x: Self) extends AnyVal {
    
    inline def setDesktop(value: horizontal | vertical): Self = StObject.set(x, "desktop", value.asInstanceOf[js.Any])
    
    inline def setDesktopUndefined: Self = StObject.set(x, "desktop", js.undefined)
    
    inline def setMobile(value: horizontal | vertical): Self = StObject.set(x, "mobile", value.asInstanceOf[js.Any])
    
    inline def setMobileUndefined: Self = StObject.set(x, "mobile", js.undefined)
  }
}
