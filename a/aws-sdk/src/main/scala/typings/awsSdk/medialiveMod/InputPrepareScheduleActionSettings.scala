package typings.awsSdk.medialiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InputPrepareScheduleActionSettings extends js.Object {
  /**
    * The name of the input attachment that should be prepared by this action. If no name is provided, the action will stop the most recent prepare (if any) when activated.
    */
  var InputAttachmentNameReference: js.UndefOr[string] = js.native
  /**
    * Settings to let you create a clip of the file input, in order to set up the input to ingest only a portion of the file.
    */
  var InputClippingSettings: js.UndefOr[typings.awsSdk.medialiveMod.InputClippingSettings] = js.native
  /**
    * The value for the variable portion of the URL for the dynamic input, for this instance of the input. Each time you use the same dynamic input in an input switch action, you can provide a different value, in order to connect the input to a different content source.
    */
  var UrlPath: js.UndefOr[listOfString] = js.native
}

object InputPrepareScheduleActionSettings {
  @scala.inline
  def apply(): InputPrepareScheduleActionSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InputPrepareScheduleActionSettings]
  }
  @scala.inline
  implicit class InputPrepareScheduleActionSettingsOps[Self <: InputPrepareScheduleActionSettings] (val x: Self) extends AnyVal {
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
    def deleteInputAttachmentNameReference: Self = this.set("InputAttachmentNameReference", js.undefined)
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

