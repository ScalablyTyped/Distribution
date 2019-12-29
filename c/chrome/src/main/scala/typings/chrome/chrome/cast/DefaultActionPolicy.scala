package typings.chrome.chrome.cast

import org.scalablytyped.runtime.TopLevel
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
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[DefaultActionPolicy with String] = js.native
  /* "cast_this_tab" */ @js.native
  object CAST_THIS_TAB extends TopLevel[CAST_THIS_TAB with String]
  
  /* "create_session" */ @js.native
  object CREATE_SESSION extends TopLevel[CREATE_SESSION with String]
  
}

