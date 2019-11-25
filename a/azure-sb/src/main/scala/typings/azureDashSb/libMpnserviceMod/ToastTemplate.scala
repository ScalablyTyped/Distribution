package typings.azureDashSb.libMpnserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ToastTemplate extends Template {
  var param: js.UndefOr[String] = js.undefined
  var text1: String
  var text2: String
}

object ToastTemplate {
  @scala.inline
  def apply(text1: String, text2: String, param: String = null): ToastTemplate = {
    val __obj = js.Dynamic.literal(text1 = text1.asInstanceOf[js.Any], text2 = text2.asInstanceOf[js.Any])
    if (param != null) __obj.updateDynamic("param")(param.asInstanceOf[js.Any])
    __obj.asInstanceOf[ToastTemplate]
  }
}

