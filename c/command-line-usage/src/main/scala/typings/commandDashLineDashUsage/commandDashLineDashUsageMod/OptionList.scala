package typings.commandDashLineDashUsage.commandDashLineDashUsageMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** A OptionList section adds a table displaying details of the available options. */
trait OptionList extends Section {
  /** If specified, only options from this particular group will be printed.  */
  var group: js.UndefOr[String | js.Array[String]] = js.undefined
  var header: js.UndefOr[String] = js.undefined
  /** The names of one of more option definitions to hide from the option list.  */
  var hide: js.UndefOr[String | js.Array[String]] = js.undefined
  /** An array of option definition objects. */
  var optionList: js.UndefOr[js.Array[OptionDefinition]] = js.undefined
  /** If true, the option alias will be displayed after the name, i.e. --verbose, -v instead of -v, --verbose). */
  var reverseNameOrder: js.UndefOr[Boolean] = js.undefined
  /** An options object suitable for passing into table-layout. */
  var tableOptions: js.UndefOr[js.Any] = js.undefined
}

object OptionList {
  @scala.inline
  def apply(
    group: String | js.Array[String] = null,
    header: String = null,
    hide: String | js.Array[String] = null,
    optionList: js.Array[OptionDefinition] = null,
    reverseNameOrder: js.UndefOr[Boolean] = js.undefined,
    tableOptions: js.Any = null
  ): OptionList = {
    val __obj = js.Dynamic.literal()
    if (group != null) __obj.updateDynamic("group")(group.asInstanceOf[js.Any])
    if (header != null) __obj.updateDynamic("header")(header)
    if (hide != null) __obj.updateDynamic("hide")(hide.asInstanceOf[js.Any])
    if (optionList != null) __obj.updateDynamic("optionList")(optionList)
    if (!js.isUndefined(reverseNameOrder)) __obj.updateDynamic("reverseNameOrder")(reverseNameOrder)
    if (tableOptions != null) __obj.updateDynamic("tableOptions")(tableOptions)
    __obj.asInstanceOf[OptionList]
  }
}

