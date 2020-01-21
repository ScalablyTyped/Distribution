package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ModifyHostsResult extends js.Object {
  /**
    * The IDs of the Dedicated Hosts that were successfully modified.
    */
  var Successful: js.UndefOr[ResponseHostIdList] = js.native
  /**
    * The IDs of the Dedicated Hosts that could not be modified. Check whether the setting you requested can be used.
    */
  var Unsuccessful: js.UndefOr[UnsuccessfulItemList] = js.native
}

object ModifyHostsResult {
  @scala.inline
  def apply(Successful: ResponseHostIdList = null, Unsuccessful: UnsuccessfulItemList = null): ModifyHostsResult = {
    val __obj = js.Dynamic.literal()
    if (Successful != null) __obj.updateDynamic("Successful")(Successful.asInstanceOf[js.Any])
    if (Unsuccessful != null) __obj.updateDynamic("Unsuccessful")(Unsuccessful.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModifyHostsResult]
  }
}

