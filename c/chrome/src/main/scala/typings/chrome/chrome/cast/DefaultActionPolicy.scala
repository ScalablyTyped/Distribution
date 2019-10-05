package typings.chrome.chrome.cast

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait DefaultActionPolicy extends js.Object

@JSGlobal("chrome.cast.DefaultActionPolicy")
@js.native
object DefaultActionPolicy extends js.Object {
  @js.native
  sealed trait CAST_THIS_TAB extends DefaultActionPolicy
  
  @js.native
  sealed trait CREATE_SESSION extends DefaultActionPolicy
  
  /* "cast_this_tab" */ val CAST_THIS_TAB: typings.chrome.chrome.cast.DefaultActionPolicy.CAST_THIS_TAB with String = js.native
  /* "create_session" */ val CREATE_SESSION: typings.chrome.chrome.cast.DefaultActionPolicy.CREATE_SESSION with String = js.native
  @JSBracketAccess
  def apply(value: String): js.UndefOr[DefaultActionPolicy with String] = js.native
}

