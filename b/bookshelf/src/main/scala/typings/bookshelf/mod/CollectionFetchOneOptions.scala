package typings.bookshelf.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CollectionFetchOneOptions extends js.Object {
  var columns: js.UndefOr[String | js.Array[String]] = js.undefined
  var require: js.UndefOr[Boolean] = js.undefined
}

object CollectionFetchOneOptions {
  @scala.inline
  def apply(columns: String | js.Array[String] = null, require: js.UndefOr[Boolean] = js.undefined): CollectionFetchOneOptions = {
    val __obj = js.Dynamic.literal()
    if (columns != null) __obj.updateDynamic("columns")(columns.asInstanceOf[js.Any])
    if (!js.isUndefined(require)) __obj.updateDynamic("require")(require.asInstanceOf[js.Any])
    __obj.asInstanceOf[CollectionFetchOneOptions]
  }
}

