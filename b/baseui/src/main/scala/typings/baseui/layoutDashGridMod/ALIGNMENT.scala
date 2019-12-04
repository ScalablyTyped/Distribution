package typings.baseui.layoutDashGridMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ALIGNMENT extends js.Object

@JSImport("baseui/layout-grid", "ALIGNMENT")
@js.native
object ALIGNMENT extends js.Object {
  @js.native
  sealed trait center extends ALIGNMENT
  
  @js.native
  sealed trait end extends ALIGNMENT
  
  @js.native
  sealed trait start extends ALIGNMENT
  
  /* "center" */ val center: typings.baseui.layoutDashGridMod.ALIGNMENT.center with String = js.native
  /* "end" */ val end: typings.baseui.layoutDashGridMod.ALIGNMENT.end with String = js.native
  /* "start" */ val start: typings.baseui.layoutDashGridMod.ALIGNMENT.start with String = js.native
  @JSBracketAccess
  def apply(value: String): js.UndefOr[ALIGNMENT with String] = js.native
}

