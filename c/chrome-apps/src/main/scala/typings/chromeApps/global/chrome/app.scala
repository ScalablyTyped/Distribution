package typings.chromeApps.global.chrome

import typings.chromeApps.AppView.EmbedRequest
import typings.chromeApps.chrome.app.ChromeAppWindow
import typings.chromeApps.chrome.app.runtime.LaunchData
import typings.chromeApps.chromeAppsStrings.about_page_
import typings.chromeApps.chromeAppsStrings.app_launcher_
import typings.chromeApps.chromeAppsStrings.available
import typings.chromeApps.chromeAppsStrings.background_
import typings.chromeApps.chromeAppsStrings.chrome_internal_
import typings.chromeApps.chromeAppsStrings.command_line_
import typings.chromeApps.chromeAppsStrings.context_menu_
import typings.chromeApps.chromeAppsStrings.enabled_
import typings.chromeApps.chromeAppsStrings.ephemeral_app_
import typings.chromeApps.chromeAppsStrings.extensions_page_
import typings.chromeApps.chromeAppsStrings.file_handler_
import typings.chromeApps.chromeAppsStrings.fullscreen_
import typings.chromeApps.chromeAppsStrings.installed_notification_
import typings.chromeApps.chromeAppsStrings.keyboard_
import typings.chromeApps.chromeAppsStrings.kiosk_
import typings.chromeApps.chromeAppsStrings.load_and_launch_
import typings.chromeApps.chromeAppsStrings.management_api_
import typings.chromeApps.chromeAppsStrings.maximized_
import typings.chromeApps.chromeAppsStrings.minimized_
import typings.chromeApps.chromeAppsStrings.new_note_
import typings.chromeApps.chromeAppsStrings.new_tab_page_
import typings.chromeApps.chromeAppsStrings.normal_
import typings.chromeApps.chromeAppsStrings.reload_
import typings.chromeApps.chromeAppsStrings.restart_
import typings.chromeApps.chromeAppsStrings.system_tray_
import typings.chromeApps.chromeAppsStrings.test_
import typings.chromeApps.chromeAppsStrings.unknown__
import typings.chromeApps.chromeAppsStrings.untracked_
import typings.chromeApps.chromeAppsStrings.url_handler_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

////////////////
// App Window //
////////////////
/**
  * @since Chrome 24.
  * @description
  * Use the chrome.app.window API to create windows.
  * Windows have an optional frame with title bar and size controls.
  * They are not associated with any Chrome browser windows.
  * See the Window State Sample for a demonstration of these options.
  */
object app {
  
  /**
    * @enum
    * @internal
    * @private
    */
  object State {
    
    @JSGlobal("chrome.app._State")
    @js.native
    val ^ : js.Any = js.native
    
    @JSGlobal("chrome.app._State.FULLSCREEN")
    @js.native
    def FULLSCREEN: fullscreen_ = js.native
    @scala.inline
    def FULLSCREEN_=(x: fullscreen_): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("FULLSCREEN")(x.asInstanceOf[js.Any])
    
    @JSGlobal("chrome.app._State.MAXIMIZED")
    @js.native
    def MAXIMIZED: maximized_ = js.native
    @scala.inline
    def MAXIMIZED_=(x: maximized_): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MAXIMIZED")(x.asInstanceOf[js.Any])
    
    @JSGlobal("chrome.app._State.MINIMIZED")
    @js.native
    def MINIMIZED: minimized_ = js.native
    @scala.inline
    def MINIMIZED_=(x: minimized_): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MINIMIZED")(x.asInstanceOf[js.Any])
    
    @JSGlobal("chrome.app._State.NORMAL")
    @js.native
    def NORMAL: normal_ = js.native
    @scala.inline
    def NORMAL_=(x: normal_): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("NORMAL")(x.asInstanceOf[js.Any])
  }
  
  // #endregion
  // #region chrome.app.*
  /////////////////
  // App Runtime //
  /////////////////
  /**
    * @since Chrome 24.
    * @description
    * Use the chrome.app.runtime API to manage the app lifecycle.
    * The app runtime manages app installation, controls the event page,
    * and can shut down the app at anytime.
    */
  object runtime {
    
    /** @enum */
    object ActionType {
      
      @JSGlobal("chrome.app.runtime.ActionType")
      @js.native
      val ^ : js.Any = js.native
      
      @JSGlobal("chrome.app.runtime.ActionType.NEW_NOTE")
      @js.native
      def NEW_NOTE: new_note_ = js.native
      @scala.inline
      def NEW_NOTE_=(x: new_note_): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("NEW_NOTE")(x.asInstanceOf[js.Any])
    }
    
    /** @enum */
    object LaunchSource {
      
      @JSGlobal("chrome.app.runtime.LaunchSource")
      @js.native
      val ^ : js.Any = js.native
      
      @JSGlobal("chrome.app.runtime.LaunchSource.ABOUT_PAGE")
      @js.native
      def ABOUT_PAGE: about_page_ = js.native
      @scala.inline
      def ABOUT_PAGE_=(x: about_page_): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ABOUT_PAGE")(x.asInstanceOf[js.Any])
      
      @JSGlobal("chrome.app.runtime.LaunchSource.APP_LAUNCHER")
      @js.native
      def APP_LAUNCHER: app_launcher_ = js.native
      @scala.inline
      def APP_LAUNCHER_=(x: app_launcher_): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("APP_LAUNCHER")(x.asInstanceOf[js.Any])
      
      @JSGlobal("chrome.app.runtime.LaunchSource.BACKGROUND")
      @js.native
      def BACKGROUND: background_ = js.native
      @scala.inline
      def BACKGROUND_=(x: background_): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("BACKGROUND")(x.asInstanceOf[js.Any])
      
      @JSGlobal("chrome.app.runtime.LaunchSource.CHROME_INTERNAL")
      @js.native
      def CHROME_INTERNAL: chrome_internal_ = js.native
      @scala.inline
      def CHROME_INTERNAL_=(x: chrome_internal_): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CHROME_INTERNAL")(x.asInstanceOf[js.Any])
      
      @JSGlobal("chrome.app.runtime.LaunchSource.COMMAND_LINE")
      @js.native
      def COMMAND_LINE: command_line_ = js.native
      @scala.inline
      def COMMAND_LINE_=(x: command_line_): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("COMMAND_LINE")(x.asInstanceOf[js.Any])
      
      @JSGlobal("chrome.app.runtime.LaunchSource.CONTEXT_MENU")
      @js.native
      def CONTEXT_MENU: context_menu_ = js.native
      @scala.inline
      def CONTEXT_MENU_=(x: context_menu_): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CONTEXT_MENU")(x.asInstanceOf[js.Any])
      
      @JSGlobal("chrome.app.runtime.LaunchSource.EPHEMERAL_APP")
      @js.native
      def EPHEMERAL_APP: ephemeral_app_ = js.native
      @scala.inline
      def EPHEMERAL_APP_=(x: ephemeral_app_): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("EPHEMERAL_APP")(x.asInstanceOf[js.Any])
      
      @JSGlobal("chrome.app.runtime.LaunchSource.EXTENSIONS_PAGE")
      @js.native
      def EXTENSIONS_PAGE: extensions_page_ = js.native
      @scala.inline
      def EXTENSIONS_PAGE_=(x: extensions_page_): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("EXTENSIONS_PAGE")(x.asInstanceOf[js.Any])
      
      @JSGlobal("chrome.app.runtime.LaunchSource.FILE_HANDLER")
      @js.native
      def FILE_HANDLER: file_handler_ = js.native
      @scala.inline
      def FILE_HANDLER_=(x: file_handler_): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("FILE_HANDLER")(x.asInstanceOf[js.Any])
      
      @JSGlobal("chrome.app.runtime.LaunchSource.INSTALLED_NOTIFICATION")
      @js.native
      def INSTALLED_NOTIFICATION: installed_notification_ = js.native
      @scala.inline
      def INSTALLED_NOTIFICATION_=(x: installed_notification_): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("INSTALLED_NOTIFICATION")(x.asInstanceOf[js.Any])
      
      @JSGlobal("chrome.app.runtime.LaunchSource.KEYBOARD")
      @js.native
      def KEYBOARD: keyboard_ = js.native
      @scala.inline
      def KEYBOARD_=(x: keyboard_): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("KEYBOARD")(x.asInstanceOf[js.Any])
      
      @JSGlobal("chrome.app.runtime.LaunchSource.KIOSK")
      @js.native
      def KIOSK: kiosk_ = js.native
      @scala.inline
      def KIOSK_=(x: kiosk_): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("KIOSK")(x.asInstanceOf[js.Any])
      
      @JSGlobal("chrome.app.runtime.LaunchSource.LOAD_AND_LAUNCH")
      @js.native
      def LOAD_AND_LAUNCH: load_and_launch_ = js.native
      @scala.inline
      def LOAD_AND_LAUNCH_=(x: load_and_launch_): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("LOAD_AND_LAUNCH")(x.asInstanceOf[js.Any])
      
      @JSGlobal("chrome.app.runtime.LaunchSource.MANAGEMENT_API")
      @js.native
      def MANAGEMENT_API: management_api_ = js.native
      @scala.inline
      def MANAGEMENT_API_=(x: management_api_): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MANAGEMENT_API")(x.asInstanceOf[js.Any])
      
      @JSGlobal("chrome.app.runtime.LaunchSource.NEW_TAB_PAGE")
      @js.native
      def NEW_TAB_PAGE: new_tab_page_ = js.native
      @scala.inline
      def NEW_TAB_PAGE_=(x: new_tab_page_): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("NEW_TAB_PAGE")(x.asInstanceOf[js.Any])
      
      @JSGlobal("chrome.app.runtime.LaunchSource.RELOAD")
      @js.native
      def RELOAD: reload_ = js.native
      @scala.inline
      def RELOAD_=(x: reload_): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("RELOAD")(x.asInstanceOf[js.Any])
      
      @JSGlobal("chrome.app.runtime.LaunchSource.RESTART")
      @js.native
      def RESTART: restart_ = js.native
      @scala.inline
      def RESTART_=(x: restart_): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("RESTART")(x.asInstanceOf[js.Any])
      
      @JSGlobal("chrome.app.runtime.LaunchSource.SYSTEM_TRAY")
      @js.native
      def SYSTEM_TRAY: system_tray_ = js.native
      @scala.inline
      def SYSTEM_TRAY_=(x: system_tray_): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SYSTEM_TRAY")(x.asInstanceOf[js.Any])
      
      @JSGlobal("chrome.app.runtime.LaunchSource.TEST")
      @js.native
      def TEST: test_ = js.native
      @scala.inline
      def TEST_=(x: test_): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TEST")(x.asInstanceOf[js.Any])
      
      @JSGlobal("chrome.app.runtime.LaunchSource.UNTRACKED")
      @js.native
      def UNTRACKED: untracked_ = js.native
      @scala.inline
      def UNTRACKED_=(x: untracked_): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("UNTRACKED")(x.asInstanceOf[js.Any])
      
      @JSGlobal("chrome.app.runtime.LaunchSource.URL_HANDLER")
      @js.native
      def URL_HANDLER: url_handler_ = js.native
      @scala.inline
      def URL_HANDLER_=(x: url_handler_): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("URL_HANDLER")(x.asInstanceOf[js.Any])
    }
    
    /** @enum */
    object PlayStoreStatus {
      
      @JSGlobal("chrome.app.runtime.PlayStoreStatus")
      @js.native
      val ^ : js.Any = js.native
      
      @JSGlobal("chrome.app.runtime.PlayStoreStatus.AVAILABLE")
      @js.native
      def AVAILABLE: available = js.native
      @scala.inline
      def AVAILABLE_=(x: available): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("AVAILABLE")(x.asInstanceOf[js.Any])
      
      @JSGlobal("chrome.app.runtime.PlayStoreStatus.ENABLED")
      @js.native
      def ENABLED: enabled_ = js.native
      @scala.inline
      def ENABLED_=(x: enabled_): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ENABLED")(x.asInstanceOf[js.Any])
      
      @JSGlobal("chrome.app.runtime.PlayStoreStatus.UNKNOWN")
      @js.native
      def UNKNOWN: unknown__ = js.native
      @scala.inline
      def UNKNOWN_=(x: unknown__): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("UNKNOWN")(x.asInstanceOf[js.Any])
    }
    
    /**
      * Fired when an embedding app requests to embed this app.
      * @since Chrome 43.
      * @see[Documentation]{@link https://developer.chrome.com/apps/tags/appview}
      */
    @JSGlobal("chrome.app.runtime.onEmbedRequested")
    @js.native
    val onEmbedRequested: typings.chromeApps.chrome.events.Event[js.Function1[/* request */ EmbedRequest, Unit]] = js.native
    
    /**
      * Fired when an app is launched from the launcher.
      */
    @JSGlobal("chrome.app.runtime.onLaunched")
    @js.native
    val onLaunched: typings.chromeApps.chrome.events.Event[js.Function1[/* launchData */ LaunchData, Unit]] = js.native
    
    /**
      * Fired at Chrome startup to apps that were running when Chrome last shut down,
      * or when apps have been requested to restart from their previous state for other reasons
      * (e.g. when the user revokes access to an app's retained files the runtime will restart the app).
      * In these situations if apps do not have an onRestarted handler they will be sent an onLaunched event instead.
      */
    @JSGlobal("chrome.app.runtime.onRestarted")
    @js.native
    val onRestarted: typings.chromeApps.chrome.events.Event[js.Function0[Unit]] = js.native
  }
  
  @JSGlobal("chrome.app.window")
  @js.native
  val window: ChromeAppWindow = js.native
}
