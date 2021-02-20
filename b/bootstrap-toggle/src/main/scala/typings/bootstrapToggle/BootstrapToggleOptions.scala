package typings.bootstrapToggle

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BootstrapToggleOptions extends StObject {
  
  var height: js.UndefOr[Double | String | Null] = js.native
  
  var off: js.UndefOr[String] = js.native
  
  var offstyle: js.UndefOr[String] = js.native
  
  var on: js.UndefOr[String] = js.native
  
  var onstyle: js.UndefOr[String] = js.native
  
  var size: js.UndefOr[String] = js.native
  
  var style: js.UndefOr[String] = js.native
  
  var width: js.UndefOr[Double | String | Null] = js.native
}
object BootstrapToggleOptions {
  
  @scala.inline
  def apply(): BootstrapToggleOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BootstrapToggleOptions]
  }
  
  @scala.inline
  implicit class BootstrapToggleOptionsMutableBuilder[Self <: BootstrapToggleOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHeight(value: Double | String): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeightNull: Self = StObject.set(x, "height", null)
    
    @scala.inline
    def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    @scala.inline
    def setOff(value: String): Self = StObject.set(x, "off", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOffUndefined: Self = StObject.set(x, "off", js.undefined)
    
    @scala.inline
    def setOffstyle(value: String): Self = StObject.set(x, "offstyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOffstyleUndefined: Self = StObject.set(x, "offstyle", js.undefined)
    
    @scala.inline
    def setOn(value: String): Self = StObject.set(x, "on", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnUndefined: Self = StObject.set(x, "on", js.undefined)
    
    @scala.inline
    def setOnstyle(value: String): Self = StObject.set(x, "onstyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnstyleUndefined: Self = StObject.set(x, "onstyle", js.undefined)
    
    @scala.inline
    def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    
    @scala.inline
    def setStyle(value: String): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    
    @scala.inline
    def setWidth(value: Double | String): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidthNull: Self = StObject.set(x, "width", null)
    
    @scala.inline
    def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
