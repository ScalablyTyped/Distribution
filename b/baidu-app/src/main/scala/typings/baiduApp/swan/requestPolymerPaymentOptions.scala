package typings.baiduApp.swan

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * 百度收银台。
  * @version 1.8.5
  */
trait requestPolymerPaymentOptions
  extends StObject
     with BaseOptions[Any, Any] {
  
  // 订单信息
  /**
    * bannedChannels参数说明
    * Alipay    支付宝
    * BDWallet    百度钱包
    * WeChat    微信支付
    */
  var bannedChannels: js.UndefOr[js.Array[String]] = js.undefined
  
  var orderInfo: orderInfoOptions
  
  // 需要隐藏的支付方式
  @JSName("success")
  var success_requestPolymerPaymentOptions: js.UndefOr[js.Function1[/* res */ typings.baiduApp.anon.AuthSetting, Unit]] = js.undefined
}
object requestPolymerPaymentOptions {
  
  inline def apply(orderInfo: orderInfoOptions): requestPolymerPaymentOptions = {
    val __obj = js.Dynamic.literal(orderInfo = orderInfo.asInstanceOf[js.Any])
    __obj.asInstanceOf[requestPolymerPaymentOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: requestPolymerPaymentOptions] (val x: Self) extends AnyVal {
    
    inline def setBannedChannels(value: js.Array[String]): Self = StObject.set(x, "bannedChannels", value.asInstanceOf[js.Any])
    
    inline def setBannedChannelsUndefined: Self = StObject.set(x, "bannedChannels", js.undefined)
    
    inline def setBannedChannelsVarargs(value: String*): Self = StObject.set(x, "bannedChannels", js.Array(value*))
    
    inline def setOrderInfo(value: orderInfoOptions): Self = StObject.set(x, "orderInfo", value.asInstanceOf[js.Any])
    
    inline def setSuccess(value: /* res */ typings.baiduApp.anon.AuthSetting => Unit): Self = StObject.set(x, "success", js.Any.fromFunction1(value))
    
    inline def setSuccessUndefined: Self = StObject.set(x, "success", js.undefined)
  }
}
