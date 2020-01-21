package typings.awsSdk.iotthingsgraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FlowTemplateSummary extends js.Object {
  /**
    * The ARN of the workflow.
    */
  var arn: js.UndefOr[Arn] = js.native
  /**
    * The date when the workflow was created.
    */
  var createdAt: js.UndefOr[Timestamp] = js.native
  /**
    * The ID of the workflow.
    */
  var id: js.UndefOr[Urn] = js.native
  /**
    * The revision number of the workflow.
    */
  var revisionNumber: js.UndefOr[Version] = js.native
}

object FlowTemplateSummary {
  @scala.inline
  def apply(arn: Arn = null, createdAt: Timestamp = null, id: Urn = null, revisionNumber: Int | Double = null): FlowTemplateSummary = {
    val __obj = js.Dynamic.literal()
    if (arn != null) __obj.updateDynamic("arn")(arn.asInstanceOf[js.Any])
    if (createdAt != null) __obj.updateDynamic("createdAt")(createdAt.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (revisionNumber != null) __obj.updateDynamic("revisionNumber")(revisionNumber.asInstanceOf[js.Any])
    __obj.asInstanceOf[FlowTemplateSummary]
  }
}

