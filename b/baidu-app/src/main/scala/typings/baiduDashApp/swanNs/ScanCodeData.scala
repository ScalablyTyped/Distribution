package typings.baiduDashApp.swanNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ScanCodeData extends js.Object {
  /**
  		 * 所扫码的字符集
  		 */
  var charSet: String
  /**
  		 * 当所扫的码为当前小程序的合法二维码时，会返回此字段，内容为二维码携带的 path
  		 */
  var path: String
  /**
  		 * 所扫码的内容
  		 */
  var result: String
  /**
  		 * 所扫码的类型
  		 */
  var scanType: typings.baiduDashApp.swanNs.scanType
}

object ScanCodeData {
  @scala.inline
  def apply(charSet: String, path: String, result: String, scanType: scanType): ScanCodeData = {
    val __obj = js.Dynamic.literal(charSet = charSet, path = path, result = result, scanType = scanType)
  
    __obj.asInstanceOf[ScanCodeData]
  }
}

