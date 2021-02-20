package typings.chromeApps.chrome

import typings.chromeApps.anon.ADMIN
import typings.chromeApps.anon.OPENASPINNEDTAB
import typings.chromeApps.anon.PERMISSIONSINCREASE
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
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// #endregion
// #region chrome.management
////////////////
// Management //
////////////////
/**
  * The chrome.management API provides ways to
  * manage the list of apps
  * that are installed and running.
  */
object management {
  
  /** Information about an installed extension, app, or theme. */
  @js.native
  trait ExtensionInfo extends StObject {
    
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
    implicit class ExtensionInfoMutableBuilder[Self <: ExtensionInfo] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAppLaunchUrl(value: String): Self = StObject.set(x, "appLaunchUrl", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAppLaunchUrlUndefined: Self = StObject.set(x, "appLaunchUrl", js.undefined)
      
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
      ): Self = StObject.set(x, "availableLaunchTypes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAvailableLaunchTypesUndefined: Self = StObject.set(x, "availableLaunchTypes", js.undefined)
      
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
      ): Self = StObject.set(x, "availableLaunchTypes", js.Array(value :_*))
      
      @scala.inline
      def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
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
      ): Self = StObject.set(x, "disabledReason", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisabledReasonUndefined: Self = StObject.set(x, "disabledReason", js.undefined)
      
      @scala.inline
      def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHomepageUrl(value: String): Self = StObject.set(x, "homepageUrl", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHomepageUrlUndefined: Self = StObject.set(x, "homepageUrl", js.undefined)
      
      @scala.inline
      def setHostPermissions(value: js.Array[String]): Self = StObject.set(x, "hostPermissions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHostPermissionsVarargs(value: String*): Self = StObject.set(x, "hostPermissions", js.Array(value :_*))
      
      @scala.inline
      def setIcons(value: js.Array[IconInfo]): Self = StObject.set(x, "icons", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIconsUndefined: Self = StObject.set(x, "icons", js.undefined)
      
      @scala.inline
      def setIconsVarargs(value: IconInfo*): Self = StObject.set(x, "icons", js.Array(value :_*))
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
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
      ): Self = StObject.set(x, "installType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsApp(value: `true`): Self = StObject.set(x, "isApp", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsAppUndefined: Self = StObject.set(x, "isApp", js.undefined)
      
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
      ): Self = StObject.set(x, "launchType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLaunchTypeUndefined: Self = StObject.set(x, "launchType", js.undefined)
      
      @scala.inline
      def setMayDisable(value: Boolean): Self = StObject.set(x, "mayDisable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOfflineEnabled(value: Boolean): Self = StObject.set(x, "offlineEnabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPermissions(value: js.Array[Permission]): Self = StObject.set(x, "permissions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPermissionsVarargs(value: Permission*): Self = StObject.set(x, "permissions", js.Array(value :_*))
      
      @scala.inline
      def setShortName(value: String): Self = StObject.set(x, "shortName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setType(value: packaged_app): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUpdateUrl(value: String): Self = StObject.set(x, "updateUrl", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUpdateUrlUndefined: Self = StObject.set(x, "updateUrl", js.undefined)
      
      @scala.inline
      def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVersionName(value: String): Self = StObject.set(x, "versionName", value.asInstanceOf[js.Any])
    }
  }
  
  /** Information about an icon belonging to an extension, app, or theme. */
  @js.native
  trait IconInfo extends StObject {
    
    /** A number representing the width and height of the icon. Likely values include (but are not limited to) 128, 48, 24, and 16. */
    var size: integer = js.native
    
    /**
      * The URL for this icon image.
      * To display a grayscale version of the icon (to indicate that an extension is disabled, for example),
      * append ?grayscale=true to the URL. */
    var url: String = js.native
  }
  object IconInfo {
    
    @scala.inline
    def apply(size: integer, url: String): IconInfo = {
      val __obj = js.Dynamic.literal(size = size.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[IconInfo]
    }
    
    @scala.inline
    implicit class IconInfoMutableBuilder[Self <: IconInfo] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSize(value: integer): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait UninstallOptions extends StObject {
    
    /**
      * Whether or not a confirm-uninstall dialog should prompt the user. Defaults to false for self uninstalls.
      * If an extension uninstalls another extension, this parameter is ignored and the dialog is always shown.
      */
    var showConfirmDialog: js.UndefOr[Boolean] = js.native
  }
  object UninstallOptions {
    
    @scala.inline
    def apply(): UninstallOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UninstallOptions]
    }
    
    @scala.inline
    implicit class UninstallOptionsMutableBuilder[Self <: UninstallOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setShowConfirmDialog(value: Boolean): Self = StObject.set(x, "showConfirmDialog", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowConfirmDialogUndefined: Self = StObject.set(x, "showConfirmDialog", js.undefined)
    }
  }
}
