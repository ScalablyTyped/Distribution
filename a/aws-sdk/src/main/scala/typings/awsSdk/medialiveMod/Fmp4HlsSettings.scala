package typings.awsSdk.medialiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Fmp4HlsSettings extends js.Object {
  /**
    * List all the audio groups that are used with the video output stream. Input all the audio GROUP-IDs that are associated to the video, separate by ','.
    */
  var AudioRenditionSets: js.UndefOr[string] = js.native
  /**
    * If set to passthrough, Nielsen inaudible tones for media tracking will be detected in the input audio and an equivalent ID3 tag will be inserted in the output.
    */
  var NielsenId3Behavior: js.UndefOr[Fmp4NielsenId3Behavior] = js.native
  /**
    * When set to passthrough, timed metadata is passed through from input to output.
    */
  var TimedMetadataBehavior: js.UndefOr[Fmp4TimedMetadataBehavior] = js.native
}

object Fmp4HlsSettings {
  @scala.inline
  def apply(): Fmp4HlsSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Fmp4HlsSettings]
  }
  @scala.inline
  implicit class Fmp4HlsSettingsOps[Self <: Fmp4HlsSettings] (val x: Self) extends AnyVal {
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
    def setAudioRenditionSets(value: string): Self = this.set("AudioRenditionSets", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAudioRenditionSets: Self = this.set("AudioRenditionSets", js.undefined)
    @scala.inline
    def setNielsenId3Behavior(value: Fmp4NielsenId3Behavior): Self = this.set("NielsenId3Behavior", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNielsenId3Behavior: Self = this.set("NielsenId3Behavior", js.undefined)
    @scala.inline
    def setTimedMetadataBehavior(value: Fmp4TimedMetadataBehavior): Self = this.set("TimedMetadataBehavior", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTimedMetadataBehavior: Self = this.set("TimedMetadataBehavior", js.undefined)
  }
  
}

