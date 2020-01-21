package typings.calHeatmap.mod._Global_.CalHeatMap

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SubDomainFormatTemplates extends js.Object {
  /** Format of the title when there is no value associated to the date. Default value: "{date}" */
  var empty: js.UndefOr[String] = js.undefined
  /** Format of the title when it's associated to a value. Default value: "{count} {name} {connector} {date}" */
  var filled: js.UndefOr[String] = js.undefined
}

object SubDomainFormatTemplates {
  @scala.inline
  def apply(empty: String = null, filled: String = null): SubDomainFormatTemplates = {
    val __obj = js.Dynamic.literal()
    if (empty != null) __obj.updateDynamic("empty")(empty.asInstanceOf[js.Any])
    if (filled != null) __obj.updateDynamic("filled")(filled.asInstanceOf[js.Any])
    __obj.asInstanceOf[SubDomainFormatTemplates]
  }
}

