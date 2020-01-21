package typings.awsSdk.medialiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Scte20SourceSettings extends js.Object {
  /**
    * If upconvert, 608 data is both passed through via the "608 compatibility bytes" fields of the 708 wrapper as well as translated into 708. 708 data present in the source content will be discarded.
    */
  var Convert608To708: js.UndefOr[Scte20Convert608To708] = js.native
  /**
    * Specifies the 608/708 channel number within the video track from which to extract captions. Unused for passthrough.
    */
  var Source608ChannelNumber: js.UndefOr[integerMin1Max4] = js.native
}

object Scte20SourceSettings {
  @scala.inline
  def apply(Convert608To708: Scte20Convert608To708 = null, Source608ChannelNumber: Int | Double = null): Scte20SourceSettings = {
    val __obj = js.Dynamic.literal()
    if (Convert608To708 != null) __obj.updateDynamic("Convert608To708")(Convert608To708.asInstanceOf[js.Any])
    if (Source608ChannelNumber != null) __obj.updateDynamic("Source608ChannelNumber")(Source608ChannelNumber.asInstanceOf[js.Any])
    __obj.asInstanceOf[Scte20SourceSettings]
  }
}

