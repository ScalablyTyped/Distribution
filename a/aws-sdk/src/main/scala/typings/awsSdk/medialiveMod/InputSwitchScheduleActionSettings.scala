package typings.awsSdk.medialiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
  def apply(
    InputAttachmentNameReference: string,
    InputClippingSettings: InputClippingSettings = null,
    UrlPath: listOfString = null
  ): InputSwitchScheduleActionSettings = {
    val __obj = js.Dynamic.literal(InputAttachmentNameReference = InputAttachmentNameReference.asInstanceOf[js.Any])
    if (InputClippingSettings != null) __obj.updateDynamic("InputClippingSettings")(InputClippingSettings.asInstanceOf[js.Any])
    if (UrlPath != null) __obj.updateDynamic("UrlPath")(UrlPath.asInstanceOf[js.Any])
    __obj.asInstanceOf[InputSwitchScheduleActionSettings]
  }
}

