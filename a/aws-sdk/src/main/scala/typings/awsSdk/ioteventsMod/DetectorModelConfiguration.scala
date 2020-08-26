package typings.awsSdk.ioteventsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DetectorModelConfiguration extends js.Object {
  /**
    * The time the detector model was created.
    */
  var creationTime: js.UndefOr[Timestamp] = js.native
  /**
    * The ARN of the detector model.
    */
  var detectorModelArn: js.UndefOr[DetectorModelArn] = js.native
  /**
    * A brief description of the detector model.
    */
  var detectorModelDescription: js.UndefOr[DetectorModelDescription] = js.native
  /**
    * The name of the detector model.
    */
  var detectorModelName: js.UndefOr[DetectorModelName] = js.native
  /**
    * The version of the detector model.
    */
  var detectorModelVersion: js.UndefOr[DetectorModelVersion] = js.native
  /**
    * Information about the order in which events are evaluated and how actions are executed. 
    */
  var evaluationMethod: js.UndefOr[EvaluationMethod] = js.native
  /**
    * The value used to identify a detector instance. When a device or system sends input, a new detector instance with a unique key value is created. AWS IoT Events can continue to route input to its corresponding detector instance based on this identifying information.  This parameter uses a JSON-path expression to select the attribute-value pair in the message payload that is used for identification. To route the message to the correct detector instance, the device must send a message payload that contains the same attribute-value.
    */
  var key: js.UndefOr[AttributeJsonPath] = js.native
  /**
    * The time the detector model was last updated.
    */
  var lastUpdateTime: js.UndefOr[Timestamp] = js.native
  /**
    * The ARN of the role that grants permission to AWS IoT Events to perform its operations.
    */
  var roleArn: js.UndefOr[AmazonResourceName] = js.native
  /**
    * The status of the detector model.
    */
  var status: js.UndefOr[DetectorModelVersionStatus] = js.native
}

object DetectorModelConfiguration {
  @scala.inline
  def apply(): DetectorModelConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DetectorModelConfiguration]
  }
  @scala.inline
  implicit class DetectorModelConfigurationOps[Self <: DetectorModelConfiguration] (val x: Self) extends AnyVal {
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
    def setCreationTime(value: Timestamp): Self = this.set("creationTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCreationTime: Self = this.set("creationTime", js.undefined)
    @scala.inline
    def setDetectorModelArn(value: DetectorModelArn): Self = this.set("detectorModelArn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDetectorModelArn: Self = this.set("detectorModelArn", js.undefined)
    @scala.inline
    def setDetectorModelDescription(value: DetectorModelDescription): Self = this.set("detectorModelDescription", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDetectorModelDescription: Self = this.set("detectorModelDescription", js.undefined)
    @scala.inline
    def setDetectorModelName(value: DetectorModelName): Self = this.set("detectorModelName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDetectorModelName: Self = this.set("detectorModelName", js.undefined)
    @scala.inline
    def setDetectorModelVersion(value: DetectorModelVersion): Self = this.set("detectorModelVersion", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDetectorModelVersion: Self = this.set("detectorModelVersion", js.undefined)
    @scala.inline
    def setEvaluationMethod(value: EvaluationMethod): Self = this.set("evaluationMethod", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEvaluationMethod: Self = this.set("evaluationMethod", js.undefined)
    @scala.inline
    def setKey(value: AttributeJsonPath): Self = this.set("key", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKey: Self = this.set("key", js.undefined)
    @scala.inline
    def setLastUpdateTime(value: Timestamp): Self = this.set("lastUpdateTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLastUpdateTime: Self = this.set("lastUpdateTime", js.undefined)
    @scala.inline
    def setRoleArn(value: AmazonResourceName): Self = this.set("roleArn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRoleArn: Self = this.set("roleArn", js.undefined)
    @scala.inline
    def setStatus(value: DetectorModelVersionStatus): Self = this.set("status", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStatus: Self = this.set("status", js.undefined)
  }
  
}

