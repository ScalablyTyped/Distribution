package typings.awsSdk.iotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateThingGroupResponse extends js.Object {
  /**
    * The version of the updated thing group.
    */
  var version: js.UndefOr[Version] = js.native
}

object UpdateThingGroupResponse {
  @scala.inline
  def apply(version: js.UndefOr[Version] = js.undefined): UpdateThingGroupResponse = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(version)) __obj.updateDynamic("version")(version.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateThingGroupResponse]
  }
}

