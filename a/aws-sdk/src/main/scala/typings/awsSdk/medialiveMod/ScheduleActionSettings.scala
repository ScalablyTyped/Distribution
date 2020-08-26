package typings.awsSdk.medialiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ScheduleActionSettings extends js.Object {
  /**
    * Action to insert HLS ID3 segment tagging
    */
  var HlsId3SegmentTaggingSettings: js.UndefOr[HlsId3SegmentTaggingScheduleActionSettings] = js.native
  /**
    * Action to insert HLS metadata
    */
  var HlsTimedMetadataSettings: js.UndefOr[HlsTimedMetadataScheduleActionSettings] = js.native
  /**
    * Action to prepare an input for a future immediate input switch
    */
  var InputPrepareSettings: js.UndefOr[InputPrepareScheduleActionSettings] = js.native
  /**
    * Action to switch the input
    */
  var InputSwitchSettings: js.UndefOr[InputSwitchScheduleActionSettings] = js.native
  /**
    * Action to pause or unpause one or both channel pipelines
    */
  var PauseStateSettings: js.UndefOr[PauseStateScheduleActionSettings] = js.native
  /**
    * Action to insert SCTE-35 return_to_network message
    */
  var Scte35ReturnToNetworkSettings: js.UndefOr[Scte35ReturnToNetworkScheduleActionSettings] = js.native
  /**
    * Action to insert SCTE-35 splice_insert message
    */
  var Scte35SpliceInsertSettings: js.UndefOr[Scte35SpliceInsertScheduleActionSettings] = js.native
  /**
    * Action to insert SCTE-35 time_signal message
    */
  var Scte35TimeSignalSettings: js.UndefOr[Scte35TimeSignalScheduleActionSettings] = js.native
  /**
    * Action to activate a static image overlay
    */
  var StaticImageActivateSettings: js.UndefOr[StaticImageActivateScheduleActionSettings] = js.native
  /**
    * Action to deactivate a static image overlay
    */
  var StaticImageDeactivateSettings: js.UndefOr[StaticImageDeactivateScheduleActionSettings] = js.native
}

object ScheduleActionSettings {
  @scala.inline
  def apply(): ScheduleActionSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ScheduleActionSettings]
  }
  @scala.inline
  implicit class ScheduleActionSettingsOps[Self <: ScheduleActionSettings] (val x: Self) extends AnyVal {
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
    def setHlsId3SegmentTaggingSettings(value: HlsId3SegmentTaggingScheduleActionSettings): Self = this.set("HlsId3SegmentTaggingSettings", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHlsId3SegmentTaggingSettings: Self = this.set("HlsId3SegmentTaggingSettings", js.undefined)
    @scala.inline
    def setHlsTimedMetadataSettings(value: HlsTimedMetadataScheduleActionSettings): Self = this.set("HlsTimedMetadataSettings", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHlsTimedMetadataSettings: Self = this.set("HlsTimedMetadataSettings", js.undefined)
    @scala.inline
    def setInputPrepareSettings(value: InputPrepareScheduleActionSettings): Self = this.set("InputPrepareSettings", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInputPrepareSettings: Self = this.set("InputPrepareSettings", js.undefined)
    @scala.inline
    def setInputSwitchSettings(value: InputSwitchScheduleActionSettings): Self = this.set("InputSwitchSettings", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInputSwitchSettings: Self = this.set("InputSwitchSettings", js.undefined)
    @scala.inline
    def setPauseStateSettings(value: PauseStateScheduleActionSettings): Self = this.set("PauseStateSettings", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePauseStateSettings: Self = this.set("PauseStateSettings", js.undefined)
    @scala.inline
    def setScte35ReturnToNetworkSettings(value: Scte35ReturnToNetworkScheduleActionSettings): Self = this.set("Scte35ReturnToNetworkSettings", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScte35ReturnToNetworkSettings: Self = this.set("Scte35ReturnToNetworkSettings", js.undefined)
    @scala.inline
    def setScte35SpliceInsertSettings(value: Scte35SpliceInsertScheduleActionSettings): Self = this.set("Scte35SpliceInsertSettings", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScte35SpliceInsertSettings: Self = this.set("Scte35SpliceInsertSettings", js.undefined)
    @scala.inline
    def setScte35TimeSignalSettings(value: Scte35TimeSignalScheduleActionSettings): Self = this.set("Scte35TimeSignalSettings", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScte35TimeSignalSettings: Self = this.set("Scte35TimeSignalSettings", js.undefined)
    @scala.inline
    def setStaticImageActivateSettings(value: StaticImageActivateScheduleActionSettings): Self = this.set("StaticImageActivateSettings", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStaticImageActivateSettings: Self = this.set("StaticImageActivateSettings", js.undefined)
    @scala.inline
    def setStaticImageDeactivateSettings(value: StaticImageDeactivateScheduleActionSettings): Self = this.set("StaticImageDeactivateSettings", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStaticImageDeactivateSettings: Self = this.set("StaticImageDeactivateSettings", js.undefined)
  }
  
}

