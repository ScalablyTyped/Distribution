package typings
package azureDashSbLib.libMpnserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ToastTemplate extends Template {
  var param: js.UndefOr[java.lang.String] = js.undefined
  var text1: java.lang.String
  var text2: java.lang.String
}

object ToastTemplate {
  @scala.inline
  def apply(text1: java.lang.String, text2: java.lang.String, param: java.lang.String = null): ToastTemplate = {
    val __obj = js.Dynamic.literal(text1 = text1, text2 = text2)
    if (param != null) __obj.updateDynamic("param")(param)
    __obj.asInstanceOf[ToastTemplate]
  }
}

