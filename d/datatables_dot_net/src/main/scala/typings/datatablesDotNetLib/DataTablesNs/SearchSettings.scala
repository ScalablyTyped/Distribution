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

