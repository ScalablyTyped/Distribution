package typings.chrome.chrome.cast

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
  
  /* "cast" */ val CAST: typings.chrome.chrome.cast.ReceiverAction.CAST with String = js.native
  /* "stop" */ val STOP: typings.chrome.chrome.cast.ReceiverAction.STOP with String = js.native
  @JSBracketAccess
  def apply(value: String): js.UndefOr[ReceiverAction with String] = js.native
}

