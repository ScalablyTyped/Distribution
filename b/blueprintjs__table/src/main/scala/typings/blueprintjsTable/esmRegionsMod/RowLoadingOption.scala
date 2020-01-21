package typings.blueprintjsTable.esmRegionsMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait RowLoadingOption extends js.Object

@JSImport("@blueprintjs/table/lib/esm/regions", "RowLoadingOption")
@js.native
object RowLoadingOption extends js.Object {
  @js.native
  sealed trait CELLS extends RowLoadingOption
  
  @js.native
  sealed trait HEADER extends RowLoadingOption
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[RowLoadingOption with String] = js.native
  /* "cells" */ @js.native
  object CELLS extends TopLevel[CELLS with String]
  
  /* "row-header" */ @js.native
  object HEADER extends TopLevel[HEADER with String]
  
}

