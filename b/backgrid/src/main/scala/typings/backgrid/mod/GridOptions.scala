package typings.backgrid.mod

import typings.backbone.mod.Collection
import typings.backbone.mod.Model
import typings.backbone.mod.ModelSetOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GridOptions extends js.Object {
  var body: js.UndefOr[Body] = js.native
  var collection: Collection[Model[_, ModelSetOptions]] = js.native
  var columns: js.Array[Column] = js.native
  var footer: js.UndefOr[Footer] = js.native
  var header: js.UndefOr[Header] = js.native
  var row: js.UndefOr[Row] = js.native
}

object GridOptions {
  @scala.inline
  def apply(collection: Collection[Model[_, ModelSetOptions]], columns: js.Array[Column]): GridOptions = {
    val __obj = js.Dynamic.literal(collection = collection.asInstanceOf[js.Any], columns = columns.asInstanceOf[js.Any])
    __obj.asInstanceOf[GridOptions]
  }
  @scala.inline
  implicit class GridOptionsOps[Self <: GridOptions] (val x: Self) extends AnyVal {
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
    def setCollection(value: Collection[Model[_, ModelSetOptions]]): Self = this.set("collection", value.asInstanceOf[js.Any])
    @scala.inline
    def setColumnsVarargs(value: Column*): Self = this.set("columns", js.Array(value :_*))
    @scala.inline
    def setColumns(value: js.Array[Column]): Self = this.set("columns", value.asInstanceOf[js.Any])
    @scala.inline
    def setBody(value: Body): Self = this.set("body", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBody: Self = this.set("body", js.undefined)
    @scala.inline
    def setFooter(value: Footer): Self = this.set("footer", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFooter: Self = this.set("footer", js.undefined)
    @scala.inline
    def setHeader(value: Header): Self = this.set("header", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeader: Self = this.set("header", js.undefined)
    @scala.inline
    def setRow(value: Row): Self = this.set("row", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRow: Self = this.set("row", js.undefined)
  }
  
}

