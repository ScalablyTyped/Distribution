package typings.awsSdk.rekognitionMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StreamProcessorInput extends StObject {
  
  /**
    * The Kinesis video stream input stream for the source streaming video.
    */
  var KinesisVideoStream: js.UndefOr[typings.awsSdk.rekognitionMod.KinesisVideoStream] = js.undefined
}
object StreamProcessorInput {
  
  inline def apply(): StreamProcessorInput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StreamProcessorInput]
  }
  
  extension [Self <: StreamProcessorInput](x: Self) {
    
    inline def setKinesisVideoStream(value: KinesisVideoStream): Self = StObject.set(x, "KinesisVideoStream", value.asInstanceOf[js.Any])
    
    inline def setKinesisVideoStreamUndefined: Self = StObject.set(x, "KinesisVideoStream", js.undefined)
  }
}
