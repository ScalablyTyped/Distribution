package typings.chromecastDashCafDashSender.cast.framework

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait CastState extends js.Object

@JSGlobal("cast.framework.CastState")
@js.native
object CastState extends js.Object {
  @js.native
  sealed trait CONNECTED extends CastState
  
  @js.native
  sealed trait CONNECTING extends CastState
  
  @js.native
  sealed trait NOT_CONNECTED extends CastState
  
  @js.native
  sealed trait NO_DEVICES_AVAILABLE extends CastState
  
  /* "CONNECTED" */ val CONNECTED: typings.chromecastDashCafDashSender.cast.framework.CastState.CONNECTED with String = js.native
  /* "CONNECTING" */ val CONNECTING: typings.chromecastDashCafDashSender.cast.framework.CastState.CONNECTING with String = js.native
  /* "NOT_CONNECTED" */ val NOT_CONNECTED: typings.chromecastDashCafDashSender.cast.framework.CastState.NOT_CONNECTED with String = js.native
  /* "NO_DEVICES_AVAILABLE" */ val NO_DEVICES_AVAILABLE: typings.chromecastDashCafDashSender.cast.framework.CastState.NO_DEVICES_AVAILABLE with String = js.native
  @JSBracketAccess
  def apply(value: String): js.UndefOr[CastState with String] = js.native
}

