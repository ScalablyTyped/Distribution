package typings.awsSdk.workspacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WorkspaceAccessProperties extends js.Object {
  /**
    * Indicates whether users can use Android devices to access their WorkSpaces.
    */
  var DeviceTypeAndroid: js.UndefOr[AccessPropertyValue] = js.native
  /**
    * Indicates whether users can use Chromebooks to access their WorkSpaces.
    */
  var DeviceTypeChromeOs: js.UndefOr[AccessPropertyValue] = js.native
  /**
    * Indicates whether users can use iOS devices to access their WorkSpaces.
    */
  var DeviceTypeIos: js.UndefOr[AccessPropertyValue] = js.native
  /**
    * Indicates whether users can use macOS clients to access their WorkSpaces. To restrict WorkSpaces access to trusted devices (also known as managed devices) with valid certificates, specify a value of TRUST. For more information, see Restrict WorkSpaces Access to Trusted Devices. 
    */
  var DeviceTypeOsx: js.UndefOr[AccessPropertyValue] = js.native
  /**
    * Indicates whether users can access their WorkSpaces through a web browser.
    */
  var DeviceTypeWeb: js.UndefOr[AccessPropertyValue] = js.native
  /**
    * Indicates whether users can use Windows clients to access their WorkSpaces. To restrict WorkSpaces access to trusted devices (also known as managed devices) with valid certificates, specify a value of TRUST. For more information, see Restrict WorkSpaces Access to Trusted Devices. 
    */
  var DeviceTypeWindows: js.UndefOr[AccessPropertyValue] = js.native
  /**
    * Indicates whether users can use zero client devices to access their WorkSpaces.
    */
  var DeviceTypeZeroClient: js.UndefOr[AccessPropertyValue] = js.native
}

object WorkspaceAccessProperties {
  @scala.inline
  def apply(): WorkspaceAccessProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WorkspaceAccessProperties]
  }
  @scala.inline
  implicit class WorkspaceAccessPropertiesOps[Self <: WorkspaceAccessProperties] (val x: Self) extends AnyVal {
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
    def setDeviceTypeAndroid(value: AccessPropertyValue): Self = this.set("DeviceTypeAndroid", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDeviceTypeAndroid: Self = this.set("DeviceTypeAndroid", js.undefined)
    @scala.inline
    def setDeviceTypeChromeOs(value: AccessPropertyValue): Self = this.set("DeviceTypeChromeOs", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDeviceTypeChromeOs: Self = this.set("DeviceTypeChromeOs", js.undefined)
    @scala.inline
    def setDeviceTypeIos(value: AccessPropertyValue): Self = this.set("DeviceTypeIos", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDeviceTypeIos: Self = this.set("DeviceTypeIos", js.undefined)
    @scala.inline
    def setDeviceTypeOsx(value: AccessPropertyValue): Self = this.set("DeviceTypeOsx", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDeviceTypeOsx: Self = this.set("DeviceTypeOsx", js.undefined)
    @scala.inline
    def setDeviceTypeWeb(value: AccessPropertyValue): Self = this.set("DeviceTypeWeb", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDeviceTypeWeb: Self = this.set("DeviceTypeWeb", js.undefined)
    @scala.inline
    def setDeviceTypeWindows(value: AccessPropertyValue): Self = this.set("DeviceTypeWindows", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDeviceTypeWindows: Self = this.set("DeviceTypeWindows", js.undefined)
    @scala.inline
    def setDeviceTypeZeroClient(value: AccessPropertyValue): Self = this.set("DeviceTypeZeroClient", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDeviceTypeZeroClient: Self = this.set("DeviceTypeZeroClient", js.undefined)
  }
  
}

