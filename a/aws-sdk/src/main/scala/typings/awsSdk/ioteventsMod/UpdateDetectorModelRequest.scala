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
    roleArn: AmazonResourceName,
    detectorModelDescription: DetectorModelDescription = null,
    evaluationMethod: EvaluationMethod = null
  ): UpdateDetectorModelRequest = {
    val __obj = js.Dynamic.literal(detectorModelDefinition = detectorModelDefinition.asInstanceOf[js.Any], detectorModelName = detectorModelName.asInstanceOf[js.Any], roleArn = roleArn.asInstanceOf[js.Any])
    if (detectorModelDescription != null) __obj.updateDynamic("detectorModelDescription")(detectorModelDescription.asInstanceOf[js.Any])
    if (evaluationMethod != null) __obj.updateDynamic("evaluationMethod")(evaluationMethod.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateDetectorModelRequest]
  }
}

