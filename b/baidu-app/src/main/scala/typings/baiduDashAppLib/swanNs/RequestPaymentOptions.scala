package typings
package baiduDashAppLib.swanNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RequestPaymentOptions
  extends BaseOptions[js.Any, js.Any] {
  /** 随机字符串，长度为32个字符以下。 */
  var nonceStr: java.lang.String
  /** 统一下单接口返回的 prepay_id 参数值，提交格式如：prepay_id=* */
  var `package`: java.lang.String
  /** 签名,具体签名方案参见微信公众号支付帮助文档; */
  var paySign: java.lang.String
  /** 签名算法，默认为MD5，支持HMAC-SHA256和MD5 */
  var signType: PaymentSignType
  /** 时间戳从1970年1月1日00:00:00至今的秒数,即当前的时间 */
  var timeStamp: java.lang.String | scala.Double
}

object RequestPaymentOptions {
  @scala.inline
  def apply(
    nonceStr: java.lang.String,
    `package`: java.lang.String,
    paySign: java.lang.String,
    signType: PaymentSignType,
    timeStamp: java.lang.String | scala.Double,
    complete: js.Function1[/* res */ js.Any, scala.Unit] = null,
    fail: js.Function1[js.Any, scala.Unit] = null,
    success: js.Function1[js.Any, scala.Unit] = null
  ): RequestPaymentOptions = {
    val __obj = js.Dynamic.literal(nonceStr = nonceStr, paySign = paySign, signType = signType, timeStamp = timeStamp.asInstanceOf[js.Any])
    __obj.updateDynamic("package")(`package`)
    if (complete != null) __obj.updateDynamic("complete")(complete)
    if (fail != null) __obj.updateDynamic("fail")(fail)
    if (success != null) __obj.updateDynamic("success")(success)
    __obj.asInstanceOf[RequestPaymentOptions]
  }
}

