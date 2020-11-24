package typings.awsSdk.medialiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InputSwitchScheduleActionSettings extends js.Object {
  
  /**
    * The name of the input attachment (not the name of the input!) to switch to. The name is specified in the channel configuration.
    */
  var InputAttachmentNameReference: string = js.native
  
  /**
    * Settings to let you create a clip of the file input, in order to set up the input to ingest only a portion of the file.
    */
  var InputClippingSettings: js.UndefOr[typings.awsSdk.medialiveMod.InputClippingSettings] = js.native
  
  /**
    * The value for the variable portion of the URL for the dynamic input, for this instance of the input. Each time you use the same dynamic input in an input switch action, you can provide a different value, in order to connect the input to a different content source.
    */
  var UrlPath: js.UndefOr[listOfString] = js.native
}
object InputSwitchScheduleActionSettings {
  
  @scala.inline
  def apply(InputAttachmentNameReference: string): InputSwitchScheduleActionSettings = {
    val __obj = js.Dynamic.literal(InputAttachmentNameReference = InputAttachmentNameReference.asInstanceOf[js.Any])
    __obj.asInstanceOf[InputSwitchScheduleActionSettings]
  }
  
  @scala.inline
  implicit class InputSwitchScheduleActionSettingsOps[Self <: InputSwitchScheduleActionSettings] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setInputAttachmentNameReference(value: string): Self = this.set("InputAttachmentNameReference", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInputClippingSettings(value: InputClippingSettings): Self = this.set("InputClippingSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInputClippingSettings: Self = this.set("InputClippingSettings", js.undefined)
    
    @scala.inline
    def setUrlPathVarargs(value: string*): Self = this.set("UrlPath", js.Array(value :_*))
    
    @scala.inline
    def setUrlPath(value: listOfString): Self = this.set("UrlPath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUrlPath: Self = this.set("UrlPath", js.undefined)
  }
}
