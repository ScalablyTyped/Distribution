package typings.awsSdk.medialiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UdpGroupSettings extends js.Object {
  /**
    * Specifies behavior of last resort when input video is lost, and no more backup inputs are available. When dropTs is selected the entire transport stream will stop being emitted.  When dropProgram is selected the program can be dropped from the transport stream (and replaced with null packets to meet the TS bitrate requirement).  Or, when emitProgram is chosen the transport stream will continue to be produced normally with repeat frames, black frames, or slate frames substituted for the absent input video.
    */
  var InputLossAction: js.UndefOr[InputLossActionForUdpOut] = js.native
  /**
    * Indicates ID3 frame that has the timecode.
    */
  var TimedMetadataId3Frame: js.UndefOr[UdpTimedMetadataId3Frame] = js.native
  /**
    * Timed Metadata interval in seconds.
    */
  var TimedMetadataId3Period: js.UndefOr[integerMin0] = js.native
}

object UdpGroupSettings {
  @scala.inline
  def apply(): UdpGroupSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UdpGroupSettings]
  }
  @scala.inline
  implicit class UdpGroupSettingsOps[Self <: UdpGroupSettings] (val x: Self) extends AnyVal {
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
    def setInputLossAction(value: InputLossActionForUdpOut): Self = this.set("InputLossAction", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInputLossAction: Self = this.set("InputLossAction", js.undefined)
    @scala.inline
    def setTimedMetadataId3Frame(value: UdpTimedMetadataId3Frame): Self = this.set("TimedMetadataId3Frame", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTimedMetadataId3Frame: Self = this.set("TimedMetadataId3Frame", js.undefined)
    @scala.inline
    def setTimedMetadataId3Period(value: integerMin0): Self = this.set("TimedMetadataId3Period", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTimedMetadataId3Period: Self = this.set("TimedMetadataId3Period", js.undefined)
  }
  
}

