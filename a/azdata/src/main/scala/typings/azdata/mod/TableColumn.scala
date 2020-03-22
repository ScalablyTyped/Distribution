package typings.azdata.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TableColumn extends js.Object {
  var cssClass: js.UndefOr[String] = js.undefined
  var headerCssClass: js.UndefOr[String] = js.undefined
  var options: js.UndefOr[CheckboxColumnOption | TextColumnOption] = js.undefined
  var toolTip: js.UndefOr[String] = js.undefined
  var `type`: js.UndefOr[ColumnType] = js.undefined
  var value: String
  var width: js.UndefOr[Double] = js.undefined
}

object TableColumn {
  @scala.inline
  def apply(
    value: String,
    cssClass: String = null,
    headerCssClass: String = null,
    options: CheckboxColumnOption | TextColumnOption = null,
    toolTip: String = null,
    `type`: ColumnType = null,
    width: Int | Double = null
  ): TableColumn = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    if (cssClass != null) __obj.updateDynamic("cssClass")(cssClass.asInstanceOf[js.Any])
    if (headerCssClass != null) __obj.updateDynamic("headerCssClass")(headerCssClass.asInstanceOf[js.Any])
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    if (toolTip != null) __obj.updateDynamic("toolTip")(toolTip.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[TableColumn]
  }
}

