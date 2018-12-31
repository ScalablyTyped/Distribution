package typings
package baiduDashAppLib.swanNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// 上传下载
trait UploadFileOptions
  extends BaseOptions[js.Any, js.Any] {
  /** 要上传文件资源的路径 */
  var filePath: java.lang.String
  /** HTTP 请求中其他额外的 form data */
  var formData: js.UndefOr[js.Any] = js.undefined
  /** HTTP 请求 Header , header 中不能设置 Referer */
  var header: js.UndefOr[RequestHeader] = js.undefined
  /** 文件对应的 key , 开发者在服务器端通过这个 key 可以获取到文件二进制内容 */
  var name: java.lang.String
  /** 开发者服务器 url */
  var url: java.lang.String
}

