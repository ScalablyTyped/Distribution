package typings.bmapgl.BMapGL

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PushpinToolOptions extends StObject {
  
  var cursor: js.UndefOr[String] = js.undefined
  
  var followText: js.UndefOr[String] = js.undefined
  
  var icon: js.UndefOr[Icon] = js.undefined
}
object PushpinToolOptions {
  
  inline def apply(): PushpinToolOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PushpinToolOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PushpinToolOptions] (val x: Self) extends AnyVal {
    
    inline def setCursor(value: String): Self = StObject.set(x, "cursor", value.asInstanceOf[js.Any])
    
    inline def setCursorUndefined: Self = StObject.set(x, "cursor", js.undefined)
    
    inline def setFollowText(value: String): Self = StObject.set(x, "followText", value.asInstanceOf[js.Any])
    
    inline def setFollowTextUndefined: Self = StObject.set(x, "followText", js.undefined)
    
    inline def setIcon(value: Icon): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
    
    inline def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
  }
}
