package typings.awsSdk.devicefarmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListDevicePoolsResult extends js.Object {
  /**
    * Information about the device pools.
    */
  var devicePools: js.UndefOr[DevicePools] = js.native
  /**
    * If the number of items that are returned is significantly large, this is an identifier that is also returned. It can be used in a subsequent call to this operation to return the next set of items in the list.
    */
  var nextToken: js.UndefOr[PaginationToken] = js.native
}

object ListDevicePoolsResult {
  @scala.inline
  def apply(devicePools: DevicePools = null, nextToken: PaginationToken = null): ListDevicePoolsResult = {
    val __obj = js.Dynamic.literal()
    if (devicePools != null) __obj.updateDynamic("devicePools")(devicePools.asInstanceOf[js.Any])
    if (nextToken != null) __obj.updateDynamic("nextToken")(nextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListDevicePoolsResult]
  }
}

