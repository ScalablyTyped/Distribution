package typings
package chromecastDashCafDashSenderLib.castNs.frameworkNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait LoggerLevel extends js.Object

@JSGlobal("cast.framework.LoggerLevel")
@js.native
object LoggerLevel extends js.Object {
  @js.native
  sealed trait DEBUG
    extends chromecastDashCafDashSenderLib.castNs.frameworkNs.LoggerLevel
  
  @js.native
  sealed trait ERROR
    extends chromecastDashCafDashSenderLib.castNs.frameworkNs.LoggerLevel
  
  @js.native
  sealed trait INFO
    extends chromecastDashCafDashSenderLib.castNs.frameworkNs.LoggerLevel
  
  @js.native
  sealed trait NONE
    extends chromecastDashCafDashSenderLib.castNs.frameworkNs.LoggerLevel
  
  @js.native
  sealed trait WARNING
    extends chromecastDashCafDashSenderLib.castNs.frameworkNs.LoggerLevel
  
  /* 0 */ val DEBUG: DEBUG with scala.Double = js.native
  /* 3 */ val ERROR: ERROR with scala.Double = js.native
  /* 1 */ val INFO: INFO with scala.Double = js.native
  /* 4 */ val NONE: NONE with scala.Double = js.native
  /* 2 */ val WARNING: WARNING with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[chromecastDashCafDashSenderLib.castNs.frameworkNs.LoggerLevel with scala.Double] = js.native
}

