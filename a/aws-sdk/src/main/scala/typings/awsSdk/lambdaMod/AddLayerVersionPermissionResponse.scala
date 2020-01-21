package typings.awsSdk.lambdaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AddLayerVersionPermissionResponse extends js.Object {
  /**
    * A unique identifier for the current revision of the policy.
    */
  var RevisionId: js.UndefOr[String] = js.native
  /**
    * The permission statement.
    */
  var Statement: js.UndefOr[String] = js.native
}

object AddLayerVersionPermissionResponse {
  @scala.inline
  def apply(RevisionId: String = null, Statement: String = null): AddLayerVersionPermissionResponse = {
    val __obj = js.Dynamic.literal()
    if (RevisionId != null) __obj.updateDynamic("RevisionId")(RevisionId.asInstanceOf[js.Any])
    if (Statement != null) __obj.updateDynamic("Statement")(Statement.asInstanceOf[js.Any])
    __obj.asInstanceOf[AddLayerVersionPermissionResponse]
  }
}

