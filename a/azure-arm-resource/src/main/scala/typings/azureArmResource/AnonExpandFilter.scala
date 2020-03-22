package typings.azureArmResource

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonExpandFilter extends js.Object {
  var customHeaders: js.UndefOr[StringDictionary[String]] = js.undefined
  var expand: js.UndefOr[String] = js.undefined
  var filter: js.UndefOr[String] = js.undefined
  var top: js.UndefOr[Double] = js.undefined
}

object AnonExpandFilter {
  @scala.inline
  def apply(
    customHeaders: StringDictionary[String] = null,
    expand: String = null,
    filter: String = null,
    top: Int | Double = null
  ): AnonExpandFilter = {
    val __obj = js.Dynamic.literal()
    if (customHeaders != null) __obj.updateDynamic("customHeaders")(customHeaders.asInstanceOf[js.Any])
    if (expand != null) __obj.updateDynamic("expand")(expand.asInstanceOf[js.Any])
    if (filter != null) __obj.updateDynamic("filter")(filter.asInstanceOf[js.Any])
    if (top != null) __obj.updateDynamic("top")(top.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonExpandFilter]
  }
}

