package typings.awsSdk.medialiveMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InputAttachment extends StObject {
  
  /**
    * User-specified settings for defining what the conditions are for declaring the input unhealthy and failing over to a different input.
    */
  var AutomaticInputFailoverSettings: js.UndefOr[typings.awsSdk.medialiveMod.AutomaticInputFailoverSettings] = js.undefined
  
  /**
    * User-specified name for the attachment. This is required if the user wants to use this input in an input switch action.
    */
  var InputAttachmentName: js.UndefOr[string] = js.undefined
  
  /**
    * The ID of the input
    */
  var InputId: js.UndefOr[string] = js.undefined
  
  /**
    * Settings of an input (caption selector, etc.)
    */
  var InputSettings: js.UndefOr[typings.awsSdk.medialiveMod.InputSettings] = js.undefined
}
object InputAttachment {
  
  inline def apply(): InputAttachment = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InputAttachment]
  }
  
  extension [Self <: InputAttachment](x: Self) {
    
    inline def setAutomaticInputFailoverSettings(value: AutomaticInputFailoverSettings): Self = StObject.set(x, "AutomaticInputFailoverSettings", value.asInstanceOf[js.Any])
    
    inline def setAutomaticInputFailoverSettingsUndefined: Self = StObject.set(x, "AutomaticInputFailoverSettings", js.undefined)
    
    inline def setInputAttachmentName(value: string): Self = StObject.set(x, "InputAttachmentName", value.asInstanceOf[js.Any])
    
    inline def setInputAttachmentNameUndefined: Self = StObject.set(x, "InputAttachmentName", js.undefined)
    
    inline def setInputId(value: string): Self = StObject.set(x, "InputId", value.asInstanceOf[js.Any])
    
    inline def setInputIdUndefined: Self = StObject.set(x, "InputId", js.undefined)
    
    inline def setInputSettings(value: InputSettings): Self = StObject.set(x, "InputSettings", value.asInstanceOf[js.Any])
    
    inline def setInputSettingsUndefined: Self = StObject.set(x, "InputSettings", js.undefined)
  }
}
