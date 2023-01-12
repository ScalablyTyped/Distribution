package typings.azdata.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InfoBoxComponentProperties
  extends StObject
     with ComponentProperties {
  
  /**
    * Controls whether the text should be announced by the screen reader. Default value is false.
    */
  var announceText: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The style of the InfoBox
    */
  var style: InfoBoxStyle
  
  /**
    * The display text of the InfoBox
    */
  var text: String
}
object InfoBoxComponentProperties {
  
  inline def apply(style: InfoBoxStyle, text: String): InfoBoxComponentProperties = {
    val __obj = js.Dynamic.literal(style = style.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[InfoBoxComponentProperties]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: InfoBoxComponentProperties] (val x: Self) extends AnyVal {
    
    inline def setAnnounceText(value: Boolean): Self = StObject.set(x, "announceText", value.asInstanceOf[js.Any])
    
    inline def setAnnounceTextUndefined: Self = StObject.set(x, "announceText", js.undefined)
    
    inline def setStyle(value: InfoBoxStyle): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
  }
}
