package typings.baseui.tabsMotionMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait STATE_CHANGE_TYPE extends js.Object
@JSImport("baseui/tabs-motion", "STATE_CHANGE_TYPE")
@js.native
object STATE_CHANGE_TYPE extends js.Object {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[STATE_CHANGE_TYPE with String] = js.native
  
  @js.native
  sealed trait change extends STATE_CHANGE_TYPE
  /* "change" */ @js.native
  object change extends TopLevel[change with String]
}
