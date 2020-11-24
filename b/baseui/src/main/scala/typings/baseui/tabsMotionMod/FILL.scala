package typings.baseui.tabsMotionMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait FILL extends js.Object
@JSImport("baseui/tabs-motion", "FILL")
@js.native
object FILL extends js.Object {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[FILL with String] = js.native
  
  @js.native
  sealed trait fixed extends FILL
  /* "fixed" */ @js.native
  object fixed extends TopLevel[fixed with String]
  
  @js.native
  sealed trait intrinsic extends FILL
  /* "intrinsic" */ @js.native
  object intrinsic extends TopLevel[intrinsic with String]
}
