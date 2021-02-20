package typings.awsSdk.rekognitionMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StreamProcessorOutput extends StObject {
  
  /**
    * The Amazon Kinesis Data Streams stream to which the Amazon Rekognition stream processor streams the analysis results.
    */
  var KinesisDataStream: js.UndefOr[typings.awsSdk.rekognitionMod.KinesisDataStream] = js.native
}
object StreamProcessorOutput {
  
  @scala.inline
  def apply(): StreamProcessorOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StreamProcessorOutput]
  }
  
  @scala.inline
  implicit class StreamProcessorOutputMutableBuilder[Self <: StreamProcessorOutput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setKinesisDataStream(value: KinesisDataStream): Self = StObject.set(x, "KinesisDataStream", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKinesisDataStreamUndefined: Self = StObject.set(x, "KinesisDataStream", js.undefined)
  }
}
