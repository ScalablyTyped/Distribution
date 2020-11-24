package typings.baiduApp.swan

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// 开放接口-----微信支付
/* Rewritten from type alias, can be one of: 
  - typings.baiduApp.baiduAppStrings.MD5
  - typings.baiduApp.baiduAppStrings.`HMAC-SHA256`
*/
trait PaymentSignType extends js.Object
object PaymentSignType {
  
  @scala.inline
  def `HMAC-SHA256`: typings.baiduApp.baiduAppStrings.`HMAC-SHA256` = "HMAC-SHA256".asInstanceOf[typings.baiduApp.baiduAppStrings.`HMAC-SHA256`]
  
  @scala.inline
  def MD5: typings.baiduApp.baiduAppStrings.MD5 = "MD5".asInstanceOf[typings.baiduApp.baiduAppStrings.MD5]
}
