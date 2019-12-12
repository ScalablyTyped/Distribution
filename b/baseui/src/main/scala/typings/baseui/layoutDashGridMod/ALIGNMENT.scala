package typings.baseui.layoutDashGridMod

import org.scalablytyped.runtime.TopLevel
import typings.baseui.layoutDashGridMod.ALIGNMENT.center
import typings.baseui.layoutDashGridMod.ALIGNMENT.end
import typings.baseui.layoutDashGridMod.ALIGNMENT.start
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
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[ALIGNMENT with String] = js.native
  /* "center" */ @js.native
  object center extends TopLevel[center with String]
  
  /* "end" */ @js.native
  object end extends TopLevel[end with String]
  
  /* "start" */ @js.native
  object start extends TopLevel[start with String]
  
}

