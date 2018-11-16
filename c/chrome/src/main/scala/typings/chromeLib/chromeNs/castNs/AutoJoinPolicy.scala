package typings
package chromeLib.chromeNs.castNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait AutoJoinPolicy extends js.Object

@JSGlobal("chrome.cast.AutoJoinPolicy")
@js.native
object AutoJoinPolicy extends js.Object {
  @js.native
  sealed trait CUSTOM_CONTROLLER_SCOPED
    extends chromeLib.chromeNs.castNs.AutoJoinPolicy
  
  @js.native
  sealed trait ORIGIN_SCOPED
    extends chromeLib.chromeNs.castNs.AutoJoinPolicy
  
  @js.native
  sealed trait PAGE_SCOPED
    extends chromeLib.chromeNs.castNs.AutoJoinPolicy
  
  @js.native
  sealed trait TAB_AND_ORIGIN_SCOPED
    extends chromeLib.chromeNs.castNs.AutoJoinPolicy
  
  /* "custom_controller_scoped" */ val CUSTOM_CONTROLLER_SCOPED: CUSTOM_CONTROLLER_SCOPED with java.lang.String = js.native
  /* "origin_scoped" */ val ORIGIN_SCOPED: ORIGIN_SCOPED with java.lang.String = js.native
  /* "page_scoped" */ val PAGE_SCOPED: PAGE_SCOPED with java.lang.String = js.native
  /* "tab_and_origin_scoped" */ val TAB_AND_ORIGIN_SCOPED: TAB_AND_ORIGIN_SCOPED with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[chromeLib.chromeNs.castNs.AutoJoinPolicy with java.lang.String] = js.native
}

