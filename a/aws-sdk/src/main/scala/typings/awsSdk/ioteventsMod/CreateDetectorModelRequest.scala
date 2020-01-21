package typings.awsSdk.ioteventsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
    * When set to SERIAL, variables are updated and event conditions evaluated in the order that the events are defined. When set to BATCH, variables are updated and events performed only after all event conditions are evaluated.
    */
  var evaluationMethod: js.UndefOr[EvaluationMethod] = js.native
  /**
    * The input attribute key used to identify a device or system to create a detector (an instance of the detector model) and then to route each input received to the appropriate detector (instance). This parameter uses a JSON-path expression to specify the attribute-value pair in the message payload of each input that is used to identify the device associated with the input.
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
    roleArn: AmazonResourceName,
    detectorModelDescription: DetectorModelDescription = null,
    evaluationMethod: EvaluationMethod = null,
    key: AttributeJsonPath = null,
    tags: Tags = null
  ): CreateDetectorModelRequest = {
    val __obj = js.Dynamic.literal(detectorModelDefinition = detectorModelDefinition.asInstanceOf[js.Any], detectorModelName = detectorModelName.asInstanceOf[js.Any], roleArn = roleArn.asInstanceOf[js.Any])
    if (detectorModelDescription != null) __obj.updateDynamic("detectorModelDescription")(detectorModelDescription.asInstanceOf[js.Any])
    if (evaluationMethod != null) __obj.updateDynamic("evaluationMethod")(evaluationMethod.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (tags != null) __obj.updateDynamic("tags")(tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateDetectorModelRequest]
  }
}

