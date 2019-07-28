package typings.atBlueprintjsTable.libEsmCellFormatsTruncatedFormatMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait TruncatedPopoverMode extends js.Object

@JSImport("@blueprintjs/table/lib/esm/cell/formats/truncatedFormat", "TruncatedPopoverMode")
@js.native
object TruncatedPopoverMode extends js.Object {
  @js.native
  sealed trait ALWAYS extends TruncatedPopoverMode
  
  @js.native
  sealed trait NEVER extends TruncatedPopoverMode
  
  @js.native
  sealed trait WHEN_TRUNCATED extends TruncatedPopoverMode
  
  @js.native
  sealed trait WHEN_TRUNCATED_APPROX extends TruncatedPopoverMode
  
  /* "always" */ val ALWAYS: typings.atBlueprintjsTable.libEsmCellFormatsTruncatedFormatMod.TruncatedPopoverMode.ALWAYS with String = js.native
  /* "never" */ val NEVER: typings.atBlueprintjsTable.libEsmCellFormatsTruncatedFormatMod.TruncatedPopoverMode.NEVER with String = js.native
  /* "when-truncated" */ val WHEN_TRUNCATED: typings.atBlueprintjsTable.libEsmCellFormatsTruncatedFormatMod.TruncatedPopoverMode.WHEN_TRUNCATED with String = js.native
  /* "when-truncated-approx" */ val WHEN_TRUNCATED_APPROX: typings.atBlueprintjsTable.libEsmCellFormatsTruncatedFormatMod.TruncatedPopoverMode.WHEN_TRUNCATED_APPROX with String = js.native
  @JSBracketAccess
  def apply(value: String): js.UndefOr[TruncatedPopoverMode with String] = js.native
}

