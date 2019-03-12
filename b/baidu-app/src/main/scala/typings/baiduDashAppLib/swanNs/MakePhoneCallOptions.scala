package typings
package baiduDashAppLib.swanNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// 设备-----拨打电话
trait MakePhoneCallOptions
  extends BaseOptions[js.Any, js.Any] {
  /**
  		 * 需要拨打的电话号码
  		 */
  var phoneNumber: java.lang.String
}

object MakePhoneCallOptions {
  @scala.inline
  def apply(
    phoneNumber: java.lang.String,
    complete: /* res */ js.Any => scala.Unit = null,
    fail: js.Any => scala.Unit = null,
    success: js.Any => scala.Unit = null
  ): MakePhoneCallOptions = {
    val __obj = js.Dynamic.literal(phoneNumber = phoneNumber)
    if (complete != null) __obj.updateDynamic("complete")(js.Any.fromFunction1(complete))
    if (fail != null) __obj.updateDynamic("fail")(js.Any.fromFunction1(fail))
    if (success != null) __obj.updateDynamic("success")(js.Any.fromFunction1(success))
    __obj.asInstanceOf[MakePhoneCallOptions]
  }
}

