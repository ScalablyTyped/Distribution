package typings.awsSdk.eksMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateNodegroupConfigResponse extends js.Object {
  var update: js.UndefOr[Update] = js.native
}

object UpdateNodegroupConfigResponse {
  @scala.inline
  def apply(update: Update = null): UpdateNodegroupConfigResponse = {
    val __obj = js.Dynamic.literal()
    if (update != null) __obj.updateDynamic("update")(update.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateNodegroupConfigResponse]
  }
}

