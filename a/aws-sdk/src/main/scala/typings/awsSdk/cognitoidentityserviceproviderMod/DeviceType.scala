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
  def apply(): DeviceType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeviceType]
  }
  @scala.inline
  implicit class DeviceTypeOps[Self <: DeviceType] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setDeviceAttributesVarargs(value: AttributeType*): Self = this.set("DeviceAttributes", js.Array(value :_*))
    @scala.inline
    def setDeviceAttributes(value: AttributeListType): Self = this.set("DeviceAttributes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDeviceAttributes: Self = this.set("DeviceAttributes", js.undefined)
    @scala.inline
    def setDeviceCreateDate(value: DateType): Self = this.set("DeviceCreateDate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDeviceCreateDate: Self = this.set("DeviceCreateDate", js.undefined)
    @scala.inline
    def setDeviceKey(value: DeviceKeyType): Self = this.set("DeviceKey", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDeviceKey: Self = this.set("DeviceKey", js.undefined)
    @scala.inline
    def setDeviceLastAuthenticatedDate(value: DateType): Self = this.set("DeviceLastAuthenticatedDate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDeviceLastAuthenticatedDate: Self = this.set("DeviceLastAuthenticatedDate", js.undefined)
    @scala.inline
    def setDeviceLastModifiedDate(value: DateType): Self = this.set("DeviceLastModifiedDate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDeviceLastModifiedDate: Self = this.set("DeviceLastModifiedDate", js.undefined)
  }
  
}

