package typings.chrome.chrome.cast

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ReceiverAction extends js.Object

@JSGlobal("chrome.cast.ReceiverAction")
@js.native
object ReceiverAction extends js.Object {
  @js.native
  sealed trait CAST extends ReceiverAction
  
  @js.native
  sealed trait STOP extends ReceiverAction
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[ReceiverAction with String] = js.native
  /* "cast" */ @js.native
  object CAST extends TopLevel[CAST with String]
  
  /* "stop" */ @js.native
  object STOP extends TopLevel[STOP with String]
  
}

