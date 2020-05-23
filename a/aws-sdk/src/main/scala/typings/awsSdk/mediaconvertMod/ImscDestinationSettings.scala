package typings.awsSdk.mediaconvertMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ImscDestinationSettings extends js.Object {
  /**
    * Keep this setting enabled to have MediaConvert use the font style and position information from the captions source in the output. This option is available only when your input captions are IMSC, SMPTE-TT, or TTML. Disable this setting for simplified output captions.
    */
  var StylePassthrough: js.UndefOr[ImscStylePassthrough] = js.native
}

object ImscDestinationSettings {
  @scala.inline
  def apply(StylePassthrough: ImscStylePassthrough = null): ImscDestinationSettings = {
    val __obj = js.Dynamic.literal()
    if (StylePassthrough != null) __obj.updateDynamic("StylePassthrough")(StylePassthrough.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImscDestinationSettings]
  }
}

