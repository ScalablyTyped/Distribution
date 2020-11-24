package typings.baiduApp.swan

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
  implicit class requestPolymerPaymentOptionsOps[Self <: requestPolymerPaymentOptions] (val x: Self) extends AnyVal {
    
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
    def setOrderInfo(value: orderInfoOptions): Self = this.set("orderInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBannedChannelsVarargs(value: String*): Self = this.set("bannedChannels", js.Array(value :_*))
    
    @scala.inline
    def setBannedChannels(value: js.Array[String]): Self = this.set("bannedChannels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBannedChannels: Self = this.set("bannedChannels", js.undefined)
    
    @scala.inline
    def setSuccess(value: /* res */ typings.baiduApp.anon.AuthSetting => Unit): Self = this.set("success", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSuccess: Self = this.set("success", js.undefined)
  }
}
