package typings.bookshelf.bookshelfMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CollectionOptions[T] extends js.Object {
  var comparator: js.UndefOr[Boolean | String | (js.Function2[/* a */ T, /* b */ T, Double])] = js.undefined
}

object CollectionOptions {
  @scala.inline
  def apply[T](comparator: Boolean | String | (js.Function2[/* a */ T, /* b */ T, Double]) = null): CollectionOptions[T] = {
    val __obj = js.Dynamic.literal()
    if (comparator != null) __obj.updateDynamic("comparator")(comparator.asInstanceOf[js.Any])
    __obj.asInstanceOf[CollectionOptions[T]]
  }
}

