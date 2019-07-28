package typings.chromecastDashCafDashSender.castNs.frameworkNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait LoggerLevel extends js.Object

@JSGlobal("cast.framework.LoggerLevel")
@js.native
object LoggerLevel extends js.Object {
  @js.native
  sealed trait DEBUG extends LoggerLevel
  
  @js.native
  sealed trait ERROR extends LoggerLevel
  
  @js.native
  sealed trait INFO extends LoggerLevel
  
  @js.native
  sealed trait NONE extends LoggerLevel
  
  @js.native
  sealed trait WARNING extends LoggerLevel
  
  /* 0 */ val DEBUG: typings.chromecastDashCafDashSender.castNs.frameworkNs.LoggerLevel.DEBUG with Double = js.native
  /* 3 */ val ERROR: typings.chromecastDashCafDashSender.castNs.frameworkNs.LoggerLevel.ERROR with Double = js.native
  /* 1 */ val INFO: typings.chromecastDashCafDashSender.castNs.frameworkNs.LoggerLevel.INFO with Double = js.native
  /* 4 */ val NONE: typings.chromecastDashCafDashSender.castNs.frameworkNs.LoggerLevel.NONE with Double = js.native
  /* 2 */ val WARNING: typings.chromecastDashCafDashSender.castNs.frameworkNs.LoggerLevel.WARNING with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[LoggerLevel with Double] = js.native
}

