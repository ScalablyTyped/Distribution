package typings.awsSdk.devicefarmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Offering extends js.Object {
  /**
    * A string that describes the offering.
    */
  var description: js.UndefOr[Message] = js.native
  /**
    * The ID that corresponds to a device offering.
    */
  var id: js.UndefOr[OfferingIdentifier] = js.native
  /**
    * The platform of the device (for example, ANDROID or IOS).
    */
  var platform: js.UndefOr[DevicePlatform] = js.native
  /**
    * Specifies whether there are recurring charges for the offering.
    */
  var recurringCharges: js.UndefOr[RecurringCharges] = js.native
  /**
    * The type of offering (for example, RECURRING) for a device.
    */
  var `type`: js.UndefOr[OfferingType] = js.native
}

object Offering {
  @scala.inline
  def apply(
    description: Message = null,
    id: OfferingIdentifier = null,
    platform: DevicePlatform = null,
    recurringCharges: RecurringCharges = null,
    `type`: OfferingType = null
  ): Offering = {
    val __obj = js.Dynamic.literal()
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (platform != null) __obj.updateDynamic("platform")(platform.asInstanceOf[js.Any])
    if (recurringCharges != null) __obj.updateDynamic("recurringCharges")(recurringCharges.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Offering]
  }
}

