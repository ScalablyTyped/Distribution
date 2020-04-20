package typings.awsSdk.rekognitionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateStreamProcessorRequest extends js.Object {
  /**
    * Kinesis video stream stream that provides the source streaming video. If you are using the AWS CLI, the parameter name is StreamProcessorInput.
    */
  var Input: StreamProcessorInput = js.native
  /**
    * An identifier you assign to the stream processor. You can use Name to manage the stream processor. For example, you can get the current status of the stream processor by calling DescribeStreamProcessor. Name is idempotent. 
    */
  var Name: StreamProcessorName = js.native
  /**
    * Kinesis data stream stream to which Amazon Rekognition Video puts the analysis results. If you are using the AWS CLI, the parameter name is StreamProcessorOutput.
    */
  var Output: StreamProcessorOutput = js.native
  /**
    * ARN of the IAM role that allows access to the stream processor.
    */
  var RoleArn: typings.awsSdk.rekognitionMod.RoleArn = js.native
  /**
    * Face recognition input parameters to be used by the stream processor. Includes the collection to use for face recognition and the face attributes to detect.
    */
  var Settings: StreamProcessorSettings = js.native
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
}

