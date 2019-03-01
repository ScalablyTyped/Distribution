package typings
package chromeDashAppsLib.chromeNs.webViewRequestNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HeaderFilter extends js.Object {
  /** Matches if the header name contains all of the specified strings. */
  var nameContains: js.UndefOr[java.lang.String | js.Array[java.lang.String]] = js.undefined
  /** Matches if the header name is equal to the specified string. */
  var nameEquals: js.UndefOr[java.lang.String] = js.undefined
  /** Matches if the header name starts with the specified string. */
  var namePrefix: js.UndefOr[java.lang.String] = js.undefined
  /** Matches if the header name ends with the specified string. */
  var nameSuffix: js.UndefOr[java.lang.String] = js.undefined
  /** Matches if the header value contains all of the specified strings. */
  var valueContains: js.UndefOr[java.lang.String | js.Array[java.lang.String]] = js.undefined
  /** Matches if the header value is equal to the specified string. */
  var valueEquals: js.UndefOr[java.lang.String] = js.undefined
  /** Matches if the header value starts with the specified string. */
  var valuePrefix: js.UndefOr[java.lang.String] = js.undefined
  /** Matches if the header value ends with the specified string. */
  var valueSuffix: js.UndefOr[java.lang.String] = js.undefined
}

object HeaderFilter {
  @scala.inline
  def apply(
    nameContains: java.lang.String | js.Array[java.lang.String] = null,
    nameEquals: java.lang.String = null,
    namePrefix: java.lang.String = null,
    nameSuffix: java.lang.String = null,
    valueContains: java.lang.String | js.Array[java.lang.String] = null,
    valueEquals: java.lang.String = null,
    valuePrefix: java.lang.String = null,
    valueSuffix: java.lang.String = null
  ): HeaderFilter = {
    val __obj = js.Dynamic.literal()
    if (nameContains != null) __obj.updateDynamic("nameContains")(nameContains.asInstanceOf[js.Any])
    if (nameEquals != null) __obj.updateDynamic("nameEquals")(nameEquals)
    if (namePrefix != null) __obj.updateDynamic("namePrefix")(namePrefix)
    if (nameSuffix != null) __obj.updateDynamic("nameSuffix")(nameSuffix)
    if (valueContains != null) __obj.updateDynamic("valueContains")(valueContains.asInstanceOf[js.Any])
    if (valueEquals != null) __obj.updateDynamic("valueEquals")(valueEquals)
    if (valuePrefix != null) __obj.updateDynamic("valuePrefix")(valuePrefix)
    if (valueSuffix != null) __obj.updateDynamic("valueSuffix")(valueSuffix)
    __obj.asInstanceOf[HeaderFilter]
  }
}

