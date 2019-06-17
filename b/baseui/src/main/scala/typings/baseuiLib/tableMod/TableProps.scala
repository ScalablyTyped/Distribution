package typings
package baseuiLib.tableMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TableProps extends js.Object {
  var columns: js.Array[java.lang.String | reactLib.reactMod.ReactNode]
  var data: js.Array[js.Array[reactLib.reactMod.ReactNode]]
  var horizontalScrollWidth: js.UndefOr[java.lang.String] = js.undefined
  var isLoading: js.UndefOr[scala.Boolean] = js.undefined
}

object TableProps {
  @scala.inline
  def apply(
    columns: js.Array[java.lang.String | reactLib.reactMod.ReactNode],
    data: js.Array[js.Array[reactLib.reactMod.ReactNode]],
    horizontalScrollWidth: java.lang.String = null,
    isLoading: js.UndefOr[scala.Boolean] = js.undefined
  ): TableProps = {
    val __obj = js.Dynamic.literal(columns = columns, data = data)
    if (horizontalScrollWidth != null) __obj.updateDynamic("horizontalScrollWidth")(horizontalScrollWidth)
    if (!js.isUndefined(isLoading)) __obj.updateDynamic("isLoading")(isLoading)
    __obj.asInstanceOf[TableProps]
  }
}

