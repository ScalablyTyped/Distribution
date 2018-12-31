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

