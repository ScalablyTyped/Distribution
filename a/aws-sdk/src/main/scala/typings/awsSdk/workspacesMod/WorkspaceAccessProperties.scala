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
  def apply(
    DeviceTypeAndroid: AccessPropertyValue = null,
    DeviceTypeChromeOs: AccessPropertyValue = null,
    DeviceTypeIos: AccessPropertyValue = null,
    DeviceTypeOsx: AccessPropertyValue = null,
    DeviceTypeWeb: AccessPropertyValue = null,
    DeviceTypeWindows: AccessPropertyValue = null,
    DeviceTypeZeroClient: AccessPropertyValue = null
  ): WorkspaceAccessProperties = {
    val __obj = js.Dynamic.literal()
    if (DeviceTypeAndroid != null) __obj.updateDynamic("DeviceTypeAndroid")(DeviceTypeAndroid.asInstanceOf[js.Any])
    if (DeviceTypeChromeOs != null) __obj.updateDynamic("DeviceTypeChromeOs")(DeviceTypeChromeOs.asInstanceOf[js.Any])
    if (DeviceTypeIos != null) __obj.updateDynamic("DeviceTypeIos")(DeviceTypeIos.asInstanceOf[js.Any])
    if (DeviceTypeOsx != null) __obj.updateDynamic("DeviceTypeOsx")(DeviceTypeOsx.asInstanceOf[js.Any])
    if (DeviceTypeWeb != null) __obj.updateDynamic("DeviceTypeWeb")(DeviceTypeWeb.asInstanceOf[js.Any])
    if (DeviceTypeWindows != null) __obj.updateDynamic("DeviceTypeWindows")(DeviceTypeWindows.asInstanceOf[js.Any])
    if (DeviceTypeZeroClient != null) __obj.updateDynamic("DeviceTypeZeroClient")(DeviceTypeZeroClient.asInstanceOf[js.Any])
    __obj.asInstanceOf[WorkspaceAccessProperties]
  }
}

