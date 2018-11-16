package typings
package chromecastDashCafDashSenderLib.castNs.frameworkNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait CastState extends js.Object

@JSGlobal("cast.framework.CastState")
@js.native
object CastState extends js.Object {
  @js.native
  sealed trait CONNECTED
    extends chromecastDashCafDashSenderLib.castNs.frameworkNs.CastState
  
  @js.native
  sealed trait CONNECTING
    extends chromecastDashCafDashSenderLib.castNs.frameworkNs.CastState
  
  @js.native
  sealed trait NOT_CONNECTED
    extends chromecastDashCafDashSenderLib.castNs.frameworkNs.CastState
  
  @js.native
  sealed trait NO_DEVICES_AVAILABLE
    extends chromecastDashCafDashSenderLib.castNs.frameworkNs.CastState
  
  /* "CONNECTED" */ val CONNECTED: CONNECTED with java.lang.String = js.native
  /* "CONNECTING" */ val CONNECTING: CONNECTING with java.lang.String = js.native
  /* "NOT_CONNECTED" */ val NOT_CONNECTED: NOT_CONNECTED with java.lang.String = js.native
  /* "NO_DEVICES_AVAILABLE" */ val NO_DEVICES_AVAILABLE: NO_DEVICES_AVAILABLE with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    chromecastDashCafDashSenderLib.castNs.frameworkNs.CastState with java.lang.String
  ] = js.native
}

