package typings.awsSdk.medialiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InputAttachment extends js.Object {
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
  def apply(InputAttachmentName: string = null, InputId: string = null, InputSettings: InputSettings = null): InputAttachment = {
    val __obj = js.Dynamic.literal()
    if (InputAttachmentName != null) __obj.updateDynamic("InputAttachmentName")(InputAttachmentName.asInstanceOf[js.Any])
    if (InputId != null) __obj.updateDynamic("InputId")(InputId.asInstanceOf[js.Any])
    if (InputSettings != null) __obj.updateDynamic("InputSettings")(InputSettings.asInstanceOf[js.Any])
    __obj.asInstanceOf[InputAttachment]
  }
}

