package typings.baiduApp.swan

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RequestPaymentOptions
  extends StObject
     with BaseOptions[js.Any, js.Any] {
  
  /** 统一下单接口返回的 prepay_id 参数值，提交格式如：prepay_id=* */
  @JSName("package")
  var _package: String
  
  /** 随机字符串，长度为32个字符以下。 */
  var nonceStr: String
  
  /** 签名,具体签名方案参见微信公众号支付帮助文档; */
  var paySign: String
  
  /** 签名算法，默认为MD5，支持HMAC-SHA256和MD5 */
  var signType: PaymentSignType
  
  /** 时间戳从1970年1月1日00:00:00至今的秒数,即当前的时间 */
  var timeStamp: String | Double
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
  implicit class RequestPaymentOptionsMutableBuilder[Self <: RequestPaymentOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNonceStr(value: String): Self = StObject.set(x, "nonceStr", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPaySign(value: String): Self = StObject.set(x, "paySign", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSignType(value: PaymentSignType): Self = StObject.set(x, "signType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeStamp(value: String | Double): Self = StObject.set(x, "timeStamp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_package(value: String): Self = StObject.set(x, "package", value.asInstanceOf[js.Any])
  }
}
