package typings.chromeApps.chrome

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// #endregion
// #region chrome.idle
//////////
// Idle //
//////////
/**
  * Use the chrome.idle API to detect when the machine's idle state changes.
  * @requires Permissions: 'idle'
  * @since Chrome 25.
  */
object idle {
  
  /* Rewritten from type alias, can be one of: 
    - typings.chromeApps.chromeAppsStrings.active
    - typings.chromeApps.chromeAppsStrings.idle
    - typings.chromeApps.chromeAppsStrings.locked
  */
  trait IdleState extends StObject
  object IdleState {
    
    @scala.inline
    def active: typings.chromeApps.chromeAppsStrings.active = "active".asInstanceOf[typings.chromeApps.chromeAppsStrings.active]
    
    @scala.inline
    def idle: typings.chromeApps.chromeAppsStrings.idle = "idle".asInstanceOf[typings.chromeApps.chromeAppsStrings.idle]
    
    @scala.inline
    def locked: typings.chromeApps.chromeAppsStrings.locked = "locked".asInstanceOf[typings.chromeApps.chromeAppsStrings.locked]
  }
}
