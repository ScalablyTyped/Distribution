package typings.awsSdk.pinpointMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OverrideButtonConfiguration extends StObject {
  
  /**
    * Action triggered by the button.
    */
  var ButtonAction: typings.awsSdk.pinpointMod.ButtonAction
  
  /**
    * Button destination.
    */
  var Link: js.UndefOr[string] = js.undefined
}
object OverrideButtonConfiguration {
  
  inline def apply(ButtonAction: ButtonAction): OverrideButtonConfiguration = {
    val __obj = js.Dynamic.literal(ButtonAction = ButtonAction.asInstanceOf[js.Any])
    __obj.asInstanceOf[OverrideButtonConfiguration]
  }
  
  extension [Self <: OverrideButtonConfiguration](x: Self) {
    
    inline def setButtonAction(value: ButtonAction): Self = StObject.set(x, "ButtonAction", value.asInstanceOf[js.Any])
    
    inline def setLink(value: string): Self = StObject.set(x, "Link", value.asInstanceOf[js.Any])
    
    inline def setLinkUndefined: Self = StObject.set(x, "Link", js.undefined)
  }
}
