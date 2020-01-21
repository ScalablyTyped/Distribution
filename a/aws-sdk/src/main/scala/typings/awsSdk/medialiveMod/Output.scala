package typings.awsSdk.medialiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Output extends js.Object {
  /**
    * The names of the AudioDescriptions used as audio sources for this output.
    */
  var AudioDescriptionNames: js.UndefOr[listOfString] = js.native
  /**
    * The names of the CaptionDescriptions used as caption sources for this output.
    */
  var CaptionDescriptionNames: js.UndefOr[listOfString] = js.native
  /**
    * The name used to identify an output.
    */
  var OutputName: js.UndefOr[stringMin1Max255] = js.native
  /**
    * Output type-specific settings.
    */
  var OutputSettings: typings.awsSdk.medialiveMod.OutputSettings = js.native
  /**
    * The name of the VideoDescription used as the source for this output.
    */
  var VideoDescriptionName: js.UndefOr[string] = js.native
}

object Output {
  @scala.inline
  def apply(
    OutputSettings: OutputSettings,
    AudioDescriptionNames: listOfString = null,
    CaptionDescriptionNames: listOfString = null,
    OutputName: stringMin1Max255 = null,
    VideoDescriptionName: string = null
  ): Output = {
    val __obj = js.Dynamic.literal(OutputSettings = OutputSettings.asInstanceOf[js.Any])
    if (AudioDescriptionNames != null) __obj.updateDynamic("AudioDescriptionNames")(AudioDescriptionNames.asInstanceOf[js.Any])
    if (CaptionDescriptionNames != null) __obj.updateDynamic("CaptionDescriptionNames")(CaptionDescriptionNames.asInstanceOf[js.Any])
    if (OutputName != null) __obj.updateDynamic("OutputName")(OutputName.asInstanceOf[js.Any])
    if (VideoDescriptionName != null) __obj.updateDynamic("VideoDescriptionName")(VideoDescriptionName.asInstanceOf[js.Any])
    __obj.asInstanceOf[Output]
  }
}

