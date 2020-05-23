package typings.awsSdk.medialiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Ac3Settings extends js.Object {
  /**
    * Average bitrate in bits/second. Valid bitrates depend on the coding mode.
    */
  var Bitrate: js.UndefOr[double] = js.native
  /**
    * Specifies the bitstream mode (bsmod) for the emitted AC-3 stream. See ATSC A/52-2012 for background on these values.
    */
  var BitstreamMode: js.UndefOr[Ac3BitstreamMode] = js.native
  /**
    * Dolby Digital coding mode. Determines number of channels.
    */
  var CodingMode: js.UndefOr[Ac3CodingMode] = js.native
  /**
    * Sets the dialnorm for the output. If excluded and input audio is Dolby Digital, dialnorm will be passed through.
    */
  var Dialnorm: js.UndefOr[integerMin1Max31] = js.native
  /**
    * If set to filmStandard, adds dynamic range compression signaling to the output bitstream as defined in the Dolby Digital specification.
    */
  var DrcProfile: js.UndefOr[Ac3DrcProfile] = js.native
  /**
    * When set to enabled, applies a 120Hz lowpass filter to the LFE channel prior to encoding. Only valid in codingMode32Lfe mode.
    */
  var LfeFilter: js.UndefOr[Ac3LfeFilter] = js.native
  /**
    * When set to "followInput", encoder metadata will be sourced from the DD, DD+, or DolbyE decoder that supplied this audio data. If audio was not supplied from one of these streams, then the static metadata settings will be used.
    */
  var MetadataControl: js.UndefOr[Ac3MetadataControl] = js.native
}

object Ac3Settings {
  @scala.inline
  def apply(
    Bitrate: js.UndefOr[double] = js.undefined,
    BitstreamMode: Ac3BitstreamMode = null,
    CodingMode: Ac3CodingMode = null,
    Dialnorm: js.UndefOr[integerMin1Max31] = js.undefined,
    DrcProfile: Ac3DrcProfile = null,
    LfeFilter: Ac3LfeFilter = null,
    MetadataControl: Ac3MetadataControl = null
  ): Ac3Settings = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(Bitrate)) __obj.updateDynamic("Bitrate")(Bitrate.get.asInstanceOf[js.Any])
    if (BitstreamMode != null) __obj.updateDynamic("BitstreamMode")(BitstreamMode.asInstanceOf[js.Any])
    if (CodingMode != null) __obj.updateDynamic("CodingMode")(CodingMode.asInstanceOf[js.Any])
    if (!js.isUndefined(Dialnorm)) __obj.updateDynamic("Dialnorm")(Dialnorm.get.asInstanceOf[js.Any])
    if (DrcProfile != null) __obj.updateDynamic("DrcProfile")(DrcProfile.asInstanceOf[js.Any])
    if (LfeFilter != null) __obj.updateDynamic("LfeFilter")(LfeFilter.asInstanceOf[js.Any])
    if (MetadataControl != null) __obj.updateDynamic("MetadataControl")(MetadataControl.asInstanceOf[js.Any])
    __obj.asInstanceOf[Ac3Settings]
  }
}

