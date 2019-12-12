package typings.baseui.tableMod

import org.scalablytyped.runtime.TopLevel
import typings.baseui.tableMod.SORT_DIRECTION.ASC
import typings.baseui.tableMod.SORT_DIRECTION.DESC
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
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[SORT_DIRECTION with String] = js.native
  /* "ASC" */ @js.native
  object ASC extends TopLevel[ASC with String]
  
  /* "DESC" */ @js.native
  object DESC extends TopLevel[DESC with String]
  
}

