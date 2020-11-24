package typings.awsSdk.medialiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
  def apply(): Ac3Settings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Ac3Settings]
  }
  
  @scala.inline
  implicit class Ac3SettingsOps[Self <: Ac3Settings] (val x: Self) extends AnyVal {
    
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
    def setBitstreamMode(value: Ac3BitstreamMode): Self = this.set("BitstreamMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBitstreamMode: Self = this.set("BitstreamMode", js.undefined)
    
    @scala.inline
    def setCodingMode(value: Ac3CodingMode): Self = this.set("CodingMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCodingMode: Self = this.set("CodingMode", js.undefined)
    
    @scala.inline
    def setDialnorm(value: integerMin1Max31): Self = this.set("Dialnorm", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDialnorm: Self = this.set("Dialnorm", js.undefined)
    
    @scala.inline
    def setDrcProfile(value: Ac3DrcProfile): Self = this.set("DrcProfile", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDrcProfile: Self = this.set("DrcProfile", js.undefined)
    
    @scala.inline
    def setLfeFilter(value: Ac3LfeFilter): Self = this.set("LfeFilter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLfeFilter: Self = this.set("LfeFilter", js.undefined)
    
    @scala.inline
    def setMetadataControl(value: Ac3MetadataControl): Self = this.set("MetadataControl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMetadataControl: Self = this.set("MetadataControl", js.undefined)
  }
}
