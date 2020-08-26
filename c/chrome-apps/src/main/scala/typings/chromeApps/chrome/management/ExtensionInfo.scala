package typings.chromeApps.chrome.management

import typings.chromeApps.anon.ADMIN
import typings.chromeApps.anon.OPENASPINNEDTAB
import typings.chromeApps.anon.PERMISSIONSINCREASE
import typings.chromeApps.chrome.ToStringLiteral
import typings.chromeApps.chrome.runtime.Permission
import typings.chromeApps.chromeAppsBooleans.`true`
import typings.chromeApps.chromeAppsStrings.DEVELOPMENT
import typings.chromeApps.chromeAppsStrings.NORMAL
import typings.chromeApps.chromeAppsStrings.OPEN_AS_PINNED_TAB
import typings.chromeApps.chromeAppsStrings.OPEN_AS_REGULAR_TAB
import typings.chromeApps.chromeAppsStrings.OPEN_AS_WINDOW
import typings.chromeApps.chromeAppsStrings.OPEN_FULL_SCREEN
import typings.chromeApps.chromeAppsStrings.OTHER
import typings.chromeApps.chromeAppsStrings.PERMISSIONS_INCREASE
import typings.chromeApps.chromeAppsStrings.SIDELOAD
import typings.chromeApps.chromeAppsStrings.UNKNOWN
import typings.chromeApps.chromeAppsStrings.admin_
import typings.chromeApps.chromeAppsStrings.development_
import typings.chromeApps.chromeAppsStrings.normal_
import typings.chromeApps.chromeAppsStrings.other_
import typings.chromeApps.chromeAppsStrings.packaged_app
import typings.chromeApps.chromeAppsStrings.permissions_increase_
import typings.chromeApps.chromeAppsStrings.sideload_
import typings.chromeApps.chromeAppsStrings.unknown__
import typings.std.Exclude
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Information about an installed extension, app, or theme. */
@js.native
trait ExtensionInfo extends js.Object {
  /**
    * The launch url.
    */
  var appLaunchUrl: js.UndefOr[String] = js.native
  /**
    * The currently available launch types.
    * @since Chrome 37.
    */
  var availableLaunchTypes: js.UndefOr[
    js.Array[
      ToStringLiteral[
        OPENASPINNEDTAB, 
        /* keyof chrome-apps.anon.OPENASPINNEDTAB */ OPEN_AS_REGULAR_TAB | OPEN_AS_PINNED_TAB | OPEN_AS_WINDOW | OPEN_FULL_SCREEN, 
        Exclude[
          /* keyof chrome-apps.anon.OPENASPINNEDTAB */ OPEN_AS_REGULAR_TAB | OPEN_AS_PINNED_TAB | OPEN_AS_WINDOW | OPEN_FULL_SCREEN, 
          OPEN_AS_REGULAR_TAB | OPEN_AS_PINNED_TAB | OPEN_AS_WINDOW | OPEN_FULL_SCREEN
        ]
      ]
    ]
  ] = js.native
  /**
    * The description of this app.
    */
  var description: String = js.native
  /**
    * A reason the item is disabled.
    * @since Chrome 17.
    * @see enum ExtensionDisabledReason
    */
  var disabledReason: js.UndefOr[
    ToStringLiteral[
      PERMISSIONSINCREASE, 
      /* keyof chrome-apps.anon.PERMISSIONSINCREASE */ UNKNOWN | PERMISSIONS_INCREASE, 
      Exclude[
        /* keyof chrome-apps.anon.PERMISSIONSINCREASE */ UNKNOWN | PERMISSIONS_INCREASE, 
        unknown__ | permissions_increase_
      ]
    ]
  ] = js.native
  /** Whether it is currently enabled or disabled. */
  var enabled: Boolean = js.native
  /**
    * The URL of the homepage of this app.
    * @since Chrome 11.
    */
  var homepageUrl: js.UndefOr[String] = js.native
  /**
    * Returns a list of host based permissions.
    * Permissions regarding url access.
    */
  var hostPermissions: js.Array[String] = js.native
  /**
    * A list of icon information.
    * Note that this just reflects what was declared in the manifest,
    * and the actual image at that url may be larger or smaller than what was declared,
    * so you might consider using explicit width and height attributes on img tags
    * referencing these images. See the manifest documentation on icons for more details.
    */
  var icons: js.UndefOr[js.Array[IconInfo]] = js.native
  /** The extension's unique identifier. */
  var id: String = js.native
  /**
    * How the app was installed.
    * @since Chrome 22.
    */
  var installType: ToStringLiteral[
    ADMIN, 
    /* keyof chrome-apps.anon.ADMIN */ typings.chromeApps.chromeAppsStrings.ADMIN | DEVELOPMENT | NORMAL | SIDELOAD | OTHER, 
    Exclude[
      /* keyof chrome-apps.anon.ADMIN */ typings.chromeApps.chromeAppsStrings.ADMIN | DEVELOPMENT | NORMAL | SIDELOAD | OTHER, 
      other_ | normal_ | development_ | admin_ | sideload_
    ]
  ] = js.native
  /**
    * True if this is an app, which it will be till this is removed.
    * @deprecated since Chrome 33. Please use management.ExtensionInfo.type.
    */
  var isApp: js.UndefOr[`true`] = js.native
  /**
    * The app launch type.
    * @since Chrome 37.
    */
  var launchType: js.UndefOr[
    ToStringLiteral[
      OPENASPINNEDTAB, 
      /* keyof chrome-apps.anon.OPENASPINNEDTAB */ OPEN_AS_REGULAR_TAB | OPEN_AS_PINNED_TAB | OPEN_AS_WINDOW | OPEN_FULL_SCREEN, 
      Exclude[
        /* keyof chrome-apps.anon.OPENASPINNEDTAB */ OPEN_AS_REGULAR_TAB | OPEN_AS_PINNED_TAB | OPEN_AS_WINDOW | OPEN_FULL_SCREEN, 
        OPEN_AS_REGULAR_TAB | OPEN_AS_PINNED_TAB | OPEN_AS_WINDOW | OPEN_FULL_SCREEN
      ]
    ]
  ] = js.native
  /**
    * Whether this app can be disabled or uninstalled by the user.
    */
  var mayDisable: Boolean = js.native
  /** The name of this app. */
  var name: String = js.native
  /**
    * Whether the app declares that it supports offline.
    * @since Chrome 15.
    */
  var offlineEnabled: Boolean = js.native
  /**
    * Returns a list of API based permissions.
    */
  var permissions: js.Array[Permission] = js.native
  /**
    * A short version of the name of this app.
    * @since Chrome 31.
    */
  var shortName: String = js.native
  /**
    * The type of this app.
    * @since Chrome 23.
    */
  var `type`: packaged_app = js.native
  /**
    * The update URL of this app.
    * @since Chrome 16.
    */
  var updateUrl: js.UndefOr[String] = js.native
  /** The version of this app. */
  var version: String = js.native
  /** This app's version name */
  var versionName: String = js.native
}

object ExtensionInfo {
  @scala.inline
  def apply(
    description: String,
    enabled: Boolean,
    hostPermissions: js.Array[String],
    id: String,
    installType: ToStringLiteral[
      ADMIN, 
      /* keyof chrome-apps.anon.ADMIN */ typings.chromeApps.chromeAppsStrings.ADMIN | DEVELOPMENT | NORMAL | SIDELOAD | OTHER, 
      Exclude[
        /* keyof chrome-apps.anon.ADMIN */ typings.chromeApps.chromeAppsStrings.ADMIN | DEVELOPMENT | NORMAL | SIDELOAD | OTHER, 
        other_ | normal_ | development_ | admin_ | sideload_
      ]
    ],
    mayDisable: Boolean,
    name: String,
    offlineEnabled: Boolean,
    permissions: js.Array[Permission],
    shortName: String,
    `type`: packaged_app,
    version: String,
    versionName: String
  ): ExtensionInfo = {
    val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], enabled = enabled.asInstanceOf[js.Any], hostPermissions = hostPermissions.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], installType = installType.asInstanceOf[js.Any], mayDisable = mayDisable.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], offlineEnabled = offlineEnabled.asInstanceOf[js.Any], permissions = permissions.asInstanceOf[js.Any], shortName = shortName.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any], versionName = versionName.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExtensionInfo]
  }
  @scala.inline
  implicit class ExtensionInfoOps[Self <: ExtensionInfo] (val x: Self) extends AnyVal {
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
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    @scala.inline
    def setEnabled(value: Boolean): Self = this.set("enabled", value.asInstanceOf[js.Any])
    @scala.inline
    def setHostPermissionsVarargs(value: String*): Self = this.set("hostPermissions", js.Array(value :_*))
    @scala.inline
    def setHostPermissions(value: js.Array[String]): Self = this.set("hostPermissions", value.asInstanceOf[js.Any])
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def setInstallType(
      value: ToStringLiteral[
          ADMIN, 
          /* keyof chrome-apps.anon.ADMIN */ typings.chromeApps.chromeAppsStrings.ADMIN | DEVELOPMENT | NORMAL | SIDELOAD | OTHER, 
          Exclude[
            /* keyof chrome-apps.anon.ADMIN */ typings.chromeApps.chromeAppsStrings.ADMIN | DEVELOPMENT | NORMAL | SIDELOAD | OTHER, 
            other_ | normal_ | development_ | admin_ | sideload_
          ]
        ]
    ): Self = this.set("installType", value.asInstanceOf[js.Any])
    @scala.inline
    def setMayDisable(value: Boolean): Self = this.set("mayDisable", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setOfflineEnabled(value: Boolean): Self = this.set("offlineEnabled", value.asInstanceOf[js.Any])
    @scala.inline
    def setPermissionsVarargs(value: Permission*): Self = this.set("permissions", js.Array(value :_*))
    @scala.inline
    def setPermissions(value: js.Array[Permission]): Self = this.set("permissions", value.asInstanceOf[js.Any])
    @scala.inline
    def setShortName(value: String): Self = this.set("shortName", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: packaged_app): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def setVersion(value: String): Self = this.set("version", value.asInstanceOf[js.Any])
    @scala.inline
    def setVersionName(value: String): Self = this.set("versionName", value.asInstanceOf[js.Any])
    @scala.inline
    def setAppLaunchUrl(value: String): Self = this.set("appLaunchUrl", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAppLaunchUrl: Self = this.set("appLaunchUrl", js.undefined)
    @scala.inline
    def setAvailableLaunchTypesVarargs(
      value: (ToStringLiteral[
          OPENASPINNEDTAB, 
          /* keyof chrome-apps.anon.OPENASPINNEDTAB */ OPEN_AS_REGULAR_TAB | OPEN_AS_PINNED_TAB | OPEN_AS_WINDOW | OPEN_FULL_SCREEN, 
          Exclude[
            /* keyof chrome-apps.anon.OPENASPINNEDTAB */ OPEN_AS_REGULAR_TAB | OPEN_AS_PINNED_TAB | OPEN_AS_WINDOW | OPEN_FULL_SCREEN, 
            OPEN_AS_REGULAR_TAB | OPEN_AS_PINNED_TAB | OPEN_AS_WINDOW | OPEN_FULL_SCREEN
          ]
        ])*
    ): Self = this.set("availableLaunchTypes", js.Array(value :_*))
    @scala.inline
    def setAvailableLaunchTypes(
      value: js.Array[
          ToStringLiteral[
            OPENASPINNEDTAB, 
            /* keyof chrome-apps.anon.OPENASPINNEDTAB */ OPEN_AS_REGULAR_TAB | OPEN_AS_PINNED_TAB | OPEN_AS_WINDOW | OPEN_FULL_SCREEN, 
            Exclude[
              /* keyof chrome-apps.anon.OPENASPINNEDTAB */ OPEN_AS_REGULAR_TAB | OPEN_AS_PINNED_TAB | OPEN_AS_WINDOW | OPEN_FULL_SCREEN, 
              OPEN_AS_REGULAR_TAB | OPEN_AS_PINNED_TAB | OPEN_AS_WINDOW | OPEN_FULL_SCREEN
            ]
          ]
        ]
    ): Self = this.set("availableLaunchTypes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAvailableLaunchTypes: Self = this.set("availableLaunchTypes", js.undefined)
    @scala.inline
    def setDisabledReason(
      value: ToStringLiteral[
          PERMISSIONSINCREASE, 
          /* keyof chrome-apps.anon.PERMISSIONSINCREASE */ UNKNOWN | PERMISSIONS_INCREASE, 
          Exclude[
            /* keyof chrome-apps.anon.PERMISSIONSINCREASE */ UNKNOWN | PERMISSIONS_INCREASE, 
            unknown__ | permissions_increase_
          ]
        ]
    ): Self = this.set("disabledReason", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisabledReason: Self = this.set("disabledReason", js.undefined)
    @scala.inline
    def setHomepageUrl(value: String): Self = this.set("homepageUrl", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHomepageUrl: Self = this.set("homepageUrl", js.undefined)
    @scala.inline
    def setIconsVarargs(value: IconInfo*): Self = this.set("icons", js.Array(value :_*))
    @scala.inline
    def setIcons(value: js.Array[IconInfo]): Self = this.set("icons", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIcons: Self = this.set("icons", js.undefined)
    @scala.inline
    def setIsApp(value: `true`): Self = this.set("isApp", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsApp: Self = this.set("isApp", js.undefined)
    @scala.inline
    def setLaunchType(
      value: ToStringLiteral[
          OPENASPINNEDTAB, 
          /* keyof chrome-apps.anon.OPENASPINNEDTAB */ OPEN_AS_REGULAR_TAB | OPEN_AS_PINNED_TAB | OPEN_AS_WINDOW | OPEN_FULL_SCREEN, 
          Exclude[
            /* keyof chrome-apps.anon.OPENASPINNEDTAB */ OPEN_AS_REGULAR_TAB | OPEN_AS_PINNED_TAB | OPEN_AS_WINDOW | OPEN_FULL_SCREEN, 
            OPEN_AS_REGULAR_TAB | OPEN_AS_PINNED_TAB | OPEN_AS_WINDOW | OPEN_FULL_SCREEN
          ]
        ]
    ): Self = this.set("launchType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLaunchType: Self = this.set("launchType", js.undefined)
    @scala.inline
    def setUpdateUrl(value: String): Self = this.set("updateUrl", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUpdateUrl: Self = this.set("updateUrl", js.undefined)
  }
  
}

