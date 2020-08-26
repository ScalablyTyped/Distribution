package typings.baiduApp.anon

import typings.baiduApp.baiduAppStrings.ok
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined {  services :std.Array<{  uuid :string,   isPrimary :boolean}>} & baidu-app.swan.ErrMsgResponse */
@js.native
trait servicesArrayuuidstringis extends js.Object {
  /** 成功：ok，错误：详细信息 */
  var errMsg: ok | String = js.native
  var services: js.Array[IsPrimary] = js.native
}

object servicesArrayuuidstringis {
  @scala.inline
  def apply(errMsg: ok | String, services: js.Array[IsPrimary]): servicesArrayuuidstringis = {
    val __obj = js.Dynamic.literal(errMsg = errMsg.asInstanceOf[js.Any], services = services.asInstanceOf[js.Any])
    __obj.asInstanceOf[servicesArrayuuidstringis]
  }
  @scala.inline
  implicit class servicesArrayuuidstringisOps[Self <: servicesArrayuuidstringis] (val x: Self) extends AnyVal {
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
    def setErrMsg(value: ok | String): Self = this.set("errMsg", value.asInstanceOf[js.Any])
    @scala.inline
    def setServicesVarargs(value: IsPrimary*): Self = this.set("services", js.Array(value :_*))
    @scala.inline
    def setServices(value: js.Array[IsPrimary]): Self = this.set("services", value.asInstanceOf[js.Any])
  }
  
}

