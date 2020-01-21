package typings.awsSdk.cognitoidentityserviceproviderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeviceType extends js.Object {
  /**
    * The device attributes.
    */
  var DeviceAttributes: js.UndefOr[AttributeListType] = js.native
  /**
    * The creation date of the device.
    */
  var DeviceCreateDate: js.UndefOr[DateType] = js.native
  /**
    * The device key.
    */
  var DeviceKey: js.UndefOr[DeviceKeyType] = js.native
  /**
    * The date in which the device was last authenticated.
    */
  var DeviceLastAuthenticatedDate: js.UndefOr[DateType] = js.native
  /**
    * The last modified date of the device.
    */
  var DeviceLastModifiedDate: js.UndefOr[DateType] = js.native
}

object DeviceType {
  @scala.inline
  def apply(
    DeviceAttributes: AttributeListType = null,
    DeviceCreateDate: DateType = null,
    DeviceKey: DeviceKeyType = null,
    DeviceLastAuthenticatedDate: DateType = null,
    DeviceLastModifiedDate: DateType = null
  ): DeviceType = {
    val __obj = js.Dynamic.literal()
    if (DeviceAttributes != null) __obj.updateDynamic("DeviceAttributes")(DeviceAttributes.asInstanceOf[js.Any])
    if (DeviceCreateDate != null) __obj.updateDynamic("DeviceCreateDate")(DeviceCreateDate.asInstanceOf[js.Any])
    if (DeviceKey != null) __obj.updateDynamic("DeviceKey")(DeviceKey.asInstanceOf[js.Any])
    if (DeviceLastAuthenticatedDate != null) __obj.updateDynamic("DeviceLastAuthenticatedDate")(DeviceLastAuthenticatedDate.asInstanceOf[js.Any])
    if (DeviceLastModifiedDate != null) __obj.updateDynamic("DeviceLastModifiedDate")(DeviceLastModifiedDate.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeviceType]
  }
}

