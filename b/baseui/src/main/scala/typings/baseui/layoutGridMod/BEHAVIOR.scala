package typings.baseui.layoutGridMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait BEHAVIOR extends js.Object
@JSImport("baseui/layout-grid", "BEHAVIOR")
@js.native
object BEHAVIOR extends js.Object {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[BEHAVIOR with String] = js.native
  
  @js.native
  sealed trait fixed extends BEHAVIOR
  /* "fixed" */ @js.native
  object fixed extends TopLevel[fixed with String]
  
  @js.native
  sealed trait fluid extends BEHAVIOR
  /* "fluid" */ @js.native
  object fluid extends TopLevel[fluid with String]
}
