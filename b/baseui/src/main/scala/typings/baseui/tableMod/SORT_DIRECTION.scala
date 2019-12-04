package typings.baseui.tableMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait SORT_DIRECTION extends js.Object

@JSImport("baseui/table", "SORT_DIRECTION")
@js.native
object SORT_DIRECTION extends js.Object {
  @js.native
  sealed trait ASC extends SORT_DIRECTION
  
  @js.native
  sealed trait DESC extends SORT_DIRECTION
  
  /* "ASC" */ val ASC: typings.baseui.tableMod.SORT_DIRECTION.ASC with String = js.native
  /* "DESC" */ val DESC: typings.baseui.tableMod.SORT_DIRECTION.DESC with String = js.native
  @JSBracketAccess
  def apply(value: String): js.UndefOr[SORT_DIRECTION with String] = js.native
}

