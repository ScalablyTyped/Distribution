package typings.baiduDashApp.swan

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// 设备-----扫码
/* Rewritten from type alias, can be one of: 
  - typings.baiduDashApp.baiduDashAppStrings.qrCode
  - typings.baiduDashApp.baiduDashAppStrings.barCode
*/
trait scanType extends js.Object

object scanType {
  @scala.inline
  def barCode: typings.baiduDashApp.baiduDashAppStrings.barCode = this.cast("barCode")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def qrCode: typings.baiduDashApp.baiduDashAppStrings.qrCode = this.cast("qrCode")
}

