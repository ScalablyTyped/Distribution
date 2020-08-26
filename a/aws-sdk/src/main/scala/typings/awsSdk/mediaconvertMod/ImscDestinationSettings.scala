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
  def apply(): ImscDestinationSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ImscDestinationSettings]
  }
  @scala.inline
  implicit class ImscDestinationSettingsOps[Self <: ImscDestinationSettings] (val x: Self) extends AnyVal {
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
    def setStylePassthrough(value: ImscStylePassthrough): Self = this.set("StylePassthrough", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStylePassthrough: Self = this.set("StylePassthrough", js.undefined)
  }
  
}

