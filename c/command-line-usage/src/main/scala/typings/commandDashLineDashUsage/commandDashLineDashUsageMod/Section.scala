package typings.commandDashLineDashUsage.commandDashLineDashUsageMod

import typings.commandDashLineDashUsage.Anon_Data
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Section object. */
/* Rewritten from type alias, can be one of: 
  - typings.commandDashLineDashUsage.commandDashLineDashUsageMod.Content
  - typings.commandDashLineDashUsage.commandDashLineDashUsageMod.OptionList
*/
trait Section extends js.Object

object Section {
  @scala.inline
  def Content(
    content: String | (js.Array[_ | String]) | Anon_Data = null,
    header: String = null,
    raw: js.UndefOr[Boolean] = js.undefined
  ): Section = {
    val __obj = js.Dynamic.literal()
    if (content != null) __obj.updateDynamic("content")(content.asInstanceOf[js.Any])
    if (header != null) __obj.updateDynamic("header")(header.asInstanceOf[js.Any])
    if (!js.isUndefined(raw)) __obj.updateDynamic("raw")(raw.asInstanceOf[js.Any])
    __obj.asInstanceOf[Section]
  }
  @scala.inline
  def OptionList(
    group: String | js.Array[String] = null,
    header: String = null,
    hide: String | js.Array[String] = null,
    optionList: js.Array[OptionDefinition] = null,
    reverseNameOrder: js.UndefOr[Boolean] = js.undefined,
    tableOptions: js.Any = null
  ): Section = {
    val __obj = js.Dynamic.literal()
    if (group != null) __obj.updateDynamic("group")(group.asInstanceOf[js.Any])
    if (header != null) __obj.updateDynamic("header")(header.asInstanceOf[js.Any])
    if (hide != null) __obj.updateDynamic("hide")(hide.asInstanceOf[js.Any])
    if (optionList != null) __obj.updateDynamic("optionList")(optionList.asInstanceOf[js.Any])
    if (!js.isUndefined(reverseNameOrder)) __obj.updateDynamic("reverseNameOrder")(reverseNameOrder.asInstanceOf[js.Any])
    if (tableOptions != null) __obj.updateDynamic("tableOptions")(tableOptions.asInstanceOf[js.Any])
    __obj.asInstanceOf[Section]
  }
}

