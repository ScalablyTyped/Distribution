package typings.baseui.layoutGridMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ALIGNMENT extends js.Object
@JSImport("baseui/layout-grid", "ALIGNMENT")
@js.native
object ALIGNMENT extends js.Object {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[ALIGNMENT with String] = js.native
  
  @js.native
  sealed trait center extends ALIGNMENT
  /* "center" */ @js.native
  object center extends TopLevel[center with String]
  
  @js.native
  sealed trait end extends ALIGNMENT
  /* "flex-end" */ @js.native
  object end extends TopLevel[end with String]
  
  @js.native
  sealed trait start extends ALIGNMENT
  /* "flex-start" */ @js.native
  object start extends TopLevel[start with String]
}
