package typings.awsSdk.medialiveMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InputPrepareScheduleActionSettings extends StObject {
  
  /**
    * The name of the input attachment that should be prepared by this action. If no name is provided, the action will stop the most recent prepare (if any) when activated.
    */
  var InputAttachmentNameReference: js.UndefOr[string] = js.undefined
  
  /**
    * Settings to let you create a clip of the file input, in order to set up the input to ingest only a portion of the file.
    */
  var InputClippingSettings: js.UndefOr[typings.awsSdk.medialiveMod.InputClippingSettings] = js.undefined
  
  /**
    * The value for the variable portion of the URL for the dynamic input, for this instance of the input. Each time you use the same dynamic input in an input switch action, you can provide a different value, in order to connect the input to a different content source.
    */
  var UrlPath: js.UndefOr[listOfString] = js.undefined
}
object InputPrepareScheduleActionSettings {
  
  @scala.inline
  def apply(): InputPrepareScheduleActionSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InputPrepareScheduleActionSettings]
  }
  
  @scala.inline
  implicit class InputPrepareScheduleActionSettingsMutableBuilder[Self <: InputPrepareScheduleActionSettings] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInputAttachmentNameReference(value: string): Self = StObject.set(x, "InputAttachmentNameReference", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInputAttachmentNameReferenceUndefined: Self = StObject.set(x, "InputAttachmentNameReference", js.undefined)
    
    @scala.inline
    def setInputClippingSettings(value: InputClippingSettings): Self = StObject.set(x, "InputClippingSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInputClippingSettingsUndefined: Self = StObject.set(x, "InputClippingSettings", js.undefined)
    
    @scala.inline
    def setUrlPath(value: listOfString): Self = StObject.set(x, "UrlPath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrlPathUndefined: Self = StObject.set(x, "UrlPath", js.undefined)
    
    @scala.inline
    def setUrlPathVarargs(value: string*): Self = StObject.set(x, "UrlPath", js.Array(value :_*))
  }
}
