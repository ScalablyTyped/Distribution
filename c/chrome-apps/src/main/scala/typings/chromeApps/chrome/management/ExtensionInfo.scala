package typings.chromeApps.chrome.management

import typings.chromeApps.AnonADMIN
import typings.chromeApps.AnonOPENASPINNEDTAB
import typings.chromeApps.AnonPERMISSIONSINCREASE
import typings.chromeApps.chrome.ToStringLiteral
import typings.chromeApps.chrome.runtime.Permission
import typings.chromeApps.chromeAppsBooleans.`true`
import typings.chromeApps.chromeAppsStrings.OPEN_AS_PINNED_TAB
import typings.chromeApps.chromeAppsStrings.OPEN_AS_REGULAR_TAB
import typings.chromeApps.chromeAppsStrings.OPEN_AS_WINDOW
import typings.chromeApps.chromeAppsStrings.OPEN_FULL_SCREEN
import typings.chromeApps.chromeAppsStrings.admin
import typings.chromeApps.chromeAppsStrings.development
import typings.chromeApps.chromeAppsStrings.normal
import typings.chromeApps.chromeAppsStrings.other_
import typings.chromeApps.chromeAppsStrings.packaged_app
import typings.chromeApps.chromeAppsStrings.permissions_increase
import typings.chromeApps.chromeAppsStrings.sideload
import typings.chromeApps.chromeAppsStrings.unknown_
import typings.std.Exclude
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Information about an installed extension, app, or theme. */
trait ExtensionInfo extends js.Object {
  /**
    * The launch url.
    */
  var appLaunchUrl: js.UndefOr[String] = js.undefined
  /**
    * The currently available launch types.
    * @since Chrome 37.
    */
  var availableLaunchTypes: js.UndefOr[
    js.Array[
      ToStringLiteral[
        AnonOPENASPINNEDTAB, 
        String, 
        Exclude[
          String, 
          OPEN_AS_REGULAR_TAB | OPEN_AS_PINNED_TAB | OPEN_AS_WINDOW | OPEN_FULL_SCREEN
        ]
      ]
    ]
  ] = js.undefined
  /**
    * The description of this app.
    */
  var description: String
  /**
    * A reason the item is disabled.
    * @since Chrome 17.
    * @see enum ExtensionDisabledReason
    */
  var disabledReason: js.UndefOr[
    ToStringLiteral[AnonPERMISSIONSINCREASE, String, Exclude[String, unknown_ | permissions_increase]]
  ] = js.undefined
  /** Whether it is currently enabled or disabled. */
  var enabled: Boolean
  /**
    * The URL of the homepage of this app.
    * @since Chrome 11.
    */
  var homepageUrl: js.UndefOr[String] = js.undefined
  /**
    * Returns a list of host based permissions.
    * Permissions regarding url access.
    */
  var hostPermissions: js.Array[String]
  /**
    * A list of icon information.
    * Note that this just reflects what was declared in the manifest,
    * and the actual image at that url may be larger or smaller than what was declared,
    * so you might consider using explicit width and height attributes on img tags
    * referencing these images. See the manifest documentation on icons for more details.
    */
  var icons: js.UndefOr[js.Array[IconInfo]] = js.undefined
  /** The extension's unique identifier. */
  var id: String
  /**
    * How the app was installed.
    * @since Chrome 22.
    */
  var installType: ToStringLiteral[AnonADMIN, String, Exclude[String, other_ | normal | development | admin | sideload]]
  /**
    * True if this is an app, which it will be till this is removed.
    * @deprecated since Chrome 33. Please use management.ExtensionInfo.type.
    */
  var isApp: js.UndefOr[`true`] = js.undefined
  /**
    * The app launch type.
    * @since Chrome 37.
    */
  var launchType: js.UndefOr[
    ToStringLiteral[
      AnonOPENASPINNEDTAB, 
      String, 
      Exclude[
        String, 
        OPEN_AS_REGULAR_TAB | OPEN_AS_PINNED_TAB | OPEN_AS_WINDOW | OPEN_FULL_SCREEN
      ]
    ]
  ] = js.undefined
  /**
    * Whether this app can be disabled or uninstalled by the user.
    */
  var mayDisable: Boolean
  /** The name of this app. */
  var name: String
  /**
    * Whether the app declares that it supports offline.
    * @since Chrome 15.
    */
  var offlineEnabled: Boolean
  /**
    * Returns a list of API based permissions.
    */
  var permissions: js.Array[Permission]
  /**
    * A short version of the name of this app.
    * @since Chrome 31.
    */
  var shortName: String
  /**
    * The type of this app.
    * @since Chrome 23.
    */
  var `type`: packaged_app
  /**
    * The update URL of this app.
    * @since Chrome 16.
    */
  var updateUrl: js.UndefOr[String] = js.undefined
  /** The version of this app. */
  var version: String
  /** This app's version name */
  var versionName: String
}

object ExtensionInfo {
  @scala.inline
  def apply(
    description: String,
    enabled: Boolean,
    hostPermissions: js.Array[String],
    id: String,
    installType: ToStringLiteral[AnonADMIN, String, Exclude[String, other_ | normal | development | admin | sideload]],
    mayDisable: Boolean,
    name: String,
    offlineEnabled: Boolean,
    permissions: js.Array[Permission],
    shortName: String,
    `type`: packaged_app,
    version: String,
    versionName: String,
    appLaunchUrl: String = null,
    availableLaunchTypes: js.Array[
      ToStringLiteral[
        AnonOPENASPINNEDTAB, 
        String, 
        Exclude[
          String, 
          OPEN_AS_REGULAR_TAB | OPEN_AS_PINNED_TAB | OPEN_AS_WINDOW | OPEN_FULL_SCREEN
        ]
      ]
    ] = null,
    disabledReason: ToStringLiteral[AnonPERMISSIONSINCREASE, String, Exclude[String, unknown_ | permissions_increase]] = null,
    homepageUrl: String = null,
    icons: js.Array[IconInfo] = null,
    isApp: `true` = null,
    launchType: ToStringLiteral[
      AnonOPENASPINNEDTAB, 
      String, 
      Exclude[
        String, 
        OPEN_AS_REGULAR_TAB | OPEN_AS_PINNED_TAB | OPEN_AS_WINDOW | OPEN_FULL_SCREEN
      ]
    ] = null,
    updateUrl: String = null
  ): ExtensionInfo = {
    val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], enabled = enabled.asInstanceOf[js.Any], hostPermissions = hostPermissions.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], installType = installType.asInstanceOf[js.Any], mayDisable = mayDisable.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], offlineEnabled = offlineEnabled.asInstanceOf[js.Any], permissions = permissions.asInstanceOf[js.Any], shortName = shortName.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any], versionName = versionName.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (appLaunchUrl != null) __obj.updateDynamic("appLaunchUrl")(appLaunchUrl.asInstanceOf[js.Any])
    if (availableLaunchTypes != null) __obj.updateDynamic("availableLaunchTypes")(availableLaunchTypes.asInstanceOf[js.Any])
    if (disabledReason != null) __obj.updateDynamic("disabledReason")(disabledReason.asInstanceOf[js.Any])
    if (homepageUrl != null) __obj.updateDynamic("homepageUrl")(homepageUrl.asInstanceOf[js.Any])
    if (icons != null) __obj.updateDynamic("icons")(icons.asInstanceOf[js.Any])
    if (isApp != null) __obj.updateDynamic("isApp")(isApp.asInstanceOf[js.Any])
    if (launchType != null) __obj.updateDynamic("launchType")(launchType.asInstanceOf[js.Any])
    if (updateUrl != null) __obj.updateDynamic("updateUrl")(updateUrl.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExtensionInfo]
  }
}

