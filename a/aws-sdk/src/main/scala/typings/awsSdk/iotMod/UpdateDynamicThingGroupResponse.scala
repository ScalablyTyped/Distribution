package typings.awsSdk.iotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateDynamicThingGroupResponse extends js.Object {
  /**
    * The dynamic thing group version.
    */
  var version: js.UndefOr[Version] = js.native
}

object UpdateDynamicThingGroupResponse {
  @scala.inline
  def apply(version: js.UndefOr[Version] = js.undefined): UpdateDynamicThingGroupResponse = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(version)) __obj.updateDynamic("version")(version.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateDynamicThingGroupResponse]
  }
}

