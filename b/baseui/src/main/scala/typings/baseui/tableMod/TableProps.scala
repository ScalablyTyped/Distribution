package typings.baseui.tableMod

import typings.react.mod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TableProps extends js.Object {
  var columns: js.Array[String | ReactNode]
  var data: js.Array[js.Array[ReactNode]]
  var horizontalScrollWidth: js.UndefOr[String] = js.undefined
  var isLoading: js.UndefOr[Boolean] = js.undefined
}

object TableProps {
  @scala.inline
  def apply(
    columns: js.Array[String | ReactNode],
    data: js.Array[js.Array[ReactNode]],
    horizontalScrollWidth: String = null,
    isLoading: js.UndefOr[Boolean] = js.undefined
  ): TableProps = {
    val __obj = js.Dynamic.literal(columns = columns.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any])
    if (horizontalScrollWidth != null) __obj.updateDynamic("horizontalScrollWidth")(horizontalScrollWidth.asInstanceOf[js.Any])
    if (!js.isUndefined(isLoading)) __obj.updateDynamic("isLoading")(isLoading.asInstanceOf[js.Any])
    __obj.asInstanceOf[TableProps]
  }
}

