package typings.awsSdk.medialiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InputSettings extends js.Object {
  /**
    * Used to select the audio stream to decode for inputs that have multiple available.
    */
  var AudioSelectors: js.UndefOr[listOfAudioSelector] = js.native
  /**
    * Used to select the caption input to use for inputs that have multiple available.
    */
  var CaptionSelectors: js.UndefOr[listOfCaptionSelector] = js.native
  /**
    * Enable or disable the deblock filter when filtering.
    */
  var DeblockFilter: js.UndefOr[InputDeblockFilter] = js.native
  /**
    * Enable or disable the denoise filter when filtering.
    */
  var DenoiseFilter: js.UndefOr[InputDenoiseFilter] = js.native
  /**
    * Adjusts the magnitude of filtering from 1 (minimal) to 5 (strongest).
    */
  var FilterStrength: js.UndefOr[integerMin1Max5] = js.native
  /**
    * Turns on the filter for this input. MPEG-2 inputs have the deblocking filter enabled by default.
  1) auto - filtering will be applied depending on input type/quality
  2) disabled - no filtering will be applied to the input
  3) forced - filtering will be applied regardless of input type
    */
  var InputFilter: js.UndefOr[typings.awsSdk.medialiveMod.InputFilter] = js.native
  /**
    * Input settings.
    */
  var NetworkInputSettings: js.UndefOr[typings.awsSdk.medialiveMod.NetworkInputSettings] = js.native
  /**
    * Specifies whether to extract applicable ancillary data from a SMPTE-2038 source in this input. Applicable data types are captions, timecode, AFD, and SCTE-104 messages.
  - PREFER: Extract from SMPTE-2038 if present in this input, otherwise extract from another source (if any).
  - IGNORE: Never extract any ancillary data from SMPTE-2038.
    */
  var Smpte2038DataPreference: js.UndefOr[typings.awsSdk.medialiveMod.Smpte2038DataPreference] = js.native
  /**
    * Loop input if it is a file. This allows a file input to be streamed indefinitely.
    */
  var SourceEndBehavior: js.UndefOr[InputSourceEndBehavior] = js.native
  /**
    * Informs which video elementary stream to decode for input types that have multiple available.
    */
  var VideoSelector: js.UndefOr[typings.awsSdk.medialiveMod.VideoSelector] = js.native
}

object InputSettings {
  @scala.inline
  def apply(): InputSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InputSettings]
  }
  @scala.inline
  implicit class InputSettingsOps[Self <: InputSettings] (val x: Self) extends AnyVal {
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
    def setAudioSelectorsVarargs(value: AudioSelector*): Self = this.set("AudioSelectors", js.Array(value :_*))
    @scala.inline
    def setAudioSelectors(value: listOfAudioSelector): Self = this.set("AudioSelectors", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAudioSelectors: Self = this.set("AudioSelectors", js.undefined)
    @scala.inline
    def setCaptionSelectorsVarargs(value: CaptionSelector*): Self = this.set("CaptionSelectors", js.Array(value :_*))
    @scala.inline
    def setCaptionSelectors(value: listOfCaptionSelector): Self = this.set("CaptionSelectors", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCaptionSelectors: Self = this.set("CaptionSelectors", js.undefined)
    @scala.inline
    def setDeblockFilter(value: InputDeblockFilter): Self = this.set("DeblockFilter", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDeblockFilter: Self = this.set("DeblockFilter", js.undefined)
    @scala.inline
    def setDenoiseFilter(value: InputDenoiseFilter): Self = this.set("DenoiseFilter", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDenoiseFilter: Self = this.set("DenoiseFilter", js.undefined)
    @scala.inline
    def setFilterStrength(value: integerMin1Max5): Self = this.set("FilterStrength", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFilterStrength: Self = this.set("FilterStrength", js.undefined)
    @scala.inline
    def setInputFilter(value: InputFilter): Self = this.set("InputFilter", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInputFilter: Self = this.set("InputFilter", js.undefined)
    @scala.inline
    def setNetworkInputSettings(value: NetworkInputSettings): Self = this.set("NetworkInputSettings", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNetworkInputSettings: Self = this.set("NetworkInputSettings", js.undefined)
    @scala.inline
    def setSmpte2038DataPreference(value: Smpte2038DataPreference): Self = this.set("Smpte2038DataPreference", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSmpte2038DataPreference: Self = this.set("Smpte2038DataPreference", js.undefined)
    @scala.inline
    def setSourceEndBehavior(value: InputSourceEndBehavior): Self = this.set("SourceEndBehavior", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSourceEndBehavior: Self = this.set("SourceEndBehavior", js.undefined)
    @scala.inline
    def setVideoSelector(value: VideoSelector): Self = this.set("VideoSelector", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVideoSelector: Self = this.set("VideoSelector", js.undefined)
  }
  
}

