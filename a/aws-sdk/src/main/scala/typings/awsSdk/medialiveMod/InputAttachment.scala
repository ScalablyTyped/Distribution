package typings.awsSdk.medialiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
  def apply(
    AutomaticInputFailoverSettings: AutomaticInputFailoverSettings = null,
    InputAttachmentName: string = null,
    InputId: string = null,
    InputSettings: InputSettings = null
  ): InputAttachment = {
    val __obj = js.Dynamic.literal()
    if (AutomaticInputFailoverSettings != null) __obj.updateDynamic("AutomaticInputFailoverSettings")(AutomaticInputFailoverSettings.asInstanceOf[js.Any])
    if (InputAttachmentName != null) __obj.updateDynamic("InputAttachmentName")(InputAttachmentName.asInstanceOf[js.Any])
    if (InputId != null) __obj.updateDynamic("InputId")(InputId.asInstanceOf[js.Any])
    if (InputSettings != null) __obj.updateDynamic("InputSettings")(InputSettings.asInstanceOf[js.Any])
    __obj.asInstanceOf[InputAttachment]
  }
}

