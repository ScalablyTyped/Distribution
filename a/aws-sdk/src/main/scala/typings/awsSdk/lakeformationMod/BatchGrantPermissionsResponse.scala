package typings.awsSdk.lakeformationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BatchGrantPermissionsResponse extends js.Object {
  /**
    * A list of failures to grant permissions to the resources.
    */
  var Failures: js.UndefOr[BatchPermissionsFailureList] = js.native
}

object BatchGrantPermissionsResponse {
  @scala.inline
  def apply(Failures: BatchPermissionsFailureList = null): BatchGrantPermissionsResponse = {
    val __obj = js.Dynamic.literal()
    if (Failures != null) __obj.updateDynamic("Failures")(Failures.asInstanceOf[js.Any])
    __obj.asInstanceOf[BatchGrantPermissionsResponse]
  }
}

