package typings
package baiduDashAppLib.swanNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DownloadFileOptions
  extends BaseOptions[js.Any, js.Any] {
  /** HTTP 请求 Header */
  var header: js.UndefOr[RequestHeader] = js.undefined
  /** 下载成功后以 tempFilePath 的形式传给页面，res = {tempFilePath: '文件的临时路径'} */
  @JSName("success")
  var success_DownloadFileOptions: js.UndefOr[js.Function1[/* res */ TempFileResponse, scala.Unit]] = js.undefined
  /** 下载资源的 url */
  var url: java.lang.String
}

object DownloadFileOptions {
  @scala.inline
  def apply(
    url: java.lang.String,
    complete: js.Function1[/* res */ js.Any, scala.Unit] = null,
    fail: js.Function1[js.Any, scala.Unit] = null,
    header: RequestHeader = null,
    success: js.Function1[/* res */ TempFileResponse, scala.Unit] = null
  ): DownloadFileOptions = {
    val __obj = js.Dynamic.literal(url = url)
    if (complete != null) __obj.updateDynamic("complete")(complete)
    if (fail != null) __obj.updateDynamic("fail")(fail)
    if (header != null) __obj.updateDynamic("header")(header)
    if (success != null) __obj.updateDynamic("success")(success)
    __obj.asInstanceOf[DownloadFileOptions]
  }
}

