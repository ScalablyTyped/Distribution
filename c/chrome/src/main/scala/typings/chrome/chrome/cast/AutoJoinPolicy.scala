package typings.chrome.chrome.cast

import org.scalablytyped.runtime.TopLevel
import typings.chrome.chrome.cast.AutoJoinPolicy.CUSTOM_CONTROLLER_SCOPED
import typings.chrome.chrome.cast.AutoJoinPolicy.ORIGIN_SCOPED
import typings.chrome.chrome.cast.AutoJoinPolicy.PAGE_SCOPED
import typings.chrome.chrome.cast.AutoJoinPolicy.TAB_AND_ORIGIN_SCOPED
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
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[AutoJoinPolicy with String] = js.native
  /* "custom_controller_scoped" */ @js.native
  object CUSTOM_CONTROLLER_SCOPED extends TopLevel[CUSTOM_CONTROLLER_SCOPED with String]
  
  /* "origin_scoped" */ @js.native
  object ORIGIN_SCOPED extends TopLevel[ORIGIN_SCOPED with String]
  
  /* "page_scoped" */ @js.native
  object PAGE_SCOPED extends TopLevel[PAGE_SCOPED with String]
  
  /* "tab_and_origin_scoped" */ @js.native
  object TAB_AND_ORIGIN_SCOPED extends TopLevel[TAB_AND_ORIGIN_SCOPED with String]
  
}

