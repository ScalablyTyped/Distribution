package typings.chromeDashApps.chromeNs.webViewRequestNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HeaderFilter extends js.Object {
  /** Matches if the header name contains all of the specified strings. */
  var nameContains: js.UndefOr[String | js.Array[String]] = js.undefined
  /** Matches if the header name is equal to the specified string. */
  var nameEquals: js.UndefOr[String] = js.undefined
  /** Matches if the header name starts with the specified string. */
  var namePrefix: js.UndefOr[String] = js.undefined
  /** Matches if the header name ends with the specified string. */
  var nameSuffix: js.UndefOr[String] = js.undefined
  /** Matches if the header value contains all of the specified strings. */
  var valueContains: js.UndefOr[String | js.Array[String]] = js.undefined
  /** Matches if the header value is equal to the specified string. */
  var valueEquals: js.UndefOr[String] = js.undefined
  /** Matches if the header value starts with the specified string. */
  var valuePrefix: js.UndefOr[String] = js.undefined
  /** Matches if the header value ends with the specified string. */
  var valueSuffix: js.UndefOr[String] = js.undefined
}

object HeaderFilter {
  @scala.inline
  def apply(
    nameContains: String | js.Array[String] = null,
    nameEquals: String = null,
    namePrefix: String = null,
    nameSuffix: String = null,
    valueContains: String | js.Array[String] = null,
    valueEquals: String = null,
    valuePrefix: String = null,
    valueSuffix: String = null
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

