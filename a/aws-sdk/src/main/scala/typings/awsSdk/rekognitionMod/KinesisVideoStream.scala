package typings.awsSdk.rekognitionMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait KinesisVideoStream extends StObject {
  
  /**
    * ARN of the Kinesis video stream stream that streams the source video.
    */
  var Arn: js.UndefOr[KinesisVideoArn] = js.undefined
}
object KinesisVideoStream {
  
  @scala.inline
  def apply(): KinesisVideoStream = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[KinesisVideoStream]
  }
  
  @scala.inline
  implicit class KinesisVideoStreamMutableBuilder[Self <: KinesisVideoStream] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setArn(value: KinesisVideoArn): Self = StObject.set(x, "Arn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArnUndefined: Self = StObject.set(x, "Arn", js.undefined)
  }
}
