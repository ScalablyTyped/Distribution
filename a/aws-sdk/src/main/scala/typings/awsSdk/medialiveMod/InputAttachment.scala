package typings.awsSdk.medialiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InputAttachment extends js.Object {
  
  /**
    * User-specified settings for defining what the conditions are for declaring the input unhealthy and failing over to a different input.
    */
  var AutomaticInputFailoverSettings: js.UndefOr[typings.awsSdk.medialiveMod.AutomaticInputFailoverSettings] = js.native
  
  /**
    * User-specified name for the attachment. This is required if the user wants to use this input in an input switch action.
    */
  var InputAttachmentName: js.UndefOr[string] = js.native
  
  /**
    * The ID of the input
    */
  var InputId: js.UndefOr[string] = js.native
  
  /**
    * Settings of an input (caption selector, etc.)
    */
  var InputSettings: js.UndefOr[typings.awsSdk.medialiveMod.InputSettings] = js.native
}
object InputAttachment {
  
  @scala.inline
  def apply(): InputAttachment = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InputAttachment]
  }
  
  @scala.inline
  implicit class InputAttachmentOps[Self <: InputAttachment] (val x: Self) extends AnyVal {
    
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
    def setAutomaticInputFailoverSettings(value: AutomaticInputFailoverSettings): Self = this.set("AutomaticInputFailoverSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAutomaticInputFailoverSettings: Self = this.set("AutomaticInputFailoverSettings", js.undefined)
    
    @scala.inline
    def setInputAttachmentName(value: string): Self = this.set("InputAttachmentName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInputAttachmentName: Self = this.set("InputAttachmentName", js.undefined)
    
    @scala.inline
    def setInputId(value: string): Self = this.set("InputId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInputId: Self = this.set("InputId", js.undefined)
    
    @scala.inline
    def setInputSettings(value: InputSettings): Self = this.set("InputSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInputSettings: Self = this.set("InputSettings", js.undefined)
  }
}
