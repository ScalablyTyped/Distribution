package typings.chromecastCafSender.cast.framework

import org.scalablytyped.runtime.TopLevel
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
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[CastState with String] = js.native
  /* "CONNECTED" */ @js.native
  object CONNECTED extends TopLevel[CONNECTED with String]
  
  /* "CONNECTING" */ @js.native
  object CONNECTING extends TopLevel[CONNECTING with String]
  
  /* "NOT_CONNECTED" */ @js.native
  object NOT_CONNECTED extends TopLevel[NOT_CONNECTED with String]
  
  /* "NO_DEVICES_AVAILABLE" */ @js.native
  object NO_DEVICES_AVAILABLE extends TopLevel[NO_DEVICES_AVAILABLE with String]
  
}

