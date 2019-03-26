package typings
package atBlueprintjsTableLib.libEsmCellFormatsTruncatedFormatMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait TruncatedPopoverMode extends js.Object

@JSImport("@blueprintjs/table/lib/esm/cell/formats/truncatedFormat", "TruncatedPopoverMode")
@js.native
object TruncatedPopoverMode extends js.Object {
  @js.native
  sealed trait ALWAYS
    extends atBlueprintjsTableLib.libEsmCellFormatsTruncatedFormatMod.TruncatedPopoverMode
  
  @js.native
  sealed trait NEVER
    extends atBlueprintjsTableLib.libEsmCellFormatsTruncatedFormatMod.TruncatedPopoverMode
  
  @js.native
  sealed trait WHEN_TRUNCATED
    extends atBlueprintjsTableLib.libEsmCellFormatsTruncatedFormatMod.TruncatedPopoverMode
  
  @js.native
  sealed trait WHEN_TRUNCATED_APPROX
    extends atBlueprintjsTableLib.libEsmCellFormatsTruncatedFormatMod.TruncatedPopoverMode
  
  /* "always" */ val ALWAYS: ALWAYS with java.lang.String = js.native
  /* "never" */ val NEVER: NEVER with java.lang.String = js.native
  /* "when-truncated" */ val WHEN_TRUNCATED: WHEN_TRUNCATED with java.lang.String = js.native
  /* "when-truncated-approx" */ val WHEN_TRUNCATED_APPROX: WHEN_TRUNCATED_APPROX with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    atBlueprintjsTableLib.libEsmCellFormatsTruncatedFormatMod.TruncatedPopoverMode with java.lang.String
  ] = js.native
}

