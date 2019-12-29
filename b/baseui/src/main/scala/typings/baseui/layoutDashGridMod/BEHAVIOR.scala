package typings.baseui.layoutDashGridMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait BEHAVIOR extends js.Object

@JSImport("baseui/layout-grid", "BEHAVIOR")
@js.native
object BEHAVIOR extends js.Object {
  @js.native
  sealed trait fixed extends BEHAVIOR
  
  @js.native
  sealed trait fluid extends BEHAVIOR
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[BEHAVIOR with String] = js.native
  /* "fixed" */ @js.native
  object fixed extends TopLevel[fixed with String]
  
  /* "fluid" */ @js.native
  object fluid extends TopLevel[fluid with String]
  
}

