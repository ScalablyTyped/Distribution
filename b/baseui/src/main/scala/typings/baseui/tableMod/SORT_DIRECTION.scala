package typings.baseui.tableMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait SORT_DIRECTION extends js.Object
@JSImport("baseui/table", "SORT_DIRECTION")
@js.native
object SORT_DIRECTION extends js.Object {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[SORT_DIRECTION with String] = js.native
  
  @js.native
  sealed trait ASC extends SORT_DIRECTION
  /* "ASC" */ @js.native
  object ASC extends TopLevel[ASC with String]
  
  @js.native
  sealed trait DESC extends SORT_DIRECTION
  /* "DESC" */ @js.native
  object DESC extends TopLevel[DESC with String]
}
