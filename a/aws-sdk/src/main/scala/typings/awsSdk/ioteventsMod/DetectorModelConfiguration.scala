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
  def apply(
    creationTime: Timestamp = null,
    detectorModelArn: DetectorModelArn = null,
    detectorModelDescription: DetectorModelDescription = null,
    detectorModelName: DetectorModelName = null,
    detectorModelVersion: DetectorModelVersion = null,
    evaluationMethod: EvaluationMethod = null,
    key: AttributeJsonPath = null,
    lastUpdateTime: Timestamp = null,
    roleArn: AmazonResourceName = null,
    status: DetectorModelVersionStatus = null
  ): DetectorModelConfiguration = {
    val __obj = js.Dynamic.literal()
    if (creationTime != null) __obj.updateDynamic("creationTime")(creationTime.asInstanceOf[js.Any])
    if (detectorModelArn != null) __obj.updateDynamic("detectorModelArn")(detectorModelArn.asInstanceOf[js.Any])
    if (detectorModelDescription != null) __obj.updateDynamic("detectorModelDescription")(detectorModelDescription.asInstanceOf[js.Any])
    if (detectorModelName != null) __obj.updateDynamic("detectorModelName")(detectorModelName.asInstanceOf[js.Any])
    if (detectorModelVersion != null) __obj.updateDynamic("detectorModelVersion")(detectorModelVersion.asInstanceOf[js.Any])
    if (evaluationMethod != null) __obj.updateDynamic("evaluationMethod")(evaluationMethod.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (lastUpdateTime != null) __obj.updateDynamic("lastUpdateTime")(lastUpdateTime.asInstanceOf[js.Any])
    if (roleArn != null) __obj.updateDynamic("roleArn")(roleArn.asInstanceOf[js.Any])
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    __obj.asInstanceOf[DetectorModelConfiguration]
  }
}

