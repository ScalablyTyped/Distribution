package typings
package bookshelfLib.bookshelfMod.BookshelfNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CollectionOptions[T] extends js.Object {
  var comparator: js.UndefOr[
    scala.Boolean | java.lang.String | (js.Function2[/* a */ T, /* b */ T, scala.Double])
  ] = js.undefined
}

object CollectionOptions {
  @scala.inline
  def apply[T](
    comparator: scala.Boolean | java.lang.String | (js.Function2[/* a */ T, /* b */ T, scala.Double]) = null
  ): CollectionOptions[T] = {
    val __obj = js.Dynamic.literal()
    if (comparator != null) __obj.updateDynamic("comparator")(comparator.asInstanceOf[js.Any])
    __obj.asInstanceOf[CollectionOptions[T]]
  }
}

