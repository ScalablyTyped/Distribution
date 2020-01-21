package typings.chromecastCafSender.cast.framework

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait CastContextEventType extends js.Object

@JSGlobal("cast.framework.CastContextEventType")
@js.native
object CastContextEventType extends js.Object {
  @js.native
  sealed trait CAST_STATE_CHANGED extends CastContextEventType
  
  @js.native
  sealed trait SESSION_STATE_CHANGED extends CastContextEventType
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[CastContextEventType with String] = js.native
  /* "caststatechanged" */ @js.native
  object CAST_STATE_CHANGED extends TopLevel[CAST_STATE_CHANGED with String]
  
  /* "sessionstatechanged" */ @js.native
  object SESSION_STATE_CHANGED extends TopLevel[SESSION_STATE_CHANGED with String]
  
}

