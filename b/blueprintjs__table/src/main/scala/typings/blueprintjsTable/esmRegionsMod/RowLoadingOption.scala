package typings.blueprintjsTable.esmRegionsMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait RowLoadingOption extends js.Object
@JSImport("@blueprintjs/table/lib/esm/regions", "RowLoadingOption")
@js.native
object RowLoadingOption extends js.Object {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[RowLoadingOption with String] = js.native
  
  @js.native
  sealed trait CELLS extends RowLoadingOption
  /* "cells" */ @js.native
  object CELLS extends TopLevel[CELLS with String]
  
  @js.native
  sealed trait HEADER extends RowLoadingOption
  /* "row-header" */ @js.native
  object HEADER extends TopLevel[HEADER with String]
}
