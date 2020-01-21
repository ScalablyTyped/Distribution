package typings.awsSdk.rdsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteCustomAvailabilityZoneResult extends js.Object {
  var CustomAvailabilityZone: js.UndefOr[typings.awsSdk.rdsMod.CustomAvailabilityZone] = js.native
}

object DeleteCustomAvailabilityZoneResult {
  @scala.inline
  def apply(CustomAvailabilityZone: CustomAvailabilityZone = null): DeleteCustomAvailabilityZoneResult = {
    val __obj = js.Dynamic.literal()
    if (CustomAvailabilityZone != null) __obj.updateDynamic("CustomAvailabilityZone")(CustomAvailabilityZone.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteCustomAvailabilityZoneResult]
  }
}

