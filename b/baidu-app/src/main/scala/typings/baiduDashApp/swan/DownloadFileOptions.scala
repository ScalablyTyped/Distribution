package typings.baiduDashApp.swan

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DownloadFileOptions
  extends BaseOptions[js.Any, js.Any] {
  /** HTTP 请求 Header */
  var header: js.UndefOr[RequestHeader] = js.undefined
  /** 下载成功后以 tempFilePath 的形式传给页面，res = {tempFilePath: '文件的临时路径'} */
  @JSName("success")
  var success_DownloadFileOptions: js.UndefOr[js.Function1[/* res */ TempFileResponse, Unit]] = js.undefined
  /** 下载资源的 url */
  var url: String
}

object DownloadFileOptions {
  @scala.inline
  def apply(
    url: String,
    complete: /* res */ js.Any => Unit = null,
    fail: js.Any => Unit = null,
    header: RequestHeader = null,
    success: /* res */ TempFileResponse => Unit = null
  ): DownloadFileOptions = {
    val __obj = js.Dynamic.literal(url = url)
    if (complete != null) __obj.updateDynamic("complete")(js.Any.fromFunction1(complete))
    if (fail != null) __obj.updateDynamic("fail")(js.Any.fromFunction1(fail))
    if (header != null) __obj.updateDynamic("header")(header)
    if (success != null) __obj.updateDynamic("success")(js.Any.fromFunction1(success))
    __obj.asInstanceOf[DownloadFileOptions]
  }
}

