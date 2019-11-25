package typings.datatablesDotNet.DataTables

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SearchSettings extends js.Object {
  /**
    * Control case-sensitive filtering option. Since: 1.10
    */
  var caseInsensitive: js.UndefOr[Boolean] = js.undefined
  /**
    * Enable / disable escaping of regular expression characters in the search term. Since: 1.10
    */
  var regex: js.UndefOr[Boolean] = js.undefined
  /**
    * Set an initial filtering condition on the table. Since: 1.10
    */
  var search: js.UndefOr[String] = js.undefined
  /**
    * Set a placeholder attribute for input type="text" tag elements. Since: 1.10.1
    */
  var searchPlaceholder: js.UndefOr[String] = js.undefined
  /**
    * Enable / disable DataTables' smart filtering. Since: 1.10
    */
  var smart: js.UndefOr[Boolean] = js.undefined
}

object SearchSettings {
  @scala.inline
  def apply(
    caseInsensitive: js.UndefOr[Boolean] = js.undefined,
    regex: js.UndefOr[Boolean] = js.undefined,
    search: String = null,
    searchPlaceholder: String = null,
    smart: js.UndefOr[Boolean] = js.undefined
  ): SearchSettings = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(caseInsensitive)) __obj.updateDynamic("caseInsensitive")(caseInsensitive.asInstanceOf[js.Any])
    if (!js.isUndefined(regex)) __obj.updateDynamic("regex")(regex.asInstanceOf[js.Any])
    if (search != null) __obj.updateDynamic("search")(search.asInstanceOf[js.Any])
    if (searchPlaceholder != null) __obj.updateDynamic("searchPlaceholder")(searchPlaceholder.asInstanceOf[js.Any])
    if (!js.isUndefined(smart)) __obj.updateDynamic("smart")(smart.asInstanceOf[js.Any])
    __obj.asInstanceOf[SearchSettings]
  }
}

