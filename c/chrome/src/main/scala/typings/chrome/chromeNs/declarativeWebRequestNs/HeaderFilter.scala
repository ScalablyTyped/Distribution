package typings.chrome.chromeNs.declarativeWebRequestNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HeaderFilter extends js.Object {
  var nameContains: js.UndefOr[js.Any] = js.undefined
  var nameEquals: js.UndefOr[String] = js.undefined
  var namePrefix: js.UndefOr[String] = js.undefined
  var nameSuffix: js.UndefOr[String] = js.undefined
  var valueContains: js.UndefOr[js.Any] = js.undefined
  var valueEquals: js.UndefOr[String] = js.undefined
  var valuePrefix: js.UndefOr[String] = js.undefined
  var valueSuffix: js.UndefOr[String] = js.undefined
}

object HeaderFilter {
  @scala.inline
  def apply(
    nameContains: js.Any = null,
    nameEquals: String = null,
    namePrefix: String = null,
    nameSuffix: String = null,
    valueContains: js.Any = null,
    valueEquals: String = null,
    valuePrefix: String = null,
    valueSuffix: String = null
  ): HeaderFilter = {
    val __obj = js.Dynamic.literal()
    if (nameContains != null) __obj.updateDynamic("nameContains")(nameContains)
    if (nameEquals != null) __obj.updateDynamic("nameEquals")(nameEquals)
    if (namePrefix != null) __obj.updateDynamic("namePrefix")(namePrefix)
    if (nameSuffix != null) __obj.updateDynamic("nameSuffix")(nameSuffix)
    if (valueContains != null) __obj.updateDynamic("valueContains")(valueContains)
    if (valueEquals != null) __obj.updateDynamic("valueEquals")(valueEquals)
    if (valuePrefix != null) __obj.updateDynamic("valuePrefix")(valuePrefix)
    if (valueSuffix != null) __obj.updateDynamic("valueSuffix")(valueSuffix)
    __obj.asInstanceOf[HeaderFilter]
  }
}

