package typings.bootstrap4Toggle

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BootstrapToggleOptions extends StObject {
  
  var height: js.UndefOr[Double | String | Null] = js.undefined
  
  var off: js.UndefOr[String] = js.undefined
  
  var offstyle: js.UndefOr[String] = js.undefined
  
  var on: js.UndefOr[String] = js.undefined
  
  var onstyle: js.UndefOr[String] = js.undefined
  
  var size: js.UndefOr[String] = js.undefined
  
  var style: js.UndefOr[String] = js.undefined
  
  var width: js.UndefOr[Double | String | Null] = js.undefined
}
object BootstrapToggleOptions {
  
  inline def apply(): BootstrapToggleOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BootstrapToggleOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BootstrapToggleOptions] (val x: Self) extends AnyVal {
    
    inline def setHeight(value: Double | String): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setHeightNull: Self = StObject.set(x, "height", null)
    
    inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    inline def setOff(value: String): Self = StObject.set(x, "off", value.asInstanceOf[js.Any])
    
    inline def setOffUndefined: Self = StObject.set(x, "off", js.undefined)
    
    inline def setOffstyle(value: String): Self = StObject.set(x, "offstyle", value.asInstanceOf[js.Any])
    
    inline def setOffstyleUndefined: Self = StObject.set(x, "offstyle", js.undefined)
    
    inline def setOn(value: String): Self = StObject.set(x, "on", value.asInstanceOf[js.Any])
    
    inline def setOnUndefined: Self = StObject.set(x, "on", js.undefined)
    
    inline def setOnstyle(value: String): Self = StObject.set(x, "onstyle", value.asInstanceOf[js.Any])
    
    inline def setOnstyleUndefined: Self = StObject.set(x, "onstyle", js.undefined)
    
    inline def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    
    inline def setStyle(value: String): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    
    inline def setWidth(value: Double | String): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    inline def setWidthNull: Self = StObject.set(x, "width", null)
    
    inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
