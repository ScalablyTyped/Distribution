package typings
package baiduDashAppLib.swanNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
	 * 百度收银台。
	 * @version 1.8.5
	 */

trait requestPolymerPaymentOptions
  extends BaseOptions[js.Any, js.Any] {
   // 订单信息
  /**
  		 * bannedChannels参数说明
  		 * Alipay	支付宝
  		 * BDWallet	百度钱包
  		 * WeChat	微信支付
  		 */
  var bannedChannels: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var orderInfo: orderInfoOptions
   // 需要隐藏的支付方式
  @JSName("success")
  var success_requestPolymerPaymentOptions: js.UndefOr[js.Function1[/* res */ baiduDashAppLib.Anon_AuthSetting, scala.Unit]] = js.undefined
}

