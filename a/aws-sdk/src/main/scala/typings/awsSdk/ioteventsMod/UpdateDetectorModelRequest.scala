package typings.awsSdk.ioteventsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateDetectorModelRequest extends js.Object {
  /**
    * Information that defines how a detector operates.
    */
  var detectorModelDefinition: DetectorModelDefinition = js.native
  /**
    * A brief description of the detector model.
    */
  var detectorModelDescription: js.UndefOr[DetectorModelDescription] = js.native
  /**
    * The name of the detector model that is updated.
    */
  var detectorModelName: DetectorModelName = js.native
  /**
    * Information about the order in which events are evaluated and how actions are executed. 
    */
  var evaluationMethod: js.UndefOr[EvaluationMethod] = js.native
  /**
    * The ARN of the role that grants permission to AWS IoT Events to perform its operations.
    */
  var roleArn: AmazonResourceName = js.native
}

object UpdateDetectorModelRequest {
  @scala.inline
  def apply(
    detectorModelDefinition: DetectorModelDefinition,
    detectorModelName: DetectorModelName,
    roleArn: AmazonResourceName
  ): UpdateDetectorModelRequest = {
    val __obj = js.Dynamic.literal(detectorModelDefinition = detectorModelDefinition.asInstanceOf[js.Any], detectorModelName = detectorModelName.asInstanceOf[js.Any], roleArn = roleArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateDetectorModelRequest]
  }
  @scala.inline
  implicit class UpdateDetectorModelRequestOps[Self <: UpdateDetectorModelRequest] (val x: Self) extends AnyVal {
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
  }
  
}

