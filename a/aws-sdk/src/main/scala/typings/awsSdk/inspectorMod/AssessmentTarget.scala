package typings.awsSdk.inspectorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AssessmentTarget extends js.Object {
  /**
    * The ARN that specifies the Amazon Inspector assessment target.
    */
  var arn: Arn = js.native
  /**
    * The time at which the assessment target is created.
    */
  var createdAt: Timestamp = js.native
  /**
    * The name of the Amazon Inspector assessment target.
    */
  var name: AssessmentTargetName = js.native
  /**
    * The ARN that specifies the resource group that is associated with the assessment target.
    */
  var resourceGroupArn: js.UndefOr[Arn] = js.native
  /**
    * The time at which UpdateAssessmentTarget is called.
    */
  var updatedAt: Timestamp = js.native
}

object AssessmentTarget {
  @scala.inline
  def apply(
    arn: Arn,
    createdAt: Timestamp,
    name: AssessmentTargetName,
    updatedAt: Timestamp,
    resourceGroupArn: Arn = null
  ): AssessmentTarget = {
    val __obj = js.Dynamic.literal(arn = arn.asInstanceOf[js.Any], createdAt = createdAt.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], updatedAt = updatedAt.asInstanceOf[js.Any])
    if (resourceGroupArn != null) __obj.updateDynamic("resourceGroupArn")(resourceGroupArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[AssessmentTarget]
  }
}

