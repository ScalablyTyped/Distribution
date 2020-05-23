package typings.awsSdk.pollyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SynthesizeSpeechOutput extends js.Object {
  /**
    *  Stream containing the synthesized speech. 
    */
  var AudioStream: js.UndefOr[typings.awsSdk.pollyMod.AudioStream] = js.native
  /**
    *  Specifies the type audio stream. This should reflect the OutputFormat parameter in your request.     If you request mp3 as the OutputFormat, the ContentType returned is audio/mpeg.     If you request ogg_vorbis as the OutputFormat, the ContentType returned is audio/ogg.     If you request pcm as the OutputFormat, the ContentType returned is audio/pcm in a signed 16-bit, 1 channel (mono), little-endian format.    If you request json as the OutputFormat, the ContentType returned is audio/json.    
    */
  var ContentType: js.UndefOr[typings.awsSdk.pollyMod.ContentType] = js.native
  /**
    * Number of characters synthesized.
    */
  var RequestCharacters: js.UndefOr[typings.awsSdk.pollyMod.RequestCharacters] = js.native
}

object SynthesizeSpeechOutput {
  @scala.inline
  def apply(
    AudioStream: AudioStream = null,
    ContentType: ContentType = null,
    RequestCharacters: js.UndefOr[RequestCharacters] = js.undefined
  ): SynthesizeSpeechOutput = {
    val __obj = js.Dynamic.literal()
    if (AudioStream != null) __obj.updateDynamic("AudioStream")(AudioStream.asInstanceOf[js.Any])
    if (ContentType != null) __obj.updateDynamic("ContentType")(ContentType.asInstanceOf[js.Any])
    if (!js.isUndefined(RequestCharacters)) __obj.updateDynamic("RequestCharacters")(RequestCharacters.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[SynthesizeSpeechOutput]
  }
}

