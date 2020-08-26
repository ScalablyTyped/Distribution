package typings.baiduApp.swan

import typings.baiduApp.baiduAppNumbers.`1`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait orderInfoOptions
  extends BaseOptions[js.Any, js.Any] {
  /**
    * https://dianshang.baidu.com/platform/doclist/index.html#!/doc/nuomiplus_2_base/term_v2.md
    * 用以表示应用身份的唯一ID,在应用审
    * 核通过后进行分配,一经分配后不会发生更改,来唯一确定一个应
    * 用。详见核心参数
    * https://dianshang.baidu.com/platform/doclist/index.html#!/doc/nuomiplus_1_guide/mini_program_cashier/parameter.md
    */
  var appKey: String = js.native
  /**
    * 订单详细信息，需要是一个可解析为JSON Object的字符串。字段
    * 内容见： https://dianshang.baidu.com/platform/doclist/index.html#!/doc/nuomiplus_1_guide/mini_program_cashier/parameter.md
    */
  var bizInfo: String = js.native
  /**
    * 跳转百度收银台支付必带参数之一,是百度收银台的财务结算凭
    * 证,与账号绑定的结算协议一一对应,每笔交易将结算到dealId对
    * 应的协议主体。详见
    * https://dianshang.baidu.com/platform/doclist/index.html#!/doc/nuomiplus_1_guide/mini_program_cashier/parameter.md
    */
  var dealId: String = js.native
  /**
    * 订单的名称
    */
  var dealTitle: String = js.native
  /**
    * 对appKey+dealId+tpOrderId+totalAmount进行RSA加密后的签
    * 名，防止订单被伪造。签名过程见 百度电商开放平台：https://dianshang.baidu.com/platform/doclist/index.html#!/doc/nuomiplus_2_base/sign_v2.md
    */
  var rsaSign: String = js.native
  /**
    * 固定值1
    */
  var signFieldsRange: `1` = js.native
  /**
    * 订单金额，单位为人民币分。
    */
  var totalAmount: String = js.native
  /**
    * 商户平台自己记录的订单ID，当支付状态发生变化时，会通过此订
    * 单ID通知商户。
    */
  var tpOrderId: String = js.native
}

object orderInfoOptions {
  @scala.inline
  def apply(
    appKey: String,
    bizInfo: String,
    dealId: String,
    dealTitle: String,
    rsaSign: String,
    signFieldsRange: `1`,
    totalAmount: String,
    tpOrderId: String
  ): orderInfoOptions = {
    val __obj = js.Dynamic.literal(appKey = appKey.asInstanceOf[js.Any], bizInfo = bizInfo.asInstanceOf[js.Any], dealId = dealId.asInstanceOf[js.Any], dealTitle = dealTitle.asInstanceOf[js.Any], rsaSign = rsaSign.asInstanceOf[js.Any], signFieldsRange = signFieldsRange.asInstanceOf[js.Any], totalAmount = totalAmount.asInstanceOf[js.Any], tpOrderId = tpOrderId.asInstanceOf[js.Any])
    __obj.asInstanceOf[orderInfoOptions]
  }
  @scala.inline
  implicit class orderInfoOptionsOps[Self <: orderInfoOptions] (val x: Self) extends AnyVal {
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
    def setAppKey(value: String): Self = this.set("appKey", value.asInstanceOf[js.Any])
    @scala.inline
    def setBizInfo(value: String): Self = this.set("bizInfo", value.asInstanceOf[js.Any])
    @scala.inline
    def setDealId(value: String): Self = this.set("dealId", value.asInstanceOf[js.Any])
    @scala.inline
    def setDealTitle(value: String): Self = this.set("dealTitle", value.asInstanceOf[js.Any])
    @scala.inline
    def setRsaSign(value: String): Self = this.set("rsaSign", value.asInstanceOf[js.Any])
    @scala.inline
    def setSignFieldsRange(value: `1`): Self = this.set("signFieldsRange", value.asInstanceOf[js.Any])
    @scala.inline
    def setTotalAmount(value: String): Self = this.set("totalAmount", value.asInstanceOf[js.Any])
    @scala.inline
    def setTpOrderId(value: String): Self = this.set("tpOrderId", value.asInstanceOf[js.Any])
  }
  
}

