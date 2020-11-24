package typings.blueprintjsTable.esmRegionsMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ColumnLoadingOption extends js.Object
@JSImport("@blueprintjs/table/lib/esm/regions", "ColumnLoadingOption")
@js.native
object ColumnLoadingOption extends js.Object {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[ColumnLoadingOption with String] = js.native
  
  @js.native
  sealed trait CELLS extends ColumnLoadingOption
  /* "cells" */ @js.native
  object CELLS extends TopLevel[CELLS with String]
  
  @js.native
  sealed trait HEADER extends ColumnLoadingOption
  /* "column-header" */ @js.native
  object HEADER extends TopLevel[HEADER with String]
}
