package typings.azdata.mod.nb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait INotebookContents extends js.Object {
  val cells: js.Array[ICellContents]
  val metadata: INotebookMetadata
  val nbformat: Double
  val nbformat_minor: Double
}

object INotebookContents {
  @scala.inline
  def apply(
    cells: js.Array[ICellContents],
    metadata: INotebookMetadata,
    nbformat: Double,
    nbformat_minor: Double
  ): INotebookContents = {
    val __obj = js.Dynamic.literal(cells = cells.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], nbformat = nbformat.asInstanceOf[js.Any], nbformat_minor = nbformat_minor.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[INotebookContents]
  }
}

