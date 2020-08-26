package typings.awsSdk.elastictranscoderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AudioCodecOptions extends js.Object {
  /**
    * You can only choose an audio bit depth when you specify flac or pcm for the value of Audio:Codec. The bit depth of a sample is how many bits of information are included in the audio samples. The higher the bit depth, the better the audio, but the larger the file. Valid values are 16 and 24. The most common bit depth is 24.
    */
  var BitDepth: js.UndefOr[AudioBitDepth] = js.native
  /**
    * You can only choose an audio bit order when you specify pcm for the value of Audio:Codec. The order the bits of a PCM sample are stored in. The supported value is LittleEndian.
    */
  var BitOrder: js.UndefOr[AudioBitOrder] = js.native
  /**
    * You can only choose an audio profile when you specify AAC for the value of Audio:Codec. Specify the AAC profile for the output file. Elastic Transcoder supports the following profiles:    auto: If you specify auto, Elastic Transcoder selects the profile based on the bit rate selected for the output file.    AAC-LC: The most common AAC profile. Use for bit rates larger than 64 kbps.    HE-AAC: Not supported on some older players and devices. Use for bit rates between 40 and 80 kbps.    HE-AACv2: Not supported on some players and devices. Use for bit rates less than 48 kbps.   All outputs in a Smooth playlist must have the same value for Profile.  If you created any presets before AAC profiles were added, Elastic Transcoder automatically updated your presets to use AAC-LC. You can change the value as required. 
    */
  var Profile: js.UndefOr[AudioCodecProfile] = js.native
  /**
    * You can only choose whether an audio sample is signed when you specify pcm for the value of Audio:Codec. Whether audio samples are represented with negative and positive numbers (signed) or only positive numbers (unsigned). The supported value is Signed.
    */
  var Signed: js.UndefOr[AudioSigned] = js.native
}

object AudioCodecOptions {
  @scala.inline
  def apply(): AudioCodecOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AudioCodecOptions]
  }
  @scala.inline
  implicit class AudioCodecOptionsOps[Self <: AudioCodecOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setBitDepth(value: AudioBitDepth): Self = this.set("BitDepth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBitDepth: Self = this.set("BitDepth", js.undefined)
    @scala.inline
    def setBitOrder(value: AudioBitOrder): Self = this.set("BitOrder", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBitOrder: Self = this.set("BitOrder", js.undefined)
    @scala.inline
    def setProfile(value: AudioCodecProfile): Self = this.set("Profile", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProfile: Self = this.set("Profile", js.undefined)
    @scala.inline
    def setSigned(value: AudioSigned): Self = this.set("Signed", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSigned: Self = this.set("Signed", js.undefined)
  }
  
}

