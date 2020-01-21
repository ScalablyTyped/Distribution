package typings.awsSdk.iotthingsgraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateSystemInstanceResponse extends js.Object {
  /**
    * The summary object that describes the new system instance.
    */
  var summary: js.UndefOr[SystemInstanceSummary] = js.native
}

object CreateSystemInstanceResponse {
  @scala.inline
  def apply(summary: SystemInstanceSummary = null): CreateSystemInstanceResponse = {
    val __obj = js.Dynamic.literal()
    if (summary != null) __obj.updateDynamic("summary")(summary.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateSystemInstanceResponse]
  }
}

