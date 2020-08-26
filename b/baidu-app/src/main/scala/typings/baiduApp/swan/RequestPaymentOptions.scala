package typings.baiduApp.swan

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RequestPaymentOptions
  extends BaseOptions[js.Any, js.Any] {
  /** 统一下单接口返回的 prepay_id 参数值，提交格式如：prepay_id=* */
  @JSName("package")
  var _package: String = js.native
  /** 随机字符串，长度为32个字符以下。 */
  var nonceStr: String = js.native
  /** 签名,具体签名方案参见微信公众号支付帮助文档; */
  var paySign: String = js.native
  /** 签名算法，默认为MD5，支持HMAC-SHA256和MD5 */
  var signType: PaymentSignType = js.native
  /** 时间戳从1970年1月1日00:00:00至今的秒数,即当前的时间 */
  var timeStamp: String | Double = js.native
}

object RequestPaymentOptions {
  @scala.inline
  def apply(
    _package: String,
    nonceStr: String,
    paySign: String,
    signType: PaymentSignType,
    timeStamp: String | Double
  ): RequestPaymentOptions = {
    val __obj = js.Dynamic.literal(nonceStr = nonceStr.asInstanceOf[js.Any], paySign = paySign.asInstanceOf[js.Any], signType = signType.asInstanceOf[js.Any], timeStamp = timeStamp.asInstanceOf[js.Any])
    __obj.updateDynamic("package")(_package.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestPaymentOptions]
  }
  @scala.inline
  implicit class RequestPaymentOptionsOps[Self <: RequestPaymentOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def set_package(value: String): Self = this.set("package", value.asInstanceOf[js.Any])
    @scala.inline
    def setNonceStr(value: String): Self = this.set("nonceStr", value.asInstanceOf[js.Any])
    @scala.inline
    def setPaySign(value: String): Self = this.set("paySign", value.asInstanceOf[js.Any])
    @scala.inline
    def setSignType(value: PaymentSignType): Self = this.set("signType", value.asInstanceOf[js.Any])
    @scala.inline
    def setTimeStamp(value: String | Double): Self = this.set("timeStamp", value.asInstanceOf[js.Any])
  }
  
}

