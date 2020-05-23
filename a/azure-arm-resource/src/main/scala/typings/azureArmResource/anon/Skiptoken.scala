package typings.azureArmResource.anon

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Skiptoken extends js.Object {
  var customHeaders: js.UndefOr[StringDictionary[String]] = js.undefined
  var skiptoken: js.UndefOr[String] = js.undefined
}

object Skiptoken {
  @scala.inline
  def apply(customHeaders: StringDictionary[String] = null, skiptoken: String = null): Skiptoken = {
    val __obj = js.Dynamic.literal()
    if (customHeaders != null) __obj.updateDynamic("customHeaders")(customHeaders.asInstanceOf[js.Any])
    if (skiptoken != null) __obj.updateDynamic("skiptoken")(skiptoken.asInstanceOf[js.Any])
    __obj.asInstanceOf[Skiptoken]
  }
}

