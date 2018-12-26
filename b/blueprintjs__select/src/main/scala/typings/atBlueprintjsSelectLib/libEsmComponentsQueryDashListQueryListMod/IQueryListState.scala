package typings
package atBlueprintjsSelectLib.libEsmComponentsQueryDashListQueryListMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait IQueryListState[T] extends js.Object {
  /** The currently focused item (for keyboard interactions). */
  var activeItem: T | scala.Null
  /** The original `items` array filtered by `itemListPredicate` or `itemPredicate`. */
  var filteredItems: js.Array[T]
  /** The current query string. */
  var query: java.lang.String
}

