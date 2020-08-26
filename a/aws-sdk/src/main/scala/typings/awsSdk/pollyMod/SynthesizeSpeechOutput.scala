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
  def apply(): SynthesizeSpeechOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SynthesizeSpeechOutput]
  }
  @scala.inline
  implicit class SynthesizeSpeechOutputOps[Self <: SynthesizeSpeechOutput] (val x: Self) extends AnyVal {
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
    def setAudioStream(value: AudioStream): Self = this.set("AudioStream", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAudioStream: Self = this.set("AudioStream", js.undefined)
    @scala.inline
    def setContentType(value: ContentType): Self = this.set("ContentType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContentType: Self = this.set("ContentType", js.undefined)
    @scala.inline
    def setRequestCharacters(value: RequestCharacters): Self = this.set("RequestCharacters", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRequestCharacters: Self = this.set("RequestCharacters", js.undefined)
  }
  
}

