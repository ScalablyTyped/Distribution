package typings.azureArmResource.anon

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Filter extends js.Object {
  var customHeaders: js.UndefOr[StringDictionary[String]] = js.undefined
  var filter: js.UndefOr[String] = js.undefined
}

object Filter {
  @scala.inline
  def apply(customHeaders: StringDictionary[String] = null, filter: String = null): Filter = {
    val __obj = js.Dynamic.literal()
    if (customHeaders != null) __obj.updateDynamic("customHeaders")(customHeaders.asInstanceOf[js.Any])
    if (filter != null) __obj.updateDynamic("filter")(filter.asInstanceOf[js.Any])
    __obj.asInstanceOf[Filter]
  }
}

