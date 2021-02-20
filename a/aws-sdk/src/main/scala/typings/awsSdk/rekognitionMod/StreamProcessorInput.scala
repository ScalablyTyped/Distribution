package typings.awsSdk.rekognitionMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StreamProcessorInput extends StObject {
  
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
  implicit class StreamProcessorInputMutableBuilder[Self <: StreamProcessorInput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setKinesisVideoStream(value: KinesisVideoStream): Self = StObject.set(x, "KinesisVideoStream", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKinesisVideoStreamUndefined: Self = StObject.set(x, "KinesisVideoStream", js.undefined)
  }
}
