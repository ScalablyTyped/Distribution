package typings.azdata.mod.nb

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait NotebookChangeKind extends js.Object
@JSImport("azdata", "nb.NotebookChangeKind")
@js.native
object NotebookChangeKind extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[NotebookChangeKind with Double] = js.native
  
  @js.native
  sealed trait CellExecuted extends NotebookChangeKind
  /* 3 */ @js.native
  object CellExecuted extends TopLevel[CellExecuted with Double]
  
  @js.native
  sealed trait ContentUpdated extends NotebookChangeKind
  /* 0 */ @js.native
  object ContentUpdated extends TopLevel[ContentUpdated with Double]
  
  @js.native
  sealed trait MetadataUpdated extends NotebookChangeKind
  /* 1 */ @js.native
  object MetadataUpdated extends TopLevel[MetadataUpdated with Double]
  
  @js.native
  sealed trait Save extends NotebookChangeKind
  /* 2 */ @js.native
  object Save extends TopLevel[Save with Double]
}
