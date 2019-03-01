package typings
package backgridLib.backgridMod.BackgridNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GridOptions extends js.Object {
  var body: js.UndefOr[Body] = js.undefined
  var collection: backboneLib.backboneMod.Collection[backboneLib.backboneMod.Model]
  var columns: js.Array[Column]
  var footer: js.UndefOr[Footer] = js.undefined
  var header: js.UndefOr[Header] = js.undefined
  var row: js.UndefOr[Row] = js.undefined
}

object GridOptions {
  @scala.inline
  def apply(
    collection: backboneLib.backboneMod.Collection[backboneLib.backboneMod.Model],
    columns: js.Array[Column],
    body: Body = null,
    footer: Footer = null,
    header: Header = null,
    row: Row = null
  ): GridOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("collection")(collection)
    __obj.updateDynamic("columns")(columns)
    if (body != null) __obj.updateDynamic("body")(body)
    if (footer != null) __obj.updateDynamic("footer")(footer)
    if (header != null) __obj.updateDynamic("header")(header)
    if (row != null) __obj.updateDynamic("row")(row)
    __obj.asInstanceOf[GridOptions]
  }
}

