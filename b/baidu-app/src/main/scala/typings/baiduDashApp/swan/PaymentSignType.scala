package typings.baiduDashApp.swan

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// 开放接口-----微信支付
/* Rewritten from type alias, can be one of: 
  - typings.baiduDashApp.baiduDashAppStrings.MD5
  - typings.baiduDashApp.baiduDashAppStrings.`HMAC-SHA256`
*/
trait PaymentSignType extends js.Object

object PaymentSignType {
  @scala.inline
  def `HMAC-SHA256`: typings.baiduDashApp.baiduDashAppStrings.`HMAC-SHA256` = this.cast("HMAC-SHA256")
  @scala.inline
  def MD5: typings.baiduDashApp.baiduDashAppStrings.MD5 = this.cast("MD5")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

