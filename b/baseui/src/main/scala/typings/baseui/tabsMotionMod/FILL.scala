package typings.baseui.tabsMotionMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait FILL extends js.Object

@JSImport("baseui/tabs-motion", "FILL")
@js.native
object FILL extends js.Object {
  @js.native
  sealed trait fixed extends FILL
  
  @js.native
  sealed trait intrinsic extends FILL
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[FILL with String] = js.native
  /* "fixed" */ @js.native
  object fixed extends TopLevel[fixed with String]
  
  /* "intrinsic" */ @js.native
  object intrinsic extends TopLevel[intrinsic with String]
  
}

