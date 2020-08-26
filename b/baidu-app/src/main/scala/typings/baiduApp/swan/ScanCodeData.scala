package typings.baiduApp.swan

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ScanCodeData extends js.Object {
  /**
    * 所扫码的字符集
    */
  var charSet: String = js.native
  /**
    * 当所扫的码为当前小程序的合法二维码时，会返回此字段，内容为二维码携带的 path
    */
  var path: String = js.native
  /**
    * 所扫码的内容
    */
  var result: String = js.native
  /**
    * 所扫码的类型
    */
  var scanType: typings.baiduApp.swan.scanType = js.native
}

object ScanCodeData {
  @scala.inline
  def apply(charSet: String, path: String, result: String, scanType: scanType): ScanCodeData = {
    val __obj = js.Dynamic.literal(charSet = charSet.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], result = result.asInstanceOf[js.Any], scanType = scanType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScanCodeData]
  }
  @scala.inline
  implicit class ScanCodeDataOps[Self <: ScanCodeData] (val x: Self) extends AnyVal {
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
    def setCharSet(value: String): Self = this.set("charSet", value.asInstanceOf[js.Any])
    @scala.inline
    def setPath(value: String): Self = this.set("path", value.asInstanceOf[js.Any])
    @scala.inline
    def setResult(value: String): Self = this.set("result", value.asInstanceOf[js.Any])
    @scala.inline
    def setScanType(value: scanType): Self = this.set("scanType", value.asInstanceOf[js.Any])
  }
  
}

