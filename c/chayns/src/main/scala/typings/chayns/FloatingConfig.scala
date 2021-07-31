package typings.chayns

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * UI Functions
  * Floating Button
  * chayns
  * interfaces
  */
// chayns.showFloatingButton()
trait FloatingConfig extends StObject {
  
  var color: js.UndefOr[String] = js.undefined
  
  var colorText: js.UndefOr[String] = js.undefined
  
  var icon: js.UndefOr[String] = js.undefined
  
  var text: js.UndefOr[String] = js.undefined
}
object FloatingConfig {
  
  @scala.inline
  def apply(): FloatingConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FloatingConfig]
  }
  
  @scala.inline
  implicit class FloatingConfigMutableBuilder[Self <: FloatingConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColorText(value: String): Self = StObject.set(x, "colorText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColorTextUndefined: Self = StObject.set(x, "colorText", js.undefined)
    
    @scala.inline
    def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    @scala.inline
    def setIcon(value: String): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
    
    @scala.inline
    def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
  }
}
