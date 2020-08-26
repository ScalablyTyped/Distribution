package typings.baseui.tabsMotionMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ORIENTATION extends js.Object

@JSImport("baseui/tabs-motion", "ORIENTATION")
@js.native
object ORIENTATION extends js.Object {
  @js.native
  sealed trait horizontal extends ORIENTATION
  
  @js.native
  sealed trait vertical extends ORIENTATION
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[ORIENTATION with String] = js.native
  /* "horizontal" */ @js.native
  object horizontal extends TopLevel[horizontal with String]
  
  /* "vertical" */ @js.native
  object vertical extends TopLevel[vertical with String]
  
}

