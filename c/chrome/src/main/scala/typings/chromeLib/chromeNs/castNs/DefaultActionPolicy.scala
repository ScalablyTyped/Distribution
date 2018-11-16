package typings
package chromeLib.chromeNs.castNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait DefaultActionPolicy extends js.Object

@JSGlobal("chrome.cast.DefaultActionPolicy")
@js.native
object DefaultActionPolicy extends js.Object {
  @js.native
  sealed trait CAST_THIS_TAB
    extends chromeLib.chromeNs.castNs.DefaultActionPolicy
  
  @js.native
  sealed trait CREATE_SESSION
    extends chromeLib.chromeNs.castNs.DefaultActionPolicy
  
  /* "cast_this_tab" */ val CAST_THIS_TAB: CAST_THIS_TAB with java.lang.String = js.native
  /* "create_session" */ val CREATE_SESSION: CREATE_SESSION with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[chromeLib.chromeNs.castNs.DefaultActionPolicy with java.lang.String] = js.native
}

