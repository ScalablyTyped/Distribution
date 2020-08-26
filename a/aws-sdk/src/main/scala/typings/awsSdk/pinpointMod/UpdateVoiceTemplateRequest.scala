package typings.awsSdk.pinpointMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateVoiceTemplateRequest extends js.Object {
  /**
    * Specifies whether to save the updates as a new version of the message template. Valid values are: true, save the updates as a new version; and, false, save the updates to (overwrite) the latest existing version of the template. If you don't specify a value for this parameter, Amazon Pinpoint saves the updates to (overwrites) the latest existing version of the template. If you specify a value of true for this parameter, don't specify a value for the version parameter. Otherwise, an error will occur.
    */
  var CreateNewVersion: js.UndefOr[boolean] = js.native
  /**
    * The name of the message template. A template name must start with an alphanumeric character and can contain a maximum of 128 characters. The characters can be alphanumeric characters, underscores (_), or hyphens (-). Template names are case sensitive.
    */
  var TemplateName: string = js.native
  /**
    * The unique identifier for the version of the message template to update, retrieve information about, or delete. To retrieve identifiers and other information for all the versions of a template, use the Template Versions resource. If specified, this value must match the identifier for an existing template version. If specified for an update operation, this value must match the identifier for the latest existing version of the template. This restriction helps ensure that race conditions don't occur. If you don't specify a value for this parameter, Amazon Pinpoint does the following: For a get operation, retrieves information about the active version of the template. For an update operation, saves the updates to (overwrites) the latest existing version of the template, if the create-new-version parameter isn't used or is set to false. For a delete operation, deletes the template, including all versions of the template.
    */
  var Version: js.UndefOr[string] = js.native
  var VoiceTemplateRequest: typings.awsSdk.pinpointMod.VoiceTemplateRequest = js.native
}

object UpdateVoiceTemplateRequest {
  @scala.inline
  def apply(TemplateName: string, VoiceTemplateRequest: VoiceTemplateRequest): UpdateVoiceTemplateRequest = {
    val __obj = js.Dynamic.literal(TemplateName = TemplateName.asInstanceOf[js.Any], VoiceTemplateRequest = VoiceTemplateRequest.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateVoiceTemplateRequest]
  }
  @scala.inline
  implicit class UpdateVoiceTemplateRequestOps[Self <: UpdateVoiceTemplateRequest] (val x: Self) extends AnyVal {
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
    def setTemplateName(value: string): Self = this.set("TemplateName", value.asInstanceOf[js.Any])
    @scala.inline
    def setVoiceTemplateRequest(value: VoiceTemplateRequest): Self = this.set("VoiceTemplateRequest", value.asInstanceOf[js.Any])
    @scala.inline
    def setCreateNewVersion(value: boolean): Self = this.set("CreateNewVersion", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCreateNewVersion: Self = this.set("CreateNewVersion", js.undefined)
    @scala.inline
    def setVersion(value: string): Self = this.set("Version", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVersion: Self = this.set("Version", js.undefined)
  }
  
}

