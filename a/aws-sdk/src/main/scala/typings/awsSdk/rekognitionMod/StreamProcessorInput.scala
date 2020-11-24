package typings.awsSdk.rekognitionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StreamProcessorInput extends js.Object {
  
  /**
    * The Kinesis video stream input stream for the source streaming video.
    */
  var KinesisVideoStream: js.UndefOr[typings.awsSdk.rekognitionMod.KinesisVideoStream] = js.native
}
object StreamProcessorInput {
  
  @scala.inline
  def apply(): StreamProcessorInput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StreamProcessorInput]
  }
  
  @scala.inline
  implicit class StreamProcessorInputOps[Self <: StreamProcessorInput] (val x: Self) extends AnyVal {
    
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
    def setKinesisVideoStream(value: KinesisVideoStream): Self = this.set("KinesisVideoStream", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKinesisVideoStream: Self = this.set("KinesisVideoStream", js.undefined)
  }
}
