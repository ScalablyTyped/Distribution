package typings
package bookshelfLib.bookshelfMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CollectionFetchOptions extends js.Object {
  var require: js.UndefOr[scala.Boolean] = js.undefined
  var withRelated: js.UndefOr[java.lang.String | js.Array[java.lang.String]] = js.undefined
}

object CollectionFetchOptions {
  @scala.inline
  def apply(
    require: js.UndefOr[scala.Boolean] = js.undefined,
    withRelated: java.lang.String | js.Array[java.lang.String] = null
  ): CollectionFetchOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(require)) __obj.updateDynamic("require")(require)
    if (withRelated != null) __obj.updateDynamic("withRelated")(withRelated.asInstanceOf[js.Any])
    __obj.asInstanceOf[CollectionFetchOptions]
  }
}

