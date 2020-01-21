package typings.awsSdk.ioteventsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DetectorModelVersionSummary extends js.Object {
  /**
    * The time the detector model version was created.
    */
  var creationTime: js.UndefOr[Timestamp] = js.native
  /**
    * The ARN of the detector model version.
    */
  var detectorModelArn: js.UndefOr[DetectorModelArn] = js.native
  /**
    * The name of the detector model.
    */
  var detectorModelName: js.UndefOr[DetectorModelName] = js.native
  /**
    * The ID of the detector model version.
    */
  var detectorModelVersion: js.UndefOr[DetectorModelVersion] = js.native
  /**
    * When set to SERIAL, variables are updated and event conditions evaluated in the order that the events are defined. When set to BATCH, variables are updated and events performed only after all event conditions are evaluated.
    */
  var evaluationMethod: js.UndefOr[EvaluationMethod] = js.native
  /**
    * The last time the detector model version was updated.
    */
  var lastUpdateTime: js.UndefOr[Timestamp] = js.native
  /**
    * The ARN of the role that grants the detector model permission to perform its tasks.
    */
  var roleArn: js.UndefOr[AmazonResourceName] = js.native
  /**
    * The status of the detector model version.
    */
  var status: js.UndefOr[DetectorModelVersionStatus] = js.native
}

object DetectorModelVersionSummary {
  @scala.inline
  def apply(
    creationTime: Timestamp = null,
    detectorModelArn: DetectorModelArn = null,
    detectorModelName: DetectorModelName = null,
    detectorModelVersion: DetectorModelVersion = null,
    evaluationMethod: EvaluationMethod = null,
    lastUpdateTime: Timestamp = null,
    roleArn: AmazonResourceName = null,
    status: DetectorModelVersionStatus = null
  ): DetectorModelVersionSummary = {
    val __obj = js.Dynamic.literal()
    if (creationTime != null) __obj.updateDynamic("creationTime")(creationTime.asInstanceOf[js.Any])
    if (detectorModelArn != null) __obj.updateDynamic("detectorModelArn")(detectorModelArn.asInstanceOf[js.Any])
    if (detectorModelName != null) __obj.updateDynamic("detectorModelName")(detectorModelName.asInstanceOf[js.Any])
    if (detectorModelVersion != null) __obj.updateDynamic("detectorModelVersion")(detectorModelVersion.asInstanceOf[js.Any])
    if (evaluationMethod != null) __obj.updateDynamic("evaluationMethod")(evaluationMethod.asInstanceOf[js.Any])
    if (lastUpdateTime != null) __obj.updateDynamic("lastUpdateTime")(lastUpdateTime.asInstanceOf[js.Any])
    if (roleArn != null) __obj.updateDynamic("roleArn")(roleArn.asInstanceOf[js.Any])
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    __obj.asInstanceOf[DetectorModelVersionSummary]
  }
}

