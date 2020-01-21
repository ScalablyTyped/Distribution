package typings.cordovaPluginGlobalization

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonFormatLength extends js.Object {
  var formatLength: js.UndefOr[String] = js.undefined
   // "short" | "medium" | "long" | "full"
  var selector: js.UndefOr[String] = js.undefined
}

object AnonFormatLength {
  @scala.inline
  def apply(formatLength: String = null, selector: String = null): AnonFormatLength = {
    val __obj = js.Dynamic.literal()
    if (formatLength != null) __obj.updateDynamic("formatLength")(formatLength.asInstanceOf[js.Any])
    if (selector != null) __obj.updateDynamic("selector")(selector.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonFormatLength]
  }
}

