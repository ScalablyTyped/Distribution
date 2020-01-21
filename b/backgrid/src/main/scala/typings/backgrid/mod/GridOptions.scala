package typings.backgrid.mod

import typings.backbone.mod.Collection
import typings.backbone.mod.Model
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GridOptions extends js.Object {
  var body: js.UndefOr[Body] = js.undefined
  var collection: Collection[Model]
  var columns: js.Array[Column]
  var footer: js.UndefOr[Footer] = js.undefined
  var header: js.UndefOr[Header] = js.undefined
  var row: js.UndefOr[Row] = js.undefined
}

object GridOptions {
  @scala.inline
  def apply(
    collection: Collection[Model],
    columns: js.Array[Column],
    body: Body = null,
    footer: Footer = null,
    header: Header = null,
    row: Row = null
  ): GridOptions = {
    val __obj = js.Dynamic.literal(collection = collection.asInstanceOf[js.Any], columns = columns.asInstanceOf[js.Any])
    if (body != null) __obj.updateDynamic("body")(body.asInstanceOf[js.Any])
    if (footer != null) __obj.updateDynamic("footer")(footer.asInstanceOf[js.Any])
    if (header != null) __obj.updateDynamic("header")(header.asInstanceOf[js.Any])
    if (row != null) __obj.updateDynamic("row")(row.asInstanceOf[js.Any])
    __obj.asInstanceOf[GridOptions]
  }
}

