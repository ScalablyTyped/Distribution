package typings.awsSdk.medialiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Mp2Settings extends js.Object {
  /**
    * Average bitrate in bits/second.
    */
  var Bitrate: js.UndefOr[double] = js.native
  /**
    * The MPEG2 Audio coding mode.  Valid values are codingMode10 (for mono) or codingMode20 (for stereo).
    */
  var CodingMode: js.UndefOr[Mp2CodingMode] = js.native
  /**
    * Sample rate in Hz.
    */
  var SampleRate: js.UndefOr[double] = js.native
}

object Mp2Settings {
  @scala.inline
  def apply(): Mp2Settings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Mp2Settings]
  }
  @scala.inline
  implicit class Mp2SettingsOps[Self <: Mp2Settings] (val x: Self) extends AnyVal {
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
    def setBitrate(value: double): Self = this.set("Bitrate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBitrate: Self = this.set("Bitrate", js.undefined)
    @scala.inline
    def setCodingMode(value: Mp2CodingMode): Self = this.set("CodingMode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCodingMode: Self = this.set("CodingMode", js.undefined)
    @scala.inline
    def setSampleRate(value: double): Self = this.set("SampleRate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSampleRate: Self = this.set("SampleRate", js.undefined)
  }
  
}

