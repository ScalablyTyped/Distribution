package typings.bmapgl.BMapGL

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NavigationControl3DOptions extends StObject {
  
  var anchor: js.UndefOr[ControlAnchor] = js.undefined
  
  var offset: js.UndefOr[Size] = js.undefined
}
object NavigationControl3DOptions {
  
  inline def apply(): NavigationControl3DOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NavigationControl3DOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: NavigationControl3DOptions] (val x: Self) extends AnyVal {
    
    inline def setAnchor(value: ControlAnchor): Self = StObject.set(x, "anchor", value.asInstanceOf[js.Any])
    
    inline def setAnchorUndefined: Self = StObject.set(x, "anchor", js.undefined)
    
    inline def setOffset(value: Size): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
    
    inline def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
  }
}
