package typings.awsSdk.pinpointMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DefaultButtonConfiguration extends StObject {
  
  /**
    * The background color of the button.
    */
  var BackgroundColor: js.UndefOr[string] = js.undefined
  
  /**
    * The border radius of the button.
    */
  var BorderRadius: js.UndefOr[integer] = js.undefined
  
  /**
    * Action triggered by the button.
    */
  var ButtonAction: typings.awsSdk.pinpointMod.ButtonAction
  
  /**
    * Button destination.
    */
  var Link: js.UndefOr[string] = js.undefined
  
  /**
    * Button text.
    */
  var Text: string
  
  /**
    * The text color of the button.
    */
  var TextColor: js.UndefOr[string] = js.undefined
}
object DefaultButtonConfiguration {
  
  inline def apply(ButtonAction: ButtonAction, Text: string): DefaultButtonConfiguration = {
    val __obj = js.Dynamic.literal(ButtonAction = ButtonAction.asInstanceOf[js.Any], Text = Text.asInstanceOf[js.Any])
    __obj.asInstanceOf[DefaultButtonConfiguration]
  }
  
  extension [Self <: DefaultButtonConfiguration](x: Self) {
    
    inline def setBackgroundColor(value: string): Self = StObject.set(x, "BackgroundColor", value.asInstanceOf[js.Any])
    
    inline def setBackgroundColorUndefined: Self = StObject.set(x, "BackgroundColor", js.undefined)
    
    inline def setBorderRadius(value: integer): Self = StObject.set(x, "BorderRadius", value.asInstanceOf[js.Any])
    
    inline def setBorderRadiusUndefined: Self = StObject.set(x, "BorderRadius", js.undefined)
    
    inline def setButtonAction(value: ButtonAction): Self = StObject.set(x, "ButtonAction", value.asInstanceOf[js.Any])
    
    inline def setLink(value: string): Self = StObject.set(x, "Link", value.asInstanceOf[js.Any])
    
    inline def setLinkUndefined: Self = StObject.set(x, "Link", js.undefined)
    
    inline def setText(value: string): Self = StObject.set(x, "Text", value.asInstanceOf[js.Any])
    
    inline def setTextColor(value: string): Self = StObject.set(x, "TextColor", value.asInstanceOf[js.Any])
    
    inline def setTextColorUndefined: Self = StObject.set(x, "TextColor", js.undefined)
  }
}
