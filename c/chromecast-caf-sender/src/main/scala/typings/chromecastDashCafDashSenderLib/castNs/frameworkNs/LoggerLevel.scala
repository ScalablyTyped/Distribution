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
  
  val DEBUG: DEBUG with java.lang.String = js.native
  val ERROR: ERROR with java.lang.String = js.native
  val INFO: INFO with java.lang.String = js.native
  val NONE: NONE with java.lang.String = js.native
  val WARNING: WARNING with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    chromecastDashCafDashSenderLib.castNs.frameworkNs.LoggerLevel with java.lang.String
  ] = js.native
}

