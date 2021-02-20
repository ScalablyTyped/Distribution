package typings.chromeApps.global.chrome

import typings.chromeApps.anon.DISPLAY
import typings.chromeApps.chrome.ToStringLiteral
import typings.chromeApps.chromeAppsStrings.SYSTEM
import typings.chromeApps.chromeAppsStrings.display_
import typings.chromeApps.chromeAppsStrings.system_
import typings.std.Exclude
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// #endregion
// #region chrome.power
///////////
// Power //
///////////
/**
  * Use the chrome.power API to override the system's power management features.
  * @requires Permissions: 'power'
  * @since Chrome 27.
  */
object power {
  
  /**
    * @enum
    * @property SYSTEM - Prevent the system from sleeping in response to user inactivity.
    * @property DISPLAY - Prevent the display from being turned off or dimmed or the system from sleeping in response to user inactivity.
    */
  object Level {
    
    @JSGlobal("chrome.power.Level")
    @js.native
    val ^ : js.Any = js.native
    
    @JSGlobal("chrome.power.Level.DISPLAY")
    @js.native
    def DISPLAY: display_ = js.native
    @scala.inline
    def DISPLAY_=(x: display_): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DISPLAY")(x.asInstanceOf[js.Any])
    
    @JSGlobal("chrome.power.Level.SYSTEM")
    @js.native
    def SYSTEM: system_ = js.native
    @scala.inline
    def SYSTEM_=(x: system_): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SYSTEM")(x.asInstanceOf[js.Any])
  }
  
  /** Releases a request previously made via requestKeepAwake(). */
  @JSGlobal("chrome.power.releaseKeepAwake")
  @js.native
  def releaseKeepAwake(): Unit = js.native
  
  /**
    * Requests that power management be temporarily disabled.
    * @param level Level describes the degree to which power management should be disabled.
    *              If a request previously made by the same app is still active, it will be replaced by the new request.
    * @see Enum: chrome.power.Level
    */
  @JSGlobal("chrome.power.requestKeepAwake")
  @js.native
  def requestKeepAwake(
    level: ToStringLiteral[
      DISPLAY, 
      /* keyof chrome-apps.anon.DISPLAY */ SYSTEM | typings.chromeApps.chromeAppsStrings.DISPLAY, 
      Exclude[
        /* keyof chrome-apps.anon.DISPLAY */ SYSTEM | typings.chromeApps.chromeAppsStrings.DISPLAY, 
        system_ | display_
      ]
    ]
  ): Unit = js.native
}
