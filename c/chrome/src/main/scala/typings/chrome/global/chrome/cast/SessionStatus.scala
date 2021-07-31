package typings.chrome.global.chrome.cast

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("chrome.cast.SessionStatus")
@js.native
object SessionStatus extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[typings.chrome.chrome.cast.SessionStatus & String] = js.native
  
  /* "connected" */ val CONNECTED: typings.chrome.chrome.cast.SessionStatus.CONNECTED & String = js.native
  
  /* "disconnected" */ val DISCONNECTED: typings.chrome.chrome.cast.SessionStatus.DISCONNECTED & String = js.native
  
  /* "stopped" */ val STOPPED: typings.chrome.chrome.cast.SessionStatus.STOPPED & String = js.native
}
