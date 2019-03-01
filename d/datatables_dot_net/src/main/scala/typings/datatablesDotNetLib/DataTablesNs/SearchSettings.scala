package typings
package datatablesDotNetLib.DataTablesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SearchSettings extends js.Object {
  /**
    * Control case-sensitive filtering option. Since: 1.10
    */
  var caseInsensitive: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Enable / disable escaping of regular expression characters in the search term. Since: 1.10
    */
  var regex: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Set an initial filtering condition on the table. Since: 1.10
    */
  var search: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Set a placeholder attribute for input type="text" tag elements. Since: 1.10.1
    */
  var searchPlaceholder: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Enable / disable DataTables' smart filtering. Since: 1.10
    */
  var smart: js.UndefOr[scala.Boolean] = js.undefined
}

object SearchSettings {
  @scala.inline
  def apply(
    caseInsensitive: js.UndefOr[scala.Boolean] = js.undefined,
    regex: js.UndefOr[scala.Boolean] = js.undefined,
    search: java.lang.String = null,
    searchPlaceholder: java.lang.String = null,
    smart: js.UndefOr[scala.Boolean] = js.undefined
  ): SearchSettings = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(caseInsensitive)) __obj.updateDynamic("caseInsensitive")(caseInsensitive)
    if (!js.isUndefined(regex)) __obj.updateDynamic("regex")(regex)
    if (search != null) __obj.updateDynamic("search")(search)
    if (searchPlaceholder != null) __obj.updateDynamic("searchPlaceholder")(searchPlaceholder)
    if (!js.isUndefined(smart)) __obj.updateDynamic("smart")(smart)
    __obj.asInstanceOf[SearchSettings]
  }
}

