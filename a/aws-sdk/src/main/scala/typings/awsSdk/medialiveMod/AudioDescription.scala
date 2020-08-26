package typings.awsSdk.medialiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AudioDescription extends js.Object {
  /**
    * Advanced audio normalization settings.
    */
  var AudioNormalizationSettings: js.UndefOr[typings.awsSdk.medialiveMod.AudioNormalizationSettings] = js.native
  /**
    * The name of the AudioSelector used as the source for this AudioDescription.
    */
  var AudioSelectorName: string = js.native
  /**
    * Applies only if audioTypeControl is useConfigured. The values for audioType are defined in ISO-IEC 13818-1.
    */
  var AudioType: js.UndefOr[typings.awsSdk.medialiveMod.AudioType] = js.native
  /**
    * Determines how audio type is determined.
    followInput: If the input contains an ISO 639 audioType, then that value is passed through to the output. If the input contains no ISO 639 audioType, the value in Audio Type is included in the output.
    useConfigured: The value in Audio Type is included in the output.
  Note that this field and audioType are both ignored if inputType is broadcasterMixedAd.
    */
  var AudioTypeControl: js.UndefOr[AudioDescriptionAudioTypeControl] = js.native
  /**
    * Audio codec settings.
    */
  var CodecSettings: js.UndefOr[AudioCodecSettings] = js.native
  /**
    * RFC 5646 language code representing the language of the audio output track. Only used if languageControlMode is useConfigured, or there is no ISO 639 language code specified in the input.
    */
  var LanguageCode: js.UndefOr[stringMin1Max35] = js.native
  /**
    * Choosing followInput will cause the ISO 639 language code of the output to follow the ISO 639 language code of the input. The languageCode will be used when useConfigured is set, or when followInput is selected but there is no ISO 639 language code specified by the input.
    */
  var LanguageCodeControl: js.UndefOr[AudioDescriptionLanguageCodeControl] = js.native
  /**
    * The name of this AudioDescription. Outputs will use this name to uniquely identify this AudioDescription.  Description names should be unique within this Live Event.
    */
  var Name: string = js.native
  /**
    * Settings that control how input audio channels are remixed into the output audio channels.
    */
  var RemixSettings: js.UndefOr[typings.awsSdk.medialiveMod.RemixSettings] = js.native
  /**
    * Used for MS Smooth and Apple HLS outputs. Indicates the name displayed by the player (eg. English, or Director Commentary).
    */
  var StreamName: js.UndefOr[string] = js.native
}

object AudioDescription {
  @scala.inline
  def apply(AudioSelectorName: string, Name: string): AudioDescription = {
    val __obj = js.Dynamic.literal(AudioSelectorName = AudioSelectorName.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[AudioDescription]
  }
  @scala.inline
  implicit class AudioDescriptionOps[Self <: AudioDescription] (val x: Self) extends AnyVal {
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
    def setAudioSelectorName(value: string): Self = this.set("AudioSelectorName", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: string): Self = this.set("Name", value.asInstanceOf[js.Any])
    @scala.inline
    def setAudioNormalizationSettings(value: AudioNormalizationSettings): Self = this.set("AudioNormalizationSettings", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAudioNormalizationSettings: Self = this.set("AudioNormalizationSettings", js.undefined)
    @scala.inline
    def setAudioType(value: AudioType): Self = this.set("AudioType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAudioType: Self = this.set("AudioType", js.undefined)
    @scala.inline
    def setAudioTypeControl(value: AudioDescriptionAudioTypeControl): Self = this.set("AudioTypeControl", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAudioTypeControl: Self = this.set("AudioTypeControl", js.undefined)
    @scala.inline
    def setCodecSettings(value: AudioCodecSettings): Self = this.set("CodecSettings", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCodecSettings: Self = this.set("CodecSettings", js.undefined)
    @scala.inline
    def setLanguageCode(value: stringMin1Max35): Self = this.set("LanguageCode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLanguageCode: Self = this.set("LanguageCode", js.undefined)
    @scala.inline
    def setLanguageCodeControl(value: AudioDescriptionLanguageCodeControl): Self = this.set("LanguageCodeControl", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLanguageCodeControl: Self = this.set("LanguageCodeControl", js.undefined)
    @scala.inline
    def setRemixSettings(value: RemixSettings): Self = this.set("RemixSettings", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRemixSettings: Self = this.set("RemixSettings", js.undefined)
    @scala.inline
    def setStreamName(value: string): Self = this.set("StreamName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStreamName: Self = this.set("StreamName", js.undefined)
  }
  
}

