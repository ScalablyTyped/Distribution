package typings
package chromeDashAppsLib.chromeNs.managementNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Information about an installed extension, app, or theme. */
trait ExtensionInfo extends js.Object {
  /**
    * The launch url.
    */
  var appLaunchUrl: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The currently available launch types.
    * @since Chrome 37.
    */
  var availableLaunchTypes: js.UndefOr[
    js.Array[
      chromeDashAppsLib.chromeNs.ToStringLiteral[
        chromeDashAppsLib.Anon_OPENASPINNEDTAB, 
        java.lang.String, 
        stdLib.Exclude[
          java.lang.String, 
          chromeDashAppsLib.chromeDashAppsLibStrings.OPEN_AS_REGULAR_TAB | chromeDashAppsLib.chromeDashAppsLibStrings.OPEN_AS_PINNED_TAB | chromeDashAppsLib.chromeDashAppsLibStrings.OPEN_AS_WINDOW | chromeDashAppsLib.chromeDashAppsLibStrings.OPEN_FULL_SCREEN
        ]
      ]
    ]
  ] = js.undefined
  /**
    * The description of this app.
    */
  var description: java.lang.String
  /**
    * A reason the item is disabled.
    * @since Chrome 17.
    * @see enum ExtensionDisabledReason
    */
  var disabledReason: js.UndefOr[
    chromeDashAppsLib.chromeNs.ToStringLiteral[
      chromeDashAppsLib.Anon_PERMISSIONSINCREASE, 
      java.lang.String, 
      stdLib.Exclude[
        java.lang.String, 
        chromeDashAppsLib.chromeDashAppsLibStrings.unknown | chromeDashAppsLib.chromeDashAppsLibStrings.permissions_increase
      ]
    ]
  ] = js.undefined
  /** Whether it is currently enabled or disabled. */
  var enabled: scala.Boolean
  /**
    * The URL of the homepage of this app.
    * @since Chrome 11.
    */
  var homepageUrl: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Returns a list of host based permissions.
    * Permissions regarding url access.
    */
  var hostPermissions: js.Array[java.lang.String]
  /**
    * A list of icon information.
    * Note that this just reflects what was declared in the manifest,
    * and the actual image at that url may be larger or smaller than what was declared,
    * so you might consider using explicit width and height attributes on img tags
    * referencing these images. See the manifest documentation on icons for more details.
    */
  var icons: js.UndefOr[js.Array[IconInfo]] = js.undefined
  /** The extension's unique identifier. */
  var id: java.lang.String
  /**
    * How the app was installed.
    * @since Chrome 22.
    */
  var installType: chromeDashAppsLib.chromeNs.ToStringLiteral[
    chromeDashAppsLib.Anon_ADMIN, 
    java.lang.String, 
    stdLib.Exclude[
      java.lang.String, 
      chromeDashAppsLib.chromeDashAppsLibStrings.other | chromeDashAppsLib.chromeDashAppsLibStrings.admin | chromeDashAppsLib.chromeDashAppsLibStrings.development | chromeDashAppsLib.chromeDashAppsLibStrings.sideload | chromeDashAppsLib.chromeDashAppsLibStrings.normal
    ]
  ]
  /**
    * True if this is an app, which it will be till this is removed.
    * @deprecated since Chrome 33. Please use management.ExtensionInfo.type.
    */
  var isApp: js.UndefOr[chromeDashAppsLib.chromeDashAppsLibNumbers.`true`] = js.undefined
  /**
    * The app launch type.
    * @since Chrome 37.
    */
  var launchType: js.UndefOr[
    chromeDashAppsLib.chromeNs.ToStringLiteral[
      chromeDashAppsLib.Anon_OPENASPINNEDTAB, 
      java.lang.String, 
      stdLib.Exclude[
        java.lang.String, 
        chromeDashAppsLib.chromeDashAppsLibStrings.OPEN_AS_REGULAR_TAB | chromeDashAppsLib.chromeDashAppsLibStrings.OPEN_AS_PINNED_TAB | chromeDashAppsLib.chromeDashAppsLibStrings.OPEN_AS_WINDOW | chromeDashAppsLib.chromeDashAppsLibStrings.OPEN_FULL_SCREEN
      ]
    ]
  ] = js.undefined
  /**
    * Whether this app can be disabled or uninstalled by the user.
    */
  var mayDisable: scala.Boolean
  /** The name of this app. */
  var name: java.lang.String
  /**
    * Whether the app declares that it supports offline.
    * @since Chrome 15.
    */
  var offlineEnabled: scala.Boolean
  /**
    * Returns a list of API based permissions.
    */
  var permissions: js.Array[chromeDashAppsLib.chromeNs.runtimeNs.Permission]
  /**
    * A short version of the name of this app.
    * @since Chrome 31.
    */
  var shortName: java.lang.String
  /**
    * The type of this app.
    * @since Chrome 23.
    */
  var `type`: chromeDashAppsLib.chromeDashAppsLibStrings.packaged_app
  /**
    * The update URL of this app.
    * @since Chrome 16.
    */
  var updateUrl: js.UndefOr[java.lang.String] = js.undefined
  /** The version of this app. */
  var version: java.lang.String
  /** This app's version name */
  var versionName: java.lang.String
}

object ExtensionInfo {
  @scala.inline
  def apply(
    description: java.lang.String,
    enabled: scala.Boolean,
    hostPermissions: js.Array[java.lang.String],
    id: java.lang.String,
    installType: chromeDashAppsLib.chromeNs.ToStringLiteral[
      chromeDashAppsLib.Anon_ADMIN, 
      java.lang.String, 
      stdLib.Exclude[
        java.lang.String, 
        chromeDashAppsLib.chromeDashAppsLibStrings.other | chromeDashAppsLib.chromeDashAppsLibStrings.admin | chromeDashAppsLib.chromeDashAppsLibStrings.development | chromeDashAppsLib.chromeDashAppsLibStrings.sideload | chromeDashAppsLib.chromeDashAppsLibStrings.normal
      ]
    ],
    mayDisable: scala.Boolean,
    name: java.lang.String,
    offlineEnabled: scala.Boolean,
    permissions: js.Array[chromeDashAppsLib.chromeNs.runtimeNs.Permission],
    shortName: java.lang.String,
    `type`: chromeDashAppsLib.chromeDashAppsLibStrings.packaged_app,
    version: java.lang.String,
    versionName: java.lang.String,
    appLaunchUrl: java.lang.String = null,
    availableLaunchTypes: js.Array[
      chromeDashAppsLib.chromeNs.ToStringLiteral[
        chromeDashAppsLib.Anon_OPENASPINNEDTAB, 
        java.lang.String, 
        stdLib.Exclude[
          java.lang.String, 
          chromeDashAppsLib.chromeDashAppsLibStrings.OPEN_AS_REGULAR_TAB | chromeDashAppsLib.chromeDashAppsLibStrings.OPEN_AS_PINNED_TAB | chromeDashAppsLib.chromeDashAppsLibStrings.OPEN_AS_WINDOW | chromeDashAppsLib.chromeDashAppsLibStrings.OPEN_FULL_SCREEN
        ]
      ]
    ] = null,
    disabledReason: chromeDashAppsLib.chromeNs.ToStringLiteral[
      chromeDashAppsLib.Anon_PERMISSIONSINCREASE, 
      java.lang.String, 
      stdLib.Exclude[
        java.lang.String, 
        chromeDashAppsLib.chromeDashAppsLibStrings.unknown | chromeDashAppsLib.chromeDashAppsLibStrings.permissions_increase
      ]
    ] = null,
    homepageUrl: java.lang.String = null,
    icons: js.Array[IconInfo] = null,
    isApp: chromeDashAppsLib.chromeDashAppsLibNumbers.`true` = null,
    launchType: chromeDashAppsLib.chromeNs.ToStringLiteral[
      chromeDashAppsLib.Anon_OPENASPINNEDTAB, 
      java.lang.String, 
      stdLib.Exclude[
        java.lang.String, 
        chromeDashAppsLib.chromeDashAppsLibStrings.OPEN_AS_REGULAR_TAB | chromeDashAppsLib.chromeDashAppsLibStrings.OPEN_AS_PINNED_TAB | chromeDashAppsLib.chromeDashAppsLibStrings.OPEN_AS_WINDOW | chromeDashAppsLib.chromeDashAppsLibStrings.OPEN_FULL_SCREEN
      ]
    ] = null,
    updateUrl: java.lang.String = null
  ): ExtensionInfo = {
    val __obj = js.Dynamic.literal(description = description, enabled = enabled, hostPermissions = hostPermissions, id = id, installType = installType.asInstanceOf[js.Any], mayDisable = mayDisable, name = name, offlineEnabled = offlineEnabled, permissions = permissions, shortName = shortName, version = version, versionName = versionName)
    __obj.updateDynamic("type")(`type`)
    if (appLaunchUrl != null) __obj.updateDynamic("appLaunchUrl")(appLaunchUrl)
    if (availableLaunchTypes != null) __obj.updateDynamic("availableLaunchTypes")(availableLaunchTypes)
    if (disabledReason != null) __obj.updateDynamic("disabledReason")(disabledReason.asInstanceOf[js.Any])
    if (homepageUrl != null) __obj.updateDynamic("homepageUrl")(homepageUrl)
    if (icons != null) __obj.updateDynamic("icons")(icons)
    if (isApp != null) __obj.updateDynamic("isApp")(isApp)
    if (launchType != null) __obj.updateDynamic("launchType")(launchType.asInstanceOf[js.Any])
    if (updateUrl != null) __obj.updateDynamic("updateUrl")(updateUrl)
    __obj.asInstanceOf[ExtensionInfo]
  }
}

