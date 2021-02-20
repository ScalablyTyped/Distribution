package typings.baiduApp.swan

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * 百度收银台。
  * @version 1.8.5
  */
@js.native
trait requestPolymerPaymentOptions
  extends BaseOptions[js.Any, js.Any] {
  
  // 订单信息
  /**
    * bannedChannels参数说明
    * Alipay    支付宝
    * BDWallet    百度钱包
    * WeChat    微信支付
    */
  var bannedChannels: js.UndefOr[js.Array[String]] = js.native
  
  var orderInfo: orderInfoOptions = js.native
  
  // 需要隐藏的支付方式
  @JSName("success")
  var success_requestPolymerPaymentOptions: js.UndefOr[js.Function1[/* res */ typings.baiduApp.anon.AuthSetting, Unit]] = js.native
}
object requestPolymerPaymentOptions {
  
  @scala.inline
  def apply(orderInfo: orderInfoOptions): requestPolymerPaymentOptions = {
    val __obj = js.Dynamic.literal(orderInfo = orderInfo.asInstanceOf[js.Any])
    __obj.asInstanceOf[requestPolymerPaymentOptions]
  }
  
  @scala.inline
  implicit class requestPolymerPaymentOptionsMutableBuilder[Self <: requestPolymerPaymentOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBannedChannels(value: js.Array[String]): Self = StObject.set(x, "bannedChannels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBannedChannelsUndefined: Self = StObject.set(x, "bannedChannels", js.undefined)
    
    @scala.inline
    def setBannedChannelsVarargs(value: String*): Self = StObject.set(x, "bannedChannels", js.Array(value :_*))
    
    @scala.inline
    def setOrderInfo(value: orderInfoOptions): Self = StObject.set(x, "orderInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSuccess(value: /* res */ typings.baiduApp.anon.AuthSetting => Unit): Self = StObject.set(x, "success", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSuccessUndefined: Self = StObject.set(x, "success", js.undefined)
  }
}
