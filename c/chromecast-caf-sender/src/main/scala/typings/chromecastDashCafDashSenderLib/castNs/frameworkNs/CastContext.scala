package typings
package chromecastDashCafDashSenderLib.castNs.frameworkNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("cast.framework.CastContext")
@js.native
class CastContext () extends js.Object {
  def addEventListener(
    `type`: CastContextEventType,
    handler: js.Function1[(/* event */ CastStateEventData) | (/* event */ SessionStateEventData), scala.Unit]
  ): scala.Unit = js.native
  def endCurrentSession(stopCasting: scala.Boolean): scala.Unit = js.native
  def getCastState(): CastState = js.native
  def getCurrentSession(): CastSession | scala.Null = js.native
  def getSessionState(): SessionState = js.native
  def removeEventListener(
    `type`: CastContextEventType,
    handler: js.Function1[(/* event */ CastStateEventData) | (/* event */ SessionStateEventData), scala.Unit]
  ): scala.Unit = js.native
  def requestSession(): js.Promise[js.UndefOr[chromeLib.chromeNs.castNs.ErrorCode]] = js.native
  def setOptions(options: CastOptions): scala.Unit = js.native
}

@JSGlobal("cast.framework.CastContext")
@js.native
object CastContext extends js.Object {
  def getInstance(): chromecastDashCafDashSenderLib.castNs.frameworkNs.CastContext = js.native
}

