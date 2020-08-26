package typings.azdata.mod.nb

import typings.azdata.anon.Azdatacellguid
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ICellContents extends js.Object {
  var cell_type: CellType = js.native
  var execution_count: js.UndefOr[Double] = js.native
  var metadata: js.UndefOr[Azdatacellguid] = js.native
  var outputs: js.UndefOr[js.Array[ICellOutput]] = js.native
  var source: String | js.Array[String] = js.native
}

object ICellContents {
  @scala.inline
  def apply(cell_type: CellType, source: String | js.Array[String]): ICellContents = {
    val __obj = js.Dynamic.literal(cell_type = cell_type.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
    __obj.asInstanceOf[ICellContents]
  }
  @scala.inline
  implicit class ICellContentsOps[Self <: ICellContents] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setCell_type(value: CellType): Self = this.set("cell_type", value.asInstanceOf[js.Any])
    @scala.inline
    def setSourceVarargs(value: String*): Self = this.set("source", js.Array(value :_*))
    @scala.inline
    def setSource(value: String | js.Array[String]): Self = this.set("source", value.asInstanceOf[js.Any])
    @scala.inline
    def setExecution_count(value: Double): Self = this.set("execution_count", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExecution_count: Self = this.set("execution_count", js.undefined)
    @scala.inline
    def setMetadata(value: Azdatacellguid): Self = this.set("metadata", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMetadata: Self = this.set("metadata", js.undefined)
    @scala.inline
    def setOutputsVarargs(value: ICellOutput*): Self = this.set("outputs", js.Array(value :_*))
    @scala.inline
    def setOutputs(value: js.Array[ICellOutput]): Self = this.set("outputs", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOutputs: Self = this.set("outputs", js.undefined)
  }
  
}

