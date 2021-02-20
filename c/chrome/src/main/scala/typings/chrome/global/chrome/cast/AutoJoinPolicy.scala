package typings.chrome.global.chrome.cast

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("chrome.cast.AutoJoinPolicy")
@js.native
object AutoJoinPolicy extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[typings.chrome.chrome.cast.AutoJoinPolicy with String] = js.native
  
  /* "custom_controller_scoped" */ val CUSTOM_CONTROLLER_SCOPED: typings.chrome.chrome.cast.AutoJoinPolicy.CUSTOM_CONTROLLER_SCOPED with String = js.native
  
  /* "origin_scoped" */ val ORIGIN_SCOPED: typings.chrome.chrome.cast.AutoJoinPolicy.ORIGIN_SCOPED with String = js.native
  
  /* "page_scoped" */ val PAGE_SCOPED: typings.chrome.chrome.cast.AutoJoinPolicy.PAGE_SCOPED with String = js.native
  
  /* "tab_and_origin_scoped" */ val TAB_AND_ORIGIN_SCOPED: typings.chrome.chrome.cast.AutoJoinPolicy.TAB_AND_ORIGIN_SCOPED with String = js.native
}
