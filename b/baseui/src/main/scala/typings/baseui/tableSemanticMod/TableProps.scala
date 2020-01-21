package typings.baseui.tableSemanticMod

import typings.react.mod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TableProps extends js.Object {
  var columns: js.Array[ReactNode]
  var data: js.Array[js.Array[ReactNode]]
  var horizontalScrollWidth: js.UndefOr[String] = js.undefined
  var overrides: js.UndefOr[Overrides] = js.undefined
}

object TableProps {
  @scala.inline
  def apply(
    columns: js.Array[ReactNode],
    data: js.Array[js.Array[ReactNode]],
    horizontalScrollWidth: String = null,
    overrides: Overrides = null
  ): TableProps = {
    val __obj = js.Dynamic.literal(columns = columns.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any])
    if (horizontalScrollWidth != null) __obj.updateDynamic("horizontalScrollWidth")(horizontalScrollWidth.asInstanceOf[js.Any])
    if (overrides != null) __obj.updateDynamic("overrides")(overrides.asInstanceOf[js.Any])
    __obj.asInstanceOf[TableProps]
  }
}

