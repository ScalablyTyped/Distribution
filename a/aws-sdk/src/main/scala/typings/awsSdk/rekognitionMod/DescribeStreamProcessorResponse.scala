package typings.awsSdk.rekognitionMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeStreamProcessorResponse extends StObject {
  
  /**
    * Date and time the stream processor was created
    */
  var CreationTimestamp: js.UndefOr[DateTime] = js.undefined
  
  /**
    * Kinesis video stream that provides the source streaming video.
    */
  var Input: js.UndefOr[StreamProcessorInput] = js.undefined
  
  /**
    * The time, in Unix format, the stream processor was last updated. For example, when the stream processor moves from a running state to a failed state, or when the user starts or stops the stream processor.
    */
  var LastUpdateTimestamp: js.UndefOr[DateTime] = js.undefined
  
  /**
    * Name of the stream processor. 
    */
  var Name: js.UndefOr[StreamProcessorName] = js.undefined
  
  /**
    * Kinesis data stream to which Amazon Rekognition Video puts the analysis results.
    */
  var Output: js.UndefOr[StreamProcessorOutput] = js.undefined
  
  /**
    * ARN of the IAM role that allows access to the stream processor.
    */
  var RoleArn: js.UndefOr[typings.awsSdk.rekognitionMod.RoleArn] = js.undefined
  
  /**
    * Face recognition input parameters that are being used by the stream processor. Includes the collection to use for face recognition and the face attributes to detect.
    */
  var Settings: js.UndefOr[StreamProcessorSettings] = js.undefined
  
  /**
    * Current status of the stream processor.
    */
  var Status: js.UndefOr[StreamProcessorStatus] = js.undefined
  
  /**
    * Detailed status message about the stream processor.
    */
  var StatusMessage: js.UndefOr[String] = js.undefined
  
  /**
    * ARN of the stream processor.
    */
  var StreamProcessorArn: js.UndefOr[typings.awsSdk.rekognitionMod.StreamProcessorArn] = js.undefined
}
object DescribeStreamProcessorResponse {
  
  @scala.inline
  def apply(): DescribeStreamProcessorResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeStreamProcessorResponse]
  }
  
  @scala.inline
  implicit class DescribeStreamProcessorResponseMutableBuilder[Self <: DescribeStreamProcessorResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCreationTimestamp(value: DateTime): Self = StObject.set(x, "CreationTimestamp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreationTimestampUndefined: Self = StObject.set(x, "CreationTimestamp", js.undefined)
    
    @scala.inline
    def setInput(value: StreamProcessorInput): Self = StObject.set(x, "Input", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInputUndefined: Self = StObject.set(x, "Input", js.undefined)
    
    @scala.inline
    def setLastUpdateTimestamp(value: DateTime): Self = StObject.set(x, "LastUpdateTimestamp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastUpdateTimestampUndefined: Self = StObject.set(x, "LastUpdateTimestamp", js.undefined)
    
    @scala.inline
    def setName(value: StreamProcessorName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    @scala.inline
    def setOutput(value: StreamProcessorOutput): Self = StObject.set(x, "Output", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOutputUndefined: Self = StObject.set(x, "Output", js.undefined)
    
    @scala.inline
    def setRoleArn(value: RoleArn): Self = StObject.set(x, "RoleArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRoleArnUndefined: Self = StObject.set(x, "RoleArn", js.undefined)
    
    @scala.inline
    def setSettings(value: StreamProcessorSettings): Self = StObject.set(x, "Settings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSettingsUndefined: Self = StObject.set(x, "Settings", js.undefined)
    
    @scala.inline
    def setStatus(value: StreamProcessorStatus): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusMessage(value: String): Self = StObject.set(x, "StatusMessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusMessageUndefined: Self = StObject.set(x, "StatusMessage", js.undefined)
    
    @scala.inline
    def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
    
    @scala.inline
    def setStreamProcessorArn(value: StreamProcessorArn): Self = StObject.set(x, "StreamProcessorArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStreamProcessorArnUndefined: Self = StObject.set(x, "StreamProcessorArn", js.undefined)
  }
}
