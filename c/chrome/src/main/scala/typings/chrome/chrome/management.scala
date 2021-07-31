package typings.chrome.chrome

import typings.chrome.chrome.events.Event
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

////////////////////
// Management
////////////////////
/**
  * The chrome.management API provides ways to manage the list of extensions/apps that are installed and running. It is particularly useful for extensions that override the built-in New Tab page.
  * Permissions:  "management"
  * @since Chrome 8.
  */
object management {
  
  trait ExtensionInfo extends StObject {
    
    /** Optional. The launch url (only present for apps). */
    var appLaunchUrl: js.UndefOr[String] = js.undefined
    
    /**
      * Optional.
      * The currently available launch types (only present for apps).
      * @since Chrome 37.
      */
    var availableLaunchTypes: js.UndefOr[js.Array[String]] = js.undefined
    
    /**
      * The description of this extension, app, or theme.
      * @since Chrome 9.
      */
    var description: String
    
    /**
      * Optional.
      * A reason the item is disabled.
      * @since Chrome 17.
      */
    var disabledReason: js.UndefOr[String] = js.undefined
    
    /** Whether it is currently enabled or disabled. */
    var enabled: Boolean
    
    /**
      * Optional.
      * The URL of the homepage of this extension, app, or theme.
      * @since Chrome 11.
      */
    var homepageUrl: js.UndefOr[String] = js.undefined
    
    /**
      * Returns a list of host based permissions.
      * @since Chrome 9.
      */
    var hostPermissions: js.Array[String]
    
    /**
      * Optional.
      * A list of icon information. Note that this just reflects what was declared in the manifest, and the actual image at that url may be larger or smaller than what was declared, so you might consider using explicit width and height attributes on img tags referencing these images. See the manifest documentation on icons for more details.
      */
    var icons: js.UndefOr[js.Array[IconInfo]] = js.undefined
    
    /** The extension's unique identifier. */
    var id: String
    
    /**
      * How the extension was installed.
      * @since Chrome 22.
      */
    var installType: String
    
    /**
      * True if this is an app.
      * @deprecated since Chrome 33. Please use management.ExtensionInfo.type.
      */
    var isApp: Boolean
    
    /**
      * Optional.
      * The app launch type (only present for apps).
      * @since Chrome 37.
      */
    var launchType: js.UndefOr[String] = js.undefined
    
    /**
      * Whether this extension can be disabled or uninstalled by the user.
      * @since Chrome 12.
      */
    var mayDisable: Boolean
    
    /** The name of this extension, app, or theme. */
    var name: String
    
    /**
      * Whether the extension, app, or theme declares that it supports offline.
      * @since Chrome 15.
      */
    var offlineEnabled: Boolean
    
    /** The url for the item's options page, if it has one. */
    var optionsUrl: String
    
    /**
      * Returns a list of API based permissions.
      * @since Chrome 9.
      */
    var permissions: js.Array[String]
    
    /**
      * A short version of the name of this extension, app, or theme.
      * @since Chrome 31.
      */
    var shortName: String
    
    /**
      * The type of this extension, app, or theme.
      * @since Chrome 23.
      */
    var `type`: String
    
    /**
      * Optional.
      * The update URL of this extension, app, or theme.
      * @since Chrome 16.
      */
    var updateUrl: js.UndefOr[String] = js.undefined
    
    /** The version of this extension, app, or theme. */
    var version: String
  }
  object ExtensionInfo {
    
    @scala.inline
    def apply(
      description: String,
      enabled: Boolean,
      hostPermissions: js.Array[String],
      id: String,
      installType: String,
      isApp: Boolean,
      mayDisable: Boolean,
      name: String,
      offlineEnabled: Boolean,
      optionsUrl: String,
      permissions: js.Array[String],
      shortName: String,
      `type`: String,
      version: String
    ): ExtensionInfo = {
      val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], enabled = enabled.asInstanceOf[js.Any], hostPermissions = hostPermissions.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], installType = installType.asInstanceOf[js.Any], isApp = isApp.asInstanceOf[js.Any], mayDisable = mayDisable.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], offlineEnabled = offlineEnabled.asInstanceOf[js.Any], optionsUrl = optionsUrl.asInstanceOf[js.Any], permissions = permissions.asInstanceOf[js.Any], shortName = shortName.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
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
      def setAvailableLaunchTypes(value: js.Array[String]): Self = StObject.set(x, "availableLaunchTypes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAvailableLaunchTypesUndefined: Self = StObject.set(x, "availableLaunchTypes", js.undefined)
      
      @scala.inline
      def setAvailableLaunchTypesVarargs(value: String*): Self = StObject.set(x, "availableLaunchTypes", js.Array(value :_*))
      
      @scala.inline
      def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisabledReason(value: String): Self = StObject.set(x, "disabledReason", value.asInstanceOf[js.Any])
      
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
      def setInstallType(value: String): Self = StObject.set(x, "installType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsApp(value: Boolean): Self = StObject.set(x, "isApp", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLaunchType(value: String): Self = StObject.set(x, "launchType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLaunchTypeUndefined: Self = StObject.set(x, "launchType", js.undefined)
      
      @scala.inline
      def setMayDisable(value: Boolean): Self = StObject.set(x, "mayDisable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOfflineEnabled(value: Boolean): Self = StObject.set(x, "offlineEnabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOptionsUrl(value: String): Self = StObject.set(x, "optionsUrl", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPermissions(value: js.Array[String]): Self = StObject.set(x, "permissions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPermissionsVarargs(value: String*): Self = StObject.set(x, "permissions", js.Array(value :_*))
      
      @scala.inline
      def setShortName(value: String): Self = StObject.set(x, "shortName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUpdateUrl(value: String): Self = StObject.set(x, "updateUrl", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUpdateUrlUndefined: Self = StObject.set(x, "updateUrl", js.undefined)
      
      @scala.inline
      def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    }
  }
  
  trait IconInfo extends StObject {
    
    /** A number representing the width and height of the icon. Likely values include (but are not limited to) 128, 48, 24, and 16. */
    var size: Double
    
    /** The URL for this icon image. To display a grayscale version of the icon (to indicate that an extension is disabled, for example), append ?grayscale=true to the URL. */
    var url: String
  }
  object IconInfo {
    
    @scala.inline
    def apply(size: Double, url: String): IconInfo = {
      val __obj = js.Dynamic.literal(size = size.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[IconInfo]
    }
    
    @scala.inline
    implicit class IconInfoMutableBuilder[Self <: IconInfo] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
  
  type ManagementDisabledEvent = Event[js.Function1[/* info */ ExtensionInfo, Unit]]
  
  type ManagementEnabledEvent = Event[js.Function1[/* info */ ExtensionInfo, Unit]]
  
  type ManagementInstalledEvent = Event[js.Function1[/* info */ ExtensionInfo, Unit]]
  
  type ManagementUninstalledEvent = Event[js.Function1[/* id */ String, Unit]]
  
  trait UninstallOptions extends StObject {
    
    /**
      * Optional.
      * Whether or not a confirm-uninstall dialog should prompt the user. Defaults to false for self uninstalls. If an extension uninstalls another extension, this parameter is ignored and the dialog is always shown.
      */
    var showConfirmDialog: js.UndefOr[Boolean] = js.undefined
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
