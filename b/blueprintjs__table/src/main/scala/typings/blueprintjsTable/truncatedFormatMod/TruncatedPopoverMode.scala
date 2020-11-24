package typings.blueprintjsTable.truncatedFormatMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait TruncatedPopoverMode extends js.Object
@JSImport("@blueprintjs/table/lib/esm/cell/formats/truncatedFormat", "TruncatedPopoverMode")
@js.native
object TruncatedPopoverMode extends js.Object {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[TruncatedPopoverMode with String] = js.native
  
  @js.native
  sealed trait ALWAYS extends TruncatedPopoverMode
  /* "always" */ @js.native
  object ALWAYS extends TopLevel[ALWAYS with String]
  
  @js.native
  sealed trait NEVER extends TruncatedPopoverMode
  /* "never" */ @js.native
  object NEVER extends TopLevel[NEVER with String]
  
  @js.native
  sealed trait WHEN_TRUNCATED extends TruncatedPopoverMode
  /* "when-truncated" */ @js.native
  object WHEN_TRUNCATED extends TopLevel[WHEN_TRUNCATED with String]
  
  @js.native
  sealed trait WHEN_TRUNCATED_APPROX extends TruncatedPopoverMode
  /* "when-truncated-approx" */ @js.native
  object WHEN_TRUNCATED_APPROX extends TopLevel[WHEN_TRUNCATED_APPROX with String]
}
