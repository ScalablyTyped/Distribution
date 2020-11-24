package typings.baseui.tabsMotionMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ORIENTATION extends js.Object
@JSImport("baseui/tabs-motion", "ORIENTATION")
@js.native
object ORIENTATION extends js.Object {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[ORIENTATION with String] = js.native
  
  @js.native
  sealed trait horizontal extends ORIENTATION
  /* "horizontal" */ @js.native
  object horizontal extends TopLevel[horizontal with String]
  
  @js.native
  sealed trait vertical extends ORIENTATION
  /* "vertical" */ @js.native
  object vertical extends TopLevel[vertical with String]
}
