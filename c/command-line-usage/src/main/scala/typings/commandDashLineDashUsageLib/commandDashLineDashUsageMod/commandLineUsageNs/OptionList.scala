package typings
package commandDashLineDashUsageLib.commandDashLineDashUsageMod.commandLineUsageNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** A OptionList section adds a table displaying details of the available options. */

trait OptionList extends js.Object {
  /** If specified, only options from this particular group will be printed.  */
  var group: js.UndefOr[java.lang.String | js.Array[java.lang.String]] = js.undefined
  var header: js.UndefOr[java.lang.String] = js.undefined
  /** The names of one of more option definitions to hide from the option list.  */
  var hide: js.UndefOr[java.lang.String | js.Array[java.lang.String]] = js.undefined
  /** An array of option definition objects. */
  var optionList: js.UndefOr[js.Array[OptionDefinition]] = js.undefined
  /** If true, the option alias will be displayed after the name, i.e. --verbose, -v instead of -v, --verbose). */
  var reverseNameOrder: js.UndefOr[scala.Boolean] = js.undefined
  /** An options object suitable for passing into table-layout. */
  var tableOptions: js.UndefOr[js.Any] = js.undefined
}

