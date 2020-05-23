package typings.azureArmResource.anon

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CustomHeaders extends js.Object {
  var customHeaders: js.UndefOr[StringDictionary[String]] = js.undefined
}

object CustomHeaders {
  @scala.inline
  def apply(customHeaders: StringDictionary[String] = null): CustomHeaders = {
    val __obj = js.Dynamic.literal()
    if (customHeaders != null) __obj.updateDynamic("customHeaders")(customHeaders.asInstanceOf[js.Any])
    __obj.asInstanceOf[CustomHeaders]
  }
}

