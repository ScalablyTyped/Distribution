package typings.chrome.chromeNs.castNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait AutoJoinPolicy extends js.Object

@JSGlobal("chrome.cast.AutoJoinPolicy")
@js.native
object AutoJoinPolicy extends js.Object {
  @js.native
  sealed trait CUSTOM_CONTROLLER_SCOPED extends AutoJoinPolicy
  
  @js.native
  sealed trait ORIGIN_SCOPED extends AutoJoinPolicy
  
  @js.native
  sealed trait PAGE_SCOPED extends AutoJoinPolicy
  
  @js.native
  sealed trait TAB_AND_ORIGIN_SCOPED extends AutoJoinPolicy
  
  /* "custom_controller_scoped" */ val CUSTOM_CONTROLLER_SCOPED: typings.chrome.chromeNs.castNs.AutoJoinPolicy.CUSTOM_CONTROLLER_SCOPED with String = js.native
  /* "origin_scoped" */ val ORIGIN_SCOPED: typings.chrome.chromeNs.castNs.AutoJoinPolicy.ORIGIN_SCOPED with String = js.native
  /* "page_scoped" */ val PAGE_SCOPED: typings.chrome.chromeNs.castNs.AutoJoinPolicy.PAGE_SCOPED with String = js.native
  /* "tab_and_origin_scoped" */ val TAB_AND_ORIGIN_SCOPED: typings.chrome.chromeNs.castNs.AutoJoinPolicy.TAB_AND_ORIGIN_SCOPED with String = js.native
  @JSBracketAccess
  def apply(value: String): js.UndefOr[AutoJoinPolicy with String] = js.native
}

