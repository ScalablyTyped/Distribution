package typings.cordovaPluginGlobalization.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FormatLength extends js.Object {
  var formatLength: js.UndefOr[String] = js.undefined
   // "short" | "medium" | "long" | "full"
  var selector: js.UndefOr[String] = js.undefined
}

object FormatLength {
  @scala.inline
  def apply(formatLength: String = null, selector: String = null): FormatLength = {
    val __obj = js.Dynamic.literal()
    if (formatLength != null) __obj.updateDynamic("formatLength")(formatLength.asInstanceOf[js.Any])
    if (selector != null) __obj.updateDynamic("selector")(selector.asInstanceOf[js.Any])
    __obj.asInstanceOf[FormatLength]
  }
}

