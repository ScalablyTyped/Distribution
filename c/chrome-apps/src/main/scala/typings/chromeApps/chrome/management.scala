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
import typings.chromeApps.chromeAppsStrings.packaged_app
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
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
  trait ExtensionInfo extends StObject {
    
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
            OPENASPINNEDTAB, 
            /* keyof chrome-apps.anon.OPENASPINNEDTAB */ OPEN_AS_REGULAR_TAB | OPEN_AS_PINNED_TAB | OPEN_AS_WINDOW | OPEN_FULL_SCREEN, 
            /* import warning: importer.ImportType#apply Failed type conversion: keyof {  OPEN_AS_REGULAR_TAB :'OPEN_AS_REGULAR_TAB',   OPEN_AS_PINNED_TAB :'OPEN_AS_PINNED_TAB',   OPEN_AS_WINDOW :'OPEN_AS_WINDOW',   OPEN_FULL_SCREEN :'OPEN_FULL_SCREEN'} extends keyof {  OPEN_AS_REGULAR_TAB :'OPEN_AS_REGULAR_TAB',   OPEN_AS_PINNED_TAB :'OPEN_AS_PINNED_TAB',   OPEN_AS_WINDOW :'OPEN_AS_WINDOW',   OPEN_FULL_SCREEN :'OPEN_FULL_SCREEN'} ? std.Exclude<keyof {  OPEN_AS_REGULAR_TAB :'OPEN_AS_REGULAR_TAB',   OPEN_AS_PINNED_TAB :'OPEN_AS_PINNED_TAB',   OPEN_AS_WINDOW :'OPEN_AS_WINDOW',   OPEN_FULL_SCREEN :'OPEN_FULL_SCREEN'}, 'OPEN_AS_REGULAR_TAB' | 'OPEN_AS_PINNED_TAB' | 'OPEN_AS_WINDOW' | 'OPEN_FULL_SCREEN'> : never */ js.Any
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
        ToStringLiteral[
          PERMISSIONSINCREASE, 
          /* keyof chrome-apps.anon.PERMISSIONSINCREASE */ UNKNOWN | PERMISSIONS_INCREASE, 
          /* import warning: importer.ImportType#apply Failed type conversion: keyof {  UNKNOWN :'unknown',   PERMISSIONS_INCREASE :'permissions_increase'} extends keyof {  UNKNOWN :'unknown',   PERMISSIONS_INCREASE :'permissions_increase'} ? std.Exclude<keyof {  UNKNOWN :'unknown',   PERMISSIONS_INCREASE :'permissions_increase'}, 'unknown' | 'permissions_increase'> : never */ js.Any
        ]
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
    var installType: ToStringLiteral[
        ADMIN, 
        /* keyof chrome-apps.anon.ADMIN */ typings.chromeApps.chromeAppsStrings.ADMIN | DEVELOPMENT | NORMAL | SIDELOAD | OTHER, 
        /* import warning: importer.ImportType#apply Failed type conversion: keyof {  ADMIN :'admin',   DEVELOPMENT :'development',   NORMAL :'normal',   SIDELOAD :'sideload',   OTHER :'other'} extends keyof {  ADMIN :'admin',   DEVELOPMENT :'development',   NORMAL :'normal',   SIDELOAD :'sideload',   OTHER :'other'} ? std.Exclude<keyof {  ADMIN :'admin',   DEVELOPMENT :'development',   NORMAL :'normal',   SIDELOAD :'sideload',   OTHER :'other'}, 'other' | 'normal' | 'development' | 'admin' | 'sideload'> : never */ js.Any
      ]
    
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
          OPENASPINNEDTAB, 
          /* keyof chrome-apps.anon.OPENASPINNEDTAB */ OPEN_AS_REGULAR_TAB | OPEN_AS_PINNED_TAB | OPEN_AS_WINDOW | OPEN_FULL_SCREEN, 
          /* import warning: importer.ImportType#apply Failed type conversion: keyof {  OPEN_AS_REGULAR_TAB :'OPEN_AS_REGULAR_TAB',   OPEN_AS_PINNED_TAB :'OPEN_AS_PINNED_TAB',   OPEN_AS_WINDOW :'OPEN_AS_WINDOW',   OPEN_FULL_SCREEN :'OPEN_FULL_SCREEN'} extends keyof {  OPEN_AS_REGULAR_TAB :'OPEN_AS_REGULAR_TAB',   OPEN_AS_PINNED_TAB :'OPEN_AS_PINNED_TAB',   OPEN_AS_WINDOW :'OPEN_AS_WINDOW',   OPEN_FULL_SCREEN :'OPEN_FULL_SCREEN'} ? std.Exclude<keyof {  OPEN_AS_REGULAR_TAB :'OPEN_AS_REGULAR_TAB',   OPEN_AS_PINNED_TAB :'OPEN_AS_PINNED_TAB',   OPEN_AS_WINDOW :'OPEN_AS_WINDOW',   OPEN_FULL_SCREEN :'OPEN_FULL_SCREEN'}, 'OPEN_AS_REGULAR_TAB' | 'OPEN_AS_PINNED_TAB' | 'OPEN_AS_WINDOW' | 'OPEN_FULL_SCREEN'> : never */ js.Any
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
    
    inline def apply(
      description: String,
      enabled: Boolean,
      hostPermissions: js.Array[String],
      id: String,
      installType: ToStringLiteral[
          ADMIN, 
          /* keyof chrome-apps.anon.ADMIN */ typings.chromeApps.chromeAppsStrings.ADMIN | DEVELOPMENT | NORMAL | SIDELOAD | OTHER, 
          /* import warning: importer.ImportType#apply Failed type conversion: keyof {  ADMIN :'admin',   DEVELOPMENT :'development',   NORMAL :'normal',   SIDELOAD :'sideload',   OTHER :'other'} extends keyof {  ADMIN :'admin',   DEVELOPMENT :'development',   NORMAL :'normal',   SIDELOAD :'sideload',   OTHER :'other'} ? std.Exclude<keyof {  ADMIN :'admin',   DEVELOPMENT :'development',   NORMAL :'normal',   SIDELOAD :'sideload',   OTHER :'other'}, 'other' | 'normal' | 'development' | 'admin' | 'sideload'> : never */ js.Any
        ],
      mayDisable: Boolean,
      name: String,
      offlineEnabled: Boolean,
      permissions: js.Array[Permission],
      shortName: String,
      version: String,
      versionName: String
    ): ExtensionInfo = {
      val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], enabled = enabled.asInstanceOf[js.Any], hostPermissions = hostPermissions.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], installType = installType.asInstanceOf[js.Any], mayDisable = mayDisable.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], offlineEnabled = offlineEnabled.asInstanceOf[js.Any], permissions = permissions.asInstanceOf[js.Any], shortName = shortName.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any], versionName = versionName.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("packaged_app")
      __obj.asInstanceOf[ExtensionInfo]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ExtensionInfo] (val x: Self) extends AnyVal {
      
      inline def setAppLaunchUrl(value: String): Self = StObject.set(x, "appLaunchUrl", value.asInstanceOf[js.Any])
      
      inline def setAppLaunchUrlUndefined: Self = StObject.set(x, "appLaunchUrl", js.undefined)
      
      inline def setAvailableLaunchTypes(
        value: js.Array[
              ToStringLiteral[
                OPENASPINNEDTAB, 
                /* keyof chrome-apps.anon.OPENASPINNEDTAB */ OPEN_AS_REGULAR_TAB | OPEN_AS_PINNED_TAB | OPEN_AS_WINDOW | OPEN_FULL_SCREEN, 
                /* import warning: importer.ImportType#apply Failed type conversion: keyof {  OPEN_AS_REGULAR_TAB :'OPEN_AS_REGULAR_TAB',   OPEN_AS_PINNED_TAB :'OPEN_AS_PINNED_TAB',   OPEN_AS_WINDOW :'OPEN_AS_WINDOW',   OPEN_FULL_SCREEN :'OPEN_FULL_SCREEN'} extends keyof {  OPEN_AS_REGULAR_TAB :'OPEN_AS_REGULAR_TAB',   OPEN_AS_PINNED_TAB :'OPEN_AS_PINNED_TAB',   OPEN_AS_WINDOW :'OPEN_AS_WINDOW',   OPEN_FULL_SCREEN :'OPEN_FULL_SCREEN'} ? std.Exclude<keyof {  OPEN_AS_REGULAR_TAB :'OPEN_AS_REGULAR_TAB',   OPEN_AS_PINNED_TAB :'OPEN_AS_PINNED_TAB',   OPEN_AS_WINDOW :'OPEN_AS_WINDOW',   OPEN_FULL_SCREEN :'OPEN_FULL_SCREEN'}, 'OPEN_AS_REGULAR_TAB' | 'OPEN_AS_PINNED_TAB' | 'OPEN_AS_WINDOW' | 'OPEN_FULL_SCREEN'> : never */ js.Any
              ]
            ]
      ): Self = StObject.set(x, "availableLaunchTypes", value.asInstanceOf[js.Any])
      
      inline def setAvailableLaunchTypesUndefined: Self = StObject.set(x, "availableLaunchTypes", js.undefined)
      
      inline def setAvailableLaunchTypesVarargs(
        value: (ToStringLiteral[
              OPENASPINNEDTAB, 
              /* keyof chrome-apps.anon.OPENASPINNEDTAB */ OPEN_AS_REGULAR_TAB | OPEN_AS_PINNED_TAB | OPEN_AS_WINDOW | OPEN_FULL_SCREEN, 
              /* import warning: importer.ImportType#apply Failed type conversion: keyof {  OPEN_AS_REGULAR_TAB :'OPEN_AS_REGULAR_TAB',   OPEN_AS_PINNED_TAB :'OPEN_AS_PINNED_TAB',   OPEN_AS_WINDOW :'OPEN_AS_WINDOW',   OPEN_FULL_SCREEN :'OPEN_FULL_SCREEN'} extends keyof {  OPEN_AS_REGULAR_TAB :'OPEN_AS_REGULAR_TAB',   OPEN_AS_PINNED_TAB :'OPEN_AS_PINNED_TAB',   OPEN_AS_WINDOW :'OPEN_AS_WINDOW',   OPEN_FULL_SCREEN :'OPEN_FULL_SCREEN'} ? std.Exclude<keyof {  OPEN_AS_REGULAR_TAB :'OPEN_AS_REGULAR_TAB',   OPEN_AS_PINNED_TAB :'OPEN_AS_PINNED_TAB',   OPEN_AS_WINDOW :'OPEN_AS_WINDOW',   OPEN_FULL_SCREEN :'OPEN_FULL_SCREEN'}, 'OPEN_AS_REGULAR_TAB' | 'OPEN_AS_PINNED_TAB' | 'OPEN_AS_WINDOW' | 'OPEN_FULL_SCREEN'> : never */ js.Any
            ])*
      ): Self = StObject.set(x, "availableLaunchTypes", js.Array(value*))
      
      inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      inline def setDisabledReason(
        value: ToStringLiteral[
              PERMISSIONSINCREASE, 
              /* keyof chrome-apps.anon.PERMISSIONSINCREASE */ UNKNOWN | PERMISSIONS_INCREASE, 
              /* import warning: importer.ImportType#apply Failed type conversion: keyof {  UNKNOWN :'unknown',   PERMISSIONS_INCREASE :'permissions_increase'} extends keyof {  UNKNOWN :'unknown',   PERMISSIONS_INCREASE :'permissions_increase'} ? std.Exclude<keyof {  UNKNOWN :'unknown',   PERMISSIONS_INCREASE :'permissions_increase'}, 'unknown' | 'permissions_increase'> : never */ js.Any
            ]
      ): Self = StObject.set(x, "disabledReason", value.asInstanceOf[js.Any])
      
      inline def setDisabledReasonUndefined: Self = StObject.set(x, "disabledReason", js.undefined)
      
      inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
      
      inline def setHomepageUrl(value: String): Self = StObject.set(x, "homepageUrl", value.asInstanceOf[js.Any])
      
      inline def setHomepageUrlUndefined: Self = StObject.set(x, "homepageUrl", js.undefined)
      
      inline def setHostPermissions(value: js.Array[String]): Self = StObject.set(x, "hostPermissions", value.asInstanceOf[js.Any])
      
      inline def setHostPermissionsVarargs(value: String*): Self = StObject.set(x, "hostPermissions", js.Array(value*))
      
      inline def setIcons(value: js.Array[IconInfo]): Self = StObject.set(x, "icons", value.asInstanceOf[js.Any])
      
      inline def setIconsUndefined: Self = StObject.set(x, "icons", js.undefined)
      
      inline def setIconsVarargs(value: IconInfo*): Self = StObject.set(x, "icons", js.Array(value*))
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setInstallType(
        value: ToStringLiteral[
              ADMIN, 
              /* keyof chrome-apps.anon.ADMIN */ typings.chromeApps.chromeAppsStrings.ADMIN | DEVELOPMENT | NORMAL | SIDELOAD | OTHER, 
              /* import warning: importer.ImportType#apply Failed type conversion: keyof {  ADMIN :'admin',   DEVELOPMENT :'development',   NORMAL :'normal',   SIDELOAD :'sideload',   OTHER :'other'} extends keyof {  ADMIN :'admin',   DEVELOPMENT :'development',   NORMAL :'normal',   SIDELOAD :'sideload',   OTHER :'other'} ? std.Exclude<keyof {  ADMIN :'admin',   DEVELOPMENT :'development',   NORMAL :'normal',   SIDELOAD :'sideload',   OTHER :'other'}, 'other' | 'normal' | 'development' | 'admin' | 'sideload'> : never */ js.Any
            ]
      ): Self = StObject.set(x, "installType", value.asInstanceOf[js.Any])
      
      inline def setIsApp(value: `true`): Self = StObject.set(x, "isApp", value.asInstanceOf[js.Any])
      
      inline def setIsAppUndefined: Self = StObject.set(x, "isApp", js.undefined)
      
      inline def setLaunchType(
        value: ToStringLiteral[
              OPENASPINNEDTAB, 
              /* keyof chrome-apps.anon.OPENASPINNEDTAB */ OPEN_AS_REGULAR_TAB | OPEN_AS_PINNED_TAB | OPEN_AS_WINDOW | OPEN_FULL_SCREEN, 
              /* import warning: importer.ImportType#apply Failed type conversion: keyof {  OPEN_AS_REGULAR_TAB :'OPEN_AS_REGULAR_TAB',   OPEN_AS_PINNED_TAB :'OPEN_AS_PINNED_TAB',   OPEN_AS_WINDOW :'OPEN_AS_WINDOW',   OPEN_FULL_SCREEN :'OPEN_FULL_SCREEN'} extends keyof {  OPEN_AS_REGULAR_TAB :'OPEN_AS_REGULAR_TAB',   OPEN_AS_PINNED_TAB :'OPEN_AS_PINNED_TAB',   OPEN_AS_WINDOW :'OPEN_AS_WINDOW',   OPEN_FULL_SCREEN :'OPEN_FULL_SCREEN'} ? std.Exclude<keyof {  OPEN_AS_REGULAR_TAB :'OPEN_AS_REGULAR_TAB',   OPEN_AS_PINNED_TAB :'OPEN_AS_PINNED_TAB',   OPEN_AS_WINDOW :'OPEN_AS_WINDOW',   OPEN_FULL_SCREEN :'OPEN_FULL_SCREEN'}, 'OPEN_AS_REGULAR_TAB' | 'OPEN_AS_PINNED_TAB' | 'OPEN_AS_WINDOW' | 'OPEN_FULL_SCREEN'> : never */ js.Any
            ]
      ): Self = StObject.set(x, "launchType", value.asInstanceOf[js.Any])
      
      inline def setLaunchTypeUndefined: Self = StObject.set(x, "launchType", js.undefined)
      
      inline def setMayDisable(value: Boolean): Self = StObject.set(x, "mayDisable", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setOfflineEnabled(value: Boolean): Self = StObject.set(x, "offlineEnabled", value.asInstanceOf[js.Any])
      
      inline def setPermissions(value: js.Array[Permission]): Self = StObject.set(x, "permissions", value.asInstanceOf[js.Any])
      
      inline def setPermissionsVarargs(value: Permission*): Self = StObject.set(x, "permissions", js.Array(value*))
      
      inline def setShortName(value: String): Self = StObject.set(x, "shortName", value.asInstanceOf[js.Any])
      
      inline def setType(value: packaged_app): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setUpdateUrl(value: String): Self = StObject.set(x, "updateUrl", value.asInstanceOf[js.Any])
      
      inline def setUpdateUrlUndefined: Self = StObject.set(x, "updateUrl", js.undefined)
      
      inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
      
      inline def setVersionName(value: String): Self = StObject.set(x, "versionName", value.asInstanceOf[js.Any])
    }
  }
  
  /** Information about an icon belonging to an extension, app, or theme. */
  trait IconInfo extends StObject {
    
    /** A number representing the width and height of the icon. Likely values include (but are not limited to) 128, 48, 24, and 16. */
    var size: integer
    
    /**
      * The URL for this icon image.
      * To display a grayscale version of the icon (to indicate that an extension is disabled, for example),
      * append ?grayscale=true to the URL. */
    var url: String
  }
  object IconInfo {
    
    inline def apply(size: integer, url: String): IconInfo = {
      val __obj = js.Dynamic.literal(size = size.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[IconInfo]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IconInfo] (val x: Self) extends AnyVal {
      
      inline def setSize(value: integer): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
  
  trait UninstallOptions extends StObject {
    
    /**
      * Whether or not a confirm-uninstall dialog should prompt the user. Defaults to false for self uninstalls.
      * If an extension uninstalls another extension, this parameter is ignored and the dialog is always shown.
      */
    var showConfirmDialog: js.UndefOr[Boolean] = js.undefined
  }
  object UninstallOptions {
    
    inline def apply(): UninstallOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UninstallOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: UninstallOptions] (val x: Self) extends AnyVal {
      
      inline def setShowConfirmDialog(value: Boolean): Self = StObject.set(x, "showConfirmDialog", value.asInstanceOf[js.Any])
      
      inline def setShowConfirmDialogUndefined: Self = StObject.set(x, "showConfirmDialog", js.undefined)
    }
  }
}
