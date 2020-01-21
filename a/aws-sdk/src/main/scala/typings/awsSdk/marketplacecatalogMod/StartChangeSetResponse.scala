package typings.awsSdk.marketplacecatalogMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StartChangeSetResponse extends js.Object {
  /**
    * The ARN associated to the unique identifier generated for the request.
    */
  var ChangeSetArn: js.UndefOr[ARN] = js.native
  /**
    * Unique identifier generated for the request.
    */
  var ChangeSetId: js.UndefOr[ResourceId] = js.native
}

object StartChangeSetResponse {
  @scala.inline
  def apply(ChangeSetArn: ARN = null, ChangeSetId: ResourceId = null): StartChangeSetResponse = {
    val __obj = js.Dynamic.literal()
    if (ChangeSetArn != null) __obj.updateDynamic("ChangeSetArn")(ChangeSetArn.asInstanceOf[js.Any])
    if (ChangeSetId != null) __obj.updateDynamic("ChangeSetId")(ChangeSetId.asInstanceOf[js.Any])
    __obj.asInstanceOf[StartChangeSetResponse]
  }
}

