package typings.awsSdk.elastictranscoderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AudioParameters extends js.Object {
  /**
    * The method of organizing audio channels and tracks. Use Audio:Channels to specify the number of channels in your output, and Audio:AudioPackingMode to specify the number of tracks and their relation to the channels. If you do not specify an Audio:AudioPackingMode, Elastic Transcoder uses SingleTrack. The following values are valid:  SingleTrack, OneChannelPerTrack, and OneChannelPerTrackWithMosTo8Tracks  When you specify SingleTrack, Elastic Transcoder creates a single track for your output. The track can have up to eight channels. Use SingleTrack for all non-mxf containers. The outputs of SingleTrack for a specific channel value and inputs are as follows:    0  channels with any input: Audio omitted from the output    1, 2, or auto  channels with no audio input: Audio omitted from the output    1  channel with any input with audio: One track with one channel, downmixed if necessary    2  channels with one track with one channel: One track with two identical channels    2 or auto  channels with two tracks with one channel each: One track with two channels    2 or auto  channels with one track with two channels: One track with two channels    2  channels with one track with multiple channels: One track with two channels    auto  channels with one track with one channel: One track with one channel    auto  channels with one track with multiple channels: One track with multiple channels   When you specify OneChannelPerTrack, Elastic Transcoder creates a new track for every channel in your output. Your output can have up to eight single-channel tracks. The outputs of OneChannelPerTrack for a specific channel value and inputs are as follows:    0  channels with any input: Audio omitted from the output    1, 2, or auto  channels with no audio input: Audio omitted from the output    1  channel with any input with audio: One track with one channel, downmixed if necessary    2  channels with one track with one channel: Two tracks with one identical channel each    2 or auto  channels with two tracks with one channel each: Two tracks with one channel each    2 or auto  channels with one track with two channels: Two tracks with one channel each    2  channels with one track with multiple channels: Two tracks with one channel each    auto  channels with one track with one channel: One track with one channel    auto  channels with one track with multiple channels: Up to eight tracks with one channel each   When you specify OneChannelPerTrackWithMosTo8Tracks, Elastic Transcoder creates eight single-channel tracks for your output. All tracks that do not contain audio data from an input channel are MOS, or Mit Out Sound, tracks. The outputs of OneChannelPerTrackWithMosTo8Tracks for a specific channel value and inputs are as follows:    0  channels with any input: Audio omitted from the output    1, 2, or auto  channels with no audio input: Audio omitted from the output    1  channel with any input with audio: One track with one channel, downmixed if necessary, plus six MOS tracks    2  channels with one track with one channel: Two tracks with one identical channel each, plus six MOS tracks    2 or auto  channels with two tracks with one channel each: Two tracks with one channel each, plus six MOS tracks    2 or auto  channels with one track with two channels: Two tracks with one channel each, plus six MOS tracks    2  channels with one track with multiple channels: Two tracks with one channel each, plus six MOS tracks    auto  channels with one track with one channel: One track with one channel, plus seven MOS tracks    auto  channels with one track with multiple channels: Up to eight tracks with one channel each, plus MOS tracks until there are eight tracks in all  
    */
  var AudioPackingMode: js.UndefOr[typings.awsSdk.elastictranscoderMod.AudioPackingMode] = js.native
  /**
    * The bit rate of the audio stream in the output file, in kilobits/second. Enter an integer between 64 and 320, inclusive.
    */
  var BitRate: js.UndefOr[AudioBitRate] = js.native
  /**
    * The number of audio channels in the output file. The following values are valid:  auto, 0, 1, 2  One channel carries the information played by a single speaker. For example, a stereo track with two channels sends one channel to the left speaker, and the other channel to the right speaker. The output channels are organized into tracks. If you want Elastic Transcoder to automatically detect the number of audio channels in the input file and use that value for the output file, select auto. The output of a specific channel value and inputs are as follows:    auto  channel specified, with any input: Pass through up to eight input channels.    0  channels specified, with any input: Audio omitted from the output.    1  channel specified, with at least one input channel: Mono sound.    2  channels specified, with any input: Two identical mono channels or stereo. For more information about tracks, see Audio:AudioPackingMode.     For more information about how Elastic Transcoder organizes channels and tracks, see Audio:AudioPackingMode.
    */
  var Channels: js.UndefOr[AudioChannels] = js.native
  /**
    * The audio codec for the output file. Valid values include aac, flac, mp2, mp3, pcm, and vorbis.
    */
  var Codec: js.UndefOr[AudioCodec] = js.native
  /**
    * If you specified AAC for Audio:Codec, this is the AAC compression profile to use. Valid values include:  auto, AAC-LC, HE-AAC, HE-AACv2  If you specify auto, Elastic Transcoder chooses a profile based on the bit rate of the output file.
    */
  var CodecOptions: js.UndefOr[AudioCodecOptions] = js.native
  /**
    * The sample rate of the audio stream in the output file, in Hertz. Valid values include:  auto, 22050, 32000, 44100, 48000, 96000  If you specify auto, Elastic Transcoder automatically detects the sample rate.
    */
  var SampleRate: js.UndefOr[AudioSampleRate] = js.native
}

object AudioParameters {
  @scala.inline
  def apply(
    AudioPackingMode: AudioPackingMode = null,
    BitRate: AudioBitRate = null,
    Channels: AudioChannels = null,
    Codec: AudioCodec = null,
    CodecOptions: AudioCodecOptions = null,
    SampleRate: AudioSampleRate = null
  ): AudioParameters = {
    val __obj = js.Dynamic.literal()
    if (AudioPackingMode != null) __obj.updateDynamic("AudioPackingMode")(AudioPackingMode.asInstanceOf[js.Any])
    if (BitRate != null) __obj.updateDynamic("BitRate")(BitRate.asInstanceOf[js.Any])
    if (Channels != null) __obj.updateDynamic("Channels")(Channels.asInstanceOf[js.Any])
    if (Codec != null) __obj.updateDynamic("Codec")(Codec.asInstanceOf[js.Any])
    if (CodecOptions != null) __obj.updateDynamic("CodecOptions")(CodecOptions.asInstanceOf[js.Any])
    if (SampleRate != null) __obj.updateDynamic("SampleRate")(SampleRate.asInstanceOf[js.Any])
    __obj.asInstanceOf[AudioParameters]
  }
}

