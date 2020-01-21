package typings.baiduApp.swan

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// 设备-----扫码
/* Rewritten from type alias, can be one of: 
  - typings.baiduApp.baiduAppStrings.qrCode
  - typings.baiduApp.baiduAppStrings.barCode
*/
trait scanType extends js.Object

object scanType {
  @scala.inline
  def barCode: typings.baiduApp.baiduAppStrings.barCode = this.cast("barCode")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def qrCode: typings.baiduApp.baiduAppStrings.qrCode = this.cast("qrCode")
}

