package typings.awsSdk.rekognitionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
  def apply(): DescribeStreamProcessorResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeStreamProcessorResponse]
  }
  
  @scala.inline
  implicit class DescribeStreamProcessorResponseOps[Self <: DescribeStreamProcessorResponse] (val x: Self) extends AnyVal {
    
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
    def setCreationTimestamp(value: DateTime): Self = this.set("CreationTimestamp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreationTimestamp: Self = this.set("CreationTimestamp", js.undefined)
    
    @scala.inline
    def setInput(value: StreamProcessorInput): Self = this.set("Input", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInput: Self = this.set("Input", js.undefined)
    
    @scala.inline
    def setLastUpdateTimestamp(value: DateTime): Self = this.set("LastUpdateTimestamp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLastUpdateTimestamp: Self = this.set("LastUpdateTimestamp", js.undefined)
    
    @scala.inline
    def setName(value: StreamProcessorName): Self = this.set("Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("Name", js.undefined)
    
    @scala.inline
    def setOutput(value: StreamProcessorOutput): Self = this.set("Output", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOutput: Self = this.set("Output", js.undefined)
    
    @scala.inline
    def setRoleArn(value: RoleArn): Self = this.set("RoleArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRoleArn: Self = this.set("RoleArn", js.undefined)
    
    @scala.inline
    def setSettings(value: StreamProcessorSettings): Self = this.set("Settings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSettings: Self = this.set("Settings", js.undefined)
    
    @scala.inline
    def setStatus(value: StreamProcessorStatus): Self = this.set("Status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStatus: Self = this.set("Status", js.undefined)
    
    @scala.inline
    def setStatusMessage(value: String): Self = this.set("StatusMessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStatusMessage: Self = this.set("StatusMessage", js.undefined)
    
    @scala.inline
    def setStreamProcessorArn(value: StreamProcessorArn): Self = this.set("StreamProcessorArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStreamProcessorArn: Self = this.set("StreamProcessorArn", js.undefined)
  }
}
