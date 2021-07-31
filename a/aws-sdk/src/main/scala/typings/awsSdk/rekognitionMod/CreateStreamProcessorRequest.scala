package typings.awsSdk.rekognitionMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateStreamProcessorRequest extends StObject {
  
  /**
    * Kinesis video stream stream that provides the source streaming video. If you are using the AWS CLI, the parameter name is StreamProcessorInput.
    */
  var Input: StreamProcessorInput
  
  /**
    * An identifier you assign to the stream processor. You can use Name to manage the stream processor. For example, you can get the current status of the stream processor by calling DescribeStreamProcessor. Name is idempotent. 
    */
  var Name: StreamProcessorName
  
  /**
    * Kinesis data stream stream to which Amazon Rekognition Video puts the analysis results. If you are using the AWS CLI, the parameter name is StreamProcessorOutput.
    */
  var Output: StreamProcessorOutput
  
  /**
    * ARN of the IAM role that allows access to the stream processor.
    */
  var RoleArn: typings.awsSdk.rekognitionMod.RoleArn
  
  /**
    * Face recognition input parameters to be used by the stream processor. Includes the collection to use for face recognition and the face attributes to detect.
    */
  var Settings: StreamProcessorSettings
}
object CreateStreamProcessorRequest {
  
  @scala.inline
  def apply(
    Input: StreamProcessorInput,
    Name: StreamProcessorName,
    Output: StreamProcessorOutput,
    RoleArn: RoleArn,
    Settings: StreamProcessorSettings
  ): CreateStreamProcessorRequest = {
    val __obj = js.Dynamic.literal(Input = Input.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], Output = Output.asInstanceOf[js.Any], RoleArn = RoleArn.asInstanceOf[js.Any], Settings = Settings.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateStreamProcessorRequest]
  }
  
  @scala.inline
  implicit class CreateStreamProcessorRequestMutableBuilder[Self <: CreateStreamProcessorRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInput(value: StreamProcessorInput): Self = StObject.set(x, "Input", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: StreamProcessorName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOutput(value: StreamProcessorOutput): Self = StObject.set(x, "Output", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRoleArn(value: RoleArn): Self = StObject.set(x, "RoleArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSettings(value: StreamProcessorSettings): Self = StObject.set(x, "Settings", value.asInstanceOf[js.Any])
  }
}
