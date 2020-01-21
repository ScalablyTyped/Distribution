package typings.awsSdk.marketplacecatalogMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CancelChangeSetResponse extends js.Object {
  /**
    * The ARN associated with the change set referenced in this request.
    */
  var ChangeSetArn: js.UndefOr[ARN] = js.native
  /**
    * The unique identifier for the change set referenced in this request.
    */
  var ChangeSetId: js.UndefOr[ResourceId] = js.native
}

object CancelChangeSetResponse {
  @scala.inline
  def apply(ChangeSetArn: ARN = null, ChangeSetId: ResourceId = null): CancelChangeSetResponse = {
    val __obj = js.Dynamic.literal()
    if (ChangeSetArn != null) __obj.updateDynamic("ChangeSetArn")(ChangeSetArn.asInstanceOf[js.Any])
    if (ChangeSetId != null) __obj.updateDynamic("ChangeSetId")(ChangeSetId.asInstanceOf[js.Any])
    __obj.asInstanceOf[CancelChangeSetResponse]
  }
}

