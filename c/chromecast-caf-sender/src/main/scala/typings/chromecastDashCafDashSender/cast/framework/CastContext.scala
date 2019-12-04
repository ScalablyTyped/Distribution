package typings.chromecastDashCafDashSender.cast.framework

import typings.chrome.chrome.cast.ErrorCode
import typings.chromecastDashCafDashSender.cast.framework.CastContextEventType.CAST_STATE_CHANGED
import typings.chromecastDashCafDashSender.cast.framework.CastContextEventType.SESSION_STATE_CHANGED
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("cast.framework.CastContext")
@js.native
class CastContext () extends js.Object {
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

/* static members */
@JSGlobal("cast.framework.CastContext")
@js.native
object CastContext extends js.Object {
  def getInstance(): CastContext = js.native
}

