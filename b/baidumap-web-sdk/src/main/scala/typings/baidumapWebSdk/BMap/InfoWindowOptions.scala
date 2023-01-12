package typings.baidumapWebSdk.BMap

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InfoWindowOptions extends StObject {
  
  var enableAutoPan: js.UndefOr[Boolean] = js.undefined
  
  var enableCloseOnClick: js.UndefOr[Boolean] = js.undefined
  
  var enableMessage: js.UndefOr[Boolean] = js.undefined
  
  var height: js.UndefOr[Double] = js.undefined
  
  var maxWidth: js.UndefOr[Double] = js.undefined
  
  var message: js.UndefOr[String] = js.undefined
  
  var offset: js.UndefOr[Size] = js.undefined
  
  var title: js.UndefOr[String] = js.undefined
  
  var width: js.UndefOr[Double] = js.undefined
}
object InfoWindowOptions {
  
  inline def apply(): InfoWindowOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InfoWindowOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: InfoWindowOptions] (val x: Self) extends AnyVal {
    
    inline def setEnableAutoPan(value: Boolean): Self = StObject.set(x, "enableAutoPan", value.asInstanceOf[js.Any])
    
    inline def setEnableAutoPanUndefined: Self = StObject.set(x, "enableAutoPan", js.undefined)
    
    inline def setEnableCloseOnClick(value: Boolean): Self = StObject.set(x, "enableCloseOnClick", value.asInstanceOf[js.Any])
    
    inline def setEnableCloseOnClickUndefined: Self = StObject.set(x, "enableCloseOnClick", js.undefined)
    
    inline def setEnableMessage(value: Boolean): Self = StObject.set(x, "enableMessage", value.asInstanceOf[js.Any])
    
    inline def setEnableMessageUndefined: Self = StObject.set(x, "enableMessage", js.undefined)
    
    inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    inline def setMaxWidth(value: Double): Self = StObject.set(x, "maxWidth", value.asInstanceOf[js.Any])
    
    inline def setMaxWidthUndefined: Self = StObject.set(x, "maxWidth", js.undefined)
    
    inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    inline def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
    
    inline def setOffset(value: Size): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
    
    inline def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    
    inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
