package typings
package chromeDashAppsLib.chromeNs.networkingNs.oncNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ManagedType[T] extends js.Object {
  /** The active value currently used by the network configuration manager (e.g. Shill). */
  var Active: js.UndefOr[T] = js.undefined
  /**
    * Whether a DevicePolicy for the property exists and allows the property
    * to be edited (i.e. the policy set recommended property value).
    * @default false
    */
  var DeviceEditable: js.UndefOr[scala.Boolean] = js.undefined
  /** The property value provided by the device policy. */
  var DevicePolicy: js.UndefOr[T] = js.undefined
  /** The source from which the effective property value was determined. */
  var Effective: js.UndefOr[java.lang.String] = js.undefined
  /** The value set for all users of the device. Only provided if *DeviceEditiable* is true. */
  var SharedSetting: js.UndefOr[T] = js.undefined
  /**
    * Whether a UserPolicy for the property exists and allows the property
    * to be edited (i.e. the policy set recommended property value).
    * @default false
    */
  var UserEditable: js.UndefOr[scala.Boolean] = js.undefined
  /** The property value provided by the user policy. */
  var UserPolicy: js.UndefOr[T] = js.undefined
  /** The property value set by the logged in user. Only provided if *UserEditable* is true. */
  var UserSetting: js.UndefOr[T] = js.undefined
}

object ManagedType {
  @scala.inline
  def apply[T](
    Active: T = null,
    DeviceEditable: js.UndefOr[scala.Boolean] = js.undefined,
    DevicePolicy: T = null,
    Effective: java.lang.String = null,
    SharedSetting: T = null,
    UserEditable: js.UndefOr[scala.Boolean] = js.undefined,
    UserPolicy: T = null,
    UserSetting: T = null
  ): ManagedType[T] = {
    val __obj = js.Dynamic.literal()
    if (Active != null) __obj.updateDynamic("Active")(Active.asInstanceOf[js.Any])
    if (!js.isUndefined(DeviceEditable)) __obj.updateDynamic("DeviceEditable")(DeviceEditable)
    if (DevicePolicy != null) __obj.updateDynamic("DevicePolicy")(DevicePolicy.asInstanceOf[js.Any])
    if (Effective != null) __obj.updateDynamic("Effective")(Effective)
    if (SharedSetting != null) __obj.updateDynamic("SharedSetting")(SharedSetting.asInstanceOf[js.Any])
    if (!js.isUndefined(UserEditable)) __obj.updateDynamic("UserEditable")(UserEditable)
    if (UserPolicy != null) __obj.updateDynamic("UserPolicy")(UserPolicy.asInstanceOf[js.Any])
    if (UserSetting != null) __obj.updateDynamic("UserSetting")(UserSetting.asInstanceOf[js.Any])
    __obj.asInstanceOf[ManagedType[T]]
  }
}

