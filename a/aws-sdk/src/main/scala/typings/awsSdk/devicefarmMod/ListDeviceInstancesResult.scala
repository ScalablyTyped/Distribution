package typings.awsSdk.devicefarmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListDeviceInstancesResult extends js.Object {
  /**
    * An object that contains information about your device instances.
    */
  var deviceInstances: js.UndefOr[DeviceInstances] = js.native
  /**
    * An identifier that can be used in the next call to this operation to return the next set of items in the list.
    */
  var nextToken: js.UndefOr[PaginationToken] = js.native
}

object ListDeviceInstancesResult {
  @scala.inline
  def apply(deviceInstances: DeviceInstances = null, nextToken: PaginationToken = null): ListDeviceInstancesResult = {
    val __obj = js.Dynamic.literal()
    if (deviceInstances != null) __obj.updateDynamic("deviceInstances")(deviceInstances.asInstanceOf[js.Any])
    if (nextToken != null) __obj.updateDynamic("nextToken")(nextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListDeviceInstancesResult]
  }
}

