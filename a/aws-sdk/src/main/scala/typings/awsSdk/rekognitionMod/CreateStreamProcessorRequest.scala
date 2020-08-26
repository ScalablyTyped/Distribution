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
  @scala.inline
  implicit class CreateStreamProcessorRequestOps[Self <: CreateStreamProcessorRequest] (val x: Self) extends AnyVal {
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
    def setInput(value: StreamProcessorInput): Self = this.set("Input", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: StreamProcessorName): Self = this.set("Name", value.asInstanceOf[js.Any])
    @scala.inline
    def setOutput(value: StreamProcessorOutput): Self = this.set("Output", value.asInstanceOf[js.Any])
    @scala.inline
    def setRoleArn(value: RoleArn): Self = this.set("RoleArn", value.asInstanceOf[js.Any])
    @scala.inline
    def setSettings(value: StreamProcessorSettings): Self = this.set("Settings", value.asInstanceOf[js.Any])
  }
  
}

