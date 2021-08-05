package typings.chrome.chrome

import typings.chrome.chrome.events.Event
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

////////////////////
// Idle
////////////////////
/**
  * Use the chrome.idle API to detect when the machine's idle state changes.
  * Permissions:  "idle"
  * @since Chrome 6.
  */
object idle {
  
  /* Rewritten from type alias, can be one of: 
    - typings.chrome.chromeStrings.active
    - typings.chrome.chromeStrings.idle
    - typings.chrome.chromeStrings.locked
  */
  trait IdleState extends StObject
  object IdleState {
    
    inline def active: typings.chrome.chromeStrings.active = "active".asInstanceOf[typings.chrome.chromeStrings.active]
    
    inline def idle: typings.chrome.chromeStrings.idle = "idle".asInstanceOf[typings.chrome.chromeStrings.idle]
    
    inline def locked: typings.chrome.chromeStrings.locked = "locked".asInstanceOf[typings.chrome.chromeStrings.locked]
  }
  
  type IdleStateChangedEvent = Event[js.Function1[/* newState */ IdleState, Unit]]
}
