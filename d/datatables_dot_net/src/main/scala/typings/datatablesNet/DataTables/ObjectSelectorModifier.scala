package typings.datatablesNet.DataTables

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ObjectSelectorModifier extends js.Object {
  /**
    * The order modifier provides the ability to control which order the rows are processed in.
    * Values: 'current', 'applied', 'index',  'original'
    */
  var order: js.UndefOr[String] = js.undefined
  /**
    * The page modifier allows you to control if the selector should consider all data in the table, regardless of paging, or if only the rows in the currently disabled page should be used.
    * Values: 'all', 'current'
    */
  var page: js.UndefOr[String] = js.undefined
  /**
    * The search modifier provides the ability to govern which rows are used by the selector using the search options that are applied to the table.
    * Values: 'none', 'applied', 'removed'
    */
  var search: js.UndefOr[String] = js.undefined
  /**
    * The searchPlaceholder modifier provides the ability to provide informational text for an input control when it has no value.
    */
  var searchPlaceholder: js.UndefOr[String] = js.undefined
}

object ObjectSelectorModifier {
  @scala.inline
  def apply(order: String = null, page: String = null, search: String = null, searchPlaceholder: String = null): ObjectSelectorModifier = {
    val __obj = js.Dynamic.literal()
    if (order != null) __obj.updateDynamic("order")(order.asInstanceOf[js.Any])
    if (page != null) __obj.updateDynamic("page")(page.asInstanceOf[js.Any])
    if (search != null) __obj.updateDynamic("search")(search.asInstanceOf[js.Any])
    if (searchPlaceholder != null) __obj.updateDynamic("searchPlaceholder")(searchPlaceholder.asInstanceOf[js.Any])
    __obj.asInstanceOf[ObjectSelectorModifier]
  }
}

