package typings.azureArmResource

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonSkiptoken extends js.Object {
  var customHeaders: js.UndefOr[StringDictionary[String]] = js.undefined
  var skiptoken: js.UndefOr[String] = js.undefined
}

object AnonSkiptoken {
  @scala.inline
  def apply(customHeaders: StringDictionary[String] = null, skiptoken: String = null): AnonSkiptoken = {
    val __obj = js.Dynamic.literal()
    if (customHeaders != null) __obj.updateDynamic("customHeaders")(customHeaders.asInstanceOf[js.Any])
    if (skiptoken != null) __obj.updateDynamic("skiptoken")(skiptoken.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonSkiptoken]
  }
}

