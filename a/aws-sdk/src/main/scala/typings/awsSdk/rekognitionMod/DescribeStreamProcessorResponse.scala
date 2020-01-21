package typings.awsSdk.rekognitionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeStreamProcessorResponse extends js.Object {
  /**
    * Date and time the stream processor was created
    */
  var CreationTimestamp: js.UndefOr[DateTime] = js.native
  /**
    * Kinesis video stream that provides the source streaming video.
    */
  var Input: js.UndefOr[StreamProcessorInput] = js.native
  /**
    * The time, in Unix format, the stream processor was last updated. For example, when the stream processor moves from a running state to a failed state, or when the user starts or stops the stream processor.
    */
  var LastUpdateTimestamp: js.UndefOr[DateTime] = js.native
  /**
    * Name of the stream processor. 
    */
  var Name: js.UndefOr[StreamProcessorName] = js.native
  /**
    * Kinesis data stream to which Amazon Rekognition Video puts the analysis results.
    */
  var Output: js.UndefOr[StreamProcessorOutput] = js.native
  /**
    * ARN of the IAM role that allows access to the stream processor.
    */
  var RoleArn: js.UndefOr[typings.awsSdk.rekognitionMod.RoleArn] = js.native
  /**
    * Face recognition input parameters that are being used by the stream processor. Includes the collection to use for face recognition and the face attributes to detect.
    */
  var Settings: js.UndefOr[StreamProcessorSettings] = js.native
  /**
    * Current status of the stream processor.
    */
  var Status: js.UndefOr[StreamProcessorStatus] = js.native
  /**
    * Detailed status message about the stream processor.
    */
  var StatusMessage: js.UndefOr[String] = js.native
  /**
    * ARN of the stream processor.
    */
  var StreamProcessorArn: js.UndefOr[typings.awsSdk.rekognitionMod.StreamProcessorArn] = js.native
}

object DescribeStreamProcessorResponse {
  @scala.inline
  def apply(
    CreationTimestamp: DateTime = null,
    Input: StreamProcessorInput = null,
    LastUpdateTimestamp: DateTime = null,
    Name: StreamProcessorName = null,
    Output: StreamProcessorOutput = null,
    RoleArn: RoleArn = null,
    Settings: StreamProcessorSettings = null,
    Status: StreamProcessorStatus = null,
    StatusMessage: String = null,
    StreamProcessorArn: StreamProcessorArn = null
  ): DescribeStreamProcessorResponse = {
    val __obj = js.Dynamic.literal()
    if (CreationTimestamp != null) __obj.updateDynamic("CreationTimestamp")(CreationTimestamp.asInstanceOf[js.Any])
    if (Input != null) __obj.updateDynamic("Input")(Input.asInstanceOf[js.Any])
    if (LastUpdateTimestamp != null) __obj.updateDynamic("LastUpdateTimestamp")(LastUpdateTimestamp.asInstanceOf[js.Any])
    if (Name != null) __obj.updateDynamic("Name")(Name.asInstanceOf[js.Any])
    if (Output != null) __obj.updateDynamic("Output")(Output.asInstanceOf[js.Any])
    if (RoleArn != null) __obj.updateDynamic("RoleArn")(RoleArn.asInstanceOf[js.Any])
    if (Settings != null) __obj.updateDynamic("Settings")(Settings.asInstanceOf[js.Any])
    if (Status != null) __obj.updateDynamic("Status")(Status.asInstanceOf[js.Any])
    if (StatusMessage != null) __obj.updateDynamic("StatusMessage")(StatusMessage.asInstanceOf[js.Any])
    if (StreamProcessorArn != null) __obj.updateDynamic("StreamProcessorArn")(StreamProcessorArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeStreamProcessorResponse]
  }
}

