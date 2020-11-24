package typings.awsSdk.ioteventsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateDetectorModelRequest extends js.Object {
  
  /**
    * Information that defines how the detectors operate.
    */
  var detectorModelDefinition: DetectorModelDefinition = js.native
  
  /**
    * A brief description of the detector model.
    */
  var detectorModelDescription: js.UndefOr[DetectorModelDescription] = js.native
  
  /**
    * The name of the detector model.
    */
  var detectorModelName: DetectorModelName = js.native
  
  /**
    * Information about the order in which events are evaluated and how actions are executed. 
    */
  var evaluationMethod: js.UndefOr[EvaluationMethod] = js.native
  
  /**
    * The input attribute key used to identify a device or system to create a detector (an instance of the detector model) and then to route each input received to the appropriate detector (instance). This parameter uses a JSON-path expression in the message payload of each input to specify the attribute-value pair that is used to identify the device associated with the input.
    */
  var key: js.UndefOr[AttributeJsonPath] = js.native
  
  /**
    * The ARN of the role that grants permission to AWS IoT Events to perform its operations.
    */
  var roleArn: AmazonResourceName = js.native
  
  /**
    * Metadata that can be used to manage the detector model.
    */
  var tags: js.UndefOr[Tags] = js.native
}
object CreateDetectorModelRequest {
  
  @scala.inline
  def apply(
    detectorModelDefinition: DetectorModelDefinition,
    detectorModelName: DetectorModelName,
    roleArn: AmazonResourceName
  ): CreateDetectorModelRequest = {
    val __obj = js.Dynamic.literal(detectorModelDefinition = detectorModelDefinition.asInstanceOf[js.Any], detectorModelName = detectorModelName.asInstanceOf[js.Any], roleArn = roleArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateDetectorModelRequest]
  }
  
  @scala.inline
  implicit class CreateDetectorModelRequestOps[Self <: CreateDetectorModelRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setDetectorModelDefinition(value: DetectorModelDefinition): Self = this.set("detectorModelDefinition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDetectorModelName(value: DetectorModelName): Self = this.set("detectorModelName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRoleArn(value: AmazonResourceName): Self = this.set("roleArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDetectorModelDescription(value: DetectorModelDescription): Self = this.set("detectorModelDescription", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDetectorModelDescription: Self = this.set("detectorModelDescription", js.undefined)
    
    @scala.inline
    def setEvaluationMethod(value: EvaluationMethod): Self = this.set("evaluationMethod", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEvaluationMethod: Self = this.set("evaluationMethod", js.undefined)
    
    @scala.inline
    def setKey(value: AttributeJsonPath): Self = this.set("key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKey: Self = this.set("key", js.undefined)
    
    @scala.inline
    def setTagsVarargs(value: Tag*): Self = this.set("tags", js.Array(value :_*))
    
    @scala.inline
    def setTags(value: Tags): Self = this.set("tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTags: Self = this.set("tags", js.undefined)
  }
}
