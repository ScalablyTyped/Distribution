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

