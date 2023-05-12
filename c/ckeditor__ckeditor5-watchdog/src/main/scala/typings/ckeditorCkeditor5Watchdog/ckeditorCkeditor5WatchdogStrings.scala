package typings.ckeditorCkeditor5Watchdog

import typings.ckeditorCkeditor5Watchdog.srcWatchdogMod.WatchdogState
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ckeditorCkeditor5WatchdogStrings {
  
  @js.native
  sealed trait crashed
    extends StObject
       with WatchdogState
  inline def crashed: crashed = "crashed".asInstanceOf[crashed]
  
  @js.native
  sealed trait crashedPermanently
    extends StObject
       with WatchdogState
  inline def crashedPermanently: crashedPermanently = "crashedPermanently".asInstanceOf[crashedPermanently]
  
  @js.native
  sealed trait destroyed
    extends StObject
       with WatchdogState
  inline def destroyed: destroyed = "destroyed".asInstanceOf[destroyed]
  
  @js.native
  sealed trait editor extends StObject
  inline def editor: editor = "editor".asInstanceOf[editor]
  
  @js.native
  sealed trait error extends StObject
  inline def error: error = "error".asInstanceOf[error]
  
  @js.native
  sealed trait initializing
    extends StObject
       with WatchdogState
  inline def initializing: initializing = "initializing".asInstanceOf[initializing]
  
  @js.native
  sealed trait itemError extends StObject
  inline def itemError: itemError = "itemError".asInstanceOf[itemError]
  
  @js.native
  sealed trait itemRestart extends StObject
  inline def itemRestart: itemRestart = "itemRestart".asInstanceOf[itemRestart]
  
  @js.native
  sealed trait ready
    extends StObject
       with WatchdogState
  inline def ready: ready = "ready".asInstanceOf[ready]
  
  @js.native
  sealed trait restart extends StObject
  inline def restart: restart = "restart".asInstanceOf[restart]
  
  @js.native
  sealed trait stateChange extends StObject
  inline def stateChange: stateChange = "stateChange".asInstanceOf[stateChange]
}
