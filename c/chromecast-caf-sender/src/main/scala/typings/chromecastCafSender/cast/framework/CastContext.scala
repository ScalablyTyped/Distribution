package typings.chromecastCafSender.cast.framework

import typings.chrome.chrome.cast.ErrorCode
import typings.chromecastCafSender.cast.framework.CastContextEventType.CAST_STATE_CHANGED
import typings.chromecastCafSender.cast.framework.CastContextEventType.SESSION_STATE_CHANGED
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CastContext extends StObject {
  
  def addEventListener(`type`: CAST_STATE_CHANGED, handler: js.Function1[/* event */ CastStateEventData, Unit]): Unit = js.native
  def addEventListener(`type`: SESSION_STATE_CHANGED, handler: js.Function1[/* event */ SessionStateEventData, Unit]): Unit = js.native
  
  def endCurrentSession(stopCasting: Boolean): Unit = js.native
  
  def getCastState(): CastState = js.native
  
  def getCurrentSession(): CastSession | Null = js.native
  
  def getSessionState(): SessionState = js.native
  
  def removeEventListener(`type`: CAST_STATE_CHANGED, handler: js.Function1[/* event */ CastStateEventData, Unit]): Unit = js.native
  def removeEventListener(`type`: SESSION_STATE_CHANGED, handler: js.Function1[/* event */ SessionStateEventData, Unit]): Unit = js.native
  
  def requestSession(): js.Promise[js.UndefOr[ErrorCode]] = js.native
  
  def setOptions(options: CastOptions): Unit = js.native
}
