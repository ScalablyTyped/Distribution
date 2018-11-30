package typings
package baiduDashAppLib.swanNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait ScanCodeOptions
  extends BaseOptions[js.Any, js.Any] {
  /**
  		 * 是否只能从相机扫码，不允许从相册选择图片
  		 * @version 1.2.0
  		 */
  var onlyFromCamera: js.UndefOr[scala.Boolean] = js.undefined
  /**
  		 * 扫码类型，参数类型是数组
  		 * 二维码是'qrCode'，一维码是'barCode'，DataMatrix是‘datamatrix’，pdf417是‘pdf417’。
  		 * @version 1.7.0
  		 */
  var scanType: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  @JSName("success")
  def success_MScanCodeOptions(res: ScanCodeData): scala.Unit
}

