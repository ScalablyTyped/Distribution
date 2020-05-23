package typings.bookshelf.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CollectionFetchOptions extends js.Object {
  var require: js.UndefOr[Boolean] = js.undefined
  var withRelated: js.UndefOr[String | js.Array[String]] = js.undefined
}

object CollectionFetchOptions {
  @scala.inline
  def apply(require: js.UndefOr[Boolean] = js.undefined, withRelated: String | js.Array[String] = null): CollectionFetchOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(require)) __obj.updateDynamic("require")(require.get.asInstanceOf[js.Any])
    if (withRelated != null) __obj.updateDynamic("withRelated")(withRelated.asInstanceOf[js.Any])
    __obj.asInstanceOf[CollectionFetchOptions]
  }
}

