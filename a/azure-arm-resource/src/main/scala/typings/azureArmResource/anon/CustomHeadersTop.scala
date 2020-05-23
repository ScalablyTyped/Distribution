package typings.azureArmResource.anon

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CustomHeadersTop extends js.Object {
  var customHeaders: js.UndefOr[StringDictionary[String]] = js.undefined
  var top: js.UndefOr[Double] = js.undefined
}

object CustomHeadersTop {
  @scala.inline
  def apply(customHeaders: StringDictionary[String] = null, top: js.UndefOr[Double] = js.undefined): CustomHeadersTop = {
    val __obj = js.Dynamic.literal()
    if (customHeaders != null) __obj.updateDynamic("customHeaders")(customHeaders.asInstanceOf[js.Any])
    if (!js.isUndefined(top)) __obj.updateDynamic("top")(top.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[CustomHeadersTop]
  }
}

