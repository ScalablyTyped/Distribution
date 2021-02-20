package typings.azdata.mod.nb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait NotebookChangeKind extends StObject
@JSImport("azdata", "nb.NotebookChangeKind")
@js.native
object NotebookChangeKind extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[NotebookChangeKind with Double] = js.native
  
  @js.native
  sealed trait CellExecuted extends NotebookChangeKind
  /* 3 */ val CellExecuted: typings.azdata.mod.nb.NotebookChangeKind.CellExecuted with Double = js.native
  
  @js.native
  sealed trait ContentUpdated extends NotebookChangeKind
  /* 0 */ val ContentUpdated: typings.azdata.mod.nb.NotebookChangeKind.ContentUpdated with Double = js.native
  
  @js.native
  sealed trait MetadataUpdated extends NotebookChangeKind
  /* 1 */ val MetadataUpdated: typings.azdata.mod.nb.NotebookChangeKind.MetadataUpdated with Double = js.native
  
  @js.native
  sealed trait Save extends NotebookChangeKind
  /* 2 */ val Save: typings.azdata.mod.nb.NotebookChangeKind.Save with Double = js.native
}
