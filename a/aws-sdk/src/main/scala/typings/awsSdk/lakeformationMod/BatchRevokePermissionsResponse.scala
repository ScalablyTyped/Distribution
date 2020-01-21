package typings.awsSdk.lakeformationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BatchRevokePermissionsResponse extends js.Object {
  /**
    * A list of failures to revoke permissions to the resources.
    */
  var Failures: js.UndefOr[BatchPermissionsFailureList] = js.native
}

object BatchRevokePermissionsResponse {
  @scala.inline
  def apply(Failures: BatchPermissionsFailureList = null): BatchRevokePermissionsResponse = {
    val __obj = js.Dynamic.literal()
    if (Failures != null) __obj.updateDynamic("Failures")(Failures.asInstanceOf[js.Any])
    __obj.asInstanceOf[BatchRevokePermissionsResponse]
  }
}

