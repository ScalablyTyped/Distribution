package typings.datatablesDotNetDashButtons.DataTablesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ButtonsApiExportDataParameter extends js.Object {
  var columns: js.UndefOr[js.Any] = js.undefined
  var decodeEntities: js.UndefOr[Boolean] = js.undefined
  var format: js.UndefOr[js.Any] = js.undefined
  var modifier: js.UndefOr[js.Any] = js.undefined
  var orthogonal: js.UndefOr[String] = js.undefined
  var rows: js.UndefOr[js.Any] = js.undefined
  var stripHtml: js.UndefOr[Boolean] = js.undefined
  var stripNewlines: js.UndefOr[Boolean] = js.undefined
  var trim: js.UndefOr[Boolean] = js.undefined
}

object ButtonsApiExportDataParameter {
  @scala.inline
  def apply(
    columns: js.Any = null,
    decodeEntities: js.UndefOr[Boolean] = js.undefined,
    format: js.Any = null,
    modifier: js.Any = null,
    orthogonal: String = null,
    rows: js.Any = null,
    stripHtml: js.UndefOr[Boolean] = js.undefined,
    stripNewlines: js.UndefOr[Boolean] = js.undefined,
    trim: js.UndefOr[Boolean] = js.undefined
  ): ButtonsApiExportDataParameter = {
    val __obj = js.Dynamic.literal()
    if (columns != null) __obj.updateDynamic("columns")(columns)
    if (!js.isUndefined(decodeEntities)) __obj.updateDynamic("decodeEntities")(decodeEntities)
    if (format != null) __obj.updateDynamic("format")(format)
    if (modifier != null) __obj.updateDynamic("modifier")(modifier)
    if (orthogonal != null) __obj.updateDynamic("orthogonal")(orthogonal)
    if (rows != null) __obj.updateDynamic("rows")(rows)
    if (!js.isUndefined(stripHtml)) __obj.updateDynamic("stripHtml")(stripHtml)
    if (!js.isUndefined(stripNewlines)) __obj.updateDynamic("stripNewlines")(stripNewlines)
    if (!js.isUndefined(trim)) __obj.updateDynamic("trim")(trim)
    __obj.asInstanceOf[ButtonsApiExportDataParameter]
  }
}

