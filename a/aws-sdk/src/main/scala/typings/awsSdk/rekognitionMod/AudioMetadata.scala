package typings.awsSdk.rekognitionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AudioMetadata extends js.Object {
  
  /**
    * The audio codec used to encode or decode the audio stream. 
    */
  var Codec: js.UndefOr[String] = js.native
  
  /**
    * The duration of the audio stream in milliseconds.
    */
  var DurationMillis: js.UndefOr[ULong] = js.native
  
  /**
    * The number of audio channels in the segment.
    */
  var NumberOfChannels: js.UndefOr[ULong] = js.native
  
  /**
    * The sample rate for the audio stream.
    */
  var SampleRate: js.UndefOr[ULong] = js.native
}
object AudioMetadata {
  
  @scala.inline
  def apply(): AudioMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AudioMetadata]
  }
  
  @scala.inline
  implicit class AudioMetadataOps[Self <: AudioMetadata] (val x: Self) extends AnyVal {
    
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
    def setCodec(value: String): Self = this.set("Codec", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCodec: Self = this.set("Codec", js.undefined)
    
    @scala.inline
    def setDurationMillis(value: ULong): Self = this.set("DurationMillis", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDurationMillis: Self = this.set("DurationMillis", js.undefined)
    
    @scala.inline
    def setNumberOfChannels(value: ULong): Self = this.set("NumberOfChannels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNumberOfChannels: Self = this.set("NumberOfChannels", js.undefined)
    
    @scala.inline
    def setSampleRate(value: ULong): Self = this.set("SampleRate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSampleRate: Self = this.set("SampleRate", js.undefined)
  }
}
