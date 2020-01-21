package typings.awsSdk.iotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateBillingGroupResponse extends js.Object {
  /**
    * The latest version of the billing group.
    */
  var version: js.UndefOr[Version] = js.native
}

object UpdateBillingGroupResponse {
  @scala.inline
  def apply(version: Int | Double = null): UpdateBillingGroupResponse = {
    val __obj = js.Dynamic.literal()
    if (version != null) __obj.updateDynamic("version")(version.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateBillingGroupResponse]
  }
}

