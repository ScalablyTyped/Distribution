package typings
package bookshelfLib.bookshelfMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CollectionFetchOneOptions extends js.Object {
  var columns: js.UndefOr[java.lang.String | js.Array[java.lang.String]] = js.undefined
  var require: js.UndefOr[scala.Boolean] = js.undefined
}

object CollectionFetchOneOptions {
  @scala.inline
  def apply(
    columns: java.lang.String | js.Array[java.lang.String] = null,
    require: js.UndefOr[scala.Boolean] = js.undefined
  ): CollectionFetchOneOptions = {
    val __obj = js.Dynamic.literal()
    if (columns != null) __obj.updateDynamic("columns")(columns.asInstanceOf[js.Any])
    if (!js.isUndefined(require)) __obj.updateDynamic("require")(require)
    __obj.asInstanceOf[CollectionFetchOneOptions]
  }
}

