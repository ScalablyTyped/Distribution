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
  def apply(
    AudioSelectors: listOfAudioSelector = null,
    CaptionSelectors: listOfCaptionSelector = null,
    DeblockFilter: InputDeblockFilter = null,
    DenoiseFilter: InputDenoiseFilter = null,
    FilterStrength: js.UndefOr[integerMin1Max5] = js.undefined,
    InputFilter: InputFilter = null,
    NetworkInputSettings: NetworkInputSettings = null,
    Smpte2038DataPreference: Smpte2038DataPreference = null,
    SourceEndBehavior: InputSourceEndBehavior = null,
    VideoSelector: VideoSelector = null
  ): InputSettings = {
    val __obj = js.Dynamic.literal()
    if (AudioSelectors != null) __obj.updateDynamic("AudioSelectors")(AudioSelectors.asInstanceOf[js.Any])
    if (CaptionSelectors != null) __obj.updateDynamic("CaptionSelectors")(CaptionSelectors.asInstanceOf[js.Any])
    if (DeblockFilter != null) __obj.updateDynamic("DeblockFilter")(DeblockFilter.asInstanceOf[js.Any])
    if (DenoiseFilter != null) __obj.updateDynamic("DenoiseFilter")(DenoiseFilter.asInstanceOf[js.Any])
    if (!js.isUndefined(FilterStrength)) __obj.updateDynamic("FilterStrength")(FilterStrength.get.asInstanceOf[js.Any])
    if (InputFilter != null) __obj.updateDynamic("InputFilter")(InputFilter.asInstanceOf[js.Any])
    if (NetworkInputSettings != null) __obj.updateDynamic("NetworkInputSettings")(NetworkInputSettings.asInstanceOf[js.Any])
    if (Smpte2038DataPreference != null) __obj.updateDynamic("Smpte2038DataPreference")(Smpte2038DataPreference.asInstanceOf[js.Any])
    if (SourceEndBehavior != null) __obj.updateDynamic("SourceEndBehavior")(SourceEndBehavior.asInstanceOf[js.Any])
    if (VideoSelector != null) __obj.updateDynamic("VideoSelector")(VideoSelector.asInstanceOf[js.Any])
    __obj.asInstanceOf[InputSettings]
  }
}

