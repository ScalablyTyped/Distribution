package typings
package chromeLib.chromeNs.declarativeWebRequestNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HeaderFilter extends js.Object {
  var nameContains: js.UndefOr[js.Any] = js.undefined
  var nameEquals: js.UndefOr[java.lang.String] = js.undefined
  var namePrefix: js.UndefOr[java.lang.String] = js.undefined
  var nameSuffix: js.UndefOr[java.lang.String] = js.undefined
  var valueContains: js.UndefOr[js.Any] = js.undefined
  var valueEquals: js.UndefOr[java.lang.String] = js.undefined
  var valuePrefix: js.UndefOr[java.lang.String] = js.undefined
  var valueSuffix: js.UndefOr[java.lang.String] = js.undefined
}

object HeaderFilter {
  @scala.inline
  def apply(
    nameContains: js.Any = null,
    nameEquals: java.lang.String = null,
    namePrefix: java.lang.String = null,
    nameSuffix: java.lang.String = null,
    valueContains: js.Any = null,
    valueEquals: java.lang.String = null,
    valuePrefix: java.lang.String = null,
    valueSuffix: java.lang.String = null
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

