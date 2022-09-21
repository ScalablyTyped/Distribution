package typings.awsSdk.pinpointMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InAppMessageContent extends StObject {
  
  /**
    * The background color for the message.
    */
  var BackgroundColor: js.UndefOr[string] = js.undefined
  
  /**
    * The configuration for the message body.
    */
  var BodyConfig: js.UndefOr[InAppMessageBodyConfig] = js.undefined
  
  /**
    * The configuration for the message header.
    */
  var HeaderConfig: js.UndefOr[InAppMessageHeaderConfig] = js.undefined
  
  /**
    * The image url for the background of message.
    */
  var ImageUrl: js.UndefOr[string] = js.undefined
  
  /**
    * The first button inside the message.
    */
  var PrimaryBtn: js.UndefOr[InAppMessageButton] = js.undefined
  
  /**
    * The second button inside message.
    */
  var SecondaryBtn: js.UndefOr[InAppMessageButton] = js.undefined
}
object InAppMessageContent {
  
  inline def apply(): InAppMessageContent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InAppMessageContent]
  }
  
  extension [Self <: InAppMessageContent](x: Self) {
    
    inline def setBackgroundColor(value: string): Self = StObject.set(x, "BackgroundColor", value.asInstanceOf[js.Any])
    
    inline def setBackgroundColorUndefined: Self = StObject.set(x, "BackgroundColor", js.undefined)
    
    inline def setBodyConfig(value: InAppMessageBodyConfig): Self = StObject.set(x, "BodyConfig", value.asInstanceOf[js.Any])
    
    inline def setBodyConfigUndefined: Self = StObject.set(x, "BodyConfig", js.undefined)
    
    inline def setHeaderConfig(value: InAppMessageHeaderConfig): Self = StObject.set(x, "HeaderConfig", value.asInstanceOf[js.Any])
    
    inline def setHeaderConfigUndefined: Self = StObject.set(x, "HeaderConfig", js.undefined)
    
    inline def setImageUrl(value: string): Self = StObject.set(x, "ImageUrl", value.asInstanceOf[js.Any])
    
    inline def setImageUrlUndefined: Self = StObject.set(x, "ImageUrl", js.undefined)
    
    inline def setPrimaryBtn(value: InAppMessageButton): Self = StObject.set(x, "PrimaryBtn", value.asInstanceOf[js.Any])
    
    inline def setPrimaryBtnUndefined: Self = StObject.set(x, "PrimaryBtn", js.undefined)
    
    inline def setSecondaryBtn(value: InAppMessageButton): Self = StObject.set(x, "SecondaryBtn", value.asInstanceOf[js.Any])
    
    inline def setSecondaryBtnUndefined: Self = StObject.set(x, "SecondaryBtn", js.undefined)
  }
}
